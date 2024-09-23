package com.sun.tools.javac.util;

import com.sun.tools.javac.api.DiagnosticFormatter;
import com.sun.tools.javac.main.Option;
import com.sun.tools.javac.tree.EndPosTable;
import java.io.PrintWriter;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Queue;
import java.util.function.Predicate;
import javax.tools.JavaFileObject;

public class Log extends AbstractLog {
  protected Log(Context arg0) {
  }

  protected Log(Context arg0, PrintWriter arg1) {
  }

  protected Log(Context arg0, PrintWriter arg1, PrintWriter arg2) {
  }

  private Log(Context arg0, Map arg1) {
  }

  public static Log instance(Context arg0) {
    return null;
  }

  public static void preRegister(Context arg0, PrintWriter arg1) {
  }

  private static Map initWriters(Context arg0) {
    return null;
  }

  private static Map initWriters(PrintWriter arg0, PrintWriter arg1) {
    return null;
  }

  private void initOptions(Options arg0) {
  }

  private int getIntOption(Options arg0, Option arg1, int arg2) {
    return 0;
  }

  protected int getDefaultMaxErrors() {
    return 0;
  }

  protected int getDefaultMaxWarnings() {
    return 0;
  }

  public boolean hasDiagnosticListener() {
    return false;
  }

  public void setEndPosTable(JavaFileObject arg0, EndPosTable arg1) {
  }

  public JavaFileObject currentSourceFile() {
    return null;
  }

  public DiagnosticFormatter getDiagnosticFormatter() {
    return null;
  }

  public void setDiagnosticFormatter(DiagnosticFormatter arg0) {
  }

  public PrintWriter getWriter(WriterKind arg0) {
    return null;
  }

  public void setWriter(WriterKind arg0, PrintWriter arg1) {
  }

  public void setWriters(PrintWriter arg0) {
  }

  public void popDiagnosticHandler(DiagnosticHandler arg0) {
  }

  public void flush() {
  }

  public void flush(WriterKind arg0) {
  }

  protected boolean shouldReport(JavaFileObject arg0, int arg1) {
    return false;
  }

  private boolean shouldReport(JCDiagnostic arg0) {
    return false;
  }

  private List getCode(JCDiagnostic arg0) {
    return null;
  }

  private void getCodeRecursive(ListBuffer arg0, JCDiagnostic arg1) {
  }

  public boolean hasErrorOn(JCDiagnostic.DiagnosticPosition arg0) {
    return false;
  }

  public void prompt() {
  }

  private void printErrLine(int arg0, PrintWriter arg1) {
  }

  public void printNewline() {
  }

  public void printNewline(WriterKind arg0) {
  }

  public void printLines(String arg0, Object[] arg1) {
  }

  public void printLines(JCDiagnostic.DiagnosticInfo arg0) {
  }

  public void printLines(PrefixKind arg0, String arg1, Object[] arg2) {
  }

  public void printLines(WriterKind arg0, String arg1, Object[] arg2) {
  }

  public void printLines(WriterKind arg0, PrefixKind arg1, String arg2, Object[] arg3) {
  }

  public void printRawLines(String arg0) {
  }

  public void printRawLines(WriterKind arg0, String arg1) {
  }

  public static void printRawLines(PrintWriter arg0, String arg1) {
  }

  public void printVerbose(String arg0, Object[] arg1) {
  }

  protected void directError(String arg0, Object[] arg1) {
  }

  public void strictWarning(JCDiagnostic.DiagnosticPosition arg0, String arg1, Object[] arg2) {
  }

  public void report(JCDiagnostic arg0) {
  }

  protected void writeDiagnostic(JCDiagnostic arg0) {
  }

  protected PrintWriter getWriterForDiagnosticType(JCDiagnostic.DiagnosticType arg0) {
    return null;
  }

  public static String getLocalizedString(String arg0, Object[] arg1) {
    return null;
  }

  public String localize(String arg0, Object[] arg1) {
    return null;
  }

  public String localize(JCDiagnostic.DiagnosticInfo arg0) {
    return null;
  }

  public String localize(PrefixKind arg0, String arg1, Object[] arg2) {
    return null;
  }

  private void printRawDiag(PrintWriter arg0, String arg1, int arg2, String arg3) {
  }

  public void rawError(int arg0, String arg1) {
  }

  public void rawWarning(int arg0, String arg1) {
  }

  public static String format(String arg0, Object[] arg1) {
    return null;
  }

  private void lambda$new$1(Options arg0) {
  }

  private static Log lambda$preRegister$0(PrintWriter arg0, Context arg1) {
    return null;
  }

  static class DefaultDiagnosticHandler extends DiagnosticHandler {
    private DefaultDiagnosticHandler(Log arg0) {
    }

    public void report(JCDiagnostic arg0) {
    }
  }

  public static class DeferredDiagnosticHandler extends DiagnosticHandler {
    public DeferredDiagnosticHandler(Log arg0) {
    }

    public DeferredDiagnosticHandler(Log arg0, Predicate arg1) {
    }

    public void report(JCDiagnostic arg0) {
    }

    public Queue getDiagnostics() {
      return null;
    }

    public void reportDeferredDiagnostics() {
    }

    public void reportDeferredDiagnostics(Predicate arg0) {
    }

    private static boolean lambda$reportDeferredDiagnostics$0(JCDiagnostic arg0) {
      return false;
    }
  }

  public abstract static class DiagnosticHandler {
    public DiagnosticHandler() {
    }

    protected void install(Log arg0) {
    }

    public abstract void report(JCDiagnostic arg0);
  }

  public static class DiscardDiagnosticHandler extends DiagnosticHandler {
    public DiscardDiagnosticHandler(Log arg0) {
    }

    public void report(JCDiagnostic arg0) {
    }
  }

  public final enum PrefixKind {
    JAVAC,

    COMPILER_MISC
  }

  public final enum WriterKind {
    NOTICE,

    WARNING,

    ERROR,

    STDOUT,

    STDERR
  }
}
