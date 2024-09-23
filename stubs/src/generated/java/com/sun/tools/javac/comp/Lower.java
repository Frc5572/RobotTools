package com.sun.tools.javac.comp;

import com.sun.tools.javac.code.Types;
import com.sun.tools.javac.tree.TreeScanner;
import com.sun.tools.javac.tree.TreeTranslator;

public class Lower extends TreeTranslator {
  static class AssignopDependencyScanner extends TreeScanner {
  }

  abstract static class BasicFreeVarCollector extends TreeScanner {
  }

  static class ClassMap extends TreeScanner {
  }

  static class CompileTimeEnumMapping implements EnumMapping {
  }

  interface EnumMapping {
  }

  static class FreeVarCollector extends BasicFreeVarCollector {
  }

  static class LowerSignatureGenerator extends Types.SignatureGenerator {
  }

  static class RuntimeEnumMapping implements EnumMapping {
  }

  interface TreeBuilder {
  }
}
