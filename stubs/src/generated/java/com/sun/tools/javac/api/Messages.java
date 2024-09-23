package com.sun.tools.javac.api;

import java.lang.Object;
import java.lang.String;
import java.util.Locale;

public interface Messages {
  void add(String arg0);

  String getLocalizedString(Locale arg0, String arg1, Object[] arg2);
}
