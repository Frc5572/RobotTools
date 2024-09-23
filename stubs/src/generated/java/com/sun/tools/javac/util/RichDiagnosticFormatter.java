package com.sun.tools.javac.util;

import com.sun.tools.javac.api.DiagnosticFormatter;
import com.sun.tools.javac.code.Printer;
import com.sun.tools.javac.code.Symbol;
import com.sun.tools.javac.code.Type;
import java.lang.Object;
import java.lang.String;
import java.util.Locale;
import javax.tools.Diagnostic;

public class RichDiagnosticFormatter extends ForwardingDiagnosticFormatter {
  protected RichDiagnosticFormatter(Context arg0) {
  }

  public static RichDiagnosticFormatter instance(Context arg0) {
    return null;
  }

  public String format(JCDiagnostic arg0, Locale arg1) {
    return null;
  }

  public String formatMessage(JCDiagnostic arg0, Locale arg1) {
    return null;
  }

  protected void setRichPrinter(RichPrinter arg0) {
  }

  protected RichPrinter getRichPrinter() {
    return null;
  }

  protected void preprocessDiagnostic(JCDiagnostic arg0) {
  }

  protected void preprocessArgument(Object arg0) {
  }

  protected List getWhereClauses() {
    return null;
  }

  private int indexOf(Type arg0, WhereClauseKind arg1) {
    return 0;
  }

  private boolean unique(Type.TypeVar arg0) {
    return false;
  }

  protected void preprocessType(Type arg0) {
  }

  protected void preprocessSymbol(Symbol arg0) {
  }

  public RichConfiguration getConfiguration() {
    return null;
  }

  public String formatMessage(Diagnostic arg0, Locale arg1) {
    return null;
  }

  public String format(Diagnostic arg0, Locale arg1) {
    return null;
  }

  public DiagnosticFormatter.Configuration getConfiguration() {
    return null;
  }

  public static class ClassNameSimplifier {
    protected ClassNameSimplifier(RichDiagnosticFormatter arg0) {
    }

    protected void addUsage(Symbol arg0) {
    }

    public String simplify(Symbol arg0) {
      return null;
    }
  }

  public final enum RichFormatterFeature {
    WHERE_CLAUSES,

    SIMPLE_NAMES,

    UNIQUE_TYPEVAR_NAMES
  }

  public static class RichConfiguration extends ForwardingDiagnosticFormatter.ForwardingConfiguration {
    public RichConfiguration(Options arg0, AbstractDiagnosticFormatter arg1) {
    }

    public RichConfiguration.RichFormatterFeature[] getAvailableFeatures() {
      return null;
    }

    public void enable(RichConfiguration.RichFormatterFeature arg0) {
    }

    public void disable(RichConfiguration.RichFormatterFeature arg0) {
    }

    public boolean isEnabled(RichConfiguration.RichFormatterFeature arg0) {
      return false;
    }
  }

  public static class RichPrinter extends Printer {
    protected RichPrinter(RichDiagnosticFormatter arg0) {
    }

    public String localize(Locale arg0, String arg1, Object[] arg2) {
      return null;
    }

    public String capturedVarId(Type.CapturedType arg0, Locale arg1) {
      return null;
    }

    public String visitType(Type arg0, Locale arg1) {
      return null;
    }

    public String visitCapturedType(Type.CapturedType arg0, Locale arg1) {
      return null;
    }

    public String visitClassType(Type.ClassType arg0, Locale arg1) {
      return null;
    }

    protected String className(Type.ClassType arg0, boolean arg1, Locale arg2) {
      return null;
    }

    public String visitTypeVar(Type.TypeVar arg0, Locale arg1) {
      return null;
    }

    public String visitClassSymbol(Symbol.ClassSymbol arg0, Locale arg1) {
      return null;
    }

    public String visitMethodSymbol(Symbol.MethodSymbol arg0, Locale arg1) {
      return null;
    }

    public Object visitType(Type arg0, Object arg1) {
      return null;
    }

    public Object visitCapturedType(Type.CapturedType arg0, Object arg1) {
      return null;
    }

    public Object visitTypeVar(Type.TypeVar arg0, Object arg1) {
      return null;
    }

    public Object visitClassType(Type.ClassType arg0, Object arg1) {
      return null;
    }

    public Object visitMethodSymbol(Symbol.MethodSymbol arg0, Object arg1) {
      return null;
    }

    public Object visitClassSymbol(Symbol.ClassSymbol arg0, Object arg1) {
      return null;
    }
  }

  final enum WhereClauseKind {
    TYPEVAR,

    CAPTURED,

    INTERSECTION
  }
}
