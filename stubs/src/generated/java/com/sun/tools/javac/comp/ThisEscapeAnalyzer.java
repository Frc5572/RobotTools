package com.sun.tools.javac.comp;

import com.sun.tools.javac.tree.TreeScanner;
import java.lang.Record;
import java.util.HashSet;

class ThisEscapeAnalyzer extends TreeScanner {
  static class ExprRef extends Ref {
  }

  static final class MethodInfo extends Record {
  }

  static class OuterRef extends Ref {
  }

  abstract static class Ref {
  }

  static class RefSet extends HashSet {
  }

  static class ReturnRef extends Ref {
  }

  static class ThisRef extends Ref {
  }

  static class VarRef extends Ref {
  }

  static class YieldRef extends Ref {
  }
}
