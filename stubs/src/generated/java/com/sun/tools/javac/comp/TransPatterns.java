package com.sun.tools.javac.comp;

import com.sun.tools.javac.tree.TreeScanner;
import com.sun.tools.javac.tree.TreeTranslator;
import java.lang.Record;

public class TransPatterns extends TreeTranslator {
  static class BasicBindingContext extends BindingContext {
  }

  abstract static class BindingContext {
  }

  static class BindingDeclarationFenceBindingContext extends BasicBindingContext {
  }

  static class ReplaceVar extends TreeScanner {
  }

  static final class UnrolledRecordPattern extends Record {
  }
}
