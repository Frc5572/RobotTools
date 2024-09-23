package com.sun.source.doctree;

import java.util.List;

public interface SpecTree extends BlockTagTree {
  TextTree getURL();

  List getTitle();
}
