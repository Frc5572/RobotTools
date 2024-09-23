package com.sun.source.doctree;

import java.util.List;

public interface ProvidesTree extends BlockTagTree {
  ReferenceTree getServiceType();

  List getDescription();
}
