package com.sun.tools.javac.comp;

import com.sun.source.util.SimpleTreeVisitor;
import com.sun.tools.javac.tree.JCTree;
import com.sun.tools.javac.tree.TreeScanner;
import java.lang.RuntimeException;

public class Attr extends JCTree.Visitor {
  static class BreakAttr extends RuntimeException {
  }

  enum CheckMode {
    NORMAL,

    NO_TREE_UPDATE,

    NO_INFERENCE_HOOK
  }

  static class ExpressionLambdaReturnContext extends FunctionalReturnContext {
  }

  static class FunctionalReturnContext extends Check.NestedCheckContext {
  }

  static class IdentAttributer extends SimpleTreeVisitor {
  }

  static class LocalInitScanner extends TreeScanner {
  }

  static class MethodAttrInfo extends ResultInfo {
  }

  static class PostAttrAnalyzer extends TreeScanner {
  }

  static class RecoveryInfo extends ResultInfo {
  }

  static class ResultInfo {
  }

  static class TargetInfo {
  }

  static final class TypeAnnotationsValidator extends TreeScanner {
  }
}
