package com.sun.tools.javac.util;

import java.lang.Iterable;
import java.lang.Object;
import java.util.Iterator;
import java.util.function.Function;
import java.util.function.Predicate;

public class Iterators {
  public Iterators() {
  }

  public static Iterator emptyIterator() {
    return null;
  }

  public static Iterator createCompoundIterator(Iterable arg0, Function arg1) {
    return null;
  }

  public static Iterator createFilterIterator(Iterator arg0, Predicate arg1) {
    return null;
  }

  static class CompoundIterator implements Iterator {
    public CompoundIterator(Iterable arg0, Function arg1) {
    }

    public boolean hasNext() {
      return false;
    }

    public Object next() {
      return null;
    }
  }
}
