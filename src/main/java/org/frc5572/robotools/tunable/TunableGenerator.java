package org.frc5572.robotools.tunable;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;
import java.util.function.Consumer;
import javax.annotation.processing.ProcessingEnvironment;
import javax.annotation.processing.RoundEnvironment;
import javax.lang.model.element.Element;
import javax.lang.model.element.ElementKind;
import javax.lang.model.element.Modifier;
import javax.lang.model.element.TypeElement;
import javax.lang.model.element.VariableElement;
import javax.lang.model.type.DeclaredType;
import javax.lang.model.type.TypeKind;
import javax.lang.model.type.TypeMirror;
import javax.tools.Diagnostic;
import org.frc5572.robotools.AnnotationGenerator;
import org.frc5572.robotools.Utilities;
import com.squareup.javapoet.ClassName;
import com.squareup.javapoet.CodeBlock;
import com.squareup.javapoet.FieldSpec;
import com.squareup.javapoet.JavaFile;
import com.squareup.javapoet.MethodSpec;
import com.squareup.javapoet.ParameterizedTypeName;
import com.squareup.javapoet.TypeName;
import com.squareup.javapoet.TypeSpec;

/**
 * Annotation Generator for {@code @Tunable}.
 *
 * <p>
 * For each {@code @Tunable}-annotated class {@code X}, generates a wrapper class {@code XTunable}
 * that holds an {@code X} instance, publishes every (recursively flattened) tunable field to
 * NetworkTables in its constructor, and listens for changes — setting a single {@code isDirty} flag
 * whenever any field changes. This replaces the reflection-based {@code Tunable.setupTunable}.
 *
 * <p>
 * Nested compound (POD) fields are inlined: a field {@code pid} of type {@code PIDConstants} inside
 * the annotated class becomes flat topics like {@code <name>/pid/kP}, all flipping the outer
 * wrapper's dirty flag. Inner types do not need to be {@code @Tunable} themselves.
 *
 * <p>
 * The wrapper also exposes {@code get()} for the underlying object and
 * {@code ifDirty(Consumer<X>)}, which logs the object's fields via AdvantageKit (through a
 * generated private {@code Inputs} {@code LoggableInputs}) and runs the consumer when something
 * changed.
 */
public class TunableGenerator implements AnnotationGenerator {

    private static final ClassName NT_INSTANCE =
        ClassName.get("edu.wpi.first.networktables", "NetworkTableInstance");
    private static final ClassName NT_EVENT_KIND =
        ClassName.get("edu.wpi.first.networktables", "NetworkTableEvent", "Kind");
    private static final ClassName ENUM_SET = ClassName.get("java.util", "EnumSet");
    private static final ClassName ROTATION2D =
        ClassName.get("edu.wpi.first.math.geometry", "Rotation2d");
    private static final ClassName SENDABLE_CHOOSER =
        ClassName.get("edu.wpi.first.wpilibj.smartdashboard", "SendableChooser");
    private static final ClassName SMART_DASHBOARD =
        ClassName.get("edu.wpi.first.wpilibj.smartdashboard", "SmartDashboard");
    private static final ClassName LOGGER =
        ClassName.get("org.littletonrobotics.junction", "Logger");
    private static final ClassName LOG_TABLE =
        ClassName.get("org.littletonrobotics.junction", "LogTable");
    private static final ClassName LOGGABLE_INPUTS =
        ClassName.get("org.littletonrobotics.junction.inputs", "LoggableInputs");

    private ProcessingEnvironment processingEnv;

    @Override
    public void init(ProcessingEnvironment env) {
        this.processingEnv = env;
    }

    @Override
    public String getAnnotationQualifiedName() {
        return "frc.robot.util.tunable.Tunable";
    }

    @Override
    public void generate(TypeElement annotation, RoundEnvironment roundEnv) {
        roundEnv.getElementsAnnotatedWith(annotation).forEach(element_ -> {
            TypeElement classElement = (TypeElement) element_;
            String pkg = Utilities.getPackageName(classElement);
            String wrapperName = classElement.getSimpleName() + "Tunable";
            TypeName classType = TypeName.get(classElement.asType());

            CodeBlock.Builder ctor = CodeBlock.builder();
            CodeBlock.Builder toLog = CodeBlock.builder();
            CodeBlock.Builder fromLog = CodeBlock.builder();

            ctor.addStatement("$T nt = $T.getDefault()", NT_INSTANCE, NT_INSTANCE);
            walk(classElement.asType(), "obj", "", classElement, ctor, toLog, fromLog,
                new HashSet<>());

            MethodSpec constructor = MethodSpec.constructorBuilder().addModifiers(Modifier.PUBLIC)
                .addParameter(String.class, "name").addParameter(classType, "obj")
                .addStatement("this.name = name").addStatement("this.obj = obj")
                .addStatement("this.isDirty = false").addCode(ctor.build()).build();

            MethodSpec get = MethodSpec.methodBuilder("get").addModifiers(Modifier.PUBLIC)
                .addJavadoc("@return the underlying object.\n").returns(classType)
                .addStatement("return obj").build();

            ParameterizedTypeName consumerType =
                ParameterizedTypeName.get(ClassName.get(Consumer.class), classType.box());
            MethodSpec ifDirty = MethodSpec.methodBuilder("ifDirty").addModifiers(Modifier.PUBLIC)
                .addJavadoc("Log the object and, if any tunable field changed, run the consumer.\n")
                .addParameter(consumerType, "consumer")
                .addStatement("$T.processInputs(name, inputs)", LOGGER)
                .beginControlFlow("if (this.isDirty)").addStatement("consumer.accept(this.obj)")
                .endControlFlow().addStatement("this.isDirty = false").build();

            MethodSpec toLogMethod = MethodSpec.methodBuilder("toLog").addAnnotation(Override.class)
                .addModifiers(Modifier.PUBLIC).addParameter(LOG_TABLE, "table")
                .addCode(toLog.build()).build();
            MethodSpec fromLogMethod = MethodSpec.methodBuilder("fromLog")
                .addAnnotation(Override.class).addModifiers(Modifier.PUBLIC)
                .addParameter(LOG_TABLE, "table").addCode(fromLog.build()).build();
            TypeSpec inputs = TypeSpec.classBuilder("Inputs").addModifiers(Modifier.PRIVATE)
                .addSuperinterface(LOGGABLE_INPUTS).addMethod(toLogMethod).addMethod(fromLogMethod)
                .addJavadoc("AdvantageKit logging that reads/writes the wrapped object.\n").build();

            TypeSpec wrapper =
                TypeSpec.classBuilder(wrapperName).addModifiers(Modifier.PUBLIC, Modifier.FINAL)
                    .addField(String.class, "name", Modifier.PRIVATE, Modifier.FINAL)
                    .addField(classType, "obj", Modifier.PRIVATE, Modifier.FINAL)
                    .addField(FieldSpec
                        .builder(ClassName.get(pkg, wrapperName, "Inputs"), "inputs",
                            Modifier.PRIVATE, Modifier.FINAL)
                        .initializer("new $N()", "Inputs").build())
                    .addField(boolean.class, "isDirty", Modifier.PRIVATE).addMethod(constructor)
                    .addMethod(get).addMethod(ifDirty).addType(inputs)
                    .addJavadoc("Generated NetworkTables tuning wrapper for {@link $T}.\n",
                        classType)
                    .build();

            try {
                JavaFile.builder(pkg, wrapper).build().writeTo(processingEnv.getFiler());
            } catch (IOException e) {
                processingEnv.getMessager().printMessage(Diagnostic.Kind.ERROR,
                    "Failed to write " + wrapperName, classElement);
            }
        });
    }

    /**
     * Recursively walks a field's type, emitting NT wiring and log statements for each leaf. {@code
     * acc} is the Java access expression for the value (e.g. {@code obj.pid.kP}); {@code relPath}
     * is the slash-separated key relative to the wrapped object (e.g. {@code pid/kP}).
     */
    private void walk(TypeMirror type, String acc, String relPath, Element errorElement,
        CodeBlock.Builder ctor, CodeBlock.Builder toLog, CodeBlock.Builder fromLog,
        Set<String> visited) {
        TypeKind kind = type.getKind();
        if (kind == TypeKind.DOUBLE) {
            simpleLeaf(ctor, toLog, fromLog, acc, relPath, "getDoubleTopic", "getDouble");
            return;
        }
        if (kind == TypeKind.BOOLEAN) {
            simpleLeaf(ctor, toLog, fromLog, acc, relPath, "getBooleanTopic", "getBoolean");
            return;
        }
        if (kind == TypeKind.DECLARED) {
            DeclaredType dt = (DeclaredType) type;
            TypeElement te = (TypeElement) dt.asElement();
            String qn = te.getQualifiedName().toString();
            if (qn.equals("java.lang.String")) {
                simpleLeaf(ctor, toLog, fromLog, acc, relPath, "getStringTopic", "getString");
                return;
            }
            if (qn.equals("edu.wpi.first.math.geometry.Rotation2d")) {
                rotationLeaf(ctor, toLog, fromLog, acc, relPath);
                return;
            }
            if (te.getKind() == ElementKind.ENUM) {
                enumLeaf(ctor, toLog, fromLog, acc, relPath, TypeName.get(type));
                return;
            }
            if (!visited.add(qn)) {
                processingEnv.getMessager().printMessage(Diagnostic.Kind.ERROR,
                    "@Tunable cannot handle the recursive type '" + qn + "' (field '" + relPath
                        + "')",
                    errorElement);
                return;
            }
            for (Element enclosed : te.getEnclosedElements()) {
                if (enclosed.getKind() != ElementKind.FIELD) {
                    continue;
                }
                Set<Modifier> mods = enclosed.getModifiers();
                if (mods.contains(Modifier.STATIC) || mods.contains(Modifier.FINAL)
                    || mods.contains(Modifier.PRIVATE)) {
                    continue;
                }
                String fieldName = enclosed.getSimpleName().toString();
                String childRel = relPath.isEmpty() ? fieldName : relPath + "/" + fieldName;
                walk(((VariableElement) enclosed).asType(), acc + "." + fieldName, childRel,
                    enclosed, ctor, toLog, fromLog, visited);
            }
            visited.remove(qn);
            return;
        }
        processingEnv.getMessager().printMessage(Diagnostic.Kind.ERROR,
            "@Tunable does not support field type '" + type + "' (field '" + relPath + "')",
            errorElement);
    }

    /** Leaf for a type NetworkTables exposes directly (double / boolean / String). */
    private void simpleLeaf(CodeBlock.Builder ctor, CodeBlock.Builder toLog,
        CodeBlock.Builder fromLog, String acc, String relPath, String topicMethod,
        String readMethod) {
        String var = sanitize(relPath);
        ctor.addStatement("var $LTopic = nt.$L(name + $S)", var, topicMethod, "/" + relPath);
        ctor.addStatement("$LTopic.publish().accept($L)", var, acc);
        ctor.beginControlFlow("nt.addListener($LTopic, $T.of($T.kValueAll), (ev) ->", var, ENUM_SET,
            NT_EVENT_KIND);
        ctor.addStatement("$L = ev.valueData.value.$L()", acc, readMethod);
        ctor.addStatement("this.isDirty = true");
        ctor.endControlFlow(")");

        toLog.addStatement("table.put($S, $L)", relPath, acc);
        fromLog.addStatement("$L = table.get($S, $L)", acc, relPath, acc);
    }

    /** Leaf for {@code Rotation2d}, published/logged as degrees. */
    private void rotationLeaf(CodeBlock.Builder ctor, CodeBlock.Builder toLog,
        CodeBlock.Builder fromLog, String acc, String relPath) {
        String var = sanitize(relPath);
        ctor.addStatement("var $LTopic = nt.getDoubleTopic(name + $S)", var, "/" + relPath);
        ctor.addStatement("$LTopic.publish().accept($L.getDegrees())", var, acc);
        ctor.beginControlFlow("nt.addListener($LTopic, $T.of($T.kValueAll), (ev) ->", var, ENUM_SET,
            NT_EVENT_KIND);
        ctor.addStatement("$L = $T.fromDegrees(ev.valueData.value.getDouble())", acc, ROTATION2D);
        ctor.addStatement("this.isDirty = true");
        ctor.endControlFlow(")");

        toLog.addStatement("table.put($S, $L.getDegrees())", relPath, acc);
        fromLog.addStatement("$L = $T.fromDegrees(table.get($S, $L.getDegrees()))", acc, ROTATION2D,
            relPath, acc);
    }

    /** Leaf for an enum, exposed through a {@link SendableChooser} and logged by name. */
    private void enumLeaf(CodeBlock.Builder ctor, CodeBlock.Builder toLog,
        CodeBlock.Builder fromLog, String acc, String relPath, TypeName enumType) {
        String var = sanitize(relPath);
        ctor.addStatement("$T<$T> $LChooser = new $T<>()", SENDABLE_CHOOSER, enumType, var,
            SENDABLE_CHOOSER);
        ctor.beginControlFlow("for ($T v : $T.values())", enumType, enumType);
        ctor.addStatement("$LChooser.addOption(v.name(), v)", var);
        ctor.endControlFlow();
        ctor.addStatement("$LChooser.setDefaultOption($L.name(), $L)", var, acc, acc);
        ctor.beginControlFlow("$LChooser.onChange((val) ->", var);
        ctor.addStatement("$L = val", acc);
        ctor.addStatement("this.isDirty = true");
        ctor.endControlFlow(")");
        ctor.addStatement("$T.putData(name + $S, $LChooser)", SMART_DASHBOARD, "/" + relPath, var);

        toLog.addStatement("table.put($S, $L.name())", relPath, acc);
        fromLog.addStatement("$L = $T.valueOf(table.get($S, $L.name()))", acc, enumType, relPath,
            acc);
    }

    /** Turns a slash-separated key into a legal Java identifier prefix. */
    private static String sanitize(String relPath) {
        return relPath.replaceAll("[^A-Za-z0-9]", "_");
    }

}
