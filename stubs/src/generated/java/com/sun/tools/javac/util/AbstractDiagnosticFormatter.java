package com.sun.tools.javac.util;

import com.sun.tools.javac.api.DiagnosticFormatter;
import com.sun.tools.javac.code.Printer;
import com.sun.tools.javac.tree.JCTree;
import java.lang.Iterable;
import java.lang.Object;
import java.lang.String;
import java.util.Collection;
import java.util.EnumSet;
import java.util.Locale;
import java.util.Set;
import javax.tools.Diagnostic;

public abstract class AbstractDiagnosticFormatter implements DiagnosticFormatter {
  protected AbstractDiagnosticFormatter(JavacMessages arg0, SimpleConfiguration arg1) {
  }

  public String formatKind(JCDiagnostic arg0, Locale arg1) {
    return null;
  }

  public String format(JCDiagnostic arg0, Locale arg1) {
    return null;
  }

  protected abstract String formatDiagnostic(JCDiagnostic arg0, Locale arg1);

  public String formatPosition(JCDiagnostic arg0, DiagnosticFormatter.PositionKind arg1,
      Locale arg2) {
    return null;
  }

  private long getPosition(JCDiagnostic arg0, DiagnosticFormatter.PositionKind arg1) {
    return 0L;
  }

  public String formatSource(JCDiagnostic arg0, boolean arg1, Locale arg2) {
    return null;
  }

  protected Collection formatArguments(JCDiagnostic arg0, Locale arg1) {
    return null;
  }

  protected String formatArgument(JCDiagnostic arg0, Object arg1, Locale arg2) {
    return null;
  }

  private String expr2String(JCTree.JCExpression arg0) {
    return null;
  }

  protected String formatIterable(JCDiagnostic arg0, Iterable arg1, Locale arg2) {
    return null;
  }

  protected List formatSubdiagnostics(JCDiagnostic arg0, Locale arg1) {
    return null;
  }

  protected String formatSubdiagnostic(JCDiagnostic arg0, JCDiagnostic arg1, Locale arg2) {
    return null;
  }

  protected String formatSourceLine(JCDiagnostic arg0, int arg1) {
    return null;
  }

  protected String formatLintCategory(JCDiagnostic arg0, Locale arg1) {
    return null;
  }

  protected String localize(Locale arg0, String arg1, Object[] arg2) {
    return null;
  }

  public boolean displaySource(JCDiagnostic arg0) {
    return false;
  }

  public boolean isRaw() {
    return false;
  }

  protected String indentString(int arg0) {
    return null;
  }

  protected String indent(String arg0, int arg1) {
    return null;
  }

  public SimpleConfiguration getConfiguration() {
    return null;
  }

  public Printer getPrinter() {
    return null;
  }

  public void setPrinter(Printer arg0) {
  }

  public DiagnosticFormatter.Configuration getConfiguration() {
    return null;
  }

  public String formatPosition(Diagnostic arg0, DiagnosticFormatter.PositionKind arg1,
      Locale arg2) {
    return null;
  }

  public String formatSource(Diagnostic arg0, boolean arg1, Locale arg2) {
    return null;
  }

  public String formatKind(Diagnostic arg0, Locale arg1) {
    return null;
  }

  public String format(Diagnostic arg0, Locale arg1) {
    return null;
  }

  public boolean displaySource(Diagnostic arg0) {
    return false;
  }

  public static class SimpleConfiguration implements DiagnosticFormatter.Configuration {
    public SimpleConfiguration(Set arg0) {
    }

    public SimpleConfiguration(Options arg0, Set arg1) {
    }

    public int getMultilineLimit(DiagnosticFormatter.Configuration.MultilineLimit arg0) {
      return 0;
    }

    public EnumSet getVisible() {
      return null;
    }

    public void setMultilineLimit(DiagnosticFormatter.Configuration.MultilineLimit arg0, int arg1) {
    }

    public void setVisible(Set arg0) {
    }

    public void setVisiblePart(DiagnosticFormatter.Configuration.DiagnosticPart arg0,
        boolean arg1) {
    }

    public void setCaretEnabled(boolean arg0) {
    }

    public boolean isCaretEnabled() {
      return false;
    }

    public Set getVisible() {
      return null;
    }
  }
}
