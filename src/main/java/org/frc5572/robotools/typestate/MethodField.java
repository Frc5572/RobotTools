package org.frc5572.robotools.typestate;

import javax.lang.model.type.TypeMirror;

/** A non-init field */
public class MethodField extends Field {
    /** An alternative method for fulfilling this field. */
    public final AltMethod alt;

    /** A non-init field */
    public MethodField(TypeMirror type, String name, AltMethod alt) {
        super(type, name);
        this.alt = alt;
    }

    /** A non-init field */
    public MethodField(TypeMirror type, String name) {
        this(type, name, null);
    }
}
