package com.sun.tools.javac.parser;

import com.sun.tools.javac.tree.JCTree;
import com.sun.tools.javac.util.JCDiagnostic;
import com.sun.tools.javac.util.List;
import com.sun.tools.javac.util.Position;
import java.util.function.Consumer;

public class VirtualParser extends JavacParser {
  public VirtualParser(JavacParser arg0) {
  }

  protected JCTree.JCErroneous syntaxError(int arg0, JCDiagnostic.Error arg1) {
    return null;
  }

  protected JCTree.JCErroneous syntaxError(int arg0, List arg1, JCDiagnostic.Error arg2) {
    return null;
  }

  protected void reportSyntaxError(int arg0, JCDiagnostic.Error arg1) {
  }

  protected void reportSyntaxError(JCDiagnostic.DiagnosticPosition arg0, JCDiagnostic.Error arg1) {
  }

  public boolean hasErrors() {
    return false;
  }

  public static boolean tryParse(JavacParser arg0, Consumer arg1) {
    return false;
  }

  public static class VirtualScanner implements Lexer {
    public VirtualScanner(Lexer arg0) {
    }

    public void nextToken() {
    }

    public Tokens.Token token() {
      return null;
    }

    public Tokens.Token token(int arg0) {
      return null;
    }

    public Tokens.Token prevToken() {
      return null;
    }

    public void setPrevToken(Tokens.Token arg0) {
    }

    public Tokens.Token split() {
      return null;
    }

    public int errPos() {
      return 0;
    }

    public void errPos(int arg0) {
    }

    public Position.LineMap getLineMap() {
      return null;
    }

    public void commit() {
    }
  }
}
