package com.sun.source.tree;

import java.util.List;

public interface LambdaExpressionTree extends ExpressionTree {
  List getParameters();

  Tree getBody();

  BodyKind getBodyKind();

  final enum BodyKind {
    EXPRESSION,

    STATEMENT
  }
}
