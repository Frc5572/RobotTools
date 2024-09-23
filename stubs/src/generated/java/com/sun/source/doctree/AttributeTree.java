package com.sun.source.doctree;

import java.util.List;
import javax.lang.model.element.Name;

public interface AttributeTree extends DocTree {
  Name getName();

  ValueKind getValueKind();

  List getValue();

  final enum ValueKind {
    EMPTY,

    UNQUOTED,

    SINGLE,

    DOUBLE
  }
}
