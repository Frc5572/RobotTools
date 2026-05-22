package org.frc5572.robotools.typestate;

import javax.lang.model.type.TypeMirror;

/** Base class for fields */
public class Field {
    /** Field type */
    public final TypeMirror type;
    /** Field name */
    public final String name;

    /** Base class for fields */
    public Field(TypeMirror type, String name) {
        this.type = type;
        this.name = name;
    }
}
