package com.sun.tools.javac.jvm;

import com.sun.tools.javac.tree.JCTree;
import java.lang.RuntimeException;

public class Gen extends JCTree.Visitor {
  static class ClassReferenceVisitor extends JCTree.Visitor {
  }

  public static class CodeSizeOverflow extends RuntimeException {
  }

  static class GenContext {
  }

  abstract static class GenFinalizer {
  }
}
