package com.sun.tools.javac.util;

import com.sun.tools.javac.code.Symbol;
import java.io.Closeable;
import java.lang.Object;
import java.lang.String;
import java.lang.Void;
import java.util.Collection;
import java.util.Properties;

public abstract class Dependencies {
  protected Dependencies(Context arg0) {
  }

  public static Dependencies instance(Context arg0) {
    return null;
  }

  public abstract void push(Symbol.ClassSymbol arg0, CompletionCause arg1);

  public abstract void pop();

  public final enum CompletionCause {
    CLASS_READER,

    HEADER_PHASE,

    HIERARCHY_PHASE,

    IMPORTS_PHASE,

    MEMBER_ENTER,

    RECORD_PHASE,

    MEMBERS_PHASE,

    PERMITS_PHASE,

    OTHER
  }

  static class DummyDependencies extends Dependencies {
    private DummyDependencies(Context arg0) {
    }

    public void push(Symbol.ClassSymbol arg0, CompletionCause arg1) {
    }

    public void pop() {
    }
  }

  final enum Kind {
    SOURCE,

    CLASS
  }

  public static class CompletionNode extends GraphDependencies.Node {
    CompletionNode(Symbol.ClassSymbol arg0) {
    }

    public Properties nodeAttributes() {
      return null;
    }

    public Symbol.ClassSymbol getClassSymbol() {
      return null;
    }
  }

  final enum DependenciesMode {
    SOURCE,

    CLASS,

    REDUNDANT
  }

  static class FilterVisitor extends GraphUtils.NodeVisitor {
    private FilterVisitor(GraphDependencies arg0, GraphDependencies.CompletionNode.Kind arg1) {
    }

    public void visitNode(GraphDependencies.Node arg0, Void arg1) {
    }

    public void visitDependency(GraphUtils.DependencyKind arg0, GraphDependencies.Node arg1,
        GraphDependencies.Node arg2, Void arg3) {
    }

    public void visitDependency(GraphUtils.DependencyKind arg0, GraphUtils.Node arg1,
        GraphUtils.Node arg2, Object arg3) {
    }

    public void visitNode(GraphUtils.Node arg0, Object arg1) {
    }
  }

  public abstract static class Node extends GraphUtils.AbstractNode implements GraphUtils.DottableNode {
    Node(Symbol.ClassSymbol arg0) {
    }

    void addDependency(GraphUtils.DependencyKind arg0, GraphDependencies.Node arg1) {
    }

    public boolean equals(Object arg0) {
      return false;
    }

    public int hashCode() {
      return 0;
    }

    public GraphUtils.DependencyKind[] getSupportedDependencyKinds() {
      return null;
    }

    public Collection getDependenciesByKind(GraphUtils.DependencyKind arg0) {
      return null;
    }

    public Properties nodeAttributes() {
      return null;
    }

    public Properties dependencyAttributes(GraphDependencies.Node arg0,
        GraphUtils.DependencyKind arg1) {
      return null;
    }

    public String toString() {
      return null;
    }

    public Properties dependencyAttributes(GraphUtils.DottableNode arg0,
        GraphUtils.DependencyKind arg1) {
      return null;
    }
  }

  static class PruneVisitor extends GraphUtils.NodeVisitor {
    private PruneVisitor() {
    }

    public void visitNode(GraphDependencies.Node arg0, Void arg1) {
    }

    public void visitDependency(GraphUtils.DependencyKind arg0, GraphDependencies.Node arg1,
        GraphDependencies.Node arg2, Void arg3) {
    }

    public void visitDependency(GraphUtils.DependencyKind arg0, GraphUtils.Node arg1,
        GraphUtils.Node arg2, Object arg3) {
    }

    public void visitNode(GraphUtils.Node arg0, Object arg1) {
    }
  }

  public static class GraphDependencies extends Dependencies implements Closeable, Symbol.Completer {
    GraphDependencies(Context arg0) {
    }

    public static void preRegister(Context arg0) {
    }

    public void push(Symbol.ClassSymbol arg0, CompletionCause arg1) {
    }

    protected GraphDependencies.Node push(GraphDependencies.Node arg0, CompletionCause arg1) {
      return null;
    }

    public void pop() {
    }

    public void close() {
    }

    public void complete(Symbol arg0) {
    }

    public boolean isTerminal() {
      return false;
    }

    public Collection getNodes() {
      return null;
    }
  }
}
