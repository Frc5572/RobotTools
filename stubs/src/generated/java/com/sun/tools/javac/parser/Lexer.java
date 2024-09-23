package com.sun.tools.javac.parser;

import com.sun.tools.javac.util.Position;

public interface Lexer {
  void nextToken();

  Tokens.Token token();

  Tokens.Token token(int arg0);

  Tokens.Token prevToken();

  void setPrevToken(Tokens.Token arg0);

  Tokens.Token split();

  int errPos();

  void errPos(int arg0);

  Position.LineMap getLineMap();
}
