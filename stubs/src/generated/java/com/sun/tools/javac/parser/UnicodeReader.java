package com.sun.tools.javac.parser;

import com.sun.tools.javac.util.Log;
import java.lang.String;

public class UnicodeReader {
  protected UnicodeReader(ScannerFactory arg0, char[] arg1, int arg2) {
  }

  protected UnicodeReader(Log arg0, char[] arg1, int arg2) {
  }

  protected UnicodeReader(Log arg0, char[] arg1, int arg2, int arg3, int arg4) {
  }

  protected char[] buffer() {
    return null;
  }

  protected int length() {
    return 0;
  }

  protected boolean isAvailable() {
    return false;
  }

  private void nextCodeUnit() {
  }

  private void nextUnicodeInputCharacter() {
  }

  private void nextCodePoint() {
  }

  private UnicodeEscapeResult unicodeEscape() {
    return null;
  }

  protected int position() {
    return 0;
  }

  protected void reset(int arg0) {
  }

  protected char get() {
    return '_';
  }

  protected int getCodepoint() {
    return 0;
  }

  protected boolean isSurrogate() {
    return false;
  }

  protected boolean isASCII() {
    return false;
  }

  protected char next() {
    return '_';
  }

  protected boolean is(char arg0) {
    return false;
  }

  protected boolean isOneOf(char arg0, char arg1) {
    return false;
  }

  protected boolean isOneOf(char arg0, char arg1, char arg2) {
    return false;
  }

  protected boolean isOneOf(char arg0, char arg1, char arg2, char arg3) {
    return false;
  }

  protected boolean isOneOf(char arg0, char arg1, char arg2, char arg3, char arg4, char arg5) {
    return false;
  }

  protected boolean inRange(char arg0, char arg1) {
    return false;
  }

  protected boolean accept(char arg0) {
    return false;
  }

  protected boolean acceptOneOf(char arg0, char arg1) {
    return false;
  }

  protected boolean acceptOneOf(char arg0, char arg1, char arg2) {
    return false;
  }

  protected UnicodeReader lineReader() {
    return null;
  }

  protected UnicodeReader lineReader(int arg0, int arg1) {
    return null;
  }

  protected int skip(char arg0) {
    return 0;
  }

  protected boolean isWhitespace() {
    return false;
  }

  protected void skipWhitespace() {
  }

  protected boolean isEOLN() {
    return false;
  }

  protected void skipToEOLN() {
  }

  protected boolean accept(String arg0) {
    return false;
  }

  protected int digit(int arg0, int arg1) {
    return 0;
  }

  public char[] getRawCharacters() {
    return null;
  }

  public char[] getRawCharacters(int arg0, int arg1) {
    return null;
  }

  public String getRawString(int arg0, int arg1) {
    return null;
  }

  public String getRawString() {
    return null;
  }

  static class PositionTrackingReader extends UnicodeReader {
    protected PositionTrackingReader(UnicodeReader arg0, int arg1, int arg2) {
    }

    protected char next() {
      return '_';
    }

    protected int column() {
      return 0;
    }
  }

  final enum UnicodeEscapeResult {
    BACKSLASH,

    VALID_ESCAPE,

    BROKEN_ESCAPE
  }
}
