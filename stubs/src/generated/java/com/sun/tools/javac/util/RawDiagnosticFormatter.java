package com.sun.tools.javac.util;

import com.sun.tools.javac.tree.JCTree;
import java.lang.Object;
import java.lang.String;
import java.util.Locale;
import javax.tools.Diagnostic;

public final class RawDiagnosticFormatter extends AbstractDiagnosticFormatter {
  public RawDiagnosticFormatter(Options arg0) {
  }

  public String formatDiagnostic(JCDiagnostic arg0, Locale arg1) {
    return null;
  }

  public String formatMessage(JCDiagnostic arg0, Locale arg1) {
    return null;
  }

  protected String formatArgument(JCDiagnostic arg0, Object arg1, Locale arg2) {
    return null;
  }

  protected String localize(Locale arg0, String arg1, Object[] arg2) {
    return null;
  }

  public boolean isRaw() {
    return false;
  }

  public String formatMessage(Diagnostic arg0, Locale arg1) {
    return null;
  }

  static class RawDiagnosticPosHelper {
    RawDiagnosticPosHelper(JCDiagnostic arg0) {
    }

    String getPosition(JCTree.JCExpression arg0) {
      return null;
    }
  }
}
