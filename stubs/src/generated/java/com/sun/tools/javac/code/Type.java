package com.sun.tools.javac.code;

import com.sun.tools.javac.jvm.PoolConstant;
import javax.lang.model.type.DeclaredType;
import javax.lang.model.type.ExecutableType;
import javax.lang.model.type.IntersectionType;
import javax.lang.model.type.NoType;
import javax.lang.model.type.NullType;
import javax.lang.model.type.PrimitiveType;
import javax.lang.model.type.TypeMirror;
import javax.lang.model.type.TypeVariable;
import javax.lang.model.type.UnionType;

public abstract class Type extends AnnoConstruct implements TypeMirror, PoolConstant {
  public static class ArrayType extends Type implements PoolConstant.LoadableConstant, javax.lang.model.type.ArrayType {
  }

  static class BottomType extends Type implements NullType {
  }

  public static class CapturedType extends TypeVar {
  }

  public static class ClassType extends Type implements DeclaredType, PoolConstant.LoadableConstant, javax.lang.model.type.ErrorType {
  }

  public abstract static class DelegatedType extends Type {
  }

  public static class ErasedClassType extends ClassType {
  }

  public static class ErrorType extends ClassType implements javax.lang.model.type.ErrorType {
  }

  public static class ForAll extends DelegatedType implements ExecutableType {
  }

  public static class IntersectionClassType extends ClassType implements IntersectionType {
  }

  public static class JCNoType extends Type implements NoType {
  }

  public static class JCPrimitiveType extends Type implements PrimitiveType {
  }

  public static class JCVoidType extends Type implements NoType {
  }

  public static class MethodType extends Type implements ExecutableType, PoolConstant.LoadableConstant {
  }

  public static class ModuleType extends Type implements NoType {
  }

  public static class PackageType extends Type implements NoType {
  }

  public abstract static class StructuralTypeMapping extends Types.TypeMapping {
  }

  public static class TypeVar extends Type implements TypeVariable {
  }

  public abstract enum InferenceBound {
    LOWER,

    EQ,

    UPPER
  }

  final enum Kind {
    NORMAL,

    CAPTURED,

    THROWS
  }

  public interface UndetVarListener {
  }

  public static class UndetVar extends DelegatedType {
  }

  public static class UnionClassType extends ClassType implements UnionType {
  }

  public static class UnknownType extends Type {
  }

  public interface Visitor {
  }

  public static class WildcardType extends Type implements javax.lang.model.type.WildcardType {
  }
}
