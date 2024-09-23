package com.sun.tools.javac.code;

import com.sun.tools.javac.util.Context;
import com.sun.tools.javac.util.JCDiagnostic;

public class DeferredLintHandler {
  protected DeferredLintHandler(Context arg0) {
  }

  public static DeferredLintHandler instance(Context arg0) {
    return null;
  }

  public void report(LintLogger arg0) {
  }

  public void flush(JCDiagnostic.DiagnosticPosition arg0) {
  }

  public JCDiagnostic.DiagnosticPosition setPos(JCDiagnostic.DiagnosticPosition arg0) {
    return null;
  }

  public JCDiagnostic.DiagnosticPosition immediate() {
    return null;
  }

  public interface LintLogger {
    void report();
  }
}
