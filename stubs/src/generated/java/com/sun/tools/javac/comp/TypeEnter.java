package com.sun.tools.javac.comp;

import com.sun.tools.javac.code.Symbol;
import com.sun.tools.javac.tree.JCTree;

public class TypeEnter implements Symbol.Completer {
  static class Synthesizer extends JCTree.Visitor {
  }

  abstract static class AbstractHeaderPhase extends Phase {
  }

  abstract static class AbstractMembersPhase extends Phase {
  }

  static class AnonClassConstructorHelper extends BasicConstructorHelper {
  }

  static class BasicConstructorHelper implements DefaultConstructorHelper {
  }

  interface DefaultConstructorHelper {
  }

  static final class HeaderPhase extends AbstractHeaderPhase {
  }

  static final class HierarchyPhase extends AbstractHeaderPhase implements Symbol.Completer {
  }

  static final class ImportsPhase extends Phase {
  }

  static final class MembersPhase extends AbstractMembersPhase {
  }

  abstract static class Phase {
  }

  static class RecordConstructorHelper extends BasicConstructorHelper {
  }

  static final class RecordPhase extends AbstractMembersPhase {
  }
}
