package com.sun.tools.javac.processing;

import java.lang.Class;
import java.lang.Error;
import java.lang.String;
import java.net.URL;

class ServiceProxy {
  ServiceProxy() {
  }

  private static void fail(Class arg0, String arg1) {
  }

  private static void fail(Class arg0, URL arg1, int arg2, String arg3) {
  }

  private static boolean parse(Class arg0, URL arg1) {
    return false;
  }

  public static boolean hasService(Class arg0, URL[] arg1) {
    return false;
  }

  static class ServiceConfigurationError extends Error {
    ServiceConfigurationError(String arg0) {
    }
  }
}
