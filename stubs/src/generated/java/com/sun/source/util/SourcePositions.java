package com.sun.source.util;

import com.sun.source.tree.CompilationUnitTree;
import com.sun.source.tree.Tree;

public interface SourcePositions {
  long getStartPosition(CompilationUnitTree arg0, Tree arg1);

  long getEndPosition(CompilationUnitTree arg0, Tree arg1);
}
