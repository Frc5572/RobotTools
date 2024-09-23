package com.sun.tools.javac.comp;

import com.sun.tools.javac.tree.TreeCopier;
import com.sun.tools.javac.tree.TreeScanner;

public class Analyzer {
  static class AnalyzerCopier extends TreeCopier {
  }

  final enum AnalyzerMode {
    DIAMOND,

    LAMBDA,

    METHOD,

    LOCAL
  }

  interface DeferredAnalysisHelper {
  }

  static class DiamondInitializer extends StatementAnalyzer {
  }

  static class LambdaAnalyzer extends StatementAnalyzer {
  }

  static class RedundantLocalVarTypeAnalyzer extends RedundantLocalVarTypeAnalyzerBase {
  }

  abstract static class RedundantLocalVarTypeAnalyzerBase extends StatementAnalyzer {
  }

  static class RedundantLocalVarTypeAnalyzerForEach extends RedundantLocalVarTypeAnalyzerBase {
  }

  static class RedundantTypeArgAnalyzer extends StatementAnalyzer {
  }

  static class RewritingContext {
  }

  abstract static class StatementAnalyzer {
  }

  static class StatementScanner extends TreeScanner {
  }

  static class TreeRewriter extends AnalyzerCopier {
  }
}
