package com.sun.tools.javac.tree;

public interface EndPosTable {
  int getEndPos(JCTree arg0);

  void storeEnd(JCTree arg0, int arg1);

  int replaceTree(JCTree arg0, JCTree arg1);
}
