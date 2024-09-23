package com.sun.tools.javac.util;

import java.lang.Class;
import java.lang.Object;
import java.util.Map;

public class Context {
  public Context() {
  }

  public void put(Key arg0, Factory arg1) {
  }

  public void put(Key arg0, Object arg1) {
  }

  public Object get(Key arg0) {
    return null;
  }

  protected Key key(Class arg0) {
    return null;
  }

  public Object get(Class arg0) {
    return null;
  }

  public void put(Class arg0, Object arg1) {
  }

  public void put(Class arg0, Factory arg1) {
  }

  private static Object uncheckedCast(Object arg0) {
    return null;
  }

  public void dump() {
  }

  private static void checkState(Map arg0) {
  }

  public interface Factory {
    Object make(Context arg0);
  }

  public static class Key {
    public Key() {
    }
  }
}
