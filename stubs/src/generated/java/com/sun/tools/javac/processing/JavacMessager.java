package com.sun.tools.javac.processing;

import com.sun.tools.javac.util.Context;
import java.lang.CharSequence;
import java.lang.String;
import javax.annotation.processing.Messager;
import javax.lang.model.element.AnnotationMirror;
import javax.lang.model.element.AnnotationValue;
import javax.lang.model.element.Element;
import javax.tools.Diagnostic;

public class JavacMessager implements Messager {
  JavacMessager(Context arg0, JavacProcessingEnvironment arg1) {
  }

  public void printMessage(Diagnostic.Kind arg0, CharSequence arg1) {
  }

  public void printMessage(Diagnostic.Kind arg0, CharSequence arg1, Element arg2) {
  }

  public void printMessage(Diagnostic.Kind arg0, CharSequence arg1, Element arg2,
      AnnotationMirror arg3) {
  }

  public void printMessage(Diagnostic.Kind arg0, CharSequence arg1, Element arg2,
      AnnotationMirror arg3, AnnotationValue arg4) {
  }

  public void printError(String arg0) {
  }

  public void printWarning(String arg0) {
  }

  public void printNotice(String arg0) {
  }

  public boolean errorRaised() {
    return false;
  }

  public int errorCount() {
    return 0;
  }

  public int warningCount() {
    return 0;
  }

  public void newRound() {
  }

  public String toString() {
    return null;
  }
}
