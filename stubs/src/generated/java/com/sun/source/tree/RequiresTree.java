package com.sun.source.tree;

public interface RequiresTree extends DirectiveTree {
  boolean isStatic();

  boolean isTransitive();

  ExpressionTree getModuleName();
}
