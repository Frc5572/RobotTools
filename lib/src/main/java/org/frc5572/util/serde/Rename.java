package org.frc5572.util.serde;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/** Rename field in log table using the given name. */
@Retention(RetentionPolicy.SOURCE)
@Target({ElementType.FIELD})
public @interface Rename {
    String value();
}
