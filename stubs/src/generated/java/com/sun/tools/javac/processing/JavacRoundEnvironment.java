package com.sun.tools.javac.processing;

import java.lang.Class;
import java.lang.Object;
import java.lang.String;
import java.util.Set;
import javax.annotation.processing.RoundEnvironment;
import javax.lang.model.element.AnnotationMirror;
import javax.lang.model.element.Element;
import javax.lang.model.element.ModuleElement;
import javax.lang.model.element.PackageElement;
import javax.lang.model.element.TypeElement;
import javax.lang.model.util.ElementScanner14;

public class JavacRoundEnvironment implements RoundEnvironment {
  JavacRoundEnvironment(boolean arg0, boolean arg1, Set arg2, JavacProcessingEnvironment arg3) {
  }

  public String toString() {
    return null;
  }

  public boolean processingOver() {
    return false;
  }

  public boolean errorRaised() {
    return false;
  }

  public Set getRootElements() {
    return null;
  }

  public Set getElementsAnnotatedWith(TypeElement arg0) {
    return null;
  }

  public Set getElementsAnnotatedWithAny(TypeElement[] arg0) {
    return null;
  }

  public Set getElementsAnnotatedWith(Class arg0) {
    return null;
  }

  public Set getElementsAnnotatedWithAny(Set arg0) {
    return null;
  }

  private TypeElement annotationToElement(Class arg0) {
    return null;
  }

  private Element mirrorAsElement(AnnotationMirror arg0) {
    return null;
  }

  private void throwIfNotAnnotation(Class arg0) {
  }

  private void throwIfNotAnnotation(TypeElement arg0) {
  }

  static class AnnotationSetMultiScanner extends ElementScanner14 {
    AnnotationSetMultiScanner(JavacRoundEnvironment arg0, Set arg1) {
    }

    public Set scan(Element arg0, Set arg1) {
      return null;
    }

    public Set visitModule(ModuleElement arg0, Set arg1) {
      return null;
    }

    public Set visitPackage(PackageElement arg0, Set arg1) {
      return null;
    }

    public Object visitModule(ModuleElement arg0, Object arg1) {
      return null;
    }

    public Object visitPackage(PackageElement arg0, Object arg1) {
      return null;
    }

    public Object scan(Element arg0, Object arg1) {
      return null;
    }
  }

  static class AnnotationSetScanner extends ElementScanner14 {
    AnnotationSetScanner(JavacRoundEnvironment arg0, Set arg1) {
    }

    public Set scan(Element arg0, TypeElement arg1) {
      return null;
    }

    public Set visitModule(ModuleElement arg0, TypeElement arg1) {
      return null;
    }

    public Set visitPackage(PackageElement arg0, TypeElement arg1) {
      return null;
    }

    public Object visitModule(ModuleElement arg0, Object arg1) {
      return null;
    }

    public Object visitPackage(PackageElement arg0, Object arg1) {
      return null;
    }

    public Object scan(Element arg0, Object arg1) {
      return null;
    }
  }
}
