package com.sun.tools.javac.comp;

import com.sun.tools.javac.code.Type;
import com.sun.tools.javac.util.GraphUtils;
import java.lang.RuntimeException;
import java.util.function.Predicate;

public class Infer {
  abstract static class BestLeafSolver extends LeafSolver {
  }

  public static class BoundFilter implements Predicate {
  }

  static class CheckBounds extends IncorporationAction {
  }

  static class CheckInst extends CheckBounds {
  }

  static class CheckUpperBounds extends IncorporationAction {
  }

  final enum DependencyKind {
    BOUND,

    STUCK
  }

  interface FreeTypeListener {
  }

  final enum GraphInferenceSteps {
    EQ,

    EQ_LOWER,

    EQ_LOWER_THROWS_UPPER_CAPTURED
  }

  static class Node extends GraphUtils.TarjanNode implements GraphUtils.DottableNode {
  }

  static class InferenceGraph {
  }

  static class GraphSolver {
  }

  public static class NodeNotFoundException extends RuntimeException {
  }

  interface GraphStrategy {
  }

  static class ImplicitArgType extends DeferredAttr.DeferredTypeMap {
  }

  public abstract static class IncorporationAction {
  }

  static class IncorporationBinaryOp {
  }

  abstract enum IncorporationBinaryOpKind {
    IS_SUBTYPE,

    IS_SAME_TYPE
  }

  static class IncorporationEngine implements Type.UndetVar.UndetVarListener {
  }

  public static class InferenceException extends Resolve.InapplicableMethodException {
  }

  abstract enum InferenceStep {
    EQ,

    LOWER,

    THROWS,

    UPPER,

    CAPTURED
  }

  abstract static class LeafSolver implements GraphStrategy {
  }

  public static class PartiallyInferredMethodType extends Type.MethodType {
  }

  static class PropagateBounds extends IncorporationAction {
  }

  static class SubstBounds extends CheckInst {
  }
}
