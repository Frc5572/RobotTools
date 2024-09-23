package com.sun.source.util;

import com.sun.source.tree.CatchTree;
import com.sun.source.tree.ClassTree;
import com.sun.source.tree.CompilationUnitTree;
import com.sun.source.tree.MethodTree;
import com.sun.source.tree.Scope;
import com.sun.source.tree.Tree;
import java.lang.CharSequence;
import java.lang.Class;
import java.lang.Object;
import java.lang.String;
import javax.annotation.processing.ProcessingEnvironment;
import javax.lang.model.element.AnnotationMirror;
import javax.lang.model.element.AnnotationValue;
import javax.lang.model.element.Element;
import javax.lang.model.element.ExecutableElement;
import javax.lang.model.element.TypeElement;
import javax.lang.model.type.DeclaredType;
import javax.lang.model.type.ErrorType;
import javax.lang.model.type.TypeMirror;
import javax.tools.Diagnostic;
import javax.tools.JavaCompiler;

public abstract class Trees {
  public Trees() {
  }

  public static Trees instance(JavaCompiler.CompilationTask arg0) {
    return null;
  }

  public static Trees instance(ProcessingEnvironment arg0) {
    return null;
  }

  static Trees getJavacTrees(Class arg0, Object arg1) {
    return null;
  }

  public abstract SourcePositions getSourcePositions();

  public abstract Tree getTree(Element arg0);

  public abstract ClassTree getTree(TypeElement arg0);

  public abstract MethodTree getTree(ExecutableElement arg0);

  public abstract Tree getTree(Element arg0, AnnotationMirror arg1);

  public abstract Tree getTree(Element arg0, AnnotationMirror arg1, AnnotationValue arg2);

  public abstract TreePath getPath(CompilationUnitTree arg0, Tree arg1);

  public abstract TreePath getPath(Element arg0);

  public abstract TreePath getPath(Element arg0, AnnotationMirror arg1);

  public abstract TreePath getPath(Element arg0, AnnotationMirror arg1, AnnotationValue arg2);

  public abstract Element getElement(TreePath arg0);

  public abstract TypeMirror getTypeMirror(TreePath arg0);

  public abstract Scope getScope(TreePath arg0);

  public abstract String getDocComment(TreePath arg0);

  public abstract boolean isAccessible(Scope arg0, TypeElement arg1);

  public abstract boolean isAccessible(Scope arg0, Element arg1, DeclaredType arg2);

  public abstract TypeMirror getOriginalType(ErrorType arg0);

  public abstract void printMessage(Diagnostic.Kind arg0, CharSequence arg1, Tree arg2,
      CompilationUnitTree arg3);

  public abstract TypeMirror getLub(CatchTree arg0);
}
