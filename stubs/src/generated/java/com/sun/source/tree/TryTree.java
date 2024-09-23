package com.sun.source.tree;

import java.util.List;

public interface TryTree extends StatementTree {
  BlockTree getBlock();

  List getCatches();

  BlockTree getFinallyBlock();

  List getResources();
}
