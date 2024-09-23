package com.sun.source.util;

import com.sun.source.doctree.DocCommentTree;
import com.sun.source.doctree.DocTree;
import com.sun.source.doctree.EntityTree;
import com.sun.source.tree.CompilationUnitTree;
import java.lang.CharSequence;
import java.lang.String;
import java.text.BreakIterator;
import java.util.List;
import javax.annotation.processing.ProcessingEnvironment;
import javax.lang.model.element.Element;
import javax.lang.model.element.PackageElement;
import javax.lang.model.type.TypeMirror;
import javax.tools.Diagnostic;
import javax.tools.FileObject;
import javax.tools.JavaCompiler;

public abstract class DocTrees extends Trees {
  public DocTrees() {
  }

  public static DocTrees instance(JavaCompiler.CompilationTask arg0) {
    return null;
  }

  public static DocTrees instance(ProcessingEnvironment arg0) {
    return null;
  }

  public abstract BreakIterator getBreakIterator();

  public abstract DocCommentTree getDocCommentTree(TreePath arg0);

  public abstract DocCommentTree getDocCommentTree(Element arg0);

  public abstract DocCommentTree getDocCommentTree(FileObject arg0);

  public abstract DocCommentTree getDocCommentTree(Element arg0, String arg1);

  public abstract DocTreePath getDocTreePath(FileObject arg0, PackageElement arg1);

  public abstract Element getElement(DocTreePath arg0);

  public abstract TypeMirror getType(DocTreePath arg0);

  public abstract List getFirstSentence(List arg0);

  public abstract DocSourcePositions getSourcePositions();

  public abstract void printMessage(Diagnostic.Kind arg0, CharSequence arg1, DocTree arg2,
      DocCommentTree arg3, CompilationUnitTree arg4);

  public abstract void setBreakIterator(BreakIterator arg0);

  public abstract DocTreeFactory getDocTreeFactory();

  public abstract String getCharacters(EntityTree arg0);

  public SourcePositions getSourcePositions() {
    return null;
  }
}
