package com.sun.tools.javac.parser;

import com.sun.tools.javac.tree.DCTree;
import com.sun.tools.javac.tree.DocCommentTable;
import com.sun.tools.javac.tree.JCTree;
import java.lang.String;

public class LazyDocCommentTable implements DocCommentTable {
  LazyDocCommentTable(ParserFactory arg0) {
  }

  public boolean hasComment(JCTree arg0) {
    return false;
  }

  public Tokens.Comment getComment(JCTree arg0) {
    return null;
  }

  public String getCommentText(JCTree arg0) {
    return null;
  }

  public DCTree.DCDocComment getCommentTree(JCTree arg0) {
    return null;
  }

  public void putComment(JCTree arg0, Tokens.Comment arg1) {
  }

  static class Entry {
    Entry(Tokens.Comment arg0) {
    }
  }
}
