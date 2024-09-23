package com.sun.tools.doclint;

import com.sun.source.util.JavacTask;
import com.sun.source.util.Plugin;
import java.lang.String;
import java.util.ServiceLoader;

public abstract class DocLint implements Plugin {
  public DocLint() {
  }

  public abstract boolean isValidOption(String arg0);

  public static synchronized DocLint newDocLint() {
    return null;
  }

  private static boolean lambda$newDocLint$0(ServiceLoader.Provider arg0) {
    return false;
  }

  static class NoDocLint extends DocLint {
    private NoDocLint() {
    }

    public String getName() {
      return null;
    }

    public void init(JavacTask arg0, String[] arg1) {
    }

    public boolean isValidOption(String arg0) {
      return false;
    }
  }
}
