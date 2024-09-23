package com.sun.source.doctree;

import java.util.List;
import javax.lang.model.element.Name;

public interface StartElementTree extends DocTree {
  Name getName();

  List getAttributes();

  boolean isSelfClosing();
}
