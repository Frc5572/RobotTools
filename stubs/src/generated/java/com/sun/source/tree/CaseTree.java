package com.sun.source.tree;

public interface CaseTree extends Tree {
  final enum CaseKind {
    STATEMENT,

    RULE
  }
}
