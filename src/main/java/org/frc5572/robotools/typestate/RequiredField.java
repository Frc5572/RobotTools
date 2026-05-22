package org.frc5572.robotools.typestate;

import javax.lang.model.element.AnnotationMirror;
import javax.lang.model.type.TypeMirror;
import org.frc5572.robotools.Utilities;

/** A field that is required to finish the builder. */
public class RequiredField extends MethodField {

    /** A field that is required to finish the builder. */
    public RequiredField(TypeMirror type, String name, AltMethod alt) {
        super(type, name, alt);
    }

    /** A field that is required to finish the builder. */
    public RequiredField(TypeMirror type, String name) {
        super(type, name);
    }

    /** A field that is required to finish the builder. */
    public static RequiredField fromAnnotation(TypeMirror type, String name,
        AnnotationMirror mirror) {
        AltMethod alt = null;
        for (var ev : mirror.getElementValues().entrySet()) {
            if (ev.getKey().getSimpleName().toString().equals("alt")) {
                AnnotationMirror altMirror = Utilities.annotationAnnotationValue(ev.getValue());
                alt = AltMethod.fromAnnotation(altMirror, name);
            }
        }
        return new RequiredField(type, name, alt);
    }
}
