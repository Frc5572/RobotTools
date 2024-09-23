package com.sun.tools.javac.tree;

import com.sun.tools.javac.parser.Tokens;
import java.lang.String;

public interface DocCommentTable {
  boolean hasComment(JCTree arg0);

  Tokens.Comment getComment(JCTree arg0);

  String getCommentText(JCTree arg0);

  DCTree.DCDocComment getCommentTree(JCTree arg0);

  void putComment(JCTree arg0, Tokens.Comment arg1);
}
