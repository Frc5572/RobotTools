package com.sun.tools.javac.code;

import com.sun.tools.javac.tree.TreeScanner;

public class TypeAnnotations {
  public final enum AnnotationType {
    DECLARATION,

    TYPE,

    NONE,

    BOTH
  }

  static class TypeAnnotationPositions extends TreeScanner {
  }
}
