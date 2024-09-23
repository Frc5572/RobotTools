package com.sun.source.util;

import com.sun.source.doctree.DocCommentTree;
import com.sun.source.doctree.DocTree;
import com.sun.source.tree.CompilationUnitTree;

public interface DocSourcePositions extends SourcePositions {
  long getStartPosition(CompilationUnitTree arg0, DocCommentTree arg1, DocTree arg2);

  long getEndPosition(CompilationUnitTree arg0, DocCommentTree arg1, DocTree arg2);
}
