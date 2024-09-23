package com.sun.source.tree;

public interface LineMap {
  long getStartPosition(long arg0);

  long getPosition(long arg0, long arg1);

  long getLineNumber(long arg0);

  long getColumnNumber(long arg0);
}
