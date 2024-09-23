package com.sun.tools.javac.parser;

import com.sun.tools.javac.util.Position;
import java.nio.CharBuffer;

public class Scanner implements Lexer {
  protected Scanner(ScannerFactory arg0, CharBuffer arg1) {
  }

  protected Scanner(ScannerFactory arg0, char[] arg1, int arg2) {
  }

  protected Scanner(ScannerFactory arg0, JavaTokenizer arg1) {
  }

  public Tokens.Token token() {
    return null;
  }

  public Tokens.Token token(int arg0) {
    return null;
  }

  private void ensureLookahead(int arg0) {
  }

  public Tokens.Token prevToken() {
    return null;
  }

  public void setPrevToken(Tokens.Token arg0) {
  }

  public void nextToken() {
  }

  public Tokens.Token split() {
    return null;
  }

  public Position.LineMap getLineMap() {
    return null;
  }

  public int errPos() {
    return 0;
  }

  public void errPos(int arg0) {
  }
}
