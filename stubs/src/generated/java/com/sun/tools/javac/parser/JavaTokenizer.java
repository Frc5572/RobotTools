package com.sun.tools.javac.parser;

import com.sun.tools.javac.code.Lint;
import com.sun.tools.javac.code.Source;
import com.sun.tools.javac.util.JCDiagnostic;
import com.sun.tools.javac.util.List;
import com.sun.tools.javac.util.Position;
import java.lang.String;
import java.nio.CharBuffer;

public class JavaTokenizer extends UnicodeReader {
  protected JavaTokenizer(ScannerFactory arg0, CharBuffer arg1) {
  }

  protected JavaTokenizer(ScannerFactory arg0, char[] arg1, int arg2) {
  }

  protected void checkSourceLevel(int arg0, Source.Feature arg1) {
  }

  protected void lexError(int arg0, JCDiagnostic.Error arg1) {
  }

  protected void lexError(JCDiagnostic.DiagnosticFlag arg0, int arg1, JCDiagnostic.Error arg2) {
  }

  protected void lexWarning(Lint.LintCategory arg0, int arg1, JCDiagnostic.Warning arg2) {
  }

  protected void put(char arg0) {
  }

  protected void putCodePoint(int arg0) {
  }

  protected void put() {
  }

  protected void put(String arg0) {
  }

  protected char putThenNext() {
    return '_';
  }

  protected boolean acceptThenPut(char arg0) {
    return false;
  }

  protected boolean acceptOneOfThenPut(char arg0, char arg1) {
    return false;
  }

  private void skipLineTerminator() {
  }

  private void scanEmbeddedExpression(int arg0, int arg1) {
  }

  private void scanLitChar(int arg0) {
  }

  private void scanString(int arg0) {
  }

  private void scanDigits(int arg0, int arg1) {
  }

  private void scanHexExponentAndSuffix(int arg0) {
  }

  private void scanFraction(int arg0) {
  }

  private void scanFractionAndSuffix(int arg0) {
  }

  private void scanHexFractionAndSuffix(int arg0, boolean arg1) {
  }

  private void skipIllegalUnderscores() {
  }

  private void scanNumber(int arg0, int arg1) {
  }

  private void checkIdent() {
  }

  private void scanIdent() {
  }

  private boolean isSpecial(char arg0) {
    return false;
  }

  private void scanOperator() {
  }

  public Tokens.Token readToken() {
    return null;
  }

  private Tokens.Token getFragments(String arg0, List arg1) {
    return null;
  }

  List fragment(String arg0) {
    return null;
  }

  List appendComment(List arg0, Tokens.Comment arg1) {
    return null;
  }

  public int errPos() {
    return 0;
  }

  public void errPos(int arg0) {
  }

  protected Tokens.Comment processComment(int arg0, int arg1, Tokens.Comment.CommentStyle arg2) {
    return null;
  }

  protected void processWhiteSpace(int arg0, int arg1) {
  }

  protected void processLineTerminator(int arg0, int arg1) {
  }

  public Position.LineMap getLineMap() {
    return null;
  }

  public static class BasicComment extends UnicodeReader.PositionTrackingReader implements Tokens.Comment {
    protected BasicComment(Tokens.Comment.CommentStyle arg0, UnicodeReader arg1, int arg2,
        int arg3) {
    }

    public String getText() {
      return null;
    }

    public int getSourcePos(int arg0) {
      return 0;
    }

    public Tokens.Comment.CommentStyle getStyle() {
      return null;
    }

    public boolean isDeprecated() {
      return false;
    }

    UnicodeReader trimEndOfComment(UnicodeReader arg0) {
      return null;
    }

    UnicodeReader trimJavadocComment(UnicodeReader arg0) {
      return null;
    }

    protected void putLine(UnicodeReader arg0) {
    }

    protected void scanDocComment() {
    }
  }
}
