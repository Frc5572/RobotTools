package com.sun.tools.javac.comp;

import com.sun.tools.javac.tree.TreeScanner;
import java.lang.Record;

public class Flow {
  static class AliveAnalyzer extends BaseAnalyzer {
  }

  public static class AssignPendingExit extends BaseAnalyzer.PendingExit {
  }

  public static class AssignAnalyzer extends BaseAnalyzer {
  }

  abstract enum JumpKind {
    BREAK,

    CONTINUE,

    YIELD
  }

  static class PendingExit {
  }

  abstract static class BaseAnalyzer extends TreeScanner {
  }

  static final class BindingPattern extends Record implements PatternDescription {
  }

  static class CaptureAnalyzer extends BaseAnalyzer {
  }

  static class ThrownPendingExit extends BaseAnalyzer.PendingExit {
  }

  static class FlowAnalyzer extends BaseAnalyzer {
  }

  final enum FlowKind {
    NORMAL,

    SPECULATIVE_LOOP
  }

  static class LambdaAliveAnalyzer extends AliveAnalyzer {
  }

  static class LambdaAssignAnalyzer extends AssignAnalyzer {
  }

  static class LambdaFlowAnalyzer extends FlowAnalyzer {
  }

  abstract enum Liveness {
    ALIVE,

    DEAD,

    RECOVERY
  }

  interface PatternDescription {
  }

  static final class RecordPattern extends Record implements PatternDescription {
  }

  static class SnippetAliveAnalyzer extends AliveAnalyzer {
  }

  static class SnippetBreakToAnalyzer extends AliveAnalyzer {
  }
}
