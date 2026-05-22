package org.frc5572.robotools.typestate;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.ProcessingEnvironment;
import javax.annotation.processing.RoundEnvironment;
import javax.lang.model.element.Element;
import javax.lang.model.element.ExecutableElement;
import javax.lang.model.element.Modifier;
import javax.lang.model.element.TypeElement;
import javax.lang.model.element.VariableElement;
import javax.tools.Diagnostic;
import javax.tools.Diagnostic.Kind;
import org.frc5572.robotools.AnnotationGenerator;
import org.frc5572.robotools.Utilities;
import com.squareup.javapoet.JavaFile;
import com.squareup.javapoet.TypeSpec;

/**
 * Annotation Generator for {@code @TypeStateBuilder}
 */
public final class TypeStateBuilderGenerator implements AnnotationGenerator {

    private ProcessingEnvironment processingEnv;

    @Override
    public void init(ProcessingEnvironment env) {
        this.processingEnv = env;
    }

    @Override
    public String getAnnotationQualifiedName() {
        return "frc.robot.util.typestate.TypeStateBuilder";
    }

    @Override
    public void generate(TypeElement annotation, RoundEnvironment roundEnv) {
        roundEnv.getElementsAnnotatedWith(annotation).forEach(constructorElement_ -> {
            ExecutableElement constructorElement = (ExecutableElement) constructorElement_;
            Element parent_ = constructorElement.getEnclosingElement();
            if (!(parent_ instanceof TypeElement)) {
                processingEnv.getMessager().printMessage(Kind.ERROR,
                    "TypeStateBuilder constructor must be the direct child of a TypeElement (e.g. class). Instead found "
                        + parent_.getKind().toString() + ".",
                    constructorElement);
            }
            TypeElement parent = (TypeElement) parent_;
            String builderName = parent.getSimpleName() + "Builder";
            String builderPackage = Utilities.getPackageName(parent);
            boolean isLinear = false;
            // System.out.println("Processing " + builderPackage + "." + builderName);
            for (var mirror : constructorElement.getAnnotationMirrors()) {
                if (!mirror.getAnnotationType().asElement().getSimpleName().toString()
                    .equals("TypeStateBuilder")) {
                    continue;
                }
                for (var ev : mirror.getElementValues().entrySet()) {
                    if (ev.getKey().getSimpleName().toString().equals("value")) {
                        String res = Utilities.stringAnnotationValue(ev.getValue());
                        if (res != null) {
                            builderName = res;
                        }
                    } else if (ev.getKey().getSimpleName().toString().equals("linear")) {
                        Boolean res = Utilities.boolAnnotationValue(ev.getValue());
                        if (res != null) {
                            isLinear = res;
                        }
                    }
                }
            }

            List<Field> fields = new ArrayList<>();
            List<? extends VariableElement> params = constructorElement.getParameters();
            for (int i = 0; i < params.size(); i++) {
                boolean found = false;
                VariableElement param = params.get(i);
                for (var mirror : param.getAnnotationMirrors()) {
                    if (mirror.getAnnotationType().asElement().getSimpleName().toString()
                        .equals("InitField")) {
                        if (found) {
                            processingEnv.getMessager().printMessage(Kind.ERROR,
                                "Each parameter of a TypeStateBuilder constructor can only "
                                    + "have one of @InitField, @RequiredField or @OptionalField",
                                param);
                        }
                        fields.add(new InitField(param.asType(), param.getSimpleName().toString()));
                        found = true;
                    } else if (mirror.getAnnotationType().asElement().getSimpleName().toString()
                        .equals("RequiredField")) {
                        if (found) {
                            processingEnv.getMessager().printMessage(Kind.ERROR,
                                "Each parameter of a TypeStateBuilder constructor can only "
                                    + "have one of @InitField, @RequiredField or @OptionalField",
                                param);
                        }
                        fields.add(RequiredField.fromAnnotation(param.asType(),
                            param.getSimpleName().toString(), mirror));
                        found = true;
                    } else if (mirror.getAnnotationType().asElement().getSimpleName().toString()
                        .equals("OptionalField")) {
                        if (found) {
                            processingEnv.getMessager().printMessage(Kind.ERROR,
                                "Each parameter of a TypeStateBuilder constructor can only "
                                    + "have one of @InitField, @RequiredField or @OptionalField",
                                param);
                        }
                        fields.add(OptionalField.fromAnnotation(param.asType(),
                            param.getSimpleName().toString(), mirror));
                        found = true;
                    }
                }
                if (!found) {
                    processingEnv.getMessager()
                        .printMessage(Kind.ERROR,
                            "Each parameter of a TypeStateBuilder constructor must "
                                + "have one of @InitField, @RequiredField or @OptionalField",
                            param);
                }
            }

            var specBuilder =
                TypeSpec.classBuilder(builderName).addModifiers(Modifier.PUBLIC, Modifier.FINAL);

            TypeStateBuilder typeStateBuilder = new TypeStateBuilder(builderName, isLinear,
                fields.toArray(Field[]::new), parent.asType());
            typeStateBuilder.apply(specBuilder);

            var spec = specBuilder.build();

            JavaFile file = JavaFile.builder(builderPackage, spec).build();
            try {
                file.writeTo(processingEnv.getFiler());
            } catch (IOException e) {
                processingEnv.getMessager().printMessage(Diagnostic.Kind.ERROR,
                    "Failed to write class", constructorElement);
                e.printStackTrace();
            }
        });
    }
}

