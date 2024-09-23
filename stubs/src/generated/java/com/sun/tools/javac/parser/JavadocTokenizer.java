package com.sun.tools.javac.parser;

import com.sun.tools.javac.util.Position;
import java.lang.String;
import java.nio.CharBuffer;

public class JavadocTokenizer extends JavaTokenizer {
  protected JavadocTokenizer(ScannerFactory arg0, CharBuffer arg1) {
  }

  protected JavadocTokenizer(ScannerFactory arg0, char[] arg1, int arg2) {
  }

  protected Tokens.Comment processComment(int arg0, int arg1, Tokens.Comment.CommentStyle arg2) {
    return null;
  }

  public Position.LineMap getLineMap() {
    return null;
  }

  public static class JavadocComment extends JavaTokenizer.BasicComment {
    JavadocComment(Tokens.Comment.CommentStyle arg0, UnicodeReader arg1, int arg2, int arg3) {
    }

    protected void putLine(UnicodeReader arg0) {
    }

    public String getText() {
      return null;
    }

    public int getSourcePos(int arg0) {
      return 0;
    }

    protected void scanDocComment() {
    }
  }

  static class OffsetMap {
    OffsetMap() {
    }

    boolean shouldAdd(int arg0, int arg1) {
      return false;
    }

    void add(int arg0, int arg1) {
    }

    private int lastSBOffset() {
      return 0;
    }

    private int lastPosOffset() {
      return 0;
    }

    private void ensure(int arg0) {
    }

    void trim() {
    }

    int getSourcePos(int arg0) {
      return 0;
    }
  }
}
