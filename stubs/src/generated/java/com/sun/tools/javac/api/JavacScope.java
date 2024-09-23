package com.sun.tools.javac.api;

import com.sun.source.tree.Scope;
import com.sun.tools.javac.code.Symbol;
import com.sun.tools.javac.comp.Env;
import java.lang.Iterable;
import java.lang.Object;
import java.lang.String;
import javax.lang.model.element.ExecutableElement;
import javax.lang.model.element.TypeElement;

public class JavacScope implements Scope {
  private JavacScope(Env arg0) {
  }

  static JavacScope create(Env arg0) {
    return null;
  }

  public JavacScope getEnclosingScope() {
    return null;
  }

  public TypeElement getEnclosingClass() {
    return null;
  }

  public ExecutableElement getEnclosingMethod() {
    return null;
  }

  public Iterable getLocalElements() {
    return null;
  }

  public Env getEnv() {
    return null;
  }

  public boolean isStarImportScope() {
    return false;
  }

  public boolean equals(Object arg0) {
    return false;
  }

  public int hashCode() {
    return 0;
  }

  public String toString() {
    return null;
  }

  public Scope getEnclosingScope() {
    return null;
  }

  private static boolean lambda$static$0(Symbol arg0) {
    return false;
  }
}
