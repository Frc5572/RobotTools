package com.sun.tools.javac.parser;

import com.sun.tools.javac.util.Context;
import com.sun.tools.javac.util.List;
import com.sun.tools.javac.util.Name;
import java.lang.String;

public class Tokens {
  protected Tokens(Context arg0) {
  }

  public static Tokens instance(Context arg0) {
    return null;
  }

  TokenKind lookupKind(Name arg0) {
    return null;
  }

  TokenKind lookupKind(String arg0) {
    return null;
  }

  public final enum CommentStyle {
    LINE,

    BLOCK,

    JAVADOC
  }

  public interface Comment {
    String getText();

    int getSourcePos(int arg0);

    Comment.CommentStyle getStyle();

    boolean isDeprecated();
  }

  static final class NamedToken extends Token {
    public NamedToken(TokenKind arg0, int arg1, int arg2, Name arg3, List arg4) {
    }

    protected void checkKind() {
    }

    public Name name() {
      return null;
    }
  }

  static final class NumericToken extends StringToken {
    public NumericToken(TokenKind arg0, int arg1, int arg2, String arg3, int arg4, List arg5) {
    }

    protected void checkKind() {
    }

    public int radix() {
      return 0;
    }
  }

  static class StringToken extends Token {
    public StringToken(TokenKind arg0, int arg1, int arg2, String arg3, List arg4) {
    }

    protected void checkKind() {
    }

    public String stringVal() {
      return null;
    }
  }

  final enum Tag {
    DEFAULT,

    NAMED,

    STRING,

    NUMERIC
  }

  public static class Token {
    Token(TokenKind arg0, int arg1, int arg2, List arg3) {
    }

    Token[] split(Tokens arg0) {
      return null;
    }

    protected void checkKind() {
    }

    public Name name() {
      return null;
    }

    public String stringVal() {
      return null;
    }

    public int radix() {
      return 0;
    }

    public Comment comment(Comment.CommentStyle arg0) {
      return null;
    }

    public boolean deprecatedFlag() {
      return false;
    }

    private List getComments(Comment.CommentStyle arg0) {
      return null;
    }
  }

  public final enum TokenKind {
    EOF,

    ERROR,

    IDENTIFIER,

    ABSTRACT,

    ASSERT,

    BOOLEAN,

    BREAK,

    BYTE,

    CASE,

    CATCH,

    CHAR,

    CLASS,

    CONST,

    CONTINUE,

    DEFAULT,

    DO,

    DOUBLE,

    ELSE,

    ENUM,

    EXTENDS,

    FINAL,

    FINALLY,

    FLOAT,

    FOR,

    GOTO,

    IF,

    IMPLEMENTS,

    IMPORT,

    INSTANCEOF,

    INT,

    INTERFACE,

    LONG,

    NATIVE,

    NEW,

    PACKAGE,

    PRIVATE,

    PROTECTED,

    PUBLIC,

    RETURN,

    SHORT,

    STATIC,

    STRICTFP,

    SUPER,

    SWITCH,

    SYNCHRONIZED,

    THIS,

    THROW,

    THROWS,

    TRANSIENT,

    TRY,

    VOID,

    VOLATILE,

    WHILE,

    INTLITERAL,

    LONGLITERAL,

    FLOATLITERAL,

    DOUBLELITERAL,

    CHARLITERAL,

    STRINGLITERAL,

    STRINGFRAGMENT,

    TRUE,

    FALSE,

    NULL,

    UNDERSCORE,

    ARROW,

    COLCOL,

    LPAREN,

    RPAREN,

    LBRACE,

    RBRACE,

    LBRACKET,

    RBRACKET,

    SEMI,

    COMMA,

    DOT,

    ELLIPSIS,

    EQ,

    GT,

    LT,

    BANG,

    TILDE,

    QUES,

    COLON,

    EQEQ,

    LTEQ,

    GTEQ,

    BANGEQ,

    AMPAMP,

    BARBAR,

    PLUSPLUS,

    SUBSUB,

    PLUS,

    SUB,

    STAR,

    SLASH,

    AMP,

    BAR,

    CARET,

    PERCENT,

    LTLT,

    GTGT,

    GTGTGT,

    PLUSEQ,

    SUBEQ,

    STAREQ,

    SLASHEQ,

    AMPEQ,

    BAREQ,

    CARETEQ,

    PERCENTEQ,

    LTLTEQ,

    GTGTEQ,

    GTGTGTEQ,

    MONKEYS_AT,

    CUSTOM
  }
}
