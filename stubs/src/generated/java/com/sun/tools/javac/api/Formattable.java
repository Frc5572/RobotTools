package com.sun.tools.javac.api;

import java.lang.String;
import java.util.Locale;

public interface Formattable {
  String toString(Locale arg0, Messages arg1);

  String getKind();

  class LocalizedString implements Formattable {
    public LocalizedString(String arg0) {
    }

    public String toString(Locale arg0, Messages arg1) {
      return null;
    }

    public String getKind() {
      return null;
    }

    public String toString() {
      return null;
    }
  }
}
