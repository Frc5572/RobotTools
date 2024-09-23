package com.sun.tools.javac.util;

import com.sun.tools.javac.api.DiagnosticFormatter;
import com.sun.tools.javac.code.Lint;
import com.sun.tools.javac.tree.EndPosTable;
import com.sun.tools.javac.tree.JCTree;
import java.lang.Object;
import java.lang.String;
import java.util.Locale;
import java.util.Set;
import java.util.function.UnaryOperator;
import javax.tools.Diagnostic;
import javax.tools.JavaFileObject;

public class JCDiagnostic implements Diagnostic {
  protected JCDiagnostic(DiagnosticFormatter arg0, DiagnosticInfo arg1, Lint.LintCategory arg2,
      Set arg3, DiagnosticSource arg4, DiagnosticPosition arg5) {
  }

  protected JCDiagnostic(DiagnosticFormatter arg0, DiagnosticInfo arg1, Lint.LintCategory arg2,
      Set arg3, DiagnosticSource arg4, DiagnosticPosition arg5, UnaryOperator arg6) {
  }

  public static JCDiagnostic fragment(String arg0, Object[] arg1) {
    return null;
  }

  public static DiagnosticFormatter getFragmentFormatter() {
    return null;
  }

  public DiagnosticType getType() {
    return null;
  }

  public List getSubdiagnostics() {
    return null;
  }

  public boolean isMultiline() {
    return false;
  }

  public boolean isMandatory() {
    return false;
  }

  public boolean hasLintCategory() {
    return false;
  }

  public Lint.LintCategory getLintCategory() {
    return null;
  }

  public JavaFileObject getSource() {
    return null;
  }

  public DiagnosticSource getDiagnosticSource() {
    return null;
  }

  protected int getIntStartPosition() {
    return 0;
  }

  protected int getIntPosition() {
    return 0;
  }

  protected int getIntEndPosition() {
    return 0;
  }

  public long getStartPosition() {
    return 0L;
  }

  public long getPosition() {
    return 0L;
  }

  public long getEndPosition() {
    return 0L;
  }

  public DiagnosticPosition getDiagnosticPosition() {
    return null;
  }

  public long getLineNumber() {
    return 0L;
  }

  public long getColumnNumber() {
    return 0L;
  }

  public Object[] getArgs() {
    return null;
  }

  public String getPrefix() {
    return null;
  }

  public String getPrefix(DiagnosticType arg0) {
    return null;
  }

  public String toString() {
    return null;
  }

  public Diagnostic.Kind getKind() {
    return null;
  }

  public String getCode() {
    return null;
  }

  public String getMessage(Locale arg0) {
    return null;
  }

  public void setFlag(DiagnosticFlag arg0) {
  }

  public boolean isFlagSet(DiagnosticFlag arg0) {
    return false;
  }

  boolean hasRewriter() {
    return false;
  }

  JCDiagnostic rewrite() {
    return null;
  }

  public Object getSource() {
    return null;
  }

  public final enum DiagnosticFlag {
    MANDATORY,

    RESOLVE_ERROR,

    SYNTAX,

    RECOVERABLE,

    NON_DEFERRABLE,

    COMPRESSED,

    API,

    SOURCE_LEVEL
  }

  public abstract static class DiagnosticInfo {
    private DiagnosticInfo(DiagnosticType arg0, String arg1, String arg2, Object[] arg3) {
    }

    public String key() {
      return null;
    }

    public static DiagnosticInfo of(DiagnosticType arg0, String arg1, String arg2, Object[] arg3) {
      return null;
    }

    public String getCode() {
      return null;
    }

    public Object[] getArgs() {
      return null;
    }

    public void setArgs(Object[] arg0) {
    }
  }

  public interface DiagnosticPosition {
    JCTree getTree();

    int getStartPosition();

    int getPreferredPosition();

    int getEndPosition(EndPosTable arg0);
  }

  public final enum DiagnosticType {
    FRAGMENT,

    NOTE,

    WARNING,

    ERROR
  }

  public static final class Error extends DiagnosticInfo {
    public Error(String arg0, String arg1, Object[] arg2) {
    }
  }

  public static class Factory {
    protected Factory(Context arg0) {
    }

    public Factory(JavacMessages arg0, String arg1) {
    }

    public static Factory instance(Context arg0) {
      return null;
    }

    private void initOptions(Options arg0) {
    }

    public JCDiagnostic error(DiagnosticFlag arg0, DiagnosticSource arg1, DiagnosticPosition arg2,
        String arg3, Object[] arg4) {
      return null;
    }

    public JCDiagnostic error(DiagnosticFlag arg0, DiagnosticSource arg1, DiagnosticPosition arg2,
        Error arg3) {
      return null;
    }

    public JCDiagnostic mandatoryWarning(Lint.LintCategory arg0, DiagnosticSource arg1,
        DiagnosticPosition arg2, String arg3, Object[] arg4) {
      return null;
    }

    public JCDiagnostic mandatoryWarning(Lint.LintCategory arg0, DiagnosticSource arg1,
        DiagnosticPosition arg2, Warning arg3) {
      return null;
    }

    public JCDiagnostic warning(Lint.LintCategory arg0, DiagnosticSource arg1,
        DiagnosticPosition arg2, String arg3, Object[] arg4) {
      return null;
    }

    public JCDiagnostic warning(Lint.LintCategory arg0, DiagnosticSource arg1,
        DiagnosticPosition arg2, Warning arg3) {
      return null;
    }

    public JCDiagnostic mandatoryNote(DiagnosticSource arg0, String arg1, Object[] arg2) {
      return null;
    }

    public JCDiagnostic mandatoryNote(DiagnosticSource arg0, Note arg1) {
      return null;
    }

    public JCDiagnostic note(DiagnosticSource arg0, DiagnosticPosition arg1, String arg2,
        Object[] arg3) {
      return null;
    }

    public JCDiagnostic note(DiagnosticSource arg0, DiagnosticPosition arg1, Note arg2) {
      return null;
    }

    public JCDiagnostic fragment(String arg0, Object[] arg1) {
      return null;
    }

    public JCDiagnostic fragment(Fragment arg0) {
      return null;
    }

    public JCDiagnostic create(DiagnosticType arg0, DiagnosticSource arg1, DiagnosticPosition arg2,
        String arg3, Object[] arg4) {
      return null;
    }

    public JCDiagnostic create(DiagnosticType arg0, DiagnosticSource arg1, DiagnosticPosition arg2,
        String arg3, UnaryOperator arg4, Object[] arg5) {
      return null;
    }

    public JCDiagnostic create(DiagnosticSource arg0, DiagnosticPosition arg1,
        DiagnosticInfo arg2) {
      return null;
    }

    public JCDiagnostic create(DiagnosticType arg0, Lint.LintCategory arg1, Set arg2,
        DiagnosticSource arg3, DiagnosticPosition arg4, String arg5, Object[] arg6) {
      return null;
    }

    public JCDiagnostic create(Lint.LintCategory arg0, Set arg1, DiagnosticSource arg2,
        DiagnosticPosition arg3, DiagnosticInfo arg4) {
      return null;
    }

    public JCDiagnostic create(Lint.LintCategory arg0, Set arg1, DiagnosticSource arg2,
        DiagnosticPosition arg3, DiagnosticInfo arg4, UnaryOperator arg5) {
      return null;
    }

    DiagnosticInfo normalize(DiagnosticInfo arg0) {
      return null;
    }

    public Error errorKey(String arg0, Object[] arg1) {
      return null;
    }

    Warning warningKey(String arg0, Object[] arg1) {
      return null;
    }

    public Note noteKey(String arg0, Object[] arg1) {
      return null;
    }

    Fragment fragmentKey(String arg0, Object[] arg1) {
      return null;
    }

    private Object lambda$normalize$1(Object arg0) {
      return null;
    }

    private void lambda$new$0(Options arg0) {
    }
  }

  public static final class Fragment extends DiagnosticInfo {
    public Fragment(String arg0, String arg1, Object[] arg2) {
    }
  }

  public static class MultilineDiagnostic extends JCDiagnostic {
    public MultilineDiagnostic(JCDiagnostic arg0, List arg1) {
    }

    public List getSubdiagnostics() {
      return null;
    }

    public boolean isMultiline() {
      return false;
    }

    public Object getSource() {
      return null;
    }
  }

  public static final class Note extends DiagnosticInfo {
    public Note(String arg0, String arg1, Object[] arg2) {
    }
  }

  public static class SimpleDiagnosticPosition implements DiagnosticPosition {
    public SimpleDiagnosticPosition(int arg0) {
    }

    public JCTree getTree() {
      return null;
    }

    public int getStartPosition() {
      return 0;
    }

    public int getPreferredPosition() {
      return 0;
    }

    public int getEndPosition(EndPosTable arg0) {
      return 0;
    }
  }

  static class SourcePosition {
    SourcePosition(JCDiagnostic arg0) {
    }

    public int getLineNumber() {
      return 0;
    }

    public int getColumnNumber() {
      return 0;
    }
  }

  public static final class Warning extends DiagnosticInfo {
    public Warning(String arg0, String arg1, Object[] arg2) {
    }
  }
}
