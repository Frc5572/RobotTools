package com.sun.tools.javac.code;

import com.sun.tools.javac.util.List;
import java.lang.Class;
import java.lang.annotation.Annotation;
import javax.lang.model.AnnotatedConstruct;

public abstract class AnnoConstruct implements AnnotatedConstruct {
  public AnnoConstruct() {
  }

  public abstract List getAnnotationMirrors();

  protected Attribute.Compound getAttribute(Class arg0) {
    return null;
  }

  protected Annotation[] getInheritedAnnotations(Class arg0) {
    return null;
  }

  public Annotation[] getAnnotationsByType(Class arg0) {
    return null;
  }

  private Attribute.Compound[] unpackContained(Attribute.Compound arg0) {
    return null;
  }

  public Annotation getAnnotation(Class arg0) {
    return null;
  }

  private static Class getContainer(Class arg0) {
    return null;
  }

  private static Attribute[] unpackAttributes(Attribute.Compound arg0) {
    return null;
  }

  public java.util.List getAnnotationMirrors() {
    return null;
  }
}
