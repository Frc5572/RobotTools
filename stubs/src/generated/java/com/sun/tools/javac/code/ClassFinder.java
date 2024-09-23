package com.sun.tools.javac.code;

public class ClassFinder {
  public static class BadClassFile extends Symbol.CompletionFailure {
  }

  public static class BadEnclosingMethodAttr extends BadClassFile {
  }
}
