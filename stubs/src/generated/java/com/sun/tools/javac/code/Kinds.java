package com.sun.tools.javac.code;

public class Kinds {
  final enum Category {
    BASIC,

    ERROR,

    RESOLUTION,

    RESOLUTION_TARGET
  }

  public final enum Kind {
    NIL,

    PCK,

    TYP,

    VAR,

    MTH,

    POLY,

    MDL,

    ERR,

    AMBIGUOUS,

    HIDDEN,

    STATICERR,

    MISSING_ENCL,

    BAD_RESTRICTED_TYPE,

    ABSENT_VAR,

    WRONG_MTHS,

    WRONG_MTH,

    ABSENT_MTH,

    ABSENT_TYP
  }

  public final enum KindName {
    ANNOTATION,

    CONSTRUCTOR,

    INTERFACE,

    ENUM,

    STATIC,

    TYPEVAR,

    BOUND,

    VAR,

    VAL,

    METHOD,

    CLASS,

    STATIC_INIT,

    INSTANCE_INIT,

    PACKAGE,

    MODULE,

    RECORD_COMPONENT,

    RECORD
  }

  public static class KindSelector {
  }
}
