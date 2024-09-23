package com.sun.tools.javac.comp;

import com.sun.tools.javac.tree.JCTree;

public class Modules extends JCTree.Visitor {
  static class ModuleVisitor extends JCTree.Visitor {
  }

  public interface PackageNameFinder {
  }

  static class UsesProvidesVisitor extends JCTree.Visitor {
  }
}
