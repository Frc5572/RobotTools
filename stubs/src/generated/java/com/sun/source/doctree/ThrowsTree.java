package com.sun.source.doctree;

import java.util.List;

public interface ThrowsTree extends BlockTagTree {
  ReferenceTree getExceptionName();

  List getDescription();
}
