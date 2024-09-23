package com.sun.source.doctree;

import java.util.List;

public interface SerialFieldTree extends BlockTagTree {
  IdentifierTree getName();

  ReferenceTree getType();

  List getDescription();
}
