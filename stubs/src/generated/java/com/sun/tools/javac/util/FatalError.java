package com.sun.tools.javac.util;

import java.lang.Error;
import java.lang.String;
import java.lang.Throwable;

public class FatalError extends Error {
  public FatalError(JCDiagnostic arg0) {
  }

  public FatalError(JCDiagnostic arg0, Throwable arg1) {
  }

  public FatalError(String arg0) {
  }
}
