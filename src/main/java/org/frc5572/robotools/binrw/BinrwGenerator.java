package org.frc5572.robotools.binrw;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.processing.ProcessingEnvironment;
import javax.annotation.processing.RoundEnvironment;
import javax.lang.model.element.ElementKind;
import javax.lang.model.element.Modifier;
import javax.lang.model.element.TypeElement;
import javax.lang.model.element.VariableElement;
import javax.lang.model.type.ArrayType;
import javax.lang.model.type.DeclaredType;
import javax.lang.model.type.TypeKind;
import javax.lang.model.type.TypeMirror;
import javax.tools.Diagnostic;
import org.frc5572.robotools.AnnotationGenerator;
import org.frc5572.robotools.Utilities;
import com.squareup.javapoet.ClassName;
import com.squareup.javapoet.CodeBlock;
import com.squareup.javapoet.JavaFile;
import com.squareup.javapoet.MethodSpec;
import com.squareup.javapoet.ParameterizedTypeName;
import com.squareup.javapoet.TypeName;
import com.squareup.javapoet.TypeSpec;

/**
 * Annotation Generator for {@code @Binrw}.
 *
 * <p>
 * For each {@code @Binrw}-annotated class or record, generates a paired {@code {Name}Reader} and
 * {@code {Name}Writer} that serialize/deserialize public instance fields using
 * {@link DataInputStream}/{@link DataOutputStream}. Collections write their size before elements so
 * reader and writer are always self-consistent.
 */
public class BinrwGenerator implements AnnotationGenerator {

    /** Holds per-field metadata normalized across classes and records. */
    private record FieldInfo(TypeMirror type, String localName, String writeExpr) {
    }

    private ProcessingEnvironment processingEnv;

    @Override
    public void init(ProcessingEnvironment env) {
        this.processingEnv = env;
    }

    @Override
    public String getAnnotationQualifiedName() {
        return "frc.robot.util.binrw.Binrw";
    }

    @Override
    public void generate(TypeElement annotation, RoundEnvironment roundEnv) {
        roundEnv.getElementsAnnotatedWith(annotation).forEach(element_ -> {
            TypeElement classElement = (TypeElement) element_;
            String pkg = Utilities.getPackageName(classElement);
            String name = classElement.getSimpleName().toString();

            TypeMirror implClass = null;
            for (var mirror : classElement.getAnnotationMirrors()) {
                if (!mirror.getAnnotationType().asElement().getSimpleName().toString()
                    .equals("Binrw")) {
                    continue;
                }
                for (var ev : mirror.getElementValues().entrySet()) {
                    if (ev.getKey().getSimpleName().toString().equals("value")) {
                        TypeMirror val = Utilities.classAnnotationValue(ev.getValue());
                        if (val != null && val.getKind() != TypeKind.VOID) {
                            implClass = val;
                        }
                    }
                }
            }

            List<FieldInfo> fields = implClass == null ? collectFields(classElement) : List.of();

            generateReader(pkg, name, classElement, fields, implClass);
            generateWriter(pkg, name, classElement, fields, implClass);
        });
    }

    /**
     * Collects the fields/components to serialize, normalized to {@link FieldInfo}.
     *
     * <p>
     * For records, components are read via their accessor methods ({@code obj.name()}). For
     * classes, public non-static non-final fields are accessed directly ({@code obj.name}).
     */
    private List<FieldInfo> collectFields(TypeElement classElement) {
        List<FieldInfo> result = new ArrayList<>();
        if (classElement.getKind() == ElementKind.RECORD) {
            for (var comp : classElement.getRecordComponents()) {
                boolean ignored =
                    comp.getAnnotationMirrors().stream().anyMatch(m -> m.getAnnotationType()
                        .asElement().getSimpleName().toString().equals("BrwIgnore"));
                if (ignored) {
                    continue;
                }
                String compName = comp.getSimpleName().toString();
                result.add(new FieldInfo(comp.asType(), compName, "obj." + compName + "()"));
            }
        } else {
            for (var enclosed : classElement.getEnclosedElements()) {
                if (!(enclosed instanceof VariableElement ve)) {
                    continue;
                }
                if (enclosed.getKind() != ElementKind.FIELD) {
                    continue;
                }
                var mods = enclosed.getModifiers();
                if (mods.contains(Modifier.STATIC)) {
                    continue;
                }
                if (mods.contains(Modifier.FINAL)) {
                    processingEnv.getMessager().printMessage(Diagnostic.Kind.WARNING,
                        "Skipping final field '" + enclosed.getSimpleName() + "' in @Binrw class",
                        enclosed);
                    continue;
                }
                if (!mods.contains(Modifier.PUBLIC)) {
                    processingEnv.getMessager().printMessage(Diagnostic.Kind.WARNING,
                        "Skipping non-public field '" + enclosed.getSimpleName()
                            + "' in @Binrw class",
                        enclosed);
                    continue;
                }
                boolean ignored =
                    enclosed.getAnnotationMirrors().stream().anyMatch(m -> m.getAnnotationType()
                        .asElement().getSimpleName().toString().equals("BrwIgnore"));
                if (ignored) {
                    continue;
                }
                String fieldName = ve.getSimpleName().toString();
                result.add(new FieldInfo(ve.asType(), fieldName, "obj." + fieldName));
            }
        }
        return result;
    }

    private void generateReader(String pkg, String name, TypeElement classElement,
        List<FieldInfo> fields, TypeMirror implClass) {
        TypeName classType = TypeName.get(classElement.asType());

        MethodSpec.Builder readMethod = MethodSpec.methodBuilder("read")
            .addModifiers(Modifier.PUBLIC, Modifier.STATIC).returns(classType)
            .addParameter(DataInputStream.class, "stream").addException(IOException.class);

        if (implClass != null) {
            readMethod.addStatement("return $T.read(stream)", TypeName.get(implClass));
        } else {
            List<String> localNames = new ArrayList<>();
            for (var field : fields) {
                localNames.add(field.localName());
                readMethod.addCode(buildReadBlock(field.type(), "stream", field.localName(), 0));
            }
            readMethod.addStatement("return new $T($L)", classType, String.join(", ", localNames));
        }

        TypeSpec readerClass = TypeSpec.classBuilder(name + "Reader")
            .addModifiers(Modifier.PUBLIC, Modifier.FINAL).addMethod(readMethod.build()).build();

        try {
            JavaFile.builder(pkg, readerClass).build().writeTo(processingEnv.getFiler());
        } catch (IOException e) {
            processingEnv.getMessager().printMessage(Diagnostic.Kind.ERROR,
                "Failed to write " + name + "Reader", classElement);
        }
    }

    private void generateWriter(String pkg, String name, TypeElement classElement,
        List<FieldInfo> fields, TypeMirror implClass) {
        TypeName classType = TypeName.get(classElement.asType());

        MethodSpec.Builder writeMethod =
            MethodSpec.methodBuilder("write").addModifiers(Modifier.PUBLIC, Modifier.STATIC)
                .returns(TypeName.VOID).addParameter(DataOutputStream.class, "stream")
                .addParameter(classType, "obj").addException(IOException.class);

        if (implClass != null) {
            writeMethod.addStatement("$T.write(stream, obj)", TypeName.get(implClass));
        } else {
            for (var field : fields) {
                writeMethod.addCode(buildWriteBlock(field.type(), "stream", field.writeExpr(), 0));
            }
        }

        TypeSpec writerClass = TypeSpec.classBuilder(name + "Writer")
            .addModifiers(Modifier.PUBLIC, Modifier.FINAL).addMethod(writeMethod.build()).build();

        try {
            JavaFile.builder(pkg, writerClass).build().writeTo(processingEnv.getFiler());
        } catch (IOException e) {
            processingEnv.getMessager().printMessage(Diagnostic.Kind.ERROR,
                "Failed to write " + name + "Writer", classElement);
        }
    }

    /**
     * Emits statements that declare a local variable {@code localName} of the given type and
     * populate it by reading from {@code streamVar}.
     */
    private CodeBlock buildReadBlock(TypeMirror type, String streamVar, String localName,
        int depth) {
        switch (type.getKind()) {
            case BYTE:
                return CodeBlock.builder()
                    .addStatement("$T $L = $L.readByte()", TypeName.get(type), localName, streamVar)
                    .build();
            case SHORT:
                return CodeBlock.builder().addStatement("$T $L = $L.readShort()",
                    TypeName.get(type), localName, streamVar).build();
            case INT:
                return CodeBlock.builder()
                    .addStatement("$T $L = $L.readInt()", TypeName.get(type), localName, streamVar)
                    .build();
            case LONG:
                return CodeBlock.builder()
                    .addStatement("$T $L = $L.readLong()", TypeName.get(type), localName, streamVar)
                    .build();
            case FLOAT:
                return CodeBlock.builder().addStatement("$T $L = $L.readFloat()",
                    TypeName.get(type), localName, streamVar).build();
            case DOUBLE:
                return CodeBlock.builder().addStatement("$T $L = $L.readDouble()",
                    TypeName.get(type), localName, streamVar).build();
            case BOOLEAN:
                return CodeBlock.builder().addStatement("$T $L = $L.readBoolean()",
                    TypeName.get(type), localName, streamVar).build();
            case CHAR:
                return CodeBlock.builder()
                    .addStatement("$T $L = $L.readChar()", TypeName.get(type), localName, streamVar)
                    .build();
            case ARRAY: {
                ArrayType at = (ArrayType) type;
                TypeMirror comp = at.getComponentType();
                if (comp.getKind() == TypeKind.ARRAY) {
                    processingEnv.getMessager().printMessage(Diagnostic.Kind.ERROR,
                        "Multi-dimensional arrays are not supported by @Binrw: " + type);
                    return CodeBlock.builder().build();
                }
                String lenVar = localName + "_len";
                String iVar = localName + "_i";
                String elemVar = localName + "_elem";
                CodeBlock.Builder cb = CodeBlock.builder();
                cb.addStatement("int $L = $L.readInt()", lenVar, streamVar);
                cb.addStatement("$T $L = new $T[$L]", TypeName.get(type), localName,
                    TypeName.get(comp), lenVar);
                cb.beginControlFlow("for (int $L = 0; $L < $L; $L++)", iVar, iVar, lenVar, iVar);
                cb.add(buildReadBlock(comp, streamVar, elemVar, depth + 1));
                cb.addStatement("$L[$L] = $L", localName, iVar, elemVar);
                cb.endControlFlow();
                return cb.build();
            }
            case DECLARED: {
                DeclaredType declaredType = (DeclaredType) type;
                TypeElement typeElement = (TypeElement) declaredType.asElement();
                String qname = typeElement.getQualifiedName().toString();
                switch (qname) {
                    case "java.lang.Byte":
                        return CodeBlock.builder().addStatement("$T $L = $L.readByte()",
                            TypeName.get(type), localName, streamVar).build();
                    case "java.lang.Short":
                        return CodeBlock.builder().addStatement("$T $L = $L.readShort()",
                            TypeName.get(type), localName, streamVar).build();
                    case "java.lang.Integer":
                        return CodeBlock.builder().addStatement("$T $L = $L.readInt()",
                            TypeName.get(type), localName, streamVar).build();
                    case "java.lang.Long":
                        return CodeBlock.builder().addStatement("$T $L = $L.readLong()",
                            TypeName.get(type), localName, streamVar).build();
                    case "java.lang.Float":
                        return CodeBlock.builder().addStatement("$T $L = $L.readFloat()",
                            TypeName.get(type), localName, streamVar).build();
                    case "java.lang.Double":
                        return CodeBlock.builder().addStatement("$T $L = $L.readDouble()",
                            TypeName.get(type), localName, streamVar).build();
                    case "java.lang.Boolean":
                        return CodeBlock.builder().addStatement("$T $L = $L.readBoolean()",
                            TypeName.get(type), localName, streamVar).build();
                    case "java.lang.Character":
                        return CodeBlock.builder().addStatement("$T $L = $L.readChar()",
                            TypeName.get(type), localName, streamVar).build();
                    case "java.lang.String":
                        return CodeBlock.builder().addStatement("$T $L = $L.readUTF()",
                            TypeName.get(type), localName, streamVar).build();
                    default:
                        break;
                }
                if (isMeasureType(typeElement)) {
                    TypeElement unitTypeElement = getUnitTypeElement(declaredType, typeElement);
                    if (unitTypeElement == null) {
                        processingEnv.getMessager().printMessage(Diagnostic.Kind.ERROR,
                            "Cannot determine unit type for @Binrw Measure field: " + type
                                + ". Use a concrete type from edu.wpi.first.units.measure.*"
                                + " or Measure<U> with a known unit type.");
                        return CodeBlock.builder().build();
                    }
                    return CodeBlock.builder()
                        .addStatement("$T $L = ($T) $L.of($L.readDouble())", TypeName.get(type),
                            localName, TypeName.get(type), buildUnitExpr(unitTypeElement),
                            streamVar)
                        .build();
                }
                if (isListType(typeElement)) {
                    List<? extends TypeMirror> args = declaredType.getTypeArguments();
                    TypeMirror elemType = args.isEmpty() ? null : args.get(0);
                    String lenVar = localName + "_len";
                    String iVar = localName + "_i";
                    String elemVar = localName + "_elem";
                    CodeBlock.Builder cb = CodeBlock.builder();
                    cb.addStatement("int $L = $L.readInt()", lenVar, streamVar);
                    cb.addStatement("$T $L = new $T<>($L)", TypeName.get(type), localName,
                        ClassName.get(ArrayList.class), lenVar);
                    if (elemType != null) {
                        cb.beginControlFlow("for (int $L = 0; $L < $L; $L++)", iVar, iVar, lenVar,
                            iVar);
                        cb.add(buildReadBlock(elemType, streamVar, elemVar, depth + 1));
                        cb.addStatement("$L.add($L)", localName, elemVar);
                        cb.endControlFlow();
                    }
                    return cb.build();
                }
                if (isMapType(typeElement)) {
                    List<? extends TypeMirror> args = declaredType.getTypeArguments();
                    TypeMirror keyType = args.size() > 0 ? args.get(0) : null;
                    TypeMirror valType = args.size() > 1 ? args.get(1) : null;
                    String lenVar = localName + "_len";
                    String iVar = localName + "_i";
                    String keyVar = localName + "_key";
                    String valVar = localName + "_val";
                    CodeBlock.Builder cb = CodeBlock.builder();
                    cb.addStatement("int $L = $L.readInt()", lenVar, streamVar);
                    cb.addStatement("$T $L = new $T<>($L)", TypeName.get(type), localName,
                        ClassName.get(LinkedHashMap.class), lenVar);
                    if (keyType != null && valType != null) {
                        cb.beginControlFlow("for (int $L = 0; $L < $L; $L++)", iVar, iVar, lenVar,
                            iVar);
                        cb.add(buildReadBlock(keyType, streamVar, keyVar, depth + 1));
                        cb.add(buildReadBlock(valType, streamVar, valVar, depth + 1));
                        cb.addStatement("$L.put($L, $L)", localName, keyVar, valVar);
                        cb.endControlFlow();
                    }
                    return cb.build();
                }
                if (isBinrwType(typeElement)) {
                    String typeElementPkg = Utilities.getPackageName(typeElement);
                    ClassName readerClass =
                        ClassName.get(typeElementPkg, typeElement.getSimpleName() + "Reader");
                    return CodeBlock.builder().addStatement("$T $L = $T.read($L)",
                        TypeName.get(type), localName, readerClass, streamVar).build();
                }
                processingEnv.getMessager().printMessage(Diagnostic.Kind.ERROR,
                    "Unsupported field type for @Binrw: " + type);
                return CodeBlock.builder().build();
            }
            default:
                processingEnv.getMessager().printMessage(Diagnostic.Kind.ERROR,
                    "Unsupported field type kind for @Binrw: " + type.getKind());
                return CodeBlock.builder().build();
        }
    }

    /**
     * Emits statements that write {@code valueExpr} (of the given type) to {@code streamVar}.
     */
    private CodeBlock buildWriteBlock(TypeMirror type, String streamVar, String valueExpr,
        int depth) {
        switch (type.getKind()) {
            case BYTE:
                return CodeBlock.builder().addStatement("$L.writeByte($L)", streamVar, valueExpr)
                    .build();
            case SHORT:
                return CodeBlock.builder().addStatement("$L.writeShort($L)", streamVar, valueExpr)
                    .build();
            case INT:
                return CodeBlock.builder().addStatement("$L.writeInt($L)", streamVar, valueExpr)
                    .build();
            case LONG:
                return CodeBlock.builder().addStatement("$L.writeLong($L)", streamVar, valueExpr)
                    .build();
            case FLOAT:
                return CodeBlock.builder().addStatement("$L.writeFloat($L)", streamVar, valueExpr)
                    .build();
            case DOUBLE:
                return CodeBlock.builder().addStatement("$L.writeDouble($L)", streamVar, valueExpr)
                    .build();
            case BOOLEAN:
                return CodeBlock.builder().addStatement("$L.writeBoolean($L)", streamVar, valueExpr)
                    .build();
            case CHAR:
                return CodeBlock.builder().addStatement("$L.writeChar($L)", streamVar, valueExpr)
                    .build();
            case ARRAY: {
                ArrayType at = (ArrayType) type;
                TypeMirror comp = at.getComponentType();
                if (comp.getKind() == TypeKind.ARRAY) {
                    processingEnv.getMessager().printMessage(Diagnostic.Kind.ERROR,
                        "Multi-dimensional arrays are not supported by @Binrw: " + type);
                    return CodeBlock.builder().build();
                }
                String iVar = "wri" + depth + "_i";
                CodeBlock.Builder cb = CodeBlock.builder();
                cb.addStatement("$L.writeInt($L.length)", streamVar, valueExpr);
                cb.beginControlFlow("for (int $L = 0; $L < $L.length; $L++)", iVar, iVar, valueExpr,
                    iVar);
                cb.add(buildWriteBlock(comp, streamVar, valueExpr + "[" + iVar + "]", depth + 1));
                cb.endControlFlow();
                return cb.build();
            }
            case DECLARED: {
                DeclaredType declaredType = (DeclaredType) type;
                TypeElement typeElement = (TypeElement) declaredType.asElement();
                String qname = typeElement.getQualifiedName().toString();
                switch (qname) {
                    case "java.lang.Byte":
                        return CodeBlock.builder()
                            .addStatement("$L.writeByte($L)", streamVar, valueExpr).build();
                    case "java.lang.Short":
                        return CodeBlock.builder()
                            .addStatement("$L.writeShort($L)", streamVar, valueExpr).build();
                    case "java.lang.Integer":
                        return CodeBlock.builder()
                            .addStatement("$L.writeInt($L)", streamVar, valueExpr).build();
                    case "java.lang.Long":
                        return CodeBlock.builder()
                            .addStatement("$L.writeLong($L)", streamVar, valueExpr).build();
                    case "java.lang.Float":
                        return CodeBlock.builder()
                            .addStatement("$L.writeFloat($L)", streamVar, valueExpr).build();
                    case "java.lang.Double":
                        return CodeBlock.builder()
                            .addStatement("$L.writeDouble($L)", streamVar, valueExpr).build();
                    case "java.lang.Boolean":
                        return CodeBlock.builder()
                            .addStatement("$L.writeBoolean($L)", streamVar, valueExpr).build();
                    case "java.lang.Character":
                        return CodeBlock.builder()
                            .addStatement("$L.writeChar($L)", streamVar, valueExpr).build();
                    case "java.lang.String":
                        return CodeBlock.builder()
                            .addStatement("$L.writeUTF($L)", streamVar, valueExpr).build();
                    default:
                        break;
                }
                if (isMeasureType(typeElement)) {
                    return CodeBlock.builder().addStatement(
                        "$L.writeDouble($L.baseUnitMagnitude())", streamVar, valueExpr).build();
                }
                if (isListType(typeElement)) {
                    List<? extends TypeMirror> args = declaredType.getTypeArguments();
                    TypeMirror elemType = args.isEmpty() ? null : args.get(0);
                    String elemVar = "wri" + depth + "_elem";
                    CodeBlock.Builder cb = CodeBlock.builder();
                    cb.addStatement("$L.writeInt($L.size())", streamVar, valueExpr);
                    if (elemType != null) {
                        cb.beginControlFlow("for ($T $L : $L)", TypeName.get(elemType), elemVar,
                            valueExpr);
                        cb.add(buildWriteBlock(elemType, streamVar, elemVar, depth + 1));
                        cb.endControlFlow();
                    }
                    return cb.build();
                }
                if (isMapType(typeElement)) {
                    List<? extends TypeMirror> args = declaredType.getTypeArguments();
                    TypeMirror keyType = args.size() > 0 ? args.get(0) : null;
                    TypeMirror valType = args.size() > 1 ? args.get(1) : null;
                    String entryVar = "wri" + depth + "_entry";
                    CodeBlock.Builder cb = CodeBlock.builder();
                    cb.addStatement("$L.writeInt($L.size())", streamVar, valueExpr);
                    if (keyType != null && valType != null) {
                        ParameterizedTypeName entryType =
                            ParameterizedTypeName.get(ClassName.get(Map.Entry.class),
                                TypeName.get(keyType).box(), TypeName.get(valType).box());
                        cb.beginControlFlow("for ($T $L : $L.entrySet())", entryType, entryVar,
                            valueExpr);
                        cb.add(
                            buildWriteBlock(keyType, streamVar, entryVar + ".getKey()", depth + 1));
                        cb.add(buildWriteBlock(valType, streamVar, entryVar + ".getValue()",
                            depth + 1));
                        cb.endControlFlow();
                    }
                    return cb.build();
                }
                if (isBinrwType(typeElement)) {
                    String tePkg = Utilities.getPackageName(typeElement);
                    ClassName writerClass =
                        ClassName.get(tePkg, typeElement.getSimpleName() + "Writer");
                    return CodeBlock.builder()
                        .addStatement("$T.write($L, $L)", writerClass, streamVar, valueExpr)
                        .build();
                }
                processingEnv.getMessager().printMessage(Diagnostic.Kind.ERROR,
                    "Unsupported field type for @Binrw: " + type);
                return CodeBlock.builder().build();
            }
            default:
                processingEnv.getMessager().printMessage(Diagnostic.Kind.ERROR,
                    "Unsupported field type kind for @Binrw: " + type.getKind());
                return CodeBlock.builder().build();
        }
    }

    private boolean isListType(TypeElement typeElement) {
        TypeElement listElement = processingEnv.getElementUtils().getTypeElement("java.util.List");
        TypeMirror listErasure = processingEnv.getTypeUtils().erasure(listElement.asType());
        TypeMirror teErasure = processingEnv.getTypeUtils().erasure(typeElement.asType());
        return processingEnv.getTypeUtils().isAssignable(teErasure, listErasure);
    }

    private boolean isMapType(TypeElement typeElement) {
        TypeElement mapElement = processingEnv.getElementUtils().getTypeElement("java.util.Map");
        TypeMirror mapErasure = processingEnv.getTypeUtils().erasure(mapElement.asType());
        TypeMirror teErasure = processingEnv.getTypeUtils().erasure(typeElement.asType());
        return processingEnv.getTypeUtils().isAssignable(teErasure, mapErasure);
    }

    private boolean isBinrwType(TypeElement typeElement) {
        return typeElement.getAnnotationMirrors().stream().anyMatch(
            m -> m.getAnnotationType().asElement().getSimpleName().toString().equals("Binrw"));
    }

    private boolean isMeasureType(TypeElement typeElement) {
        TypeElement measureElement =
            processingEnv.getElementUtils().getTypeElement("edu.wpi.first.units.Measure");
        if (measureElement == null) {
            return false;
        }
        TypeMirror measureErasure = processingEnv.getTypeUtils().erasure(measureElement.asType());
        TypeMirror teErasure = processingEnv.getTypeUtils().erasure(typeElement.asType());
        return processingEnv.getTypeUtils().isAssignable(teErasure, measureErasure);
    }

    /**
     * Gets the {@code Unit} {@link TypeElement} from a {@code Measure} declared type, or
     * {@code null} if it cannot be determined.
     *
     * <p>
     * For the generic {@code Measure} interface, {@code U} is the direct type argument. For
     * concrete types in {@code edu.wpi.first.units.measure.*}, the unit type is found by inspecting
     * the {@code Measure} superinterface.
     */
    private TypeElement getUnitTypeElement(DeclaredType measureDeclaredType,
        TypeElement measureTypeElement) {
        if ("edu.wpi.first.units.Measure"
            .equals(measureTypeElement.getQualifiedName().toString())) {
            List<? extends TypeMirror> args = measureDeclaredType.getTypeArguments();
            if (!args.isEmpty() && args.get(0) instanceof DeclaredType uDeclaredType) {
                return (TypeElement) uDeclaredType.asElement();
            }
            return null;
        }
        for (TypeMirror iface : measureTypeElement.getInterfaces()) {
            if (!(iface instanceof DeclaredType ifaceDeclaredType)) {
                continue;
            }
            TypeElement ifaceTypeElement = (TypeElement) ifaceDeclaredType.asElement();
            if ("edu.wpi.first.units.Measure"
                .equals(ifaceTypeElement.getQualifiedName().toString())) {
                List<? extends TypeMirror> args = ifaceDeclaredType.getTypeArguments();
                if (!args.isEmpty() && args.get(0) instanceof DeclaredType uDeclaredType) {
                    return (TypeElement) uDeclaredType.asElement();
                }
            }
        }
        return null;
    }

    /**
     * Recursively builds a {@link CodeBlock} expression that evaluates to the base unit for the
     * given unit type.
     *
     * <p>
     * For base units (e.g. {@code DistanceUnit}): returns {@code BaseUnits.DistanceUnit}. For
     * compound units that extend {@code PerUnit<N, D>} (e.g. {@code AngularVelocityUnit}): returns
     * {@code BaseUnits.AngleUnit.per(BaseUnits.TimeUnit)}, recursing into N and D.
     */
    private CodeBlock buildUnitExpr(TypeElement unitType) {
        ClassName baseUnitsClass = ClassName.get("edu.wpi.first.units", "BaseUnits");
        TypeElement perUnitElement =
            processingEnv.getElementUtils().getTypeElement("edu.wpi.first.units.PerUnit");
        if (perUnitElement != null) {
            TypeMirror superClass = unitType.getSuperclass();
            if (superClass instanceof DeclaredType superDeclaredType) {
                TypeElement superTypeElement = (TypeElement) superDeclaredType.asElement();
                if ("edu.wpi.first.units.PerUnit"
                    .equals(superTypeElement.getQualifiedName().toString())) {
                    List<? extends TypeMirror> args = superDeclaredType.getTypeArguments();
                    if (args.size() >= 2 && args.get(0) instanceof DeclaredType numDt
                        && args.get(1) instanceof DeclaredType denDt) {
                        CodeBlock numExpr = buildUnitExpr((TypeElement) numDt.asElement());
                        CodeBlock denExpr = buildUnitExpr((TypeElement) denDt.asElement());
                        return CodeBlock.of("$L.per($L)", numExpr, denExpr);
                    }
                }
            }
        }
        return CodeBlock.of("$T.$L", baseUnitsClass, unitType.getSimpleName().toString());
    }
}
