package com.sun.tools.javac.util;

import java.lang.String;

public class Bits {
  public Bits() {
  }

  public Bits(Bits arg0) {
  }

  public Bits(boolean arg0) {
  }

  protected Bits(int[] arg0, BitsState arg1) {
  }

  protected void sizeTo(int arg0) {
  }

  public void clear() {
  }

  public void reset() {
  }

  protected void internalReset() {
  }

  public boolean isReset() {
    return false;
  }

  public Bits assign(Bits arg0) {
    return null;
  }

  public Bits dup() {
    return null;
  }

  protected int[] dupBits() {
    return null;
  }

  public void incl(int arg0) {
  }

  public void inclRange(int arg0, int arg1) {
  }

  public void excludeFrom(int arg0) {
  }

  public void excl(int arg0) {
  }

  public boolean isMember(int arg0) {
    return false;
  }

  public Bits andSet(Bits arg0) {
    return null;
  }

  protected void internalAndSet(Bits arg0) {
  }

  public Bits orSet(Bits arg0) {
    return null;
  }

  public Bits diffSet(Bits arg0) {
    return null;
  }

  public Bits xorSet(Bits arg0) {
    return null;
  }

  private static int trailingZeroBits(int arg0) {
    return 0;
  }

  public int nextBit(int arg0) {
    return 0;
  }

  public String toString() {
    return null;
  }

  public final enum BitsState {
    UNKNOWN,

    UNINIT,

    NORMAL
  }
}
