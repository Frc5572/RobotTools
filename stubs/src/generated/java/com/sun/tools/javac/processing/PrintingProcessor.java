package com.sun.tools.javac.processing;

import java.io.PrintWriter;
import java.io.Writer;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.lang.Void;
import java.util.List;
import java.util.Set;
import javax.annotation.processing.AbstractProcessor;
import javax.annotation.processing.RoundEnvironment;
import javax.lang.model.element.AnnotationMirror;
import javax.lang.model.element.Element;
import javax.lang.model.element.ExecutableElement;
import javax.lang.model.element.ModuleElement;
import javax.lang.model.element.PackageElement;
import javax.lang.model.element.Parameterizable;
import javax.lang.model.element.RecordComponentElement;
import javax.lang.model.element.TypeElement;
import javax.lang.model.element.TypeParameterElement;
import javax.lang.model.element.VariableElement;
import javax.lang.model.type.TypeMirror;
import javax.lang.model.util.Elements;
import javax.lang.model.util.SimpleElementVisitor14;

public class PrintingProcessor extends AbstractProcessor {
  public PrintingProcessor() {
  }

  public void setWriter(Writer arg0) {
  }

  public boolean process(Set arg0, RoundEnvironment arg1) {
    return false;
  }

  void print(Element arg0) {
  }

  static class PrintDirective implements ModuleElement.DirectiveVisitor {
    PrintDirective(PrintWriter arg0) {
    }

    public Void visitExports(ModuleElement.ExportsDirective arg0, Void arg1) {
      return null;
    }

    public Void visitOpens(ModuleElement.OpensDirective arg0, Void arg1) {
      return null;
    }

    public Void visitProvides(ModuleElement.ProvidesDirective arg0, Void arg1) {
      return null;
    }

    public Void visitRequires(ModuleElement.RequiresDirective arg0, Void arg1) {
      return null;
    }

    public Void visitUses(ModuleElement.UsesDirective arg0, Void arg1) {
      return null;
    }

    private void printModuleList(List arg0) {
    }

    private void printNameableList(List arg0) {
    }

    public Object visitProvides(ModuleElement.ProvidesDirective arg0, Object arg1) {
      return null;
    }

    public Object visitUses(ModuleElement.UsesDirective arg0, Object arg1) {
      return null;
    }

    public Object visitOpens(ModuleElement.OpensDirective arg0, Object arg1) {
      return null;
    }

    public Object visitExports(ModuleElement.ExportsDirective arg0, Object arg1) {
      return null;
    }

    public Object visitRequires(ModuleElement.RequiresDirective arg0, Object arg1) {
      return null;
    }
  }

  public static class PrintingElementVisitor extends SimpleElementVisitor14 {
    public PrintingElementVisitor(Writer arg0, Elements arg1) {
    }

    protected PrintingElementVisitor defaultAction(Element arg0, Boolean arg1) {
      return null;
    }

    public PrintingElementVisitor visitRecordComponent(RecordComponentElement arg0, Boolean arg1) {
      return null;
    }

    public PrintingElementVisitor visitExecutable(ExecutableElement arg0, Boolean arg1) {
      return null;
    }

    public PrintingElementVisitor visitType(TypeElement arg0, Boolean arg1) {
      return null;
    }

    public PrintingElementVisitor visitVariable(VariableElement arg0, Boolean arg1) {
      return null;
    }

    public PrintingElementVisitor visitTypeParameter(TypeParameterElement arg0, Boolean arg1) {
      return null;
    }

    public PrintingElementVisitor visitPackage(PackageElement arg0, Boolean arg1) {
      return null;
    }

    public PrintingElementVisitor visitModule(ModuleElement arg0, Boolean arg1) {
      return null;
    }

    private void printDirective(ModuleElement.Directive arg0) {
    }

    public void flush() {
    }

    private void printDocComment(Element arg0) {
    }

    private void printModifiers(Element arg0) {
    }

    private void printFormalTypeParameters(Parameterizable arg0, boolean arg1) {
    }

    private String annotationsToString(Element arg0) {
      return null;
    }

    private void printAnnotations(Element arg0) {
    }

    private boolean printedContainerAnnotation(Element arg0, AnnotationMirror arg1) {
      return false;
    }

    private void printParameters(ExecutableElement arg0) {
    }

    private void printInterfaces(TypeElement arg0) {
    }

    private void printPermittedSubclasses(TypeElement arg0) {
    }

    private void printThrows(ExecutableElement arg0) {
    }

    private void indent() {
    }

    public Object visitRecordComponent(RecordComponentElement arg0, Object arg1) {
      return null;
    }

    public Object visitModule(ModuleElement arg0, Object arg1) {
      return null;
    }

    public Object visitVariable(VariableElement arg0, Object arg1) {
      return null;
    }

    public Object visitTypeParameter(TypeParameterElement arg0, Object arg1) {
      return null;
    }

    public Object visitExecutable(ExecutableElement arg0, Object arg1) {
      return null;
    }

    public Object visitType(TypeElement arg0, Object arg1) {
      return null;
    }

    public Object visitPackage(PackageElement arg0, Object arg1) {
      return null;
    }

    protected Object defaultAction(Element arg0, Object arg1) {
      return null;
    }

    private static String lambda$printPermittedSubclasses$3(TypeMirror arg0) {
      return null;
    }

    private String lambda$printFormalTypeParameters$2(TypeParameterElement arg0) {
      return null;
    }

    private boolean lambda$visitType$1(Element arg0) {
      return false;
    }

    private String lambda$visitType$0(RecordComponentElement arg0) {
      return null;
    }
  }
}
