package com.sun.tools.javac.comp;

import com.sun.tools.javac.tree.JCTree;
import com.sun.tools.javac.tree.TreeScanner;

public class Enter extends JCTree.Visitor {
  static class UnenterScanner extends TreeScanner {
  }
}
