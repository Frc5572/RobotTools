package org.frc5572.robotools.typestate;

import javax.lang.model.element.AnnotationMirror;
import javax.lang.model.type.TypeMirror;
import org.frc5572.robotools.Utilities;

/** Alternative method for a field. */
public record AltMethod(TypeMirror type, String parameterName, String code) {
    /** Alternative method for a field. */
    public static AltMethod fromAnnotation(AnnotationMirror mirror, String defaultName) {
        if (mirror == null) {
            System.out.println("annotation is null");
            return null;
        }

        if (!mirror.getAnnotationType().asElement().getSimpleName().toString()
            .equals("AltMethod")) {
            System.out.println("annotation name doesn't match "
                + mirror.getAnnotationType().asElement().getSimpleName().toString());
            return null;
        }
        TypeMirror type = null;
        String parameterName = defaultName;
        String code = null;

        for (var ev : mirror.getElementValues().entrySet()) {
            if (ev.getKey().getSimpleName().toString().equals("type")) {
                type = Utilities.classAnnotationValue(ev.getValue());
            } else if (ev.getKey().getSimpleName().toString().equals("parameter_name")) {
                parameterName = Utilities.stringAnnotationValue(ev.getValue());
            } else if (ev.getKey().getSimpleName().toString().equals("value")) {
                code = Utilities.stringAnnotationValue(ev.getValue());
            }
        }

        if (type == null) {
            System.out.println("Missing type");
            return null;
        }
        if (code == null) {
            System.out.println("Missing code");
            return null;
        }

        return new AltMethod(type, parameterName, code);
    }
}
