package com.sun.source.doctree;

import javax.lang.model.element.Name;

public interface SystemPropertyTree extends InlineTagTree {
  Name getPropertyName();
}
