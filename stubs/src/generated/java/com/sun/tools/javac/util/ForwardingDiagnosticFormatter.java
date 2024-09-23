package com.sun.tools.javac.util;

import com.sun.tools.javac.api.DiagnosticFormatter;
import java.lang.String;
import java.util.Locale;
import java.util.Set;
import javax.tools.Diagnostic;

public class ForwardingDiagnosticFormatter implements DiagnosticFormatter {
  public ForwardingDiagnosticFormatter(DiagnosticFormatter arg0) {
  }

  public DiagnosticFormatter getDelegatedFormatter() {
    return null;
  }

  public DiagnosticFormatter.Configuration getConfiguration() {
    return null;
  }

  public boolean displaySource(Diagnostic arg0) {
    return false;
  }

  public String format(Diagnostic arg0, Locale arg1) {
    return null;
  }

  public String formatKind(Diagnostic arg0, Locale arg1) {
    return null;
  }

  public String formatMessage(Diagnostic arg0, Locale arg1) {
    return null;
  }

  public String formatPosition(Diagnostic arg0, DiagnosticFormatter.PositionKind arg1,
      Locale arg2) {
    return null;
  }

  public String formatSource(Diagnostic arg0, boolean arg1, Locale arg2) {
    return null;
  }

  public static class ForwardingConfiguration implements DiagnosticFormatter.Configuration {
    public ForwardingConfiguration(DiagnosticFormatter.Configuration arg0) {
    }

    public DiagnosticFormatter.Configuration getDelegatedConfiguration() {
      return null;
    }

    public int getMultilineLimit(DiagnosticFormatter.Configuration.MultilineLimit arg0) {
      return 0;
    }

    public Set getVisible() {
      return null;
    }

    public void setMultilineLimit(DiagnosticFormatter.Configuration.MultilineLimit arg0, int arg1) {
    }

    public void setVisible(Set arg0) {
    }
  }
}
