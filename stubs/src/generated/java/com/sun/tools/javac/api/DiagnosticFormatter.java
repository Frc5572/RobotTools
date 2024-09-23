package com.sun.tools.javac.api;

import java.lang.String;
import java.util.Locale;
import java.util.Set;
import javax.tools.Diagnostic;

public interface DiagnosticFormatter {
  boolean displaySource(Diagnostic arg0);

  String format(Diagnostic arg0, Locale arg1);

  String formatMessage(Diagnostic arg0, Locale arg1);

  String formatKind(Diagnostic arg0, Locale arg1);

  String formatSource(Diagnostic arg0, boolean arg1, Locale arg2);

  String formatPosition(Diagnostic arg0, PositionKind arg1, Locale arg2);

  Configuration getConfiguration();

  final enum DiagnosticPart {
    SUMMARY,

    DETAILS,

    SOURCE,

    SUBDIAGNOSTICS,

    JLS
  }

  final enum MultilineLimit {
    DEPTH,

    LENGTH
  }

  interface Configuration {
    void setVisible(Set arg0);

    Set getVisible();

    void setMultilineLimit(Configuration.MultilineLimit arg0, int arg1);

    int getMultilineLimit(Configuration.MultilineLimit arg0);
  }

  final enum PositionKind {
    START,

    END,

    LINE,

    COLUMN,

    OFFSET
  }
}
