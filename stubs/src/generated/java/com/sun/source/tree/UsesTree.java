package com.sun.source.tree;

public interface UsesTree extends DirectiveTree {
  ExpressionTree getServiceName();
}
