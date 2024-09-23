package com.sun.tools.javac.model;

import com.sun.tools.javac.code.Attribute;
import com.sun.tools.javac.code.Symbol;
import com.sun.tools.javac.util.List;
import java.io.ObjectInputStream;
import java.lang.Class;
import java.lang.Object;
import java.lang.RuntimeException;
import java.lang.String;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.Map;
import javax.lang.model.type.TypeMirror;
import sun.reflect.annotation.ExceptionProxy;

public class AnnotationProxyMaker {
  private AnnotationProxyMaker(Attribute.Compound arg0, Class arg1) {
  }

  public static Annotation generateAnnotation(Attribute.Compound arg0, Class arg1) {
    return null;
  }

  private Annotation generateAnnotation() {
    return null;
  }

  private Map getAllReflectedValues() {
    return null;
  }

  private Map getAllValues() {
    return null;
  }

  private Object generateValue(Symbol.MethodSymbol arg0, Attribute arg1) {
    return null;
  }

  static final class MirroredTypeExceptionProxy extends ExceptionProxy {
    MirroredTypeExceptionProxy(TypeMirror arg0) {
    }

    public String toString() {
      return null;
    }

    public int hashCode() {
      return 0;
    }

    public boolean equals(Object arg0) {
      return false;
    }

    protected RuntimeException generateException() {
      return null;
    }

    private void readObject(ObjectInputStream arg0) {
    }
  }

  static final class MirroredTypesExceptionProxy extends ExceptionProxy {
    MirroredTypesExceptionProxy(List arg0) {
    }

    public String toString() {
      return null;
    }

    public int hashCode() {
      return 0;
    }

    public boolean equals(Object arg0) {
      return false;
    }

    protected RuntimeException generateException() {
      return null;
    }

    private void readObject(ObjectInputStream arg0) {
    }

    private static String lambda$toString$0(TypeMirror arg0) {
      return null;
    }
  }

  static class ValueVisitor implements Attribute.Visitor {
    ValueVisitor(AnnotationProxyMaker arg0, Symbol.MethodSymbol arg1) {
    }

    Object getValue(Attribute arg0) {
      return null;
    }

    public void visitConstant(Attribute.Constant arg0) {
    }

    public void visitClass(Attribute.Class arg0) {
    }

    public void visitArray(Attribute.Array arg0) {
    }

    public void visitEnum(Attribute.Enum arg0) {
    }

    public void visitCompound(Attribute.Compound arg0) {
    }

    public void visitError(Attribute.Error arg0) {
    }

    private void typeMismatch(Method arg0, Attribute arg1) {
    }
  }
}
