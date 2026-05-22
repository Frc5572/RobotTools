package org.frc5572.robotools.typestate;

import javax.lang.model.element.AnnotationMirror;
import javax.lang.model.type.TypeMirror;
import org.frc5572.robotools.Utilities;

/** A field that has a default in case it is not specified. */
public class OptionalField extends MethodField {
    /** Java expression that provides the default value. */
    public final String default_code;

    /** A field that has a default in case it is not specified. */
    public OptionalField(TypeMirror type, String name, AltMethod alt, String default_code) {
        super(type, name, alt);
        this.default_code = default_code;
    }

    /** A field that has a default in case it is not specified. */
    public OptionalField(TypeMirror type, String name, String default_code) {
        super(type, name);
        this.default_code = default_code;
    }

    /** A field that has a default in case it is not specified. */
    public static OptionalField fromAnnotation(TypeMirror type, String name,
        AnnotationMirror mirror) {
        String defaultCode = "";
        AltMethod alt = null;
        for (var ev : mirror.getElementValues().entrySet()) {
            if (ev.getKey().getSimpleName().toString().equals("value")) {
                defaultCode = Utilities.stringAnnotationValue(ev.getValue());
            } else if (ev.getKey().getSimpleName().toString().equals("alt")) {
                AnnotationMirror altMirror = Utilities.annotationAnnotationValue(ev.getValue());
                alt = AltMethod.fromAnnotation(altMirror, name);
            }
        }
        return new OptionalField(type, name, alt, defaultCode);
    }
}
