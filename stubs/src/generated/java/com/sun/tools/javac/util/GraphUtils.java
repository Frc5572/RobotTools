package com.sun.tools.javac.util;

import java.lang.Comparable;
import java.lang.Iterable;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;
import java.util.Collection;
import java.util.Properties;

public class GraphUtils {
  public GraphUtils() {
  }

  public static List tarjan(Iterable arg0) {
    return null;
  }

  public static String toDot(Collection arg0, String arg1, String arg2) {
    return null;
  }

  public abstract static class AbstractNode implements Node {
    public AbstractNode(Object arg0) {
    }

    public abstract DependencyKind[] getSupportedDependencyKinds();

    public abstract Collection getDependenciesByKind(DependencyKind arg0);

    public String toString() {
      return null;
    }

    public void accept(NodeVisitor arg0, Object arg1) {
    }
  }

  public interface DependencyKind {
  }

  public static class DotVisitor extends NodeVisitor {
    public DotVisitor() {
    }

    public void visitDependency(DependencyKind arg0, DottableNode arg1, DottableNode arg2,
        StringBuilder arg3) {
    }

    public void visitNode(DottableNode arg0, StringBuilder arg1) {
    }

    protected String formatProperties(Properties arg0) {
      return null;
    }

    protected static String wrap(String arg0) {
      return null;
    }

    public void visit(Collection arg0, Object arg1) {
    }

    public void visitDependency(DependencyKind arg0, Node arg1, Node arg2, Object arg3) {
    }

    public void visitNode(Node arg0, Object arg1) {
    }
  }

  public interface DottableNode extends Node {
    Properties nodeAttributes();

    Properties dependencyAttributes(DottableNode arg0, DependencyKind arg1);
  }

  public interface Node {
    void accept(NodeVisitor arg0, Object arg1);
  }

  abstract static class NodeVisitor {
    NodeVisitor() {
    }

    public abstract void visitNode(Node arg0, Object arg1);

    public abstract void visitDependency(DependencyKind arg0, Node arg1, Node arg2, Object arg3);

    public void visit(Collection arg0, Object arg1) {
    }
  }

  static class Tarjan {
    private Tarjan() {
    }

    private List findSCC(Iterable arg0) {
      return null;
    }

    private void findSCC(TarjanNode arg0) {
    }

    private void visitNode(TarjanNode arg0) {
    }

    private void addSCC(TarjanNode arg0) {
    }
  }

  public abstract static class TarjanNode extends AbstractNode implements Comparable {
    public TarjanNode(Object arg0) {
    }

    public abstract Iterable getAllDependencies();

    public int compareTo(TarjanNode arg0) {
      return 0;
    }

    public int compareTo(Object arg0) {
      return 0;
    }
  }
}
