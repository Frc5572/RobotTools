package com.sun.tools.javac.util;

import com.sun.tools.javac.main.Option;
import java.lang.Runnable;
import java.lang.String;
import java.util.Set;

public class Options {
  protected Options(Context arg0) {
  }

  public static Options instance(Context arg0) {
    return null;
  }

  public String get(String arg0) {
    return null;
  }

  public String get(Option arg0) {
    return null;
  }

  public boolean getBoolean(String arg0) {
    return false;
  }

  public boolean getBoolean(String arg0, boolean arg1) {
    return false;
  }

  public boolean isSet(String arg0) {
    return false;
  }

  public boolean isSet(Option arg0) {
    return false;
  }

  public boolean isSet(Option arg0, String arg1) {
    return false;
  }

  public boolean isLintSet(String arg0) {
    return false;
  }

  public boolean isUnset(String arg0) {
    return false;
  }

  public boolean isUnset(Option arg0) {
    return false;
  }

  public boolean isUnset(Option arg0, String arg1) {
    return false;
  }

  public void put(String arg0, String arg1) {
  }

  public void put(Option arg0, String arg1) {
  }

  public void putAll(Options arg0) {
  }

  public void remove(String arg0) {
  }

  public Set keySet() {
    return null;
  }

  public int size() {
    return 0;
  }

  public void addListener(Runnable arg0) {
  }

  public void notifyListeners() {
  }

  public void clear() {
  }
}
