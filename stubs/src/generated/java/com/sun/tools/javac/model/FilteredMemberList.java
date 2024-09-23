package com.sun.tools.javac.model;

import com.sun.tools.javac.code.Scope;
import com.sun.tools.javac.code.Symbol;
import java.lang.Object;
import java.util.AbstractList;
import java.util.Iterator;

public class FilteredMemberList extends AbstractList {
  public FilteredMemberList(Scope arg0) {
  }

  public int size() {
    return 0;
  }

  public Symbol get(int arg0) {
    return null;
  }

  public Iterator iterator() {
    return null;
  }

  private static boolean unwanted(Symbol arg0) {
    return false;
  }

  public Object get(int arg0) {
    return null;
  }

  private static boolean lambda$iterator$0(Symbol arg0) {
    return false;
  }
}
