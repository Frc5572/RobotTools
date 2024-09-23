package com.sun.tools.javac.main;

import com.sun.tools.javac.processing.AnnotationProcessingError;
import com.sun.tools.javac.util.Context;
import com.sun.tools.javac.util.JCDiagnostic;
import com.sun.tools.javac.util.Options;
import java.io.PrintWriter;
import java.lang.IllegalAccessError;
import java.lang.String;
import java.lang.Throwable;

public class Main {
  public Main(String arg0) {
  }

  public Main(String arg0, PrintWriter arg1) {
  }

  public Main(String arg0, PrintWriter arg1, PrintWriter arg2) {
  }

  void reportDiag(JCDiagnostic.DiagnosticInfo arg0) {
  }

  void reportHelper(JCDiagnostic.DiagnosticInfo arg0) {
  }

  public Result compile(String[] arg0) {
    return null;
  }

  public Result compile(String[] arg0, Context arg1) {
    return null;
  }

  void printArgumentsToFile(String[] arg0) {
  }

  private boolean twoClassLoadersInUse(IllegalAccessError arg0) {
    return false;
  }

  void bugMessage(Throwable arg0) {
  }

  void feMessage(Throwable arg0, Options arg1) {
  }

  void ioMessage(Throwable arg0) {
  }

  void resourceMessage(Throwable arg0) {
  }

  void apMessage(AnnotationProcessingError arg0) {
  }

  void pluginMessage(Throwable arg0) {
  }

  void showClass(String arg0) {
  }

  public final enum Result {
    OK,

    ERROR,

    CMDERR,

    SYSERR,

    ABNORMAL
  }
}
