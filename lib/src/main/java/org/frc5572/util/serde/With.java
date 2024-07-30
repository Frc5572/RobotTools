package org.frc5572.util.serde;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/** Use a field with type that implements {@link Serialize} for serialization instead of the default. */
@Retention(RetentionPolicy.SOURCE)
@Target({ElementType.FIELD})
public @interface With {
    Class<? extends Serialize<?>> value();
}
