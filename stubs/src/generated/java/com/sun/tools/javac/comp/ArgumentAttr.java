package com.sun.tools.javac.comp;

import com.sun.tools.javac.tree.JCTree;

public class ArgumentAttr extends JCTree.Visitor {
  abstract static class ArgumentType extends DeferredAttr.DeferredType {
  }

  static class ConditionalType extends ArgumentType {
  }

  static class ExplicitLambdaType extends ArgumentType {
  }

  static class LocalCacheContext {
  }

  static class ParensType extends ArgumentType {
  }

  static class ResolvedConstructorType extends ResolvedMemberType {
  }

  abstract static class ResolvedMemberType extends ArgumentType {
  }

  static class ResolvedMethodType extends ResolvedMemberType {
  }

  static class SwitchExpressionType extends ArgumentType {
  }

  static class UniquePos {
  }
}
