package org.frc5572.robotools.typestate;

import javax.lang.model.type.TypeMirror;

/** Field that must be provided when creating a builder */
public class InitField extends Field {
    /** Field that must be provided when creating a builder */
    public InitField(TypeMirror type, String name) {
        super(type, name);
    }
}
