package com.sun.tools.javac.model;

import com.sun.tools.javac.code.Symbol;
import com.sun.tools.javac.code.Type;
import com.sun.tools.javac.util.Context;
import java.lang.Class;
import java.lang.Object;
import java.util.List;
import java.util.Set;
import javax.lang.model.element.Element;
import javax.lang.model.element.TypeElement;
import javax.lang.model.type.ArrayType;
import javax.lang.model.type.DeclaredType;
import javax.lang.model.type.ExecutableType;
import javax.lang.model.type.NoType;
import javax.lang.model.type.NullType;
import javax.lang.model.type.PrimitiveType;
import javax.lang.model.type.TypeKind;
import javax.lang.model.type.TypeMirror;
import javax.lang.model.type.WildcardType;
import javax.lang.model.util.Types;

public class JavacTypes implements Types {
  protected JavacTypes(Context arg0) {
  }

  public static JavacTypes instance(Context arg0) {
    return null;
  }

  public Element asElement(TypeMirror arg0) {
    return null;
  }

  public boolean isSameType(TypeMirror arg0, TypeMirror arg1) {
    return false;
  }

  public boolean isSubtype(TypeMirror arg0, TypeMirror arg1) {
    return false;
  }

  public boolean isAssignable(TypeMirror arg0, TypeMirror arg1) {
    return false;
  }

  public boolean contains(TypeMirror arg0, TypeMirror arg1) {
    return false;
  }

  public boolean isSubsignature(ExecutableType arg0, ExecutableType arg1) {
    return false;
  }

  public List directSupertypes(TypeMirror arg0) {
    return null;
  }

  public TypeMirror erasure(TypeMirror arg0) {
    return null;
  }

  public TypeElement boxedClass(PrimitiveType arg0) {
    return null;
  }

  public PrimitiveType unboxedType(TypeMirror arg0) {
    return null;
  }

  public TypeMirror capture(TypeMirror arg0) {
    return null;
  }

  public PrimitiveType getPrimitiveType(TypeKind arg0) {
    return null;
  }

  public NullType getNullType() {
    return null;
  }

  public NoType getNoType(TypeKind arg0) {
    return null;
  }

  public ArrayType getArrayType(TypeMirror arg0) {
    return null;
  }

  public WildcardType getWildcardType(TypeMirror arg0, TypeMirror arg1) {
    return null;
  }

  public DeclaredType getDeclaredType(TypeElement arg0, TypeMirror[] arg1) {
    return null;
  }

  public DeclaredType getDeclaredType(DeclaredType arg0, TypeElement arg1, TypeMirror[] arg2) {
    return null;
  }

  private DeclaredType getDeclaredType0(Type arg0, Symbol.ClassSymbol arg1, TypeMirror[] arg2) {
    return null;
  }

  public TypeMirror asMemberOf(DeclaredType arg0, Element arg1) {
    return null;
  }

  private void validateTypeNotIn(TypeMirror arg0, Set arg1) {
  }

  private static Object cast(Class arg0, Object arg1) {
    return null;
  }

  public Set getOverriddenMethods(Element arg0) {
    return null;
  }
}
