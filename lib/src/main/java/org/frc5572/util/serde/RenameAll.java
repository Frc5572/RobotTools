package org.frc5572.util.serde;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/** Rename all fields in serialized table using the given case conversions. This is ignored for any field with an explicit {@link Rename} annotation. */
@Retention(RetentionPolicy.SOURCE)
@Target({ElementType.TYPE})
public @interface RenameAll {
    Casing value();
}
