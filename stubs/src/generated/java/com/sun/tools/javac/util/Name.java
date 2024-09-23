package com.sun.tools.javac.util;

import com.sun.tools.javac.jvm.PoolConstant;
import java.lang.CharSequence;
import java.lang.Comparable;
import java.lang.Object;
import java.lang.String;

public abstract class Name implements javax.lang.model.element.Name, PoolConstant, Comparable {
  protected Name(Table arg0) {
  }

  public boolean contentEquals(CharSequence arg0) {
    return false;
  }

  public int poolTag() {
    return 0;
  }

  public int length() {
    return 0;
  }

  public char charAt(int arg0) {
    return '_';
  }

  public CharSequence subSequence(int arg0, int arg1) {
    return null;
  }

  public Name append(Name arg0) {
    return null;
  }

  public Name append(char arg0, Name arg1) {
    return null;
  }

  public int compareTo(Name arg0) {
    return 0;
  }

  public boolean isEmpty() {
    return false;
  }

  public int lastIndexOf(byte arg0) {
    return 0;
  }

  public boolean startsWith(Name arg0) {
    return false;
  }

  public Name subName(int arg0, int arg1) {
    return null;
  }

  public String toString() {
    return null;
  }

  public byte[] toUtf() {
    return null;
  }

  public abstract int getIndex();

  public abstract int getByteLength();

  public abstract byte getByteAt(int arg0);

  public void getBytes(byte[] arg0, int arg1) {
  }

  public abstract byte[] getByteArray();

  public abstract int getByteOffset();

  public Object map(NameMapper arg0) {
    return null;
  }

  public int compareTo(Object arg0) {
    return 0;
  }

  public interface NameMapper {
    Object map(byte[] arg0, int arg1, int arg2);
  }

  public abstract static class Table {
    Table(Names arg0) {
    }

    public abstract Name fromChars(char[] arg0, int arg1, int arg2);

    public Name fromString(String arg0) {
      return null;
    }

    public Name fromUtf(byte[] arg0) {
      return null;
    }

    public abstract Name fromUtf(byte[] arg0, int arg1, int arg2, Convert.Validation arg3);

    public abstract void dispose();

    protected static int hashValue(byte[] arg0, int arg1, int arg2) {
      return 0;
    }

    protected static boolean equals(byte[] arg0, int arg1, byte[] arg2, int arg3, int arg4) {
      return false;
    }
  }
}
