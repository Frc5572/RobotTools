package com.sun.tools.javac.util;

import com.sun.tools.javac.code.Lint;
import java.lang.Object;
import java.lang.String;
import javax.tools.JavaFileObject;

public abstract class AbstractLog {
  AbstractLog(JCDiagnostic.Factory arg0) {
  }

  public JavaFileObject useSource(JavaFileObject arg0) {
    return null;
  }

  protected DiagnosticSource getSource(JavaFileObject arg0) {
    return null;
  }

  public DiagnosticSource currentSource() {
    return null;
  }

  public void error(String arg0, Object[] arg1) {
  }

  public void error(JCDiagnostic.Error arg0) {
  }

  public void error(JCDiagnostic.DiagnosticPosition arg0, JCDiagnostic.Error arg1) {
  }

  public void error(JCDiagnostic.DiagnosticFlag arg0, JCDiagnostic.DiagnosticPosition arg1,
      JCDiagnostic.Error arg2) {
  }

  public void error(int arg0, String arg1, Object[] arg2) {
  }

  public void error(int arg0, JCDiagnostic.Error arg1) {
  }

  public void error(JCDiagnostic.DiagnosticFlag arg0, int arg1, JCDiagnostic.Error arg2) {
  }

  public void warning(JCDiagnostic.Warning arg0) {
  }

  public void warning(Lint.LintCategory arg0, JCDiagnostic.Warning arg1) {
  }

  public void warning(JCDiagnostic.DiagnosticPosition arg0, JCDiagnostic.Warning arg1) {
  }

  public void warning(Lint.LintCategory arg0, JCDiagnostic.DiagnosticPosition arg1,
      JCDiagnostic.Warning arg2) {
  }

  public void warning(int arg0, JCDiagnostic.Warning arg1) {
  }

  public void mandatoryWarning(JCDiagnostic.DiagnosticPosition arg0, JCDiagnostic.Warning arg1) {
  }

  public void mandatoryWarning(Lint.LintCategory arg0, JCDiagnostic.DiagnosticPosition arg1,
      JCDiagnostic.Warning arg2) {
  }

  public void note(JCDiagnostic.Note arg0) {
  }

  public void note(JCDiagnostic.DiagnosticPosition arg0, JCDiagnostic.Note arg1) {
  }

  public void note(int arg0, JCDiagnostic.Note arg1) {
  }

  public void note(JavaFileObject arg0, JCDiagnostic.Note arg1) {
  }

  public void mandatoryNote(JavaFileObject arg0, JCDiagnostic.Note arg1) {
  }

  protected abstract void report(JCDiagnostic arg0);

  protected abstract void directError(String arg0, Object[] arg1);

  private JCDiagnostic.DiagnosticPosition wrap(int arg0) {
    return null;
  }
}
