package com.sun.source.tree;

public interface PatternCaseLabelTree extends CaseLabelTree {
  PatternTree getPattern();
}
