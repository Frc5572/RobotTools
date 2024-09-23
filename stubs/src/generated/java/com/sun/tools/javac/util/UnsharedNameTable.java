package com.sun.tools.javac.util;

import java.lang.ref.WeakReference;

public class UnsharedNameTable extends Name.Table {
  public UnsharedNameTable(Names arg0, int arg1) {
  }

  public UnsharedNameTable(Names arg0) {
  }

  public static Name.Table create(Names arg0) {
    return null;
  }

  public Name fromChars(char[] arg0, int arg1, int arg2) {
    return null;
  }

  public Name fromUtf(byte[] arg0, int arg1, int arg2, Convert.Validation arg3) {
    return null;
  }

  private Name fromValidUtf(byte[] arg0, int arg1, int arg2) {
    return null;
  }

  public void dispose() {
  }

  static class HashEntry extends WeakReference {
    HashEntry(NameImpl arg0) {
    }
  }

  static class NameImpl extends Name {
    NameImpl(UnsharedNameTable arg0, byte[] arg1, int arg2) {
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
  }
}
