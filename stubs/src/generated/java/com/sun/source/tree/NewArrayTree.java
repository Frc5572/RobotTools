package com.sun.source.tree;

import java.util.List;

public interface NewArrayTree extends ExpressionTree {
  Tree getType();

  List getDimensions();

  List getInitializers();

  List getAnnotations();

  List getDimAnnotations();
}
