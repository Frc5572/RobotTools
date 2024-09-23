package com.sun.tools.javac.code;

public class Lint {
  public static class AugmentVisitor implements Attribute.Visitor {
  }

  public final enum LintCategory {
    AUXILIARYCLASS,

    CAST,

    CLASSFILE,

    DEPRECATION,

    DEP_ANN,

    DIVZERO,

    EMPTY,

    EXPORTS,

    FALLTHROUGH,

    FINALLY,

    LOSSY_CONVERSIONS,

    MISSING_EXPLICIT_CTOR,

    MODULE,

    OPENS,

    OPTIONS,

    OUTPUT_FILE_CLASH,

    OVERLOADS,

    OVERRIDES,

    PATH,

    PROCESSING,

    RAW,

    REMOVAL,

    REQUIRES_AUTOMATIC,

    REQUIRES_TRANSITIVE_AUTOMATIC,

    SERIAL,

    STATIC,

    STRICTFP,

    SYNCHRONIZATION,

    TEXT_BLOCKS,

    THIS_ESCAPE,

    TRY,

    UNCHECKED,

    VARARGS,

    PREVIEW
  }
}
