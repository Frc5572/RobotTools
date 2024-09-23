package com.sun.tools.javac.api;

import com.sun.source.doctree.DocCommentTree;
import com.sun.source.doctree.DocTree;
import com.sun.source.doctree.EntityTree;
import com.sun.source.tree.CatchTree;
import com.sun.source.tree.ClassTree;
import com.sun.source.tree.CompilationUnitTree;
import com.sun.source.tree.MethodTree;
import com.sun.source.tree.Scope;
import com.sun.source.tree.Tree;
import com.sun.source.util.DocSourcePositions;
import com.sun.source.util.DocTreeFactory;
import com.sun.source.util.DocTreePath;
import com.sun.source.util.DocTrees;
import com.sun.source.util.SourcePositions;
import com.sun.source.util.TreePath;
import com.sun.tools.javac.code.Symbol;
import com.sun.tools.javac.code.Type;
import com.sun.tools.javac.comp.Env;
import com.sun.tools.javac.tree.DCTree;
import com.sun.tools.javac.tree.DocTreeMaker;
import com.sun.tools.javac.tree.JCTree;
import com.sun.tools.javac.tree.TreeCopier;
import com.sun.tools.javac.tree.TreeMaker;
import com.sun.tools.javac.util.Context;
import com.sun.tools.javac.util.JCDiagnostic;
import com.sun.tools.javac.util.Name;
import java.lang.CharSequence;
import java.lang.Object;
import java.lang.String;
import java.text.BreakIterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.annotation.processing.ProcessingEnvironment;
import javax.lang.model.element.AnnotationMirror;
import javax.lang.model.element.AnnotationValue;
import javax.lang.model.element.Element;
import javax.lang.model.element.ExecutableElement;
import javax.lang.model.element.Modifier;
import javax.lang.model.element.NestingKind;
import javax.lang.model.element.PackageElement;
import javax.lang.model.element.TypeElement;
import javax.lang.model.type.DeclaredType;
import javax.lang.model.type.ErrorType;
import javax.lang.model.type.TypeMirror;
import javax.tools.Diagnostic;
import javax.tools.FileObject;
import javax.tools.ForwardingFileObject;
import javax.tools.JavaCompiler;
import javax.tools.JavaFileObject;

public class JavacTrees extends DocTrees {
  protected JavacTrees(Context arg0) {
  }

  public static JavacTrees instance(JavaCompiler.CompilationTask arg0) {
    return null;
  }

  public static JavacTrees instance(ProcessingEnvironment arg0) {
    return null;
  }

  public static JavacTrees instance(Context arg0) {
    return null;
  }

  public BreakIterator getBreakIterator() {
    return null;
  }

  public DocSourcePositions getSourcePositions() {
    return null;
  }

  public DocTreeMaker getDocTreeFactory() {
    return null;
  }

  private DocTree getLastChild(DocTree arg0) {
    return null;
  }

  public JCTree.JCClassDecl getTree(TypeElement arg0) {
    return null;
  }

  public JCTree.JCMethodDecl getTree(ExecutableElement arg0) {
    return null;
  }

  public JCTree getTree(Element arg0) {
    return null;
  }

  public JCTree getTree(Element arg0, AnnotationMirror arg1) {
    return null;
  }

  public JCTree getTree(Element arg0, AnnotationMirror arg1, AnnotationValue arg2) {
    return null;
  }

  public TreePath getPath(CompilationUnitTree arg0, Tree arg1) {
    return null;
  }

  public TreePath getPath(Element arg0) {
    return null;
  }

  public TreePath getPath(Element arg0, AnnotationMirror arg1) {
    return null;
  }

  public TreePath getPath(Element arg0, AnnotationMirror arg1, AnnotationValue arg2) {
    return null;
  }

  public Symbol getElement(TreePath arg0) {
    return null;
  }

  public Element getElement(DocTreePath arg0) {
    return null;
  }

  public TypeMirror getType(DocTreePath arg0) {
    return null;
  }

  public List getFirstSentence(List arg0) {
    return null;
  }

  private Symbol attributeDocReference(TreePath arg0, DCTree.DCReference arg1) {
    return null;
  }

  private Symbol attributeParamIdentifier(TreePath arg0, DCTree.DCParam arg1) {
    return null;
  }

  private Symbol.VarSymbol findField(Symbol.ClassSymbol arg0, Name arg1) {
    return null;
  }

  private Symbol.VarSymbol searchField(Symbol.ClassSymbol arg0, Name arg1, Set arg2) {
    return null;
  }

  Symbol.MethodSymbol findConstructor(Symbol.ClassSymbol arg0, com.sun.tools.javac.util.List arg1,
      boolean arg2) {
    return null;
  }

  private Symbol.MethodSymbol findMethod(Symbol.ClassSymbol arg0, Name arg1,
      com.sun.tools.javac.util.List arg2, boolean arg3) {
    return null;
  }

  private Symbol.MethodSymbol searchMethod(Symbol.ClassSymbol arg0, Name arg1,
      com.sun.tools.javac.util.List arg2, boolean arg3, Set arg4) {
    return null;
  }

  private boolean hasParameterTypes(Symbol.MethodSymbol arg0, com.sun.tools.javac.util.List arg1,
      boolean arg2) {
    return false;
  }

  public TypeMirror getTypeMirror(TreePath arg0) {
    return null;
  }

  public JavacScope getScope(TreePath arg0) {
    return null;
  }

  public String getDocComment(TreePath arg0) {
    return null;
  }

  public DocCommentTree getDocCommentTree(TreePath arg0) {
    return null;
  }

  public DocCommentTree getDocCommentTree(Element arg0) {
    return null;
  }

  public DocCommentTree getDocCommentTree(Element arg0, String arg1) {
    return null;
  }

  public boolean isAccessible(Scope arg0, TypeElement arg1) {
    return false;
  }

  public boolean isAccessible(Scope arg0, Element arg1, DeclaredType arg2) {
    return false;
  }

  private Env getAttrContext(TreePath arg0) {
    return null;
  }

  private Env attribStatToTree(JCTree arg0, Env arg1, JCTree arg2, Map arg3) {
    return null;
  }

  private Env attribExprToTree(JCTree.JCExpression arg0, Env arg1, JCTree arg2, Map arg3) {
    return null;
  }

  private void fixLocalClassNames(Map arg0, Env arg1) {
  }

  private Map prepareFlatnameForClass(Env arg0) {
    return null;
  }

  static JavaFileObject asJavaFileObject(FileObject arg0) {
    return null;
  }

  private static void checkHtmlKind(FileObject arg0) {
  }

  private static void checkHtmlKind(FileObject arg0, JavaFileObject.Kind arg1) {
  }

  public DocCommentTree getDocCommentTree(FileObject arg0) {
    return null;
  }

  public DocTreePath getDocTreePath(FileObject arg0, PackageElement arg1) {
    return null;
  }

  public void setBreakIterator(BreakIterator arg0) {
  }

  public String getCharacters(EntityTree arg0) {
    return null;
  }

  protected Copier createCopier(TreeMaker arg0) {
    return null;
  }

  public TypeMirror getOriginalType(ErrorType arg0) {
    return null;
  }

  public void printMessage(Diagnostic.Kind arg0, CharSequence arg1, Tree arg2,
      CompilationUnitTree arg3) {
  }

  public void printMessage(Diagnostic.Kind arg0, CharSequence arg1, DocTree arg2,
      DocCommentTree arg3, CompilationUnitTree arg4) {
  }

  private void printMessage(Diagnostic.Kind arg0, CharSequence arg1,
      JCDiagnostic.DiagnosticPosition arg2, CompilationUnitTree arg3) {
  }

  public TypeMirror getLub(CatchTree arg0) {
    return null;
  }

  private TreePath makeTreePath(Symbol.PackageSymbol arg0, JavaFileObject arg1,
      DocCommentTree arg2) {
    return null;
  }

  public DocTreeFactory getDocTreeFactory() {
    return null;
  }

  public Scope getScope(TreePath arg0) {
    return null;
  }

  public Element getElement(TreePath arg0) {
    return null;
  }

  public Tree getTree(Element arg0, AnnotationMirror arg1, AnnotationValue arg2) {
    return null;
  }

  public Tree getTree(Element arg0, AnnotationMirror arg1) {
    return null;
  }

  public MethodTree getTree(ExecutableElement arg0) {
    return null;
  }

  public ClassTree getTree(TypeElement arg0) {
    return null;
  }

  public Tree getTree(Element arg0) {
    return null;
  }

  public SourcePositions getSourcePositions() {
    return null;
  }

  private Type lambda$getOriginalType$1(Type.ClassType arg0, Type arg1) {
    return null;
  }

  private void lambda$prepareFlatnameForClass$0(Symbol.ClassSymbol arg0) {
  }

  public static class Copier extends TreeCopier {
    protected Copier(TreeMaker arg0) {
    }

    public JCTree copy(JCTree arg0, JCTree arg1) {
      return null;
    }

    public JCTree visitClass(ClassTree arg0, JCTree arg1) {
      return null;
    }

    public JCTree visitClass(ClassTree arg0, Object arg1) {
      return null;
    }

    public JCTree copy(JCTree arg0, Object arg1) {
      return null;
    }

    public Object visitClass(ClassTree arg0, Object arg1) {
      return null;
    }
  }

  static class HtmlFileObject extends ForwardingFileObject implements JavaFileObject {
    public HtmlFileObject(FileObject arg0) {
    }

    public JavaFileObject.Kind getKind() {
      return null;
    }

    public boolean isNameCompatible(String arg0, JavaFileObject.Kind arg1) {
      return false;
    }

    public NestingKind getNestingKind() {
      return null;
    }

    public Modifier getAccessLevel() {
      return null;
    }
  }
}
