package com.sun.tools.javac.main;

import java.lang.Exception;
import java.lang.String;
import java.lang.Throwable;

public enum Option {
  G,

  G_NONE,

  G_CUSTOM,

  XLINT,

  XLINT_CUSTOM,

  XDOCLINT,

  XDOCLINT_CUSTOM,

  XDOCLINT_PACKAGE,

  NOWARN,

  VERBOSE,

  DEPRECATION,

  CLASS_PATH,

  SOURCE_PATH,

  MODULE_SOURCE_PATH,

  MODULE_PATH,

  UPGRADE_MODULE_PATH,

  SYSTEM,

  PATCH_MODULE,

  BOOT_CLASS_PATH,

  XBOOTCLASSPATH_PREPEND,

  XBOOTCLASSPATH_APPEND,

  XBOOTCLASSPATH,

  EXTDIRS,

  DJAVA_EXT_DIRS,

  ENDORSEDDIRS,

  DJAVA_ENDORSED_DIRS,

  PROC,

  PROCESSOR,

  PROCESSOR_PATH,

  PROCESSOR_MODULE_PATH,

  PARAMETERS,

  D,

  S,

  H,

  IMPLICIT,

  ENCODING,

  SOURCE,

  TARGET,

  RELEASE,

  PREVIEW,

  PROFILE,

  VERSION,

  FULLVERSION,

  HELP,

  A,

  DEFAULT_MODULE_FOR_CREATED_FILES,

  X,

  HELP_LINT,

  J,

  MOREINFO,

  WERROR,

  PROMPT,

  DOE,

  PRINTSOURCE,

  WARNUNCHECKED,

  XMAXERRS,

  XMAXWARNS,

  XSTDOUT,

  XPRINT,

  XPRINTROUNDS,

  XPRINTPROCESSORINFO,

  XPREFER,

  XXUSERPATHSFIRST,

  XPKGINFO,

  O,

  XJCOV,

  PLUGIN,

  XDIAGS,

  DEBUG,

  SHOULDSTOP,

  DIAGS,

  XD,

  ADD_EXPORTS,

  ADD_OPENS,

  ADD_READS,

  MODULE,

  ADD_MODULES,

  LIMIT_MODULES,

  MODULE_VERSION,

  AT,

  SOURCEFILE,

  MULTIRELEASE,

  INHERIT_RUNTIME_ENVIRONMENT;

  public final enum ArgKind {
    NONE,

    REQUIRED,

    ADJACENT
  }

  final enum ChoiceKind {
    ONEOF,

    ANYOF
  }

  final enum HiddenGroup {
    DIAGS,

    DEBUG,

    SHOULDSTOP
  }

  public static class InvalidValueException extends Exception {
    public InvalidValueException(String arg0) {
    }

    public InvalidValueException(String arg0, Throwable arg1) {
    }
  }

  final enum OptionGroup {
    BASIC,

    FILEMANAGER,

    INFO,

    OPERAND
  }

  public final enum OptionKind {
    STANDARD,

    EXTENDED,

    HIDDEN
  }

  public final enum PkgInfo {
    ALWAYS,

    LEGACY,

    NONEMPTY
  }
}
