package com.sun.tools.javac.util;

import java.lang.Exception;

public class InvalidUtfException extends Exception {
  public InvalidUtfException(int arg0) {
  }

  public int getOffset() {
    return 0;
  }
}
