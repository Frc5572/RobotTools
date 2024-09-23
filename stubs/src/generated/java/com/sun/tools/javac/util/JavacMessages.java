package com.sun.tools.javac.util;

import com.sun.tools.javac.api.Messages;
import java.lang.Object;
import java.lang.String;
import java.util.Locale;
import java.util.ResourceBundle;

public class JavacMessages implements Messages {
  public JavacMessages(Context arg0) {
  }

  public JavacMessages(String arg0) {
  }

  public JavacMessages(String arg0, Locale arg1) {
  }

  public JavacMessages() {
  }

  public static JavacMessages instance(Context arg0) {
    return null;
  }

  public Locale getCurrentLocale() {
    return null;
  }

  public void setCurrentLocale(Locale arg0) {
  }

  public void add(String arg0) {
  }

  public void add(ResourceBundleHelper arg0) {
  }

  public List getBundles(Locale arg0) {
    return null;
  }

  public String getLocalizedString(String arg0, Object[] arg1) {
    return null;
  }

  public String getLocalizedString(JCDiagnostic.DiagnosticInfo arg0) {
    return null;
  }

  public String getLocalizedString(Locale arg0, String arg1, Object[] arg2) {
    return null;
  }

  public String getLocalizedString(Locale arg0, JCDiagnostic.DiagnosticInfo arg1) {
    return null;
  }

  static String getDefaultLocalizedString(String arg0, Object[] arg1) {
    return null;
  }

  static JavacMessages getDefaultMessages() {
    return null;
  }

  public static ResourceBundle getDefaultBundle() {
    return null;
  }

  private static String getLocalizedString(List arg0, String arg1, Object[] arg2) {
    return null;
  }

  private String getLocalizedString(List arg0, JCDiagnostic.DiagnosticInfo arg1) {
    return null;
  }

  JCDiagnostic.Factory getDiagFactory() {
    return null;
  }

  private static ResourceBundle lambda$add$0(String arg0, Locale arg1) {
    return null;
  }

  public interface ResourceBundleHelper {
    ResourceBundle getResourceBundle(Locale arg0);
  }
}
