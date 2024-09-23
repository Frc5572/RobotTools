package com.sun.source.tree;

import java.util.List;

public interface ForLoopTree extends StatementTree {
  List getInitializer();

  ExpressionTree getCondition();

  List getUpdate();

  StatementTree getStatement();
}
