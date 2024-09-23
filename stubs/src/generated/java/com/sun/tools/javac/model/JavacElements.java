package com.sun.tools.javac.model;

import com.sun.tools.javac.code.Attribute;
import com.sun.tools.javac.code.Scope;
import com.sun.tools.javac.code.Symbol;
import com.sun.tools.javac.code.Type;
import com.sun.tools.javac.comp.Env;
import com.sun.tools.javac.tree.JCTree;
import com.sun.tools.javac.util.Context;
import com.sun.tools.javac.util.List;
import com.sun.tools.javac.util.Name;
import com.sun.tools.javac.util.Pair;
import java.io.Writer;
import java.lang.CharSequence;
import java.lang.Class;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import javax.lang.model.AnnotatedConstruct;
import javax.lang.model.element.AnnotationMirror;
import javax.lang.model.element.AnnotationValue;
import javax.lang.model.element.Element;
import javax.lang.model.element.ExecutableElement;
import javax.lang.model.element.ModuleElement;
import javax.lang.model.element.PackageElement;
import javax.lang.model.element.TypeElement;
import javax.lang.model.util.Elements;
import javax.tools.JavaFileObject;

public class JavacElements implements Elements {
  protected JavacElements(Context arg0) {
  }

  public static JavacElements instance(Context arg0) {
    return null;
  }

  public Set getAllModuleElements() {
    return null;
  }

  public Symbol.ModuleSymbol getModuleElement(CharSequence arg0) {
    return null;
  }

  public Symbol.PackageSymbol getPackageElement(CharSequence arg0) {
    return null;
  }

  public Symbol.PackageSymbol getPackageElement(ModuleElement arg0, CharSequence arg1) {
    return null;
  }

  private Symbol.PackageSymbol doGetPackageElement(ModuleElement arg0, CharSequence arg1) {
    return null;
  }

  public Symbol.ClassSymbol getTypeElement(CharSequence arg0) {
    return null;
  }

  public Symbol.ClassSymbol getTypeElement(ModuleElement arg0, CharSequence arg1) {
    return null;
  }

  private Symbol.ClassSymbol doGetTypeElement(ModuleElement arg0, CharSequence arg1) {
    return null;
  }

  private Symbol doGetElement(ModuleElement arg0, String arg1, CharSequence arg2, Class arg3) {
    return null;
  }

  private Symbol unboundNameToSymbol(String arg0, String arg1, Class arg2) {
    return null;
  }

  private Symbol nameToSymbol(Symbol.ModuleSymbol arg0, String arg1, Class arg2) {
    return null;
  }

  private JCTree matchAnnoToTree(AnnotationMirror arg0, Element arg1, JCTree arg2) {
    return null;
  }

  private JCTree matchAnnoToTree(Attribute.Compound arg0, List arg1, List arg2) {
    return null;
  }

  private JCTree matchAttributeToTree(Attribute arg0, Attribute arg1, JCTree arg2) {
    return null;
  }

  private JCTree.JCExpression scanForAssign(Symbol.MethodSymbol arg0, JCTree arg1) {
    return null;
  }

  public JCTree getTree(Element arg0) {
    return null;
  }

  public String getDocComment(Element arg0) {
    return null;
  }

  public PackageElement getPackageOf(Element arg0) {
    return null;
  }

  public ModuleElement getModuleOf(Element arg0) {
    return null;
  }

  public boolean isDeprecated(Element arg0) {
    return false;
  }

  public Elements.Origin getOrigin(Element arg0) {
    return null;
  }

  public Elements.Origin getOrigin(AnnotatedConstruct arg0, AnnotationMirror arg1) {
    return null;
  }

  public Elements.Origin getOrigin(ModuleElement arg0, ModuleElement.Directive arg1) {
    return null;
  }

  public Name getBinaryName(TypeElement arg0) {
    return null;
  }

  public Map getElementValuesWithDefaults(AnnotationMirror arg0) {
    return null;
  }

  public FilteredMemberList getAllMembers(TypeElement arg0) {
    return null;
  }

  private void addMembers(Scope.WriteableScope arg0, Type arg1) {
  }

  public TypeElement getOutermostTypeElement(Element arg0) {
    return null;
  }

  public List getAllAnnotationMirrors(Element arg0) {
    return null;
  }

  private boolean isInherited(Type arg0) {
    return false;
  }

  private static boolean containsAnnoOfType(List arg0, Type arg1) {
    return false;
  }

  public boolean hides(Element arg0, Element arg1) {
    return false;
  }

  public boolean overrides(ExecutableElement arg0, ExecutableElement arg1, TypeElement arg2) {
    return false;
  }

  public String getConstantExpression(Object arg0) {
    return null;
  }

  public void printElements(Writer arg0, Element[] arg1) {
  }

  public Name getName(CharSequence arg0) {
    return null;
  }

  public boolean isFunctionalInterface(TypeElement arg0) {
    return false;
  }

  public boolean isAutomaticModule(ModuleElement arg0) {
    return false;
  }

  public boolean isCompactConstructor(ExecutableElement arg0) {
    return false;
  }

  public boolean isCanonicalConstructor(ExecutableElement arg0) {
    return false;
  }

  public JavaFileObject getFileObjectOf(Element arg0) {
    return null;
  }

  private Pair getTreeAndTopLevel(Element arg0) {
    return null;
  }

  public Pair getTreeAndTopLevel(Element arg0, AnnotationMirror arg1, AnnotationValue arg2) {
    return null;
  }

  private Env getEnterEnv(Symbol arg0) {
    return null;
  }

  private void ensureEntered(String arg0) {
  }

  private static Object cast(Class arg0, Object arg1) {
    return null;
  }

  public void newRound() {
  }

  public javax.lang.model.element.Name getName(CharSequence arg0) {
    return null;
  }

  public java.util.List getAllAnnotationMirrors(Element arg0) {
    return null;
  }

  public java.util.List getAllMembers(TypeElement arg0) {
    return null;
  }

  public javax.lang.model.element.Name getBinaryName(TypeElement arg0) {
    return null;
  }

  public ModuleElement getModuleElement(CharSequence arg0) {
    return null;
  }

  public TypeElement getTypeElement(ModuleElement arg0, CharSequence arg1) {
    return null;
  }

  public TypeElement getTypeElement(CharSequence arg0) {
    return null;
  }

  public PackageElement getPackageElement(ModuleElement arg0, CharSequence arg1) {
    return null;
  }

  public PackageElement getPackageElement(CharSequence arg0) {
    return null;
  }

  private Optional lambda$unboundNameToSymbol$2(String arg0, Class arg1, String arg2, Pair arg3) {
    return null;
  }

  private static String lambda$unboundNameToSymbol$1(Symbol.ModuleSymbol arg0) {
    return null;
  }

  private static Symbol.ModuleSymbol lambda$unboundNameToSymbol$0(Symbol arg0) {
    return null;
  }
}
