package com.sun.tools.javac.parser;

import com.sun.source.tree.AnnotatedTypeTree;
import com.sun.source.tree.Tree;
import com.sun.source.util.TreeScanner;
import com.sun.tools.javac.tree.JCTree;
import com.sun.tools.javac.util.List;
import com.sun.tools.javac.util.Log;
import com.sun.tools.javac.util.Name;
import java.lang.Exception;
import java.lang.Object;
import java.lang.String;
import java.lang.Void;

public class ReferenceParser {
  public ReferenceParser(ParserFactory arg0) {
  }

  public Reference parse(String arg0, Mode arg1) {
    return null;
  }

  private JCTree.JCExpression parseModule(String arg0, int arg1, int arg2,
      Log.DeferredDiagnosticHandler arg3) {
    return null;
  }

  private JCTree parseType(String arg0, int arg1, int arg2, Log.DeferredDiagnosticHandler arg3) {
    return null;
  }

  private Name parseMember(String arg0, int arg1, int arg2, Log.DeferredDiagnosticHandler arg3) {
    return null;
  }

  private List parseParams(String arg0, int arg1, int arg2, Log.DeferredDiagnosticHandler arg3) {
    return null;
  }

  private void checkDiags(Log.DeferredDiagnosticHandler arg0, int arg1) {
  }

  public final enum Mode {
    MEMBER_DISALLOWED,

    MEMBER_OPTIONAL,

    MEMBER_REQUIRED
  }

  public static class ParseException extends Exception {
    ParseException(int arg0, String arg1) {
    }
  }

  public static class Reference {
    Reference(JCTree.JCExpression arg0, JCTree arg1, Name arg2, List arg3) {
    }
  }

  static class TypeAnnotationFinder extends TreeScanner {
    TypeAnnotationFinder() {
    }

    public Tree visitAnnotatedType(AnnotatedTypeTree arg0, Void arg1) {
      return null;
    }

    public Tree reduce(Tree arg0, Tree arg1) {
      return null;
    }

    public Object visitAnnotatedType(AnnotatedTypeTree arg0, Object arg1) {
      return null;
    }

    public Object reduce(Object arg0, Object arg1) {
      return null;
    }
  }
}
