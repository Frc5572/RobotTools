package com.sun.source.doctree;

import javax.lang.model.element.Name;

public interface IdentifierTree extends DocTree {
  Name getName();
}
