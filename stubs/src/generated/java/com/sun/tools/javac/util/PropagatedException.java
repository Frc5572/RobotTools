package com.sun.tools.javac.util;

import java.lang.RuntimeException;
import java.lang.Throwable;

public class PropagatedException extends RuntimeException {
  public PropagatedException(RuntimeException arg0) {
  }

  public RuntimeException getCause() {
    return null;
  }

  public Throwable getCause() {
    return null;
  }
}
