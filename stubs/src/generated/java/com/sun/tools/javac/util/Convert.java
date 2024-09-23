package com.sun.tools.javac.util;

import java.lang.String;

public class Convert {
  public Convert() {
  }

  public static int string2int(String arg0, int arg1) {
    return 0;
  }

  public static long string2long(String arg0, int arg1) {
    return 0L;
  }

  public static void utfValidate(byte[] arg0, int arg1, int arg2, Validation arg3) {
  }

  public static int utf2chars(byte[] arg0, int arg1, char[] arg2, int arg3, int arg4,
      Validation arg5) {
    return 0;
  }

  public static char[] utf2chars(byte[] arg0, int arg1, int arg2, Validation arg3) {
    return null;
  }

  public static String utf2string(byte[] arg0, int arg1, int arg2, Validation arg3) {
    return null;
  }

  public static int chars2utf(char[] arg0, int arg1, byte[] arg2, int arg3, int arg4) {
    return 0;
  }

  public static byte[] chars2utf(char[] arg0, int arg1, int arg2) {
    return null;
  }

  public static byte[] chars2utf(char[] arg0) {
    return null;
  }

  public static byte[] string2utf(String arg0) {
    return null;
  }

  public static String quote(String arg0) {
    return null;
  }

  public static String quote(char arg0) {
    return null;
  }

  private static boolean isPrintableAscii(char arg0) {
    return false;
  }

  public static String escapeUnicode(String arg0) {
    return null;
  }

  public static Name shortName(Name arg0) {
    return null;
  }

  public static String shortName(String arg0) {
    return null;
  }

  public static Name packagePart(Name arg0) {
    return null;
  }

  public static String packagePart(String arg0) {
    return null;
  }

  public static List enclosingCandidates(Name arg0) {
    return null;
  }

  public static List classCandidates(Name arg0) {
    return null;
  }

  public final enum Validation {
    NONE,

    PREJDK14,

    STRICT
  }
}
