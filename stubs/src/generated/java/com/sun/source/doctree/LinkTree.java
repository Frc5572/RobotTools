package com.sun.source.doctree;

import java.util.List;

public interface LinkTree extends InlineTagTree {
  ReferenceTree getReference();

  List getLabel();
}
