package com.sun.tools.javac.util;

import com.sun.tools.javac.api.DiagnosticFormatter;
import java.lang.String;
import java.util.Locale;
import javax.tools.Diagnostic;

public class BasicDiagnosticFormatter extends AbstractDiagnosticFormatter {
  public BasicDiagnosticFormatter(Options arg0, JavacMessages arg1) {
  }

  public BasicDiagnosticFormatter(JavacMessages arg0) {
  }

  public String formatDiagnostic(JCDiagnostic arg0, Locale arg1) {
    return null;
  }

  public String formatMessage(JCDiagnostic arg0, Locale arg1) {
    return null;
  }

  protected String addSourceLineIfNeeded(JCDiagnostic arg0, String arg1) {
    return null;
  }

  protected String formatMeta(char arg0, JCDiagnostic arg1, Locale arg2) {
    return null;
  }

  private String selectFormat(JCDiagnostic arg0) {
    return null;
  }

  public BasicConfiguration getConfiguration() {
    return null;
  }

  public AbstractDiagnosticFormatter.SimpleConfiguration getConfiguration() {
    return null;
  }

  public DiagnosticFormatter.Configuration getConfiguration() {
    return null;
  }

  public String formatMessage(Diagnostic arg0, Locale arg1) {
    return null;
  }

  public final enum BasicFormatKind {
    DEFAULT_POS_FORMAT,

    DEFAULT_NO_POS_FORMAT,

    DEFAULT_CLASS_FORMAT
  }

  public final enum SourcePosition {
    BOTTOM,

    AFTER_SUMMARY
  }

  public static class BasicConfiguration extends AbstractDiagnosticFormatter.SimpleConfiguration {
    public BasicConfiguration(Options arg0) {
    }

    public BasicConfiguration() {
    }

    private void initFormat() {
    }

    private void initOldFormat() {
    }

    private void initFormats(String arg0, String arg1, String arg2) {
    }

    private void initFormats(String arg0) {
    }

    private void initIndentation() {
    }

    public int getIndentation(DiagnosticFormatter.Configuration.DiagnosticPart arg0) {
      return 0;
    }

    public void setIndentation(DiagnosticFormatter.Configuration.DiagnosticPart arg0, int arg1) {
    }

    public void setSourcePosition(BasicConfiguration.SourcePosition arg0) {
    }

    public BasicConfiguration.SourcePosition getSourcePosition() {
      return null;
    }

    public void setFormat(BasicConfiguration.BasicFormatKind arg0, String arg1) {
    }

    public String getFormat(BasicConfiguration.BasicFormatKind arg0) {
      return null;
    }
  }
}
