package com.sun.tools.javac.jvm;

import com.sun.tools.javac.code.Attribute;
import com.sun.tools.javac.code.Symbol;
import com.sun.tools.javac.code.Type;
import com.sun.tools.javac.comp.Annotate;
import java.lang.Runnable;
import javax.tools.JavaFileObject;

public class ClassReader {
  static class AnnotationCompleter extends AnnotationDeproxy implements Runnable {
  }

  static class AnnotationDefaultCompleter extends AnnotationDeproxy implements Runnable {
  }

  static class AnnotationDeproxy implements ProxyVisitor {
  }

  static class ArrayAttributeProxy extends Attribute {
  }

  public final enum AttributeKind {
    CLASS,

    MEMBER
  }

  public abstract static class AttributeReader {
  }

  static class ClassAttributeProxy extends Attribute {
  }

  static class CompleterDeproxy implements Annotate.AnnotationTypeCompleter {
  }

  static class CompoundAnnotationProxy extends Attribute {
  }

  static class EnumAttributeProxy extends Attribute {
  }

  static final class InterimProvidesDirective {
  }

  static final class InterimUsesDirective {
  }

  static class ParameterAnnotations {
  }

  static class ProxyType extends Type {
  }

  interface ProxyVisitor extends Attribute.Visitor {
  }

  static class SourceFileObject implements JavaFileObject {
  }

  static class TypeAnnotationCompleter extends AnnotationCompleter {
  }

  static class TypeAnnotationProxy {
  }

  static final class UsesProvidesCompleter implements Symbol.Completer {
  }
}
