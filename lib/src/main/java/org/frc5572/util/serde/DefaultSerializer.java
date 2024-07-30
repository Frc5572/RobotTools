package org.frc5572.util.serde;

/** Mark this class as the default serialization implementation for a given class. */
public @interface DefaultSerializer {
    Class<?> value();
}
