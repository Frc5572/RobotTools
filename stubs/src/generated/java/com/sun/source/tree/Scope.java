package com.sun.source.tree;

import java.lang.Iterable;
import javax.lang.model.element.ExecutableElement;
import javax.lang.model.element.TypeElement;

public interface Scope {
  Scope getEnclosingScope();

  TypeElement getEnclosingClass();

  ExecutableElement getEnclosingMethod();

  Iterable getLocalElements();
}
