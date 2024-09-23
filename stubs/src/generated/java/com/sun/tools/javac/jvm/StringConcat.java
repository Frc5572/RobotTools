package com.sun.tools.javac.jvm;

import com.sun.tools.javac.code.Type;
import com.sun.tools.javac.tree.JCTree;
import com.sun.tools.javac.util.Context;
import com.sun.tools.javac.util.JCDiagnostic;
import com.sun.tools.javac.util.List;
import java.lang.String;

public abstract class StringConcat {
  protected StringConcat(Context arg0) {
  }

  public static StringConcat instance(Context arg0) {
    return null;
  }

  private static StringConcat makeConcat(Context arg0) {
    return null;
  }

  public abstract Items.Item makeConcat(JCTree.JCAssignOp arg0);

  public abstract Items.Item makeConcat(JCTree.JCBinary arg0);

  protected List collectAll(JCTree arg0) {
    return null;
  }

  protected List collectAll(JCTree.JCExpression arg0, JCTree.JCExpression arg1) {
    return null;
  }

  private List collect(JCTree arg0, List arg1) {
    return null;
  }

  abstract static class Indy extends StringConcat {
    public Indy(Context arg0) {
    }

    public Items.Item makeConcat(JCTree.JCAssignOp arg0) {
      return null;
    }

    public Items.Item makeConcat(JCTree.JCBinary arg0) {
      return null;
    }

    protected abstract void emit(JCDiagnostic.DiagnosticPosition arg0, List arg1, boolean arg2,
        Type arg3);

    protected List split(List arg0) {
      return null;
    }

    protected boolean shouldConvertToStringEagerly(Type arg0) {
      return false;
    }
  }

  static final class IndyConstants extends Indy {
    public IndyConstants(Context arg0) {
    }

    protected void emit(JCDiagnostic.DiagnosticPosition arg0, List arg1, boolean arg2, Type arg3) {
    }

    private void doCall(Type arg0, JCDiagnostic.DiagnosticPosition arg1, String arg2, List arg3,
        List arg4) {
    }
  }

  static class IndyPlain extends Indy {
    public IndyPlain(Context arg0) {
    }

    protected void emit(JCDiagnostic.DiagnosticPosition arg0, List arg1, boolean arg2, Type arg3) {
    }

    private void doCall(Type arg0, JCDiagnostic.DiagnosticPosition arg1, List arg2) {
    }
  }

  static class Inline extends StringConcat {
    public Inline(Context arg0) {
    }

    public Items.Item makeConcat(JCTree.JCAssignOp arg0) {
      return null;
    }

    public Items.Item makeConcat(JCTree.JCBinary arg0) {
      return null;
    }

    private JCDiagnostic.DiagnosticPosition newStringBuilder(JCTree arg0) {
      return null;
    }

    private void appendString(JCTree arg0) {
    }

    private void builderToString(JCDiagnostic.DiagnosticPosition arg0) {
    }
  }
}
