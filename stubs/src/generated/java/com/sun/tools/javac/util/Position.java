package com.sun.tools.javac.util;

public class Position {
  private Position() {
  }

  public static LineMap makeLineMap(char[] arg0, int arg1, boolean arg2) {
    return null;
  }

  public static int encodePosition(int arg0, int arg1) {
    return 0;
  }

  public interface LineMap extends com.sun.source.tree.LineMap {
    int getStartPosition(int arg0);

    int getPosition(int arg0, int arg1);

    int getLineNumber(int arg0);

    int getColumnNumber(int arg0);
  }

  static class LineMapImpl implements LineMap {
    protected LineMapImpl() {
    }

    protected void build(char[] arg0, int arg1) {
    }

    public int getStartPosition(int arg0) {
      return 0;
    }

    public long getStartPosition(long arg0) {
      return 0L;
    }

    public int getPosition(int arg0, int arg1) {
      return 0;
    }

    public long getPosition(long arg0, long arg1) {
      return 0L;
    }

    public int getLineNumber(int arg0) {
      return 0;
    }

    public long getLineNumber(long arg0) {
      return 0L;
    }

    public int getColumnNumber(int arg0) {
      return 0;
    }

    public long getColumnNumber(long arg0) {
      return 0L;
    }

    private static int longToInt(long arg0) {
      return 0;
    }

    protected void setTabPosition(int arg0) {
    }
  }

  public static class LineTabMapImpl extends LineMapImpl {
    public LineTabMapImpl(int arg0) {
    }

    protected void setTabPosition(int arg0) {
    }

    public int getColumnNumber(int arg0) {
      return 0;
    }

    public int getPosition(int arg0, int arg1) {
      return 0;
    }

    public long getColumnNumber(long arg0) {
      return 0L;
    }

    public long getLineNumber(long arg0) {
      return 0L;
    }

    public int getLineNumber(int arg0) {
      return 0;
    }

    public long getPosition(long arg0, long arg1) {
      return 0L;
    }

    public long getStartPosition(long arg0) {
      return 0L;
    }

    public int getStartPosition(int arg0) {
      return 0;
    }
  }
}
