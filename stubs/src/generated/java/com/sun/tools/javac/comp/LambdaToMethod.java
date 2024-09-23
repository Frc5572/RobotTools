package com.sun.tools.javac.comp;

import com.sun.tools.javac.code.Types;
import com.sun.tools.javac.tree.TreeTranslator;

public class LambdaToMethod extends TreeTranslator {
  static class DedupedLambda {
  }

  static class KlassInfo {
  }

  static class L2MSignatureGenerator extends Types.SignatureGenerator {
  }

  static class Frame {
  }

  static class LambdaTranslationContext extends LambdaAnalyzerPreprocessor.TranslationContext {
  }

  static final class ReferenceTranslationContext extends LambdaAnalyzerPreprocessor.TranslationContext {
  }

  static class SyntheticMethodNameCounter {
  }

  abstract static class TranslationContext {
  }

  static class LambdaAnalyzerPreprocessor extends TreeTranslator {
  }

  final enum LambdaSymbolKind {
    PARAM,

    LOCAL_VAR,

    CAPTURED_VAR,

    CAPTURED_THIS,

    CAPTURED_OUTER_THIS
  }

  static class MemberReferenceToLambda {
  }
}
