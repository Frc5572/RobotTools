package com.sun.source.doctree;

import java.util.List;

public interface IndexTree extends InlineTagTree {
  DocTree getSearchTerm();

  List getDescription();
}
