package org.frc5572.util.serde;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/** File supports serialization to and from a log table. */
@Retention(RetentionPolicy.SOURCE)
@Target({ElementType.TYPE})
public @interface Serde {}
