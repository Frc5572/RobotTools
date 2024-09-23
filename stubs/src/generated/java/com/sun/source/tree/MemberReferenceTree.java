package com.sun.source.tree;

import java.util.List;
import javax.lang.model.element.Name;

public interface MemberReferenceTree extends ExpressionTree {
  ReferenceMode getMode();

  ExpressionTree getQualifierExpression();

  Name getName();

  List getTypeArguments();

  final enum ReferenceMode {
    INVOKE,

    NEW
  }
}
