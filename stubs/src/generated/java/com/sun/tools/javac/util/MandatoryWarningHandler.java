package com.sun.tools.javac.util;

import com.sun.tools.javac.code.Lint;
import com.sun.tools.javac.code.Source;
import java.lang.Object;
import java.lang.String;
import javax.tools.JavaFileObject;

public class MandatoryWarningHandler {
  public MandatoryWarningHandler(Log arg0, Source arg1, boolean arg2, boolean arg3, String arg4,
      Lint.LintCategory arg5) {
  }

  public void report(JCDiagnostic.DiagnosticPosition arg0, JCDiagnostic.Warning arg1) {
  }

  public void reportDeferredDiagnostic() {
  }

  private void logMandatoryWarning(JCDiagnostic.DiagnosticPosition arg0,
      JCDiagnostic.Warning arg1) {
  }

  private void logMandatoryNote(JavaFileObject arg0, String arg1, Object[] arg2) {
  }

  public void clear() {
  }

  final enum DeferredDiagnosticKind {
    IN_FILE,

    ADDITIONAL_IN_FILE,

    IN_FILES,

    ADDITIONAL_IN_FILES
  }
}
