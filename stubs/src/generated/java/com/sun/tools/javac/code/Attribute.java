package com.sun.tools.javac.code;

import javax.lang.model.element.AnnotationMirror;
import javax.lang.model.element.AnnotationValue;

public abstract class Attribute implements AnnotationValue {
  public static class Array extends Attribute {
  }

  public static class Class extends Attribute {
  }

  public static class Compound extends Attribute implements AnnotationMirror {
  }

  public static class Constant extends Attribute {
  }

  public static class Enum extends Attribute {
  }

  public static class Error extends Attribute {
  }

  public final enum RetentionPolicy {
    SOURCE,

    CLASS,

    RUNTIME
  }

  public static class TypeCompound extends Compound {
  }

  public static class UnresolvedClass extends Error {
  }

  public interface Visitor {
  }
}
