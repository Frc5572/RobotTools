package com.sun.tools.javac.comp;

import java.util.HashMap;

public class CompileStates extends HashMap {
  public final enum CompileState {
    INIT,

    PARSE,

    ENTER,

    PROCESS,

    ATTR,

    FLOW,

    TRANSTYPES,

    TRANSLITERALS,

    TRANSPATTERNS,

    UNLAMBDA,

    LOWER,

    GENERATE
  }
}
