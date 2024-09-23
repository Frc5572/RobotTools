package com.sun.source.tree;

public interface ModuleTree extends Tree {
  final enum ModuleKind {
    OPEN,

    STRONG
  }
}
