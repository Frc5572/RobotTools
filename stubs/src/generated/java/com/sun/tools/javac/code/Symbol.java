package com.sun.tools.javac.code;

import com.sun.tools.javac.jvm.PoolConstant;
import java.lang.Record;
import java.lang.RuntimeException;
import javax.lang.model.element.Element;
import javax.lang.model.element.ExecutableElement;
import javax.lang.model.element.ModuleElement;
import javax.lang.model.element.PackageElement;
import javax.lang.model.element.RecordComponentElement;
import javax.lang.model.element.TypeElement;
import javax.lang.model.element.TypeParameterElement;
import javax.lang.model.element.VariableElement;

public abstract class Symbol extends AnnoConstruct implements PoolConstant, Element {
  public static class BindingSymbol extends VarSymbol {
  }

  static final class PermittedClassWithPos extends Record {
  }

  public static class ClassSymbol extends TypeSymbol implements TypeElement {
  }

  public interface Completer {
  }

  public static class CompletionFailure extends RuntimeException {
  }

  public static class DelegatedSymbol extends Symbol {
  }

  public static class DynamicMethodSymbol extends MethodSymbol implements PoolConstant.Dynamic {
  }

  public static class DynamicVarSymbol extends VarSymbol implements PoolConstant.Dynamic, PoolConstant.LoadableConstant {
  }

  public static class MethodHandleSymbol extends MethodSymbol implements PoolConstant.LoadableConstant {
  }

  public static class MethodSymbol extends Symbol implements ExecutableElement {
  }

  public final enum ModuleFlags {
    OPEN,

    SYNTHETIC,

    MANDATED
  }

  public final enum ModuleResolutionFlags {
    DO_NOT_RESOLVE_BY_DEFAULT,

    WARN_DEPRECATED,

    WARN_DEPRECATED_REMOVAL,

    WARN_INCUBATING
  }

  public static class ModuleSymbol extends TypeSymbol implements ModuleElement {
  }

  public final enum AccessCode {
    UNKNOWN,

    DEREF,

    ASSIGN,

    PREINC,

    PREDEC,

    POSTINC,

    POSTDEC,

    FIRSTASGOP
  }

  public static class OperatorSymbol extends MethodSymbol {
  }

  public static class PackageSymbol extends TypeSymbol implements PackageElement {
  }

  public static class ParamSymbol extends VarSymbol {
  }

  public static class RecordComponent extends VarSymbol implements RecordComponentElement {
  }

  public static class RootPackageSymbol extends PackageSymbol {
  }

  public abstract static class TypeSymbol extends Symbol {
  }

  public static class TypeVariableSymbol extends TypeSymbol implements TypeParameterElement {
  }

  public static class VarSymbol extends Symbol implements VariableElement {
  }

  public interface Visitor {
  }
}
