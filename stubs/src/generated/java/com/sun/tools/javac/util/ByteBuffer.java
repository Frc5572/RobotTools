package com.sun.tools.javac.util;

import java.io.InputStream;
import java.lang.Exception;

public class ByteBuffer {
  public ByteBuffer() {
  }

  public ByteBuffer(int arg0) {
  }

  public ByteBuffer(byte[] arg0) {
  }

  public void appendByte(int arg0) {
  }

  public void appendBytes(byte[] arg0, int arg1, int arg2) {
  }

  public void appendBytes(byte[] arg0) {
  }

  public void appendChar(int arg0) {
  }

  public void appendInt(int arg0) {
  }

  public void appendLong(long arg0) {
  }

  public void appendFloat(float arg0) {
  }

  public void appendDouble(double arg0) {
  }

  public void appendName(Name arg0) {
  }

  public void appendStream(InputStream arg0) {
  }

  public int getInt(int arg0) {
    return 0;
  }

  public long getLong(int arg0) {
    return 0L;
  }

  public float getFloat(int arg0) {
    return 0.0F;
  }

  public double getDouble(int arg0) {
    return 0.0D;
  }

  public char getChar(int arg0) {
    return '_';
  }

  public byte getByte(int arg0) {
    return (byte)0;
  }

  public void reset() {
  }

  public Name toName(Names arg0) {
    return null;
  }

  public void verifyRange(int arg0, int arg1) {
  }

  public java.nio.ByteBuffer asByteBuffer() {
    return null;
  }

  public static class UnderflowException extends Exception {
    public UnderflowException(int arg0) {
    }

    public int getLength() {
      return 0;
    }
  }
}
