package org.frc5572.util.serde;

import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/** Additional name this field could go by. Only used for deserialization, and only used if previous names/aliases are missing in log files. */
@Retention(RetentionPolicy.SOURCE)
@Target({ElementType.FIELD})
@Repeatable(Aliases.class)
public @interface Alias {
    String value();
}
