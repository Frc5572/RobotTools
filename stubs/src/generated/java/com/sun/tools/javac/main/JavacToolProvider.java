package com.sun.tools.javac.main;

import java.io.PrintWriter;
import java.lang.String;
import java.util.Optional;
import java.util.spi.ToolProvider;

public class JavacToolProvider implements ToolProvider {
  public JavacToolProvider() {
  }

  public String name() {
    return null;
  }

  public Optional description() {
    return null;
  }

  public int run(PrintWriter arg0, PrintWriter arg1, String[] arg2) {
    return 0;
  }
}
