package com.sun.source.doctree;

import java.util.List;

public interface SeeTree extends BlockTagTree {
  List getReference();
}
