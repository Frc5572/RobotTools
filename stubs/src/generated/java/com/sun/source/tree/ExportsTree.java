package com.sun.source.tree;

import java.util.List;

public interface ExportsTree extends DirectiveTree {
  ExpressionTree getPackageName();

  List getModuleNames();
}
