package com.sun.tools.javac.util;

import java.lang.Error;
import java.lang.Object;
import java.lang.String;
import java.util.function.Supplier;

public class Assert {
  private Assert() {
  }

  public static void check(boolean arg0) {
  }

  public static void checkNull(Object arg0) {
  }

  public static Object checkNonNull(Object arg0) {
    return null;
  }

  public static void check(boolean arg0, int arg1) {
  }

  public static void check(boolean arg0, long arg1) {
  }

  public static void check(boolean arg0, Object arg1) {
  }

  public static void check(boolean arg0, String arg1) {
  }

  public static void check(boolean arg0, Supplier arg1) {
  }

  public static void checkNull(Object arg0, Object arg1) {
  }

  public static void checkNull(Object arg0, String arg1) {
  }

  public static void checkNull(Object arg0, Supplier arg1) {
  }

  public static Object checkNonNull(Object arg0, String arg1) {
    return null;
  }

  public static Object checkNonNull(Object arg0, Supplier arg1) {
    return null;
  }

  public static Error error() {
    return null;
  }

  public static Error error(String arg0) {
    return null;
  }
}
