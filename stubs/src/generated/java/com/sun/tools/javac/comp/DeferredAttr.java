package com.sun.tools.javac.comp;

import com.sun.tools.javac.code.Type;
import com.sun.tools.javac.tree.JCTree;
import com.sun.tools.javac.tree.TreeScanner;
import com.sun.tools.javac.util.GraphUtils;
import com.sun.tools.javac.util.Log;

public class DeferredAttr extends JCTree.Visitor {
  public final enum AttrMode {
    SPECULATIVE,

    CHECK
  }

  final enum AttributionMode {
    FULL,

    ATTRIB_TO_TREE,

    ANALYZER,

    SPECULATIVE
  }

  static class CheckStuckPolicy extends PolyScanner implements DeferredStuckPolicy, Infer.FreeTypeListener {
  }

  static class StuckNode extends GraphUtils.TarjanNode {
  }

  static class DeferredAttrContext {
  }

  static class PosScanner extends TreeScanner {
  }

  static class DeferredAttrDiagHandler extends Log.DeferredDiagnosticHandler {
  }

  static class LambdaBodyStructChecker extends TreeScanner {
  }

  static class StructuralStuckChecker extends TreeScanner {
  }

  static class DeferredAttrNode {
  }

  interface DeferredStuckPolicy {
  }

  static class Entry {
  }

  static class SpeculativeCache {
  }

  public static class DeferredType extends Type {
  }

  static class DeferredTypeMap extends Type.StructuralTypeMapping {
  }

  abstract static class FilterScanner extends TreeScanner {
  }

  static class LambdaReturnScanner extends FilterScanner {
  }

  static class OverloadStuckPolicy extends CheckStuckPolicy implements DeferredStuckPolicy {
  }

  static class PolyScanner extends FilterScanner {
  }

  public static class RecoveryDeferredTypeMap extends DeferredTypeMap {
  }

  static class SwitchExpressionScanner extends FilterScanner {
  }

  static class TypeDeclVisitor extends TreeScanner {
  }
}
