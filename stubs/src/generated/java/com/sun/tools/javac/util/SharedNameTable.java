package com.sun.tools.javac.util;

import java.lang.Object;

public class SharedNameTable extends Name.Table {
  public SharedNameTable(Names arg0, int arg1, int arg2) {
  }

  public SharedNameTable(Names arg0) {
  }

  public static synchronized SharedNameTable create(Names arg0) {
    return null;
  }

  private static synchronized void dispose(SharedNameTable arg0) {
  }

  public Name fromChars(char[] arg0, int arg1, int arg2) {
    return null;
  }

  public Name fromUtf(byte[] arg0, int arg1, int arg2, Convert.Validation arg3) {
    return null;
  }

  public void dispose() {
  }

  static class NameImpl extends Name {
    NameImpl(SharedNameTable arg0) {
    }

    public int getIndex() {
      return 0;
    }

    public int getByteLength() {
      return 0;
    }

    public byte getByteAt(int arg0) {
      return (byte)0;
    }

    public byte[] getByteArray() {
      return null;
    }

    public int getByteOffset() {
      return 0;
    }

    public int hashCode() {
      return 0;
    }

    public boolean equals(Object arg0) {
      return false;
    }
  }
}
