package com.sun.tools.javac.platform;

import java.lang.Exception;
import java.lang.Iterable;
import java.lang.String;

public interface PlatformProvider {
  Iterable getSupportedPlatformNames();

  PlatformDescription getPlatform(String arg0, String arg1);

  class PlatformNotSupported extends Exception {
    public PlatformNotSupported() {
    }
  }
}
