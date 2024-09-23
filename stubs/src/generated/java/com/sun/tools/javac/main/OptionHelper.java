package com.sun.tools.javac.main;

import com.sun.tools.javac.util.JCDiagnostic;
import com.sun.tools.javac.util.Log;
import java.lang.String;
import java.nio.file.Path;

public abstract class OptionHelper {
  public OptionHelper() {
  }

  public abstract String get(Option arg0);

  public abstract void put(String arg0, String arg1);

  public abstract void remove(String arg0);

  public abstract boolean handleFileManagerOption(Option arg0, String arg1);

  public abstract Log getLog();

  public abstract String getOwnName();

  Option.InvalidValueException newInvalidValueException(JCDiagnostic.Error arg0) {
    return null;
  }

  abstract void addFile(Path arg0);

  abstract void addClassName(String arg0);

  public static class GrumpyHelper extends OptionHelper {
    public GrumpyHelper(Log arg0) {
    }

    public Log getLog() {
      return null;
    }

    public String getOwnName() {
      return null;
    }

    public String get(Option arg0) {
      return null;
    }

    public void put(String arg0, String arg1) {
    }

    public void remove(String arg0) {
    }

    public boolean handleFileManagerOption(Option arg0, String arg1) {
      return false;
    }

    public void addFile(Path arg0) {
    }

    public void addClassName(String arg0) {
    }
  }
}
