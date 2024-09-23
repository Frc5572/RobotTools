package com.sun.tools.javac.code;

import java.lang.String;
import java.util.EnumSet;
import java.util.Set;

public class Flags {
  private Flags() {
  }

  public static String toString(long arg0) {
    return null;
  }

  public static EnumSet asFlagSet(long arg0) {
    return null;
  }

  public static String toSource(long arg0) {
    return null;
  }

  public static Set asModifierSet(long arg0) {
    return null;
  }

  public static boolean isStatic(Symbol arg0) {
    return false;
  }

  public static boolean isEnum(Symbol arg0) {
    return false;
  }

  public static boolean isConstant(Symbol.VarSymbol arg0) {
    return false;
  }

  public enum Flag {
    PUBLIC,

    PRIVATE,

    PROTECTED,

    STATIC,

    FINAL,

    SYNCHRONIZED,

    VOLATILE,

    TRANSIENT,

    NATIVE,

    INTERFACE,

    ABSTRACT,

    DEFAULT,

    STRICTFP,

    BRIDGE,

    SYNTHETIC,

    ANNOTATION,

    DEPRECATED,

    HASINIT,

    UNNAMED_CLASS,

    BLOCK,

    FROM_SOURCE,

    ENUM,

    MANDATED,

    NOOUTERTHIS,

    EXISTS,

    COMPOUND,

    CLASS_SEEN,

    SOURCE_SEEN,

    LOCKED,

    UNATTRIBUTED,

    ANONCONSTR,

    ACYCLIC,

    PARAMETER,

    VARARGS,

    ACYCLIC_ANN,

    GENERATEDCONSTR,

    HYPOTHETICAL,

    PROPRIETARY,

    UNION,

    EFFECTIVELY_FINAL,

    CLASH,

    AUXILIARY,

    NOT_IN_PROFILE,

    BAD_OVERRIDE,

    SIGNATURE_POLYMORPHIC,

    THROWS,

    LAMBDA_METHOD,

    TYPE_TRANSLATED,

    MODULE,

    AUTOMATIC_MODULE,

    SYSTEM_MODULE,

    DEPRECATED_ANNOTATION,

    DEPRECATED_REMOVAL,

    HAS_RESOURCE,

    ANONCONSTR_BASED,

    NAME_FILLED,

    PREVIEW_API,

    PREVIEW_REFLECTIVE,

    MATCH_BINDING,

    MATCH_BINDING_TO_OUTER,

    RECORD,

    RECOVERABLE,

    SEALED,

    NON_SEALED
  }
}
