package com.sun.tools.javac.code;

public class TypeAnnotationPosition {
  public static class TypePathEntry {
  }

  public final enum TypePathEntryKind {
    ARRAY,

    INNER_TYPE,

    WILDCARD,

    TYPE_ARGUMENT
  }
}
