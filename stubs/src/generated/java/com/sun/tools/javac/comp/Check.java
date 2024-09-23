package com.sun.tools.javac.comp;

import com.sun.tools.javac.tree.JCTree;
import com.sun.tools.javac.tree.TreeScanner;
import com.sun.tools.javac.util.Warner;
import java.util.function.Predicate;
import javax.lang.model.util.ElementKindVisitor14;

public class Check {
  public interface CheckContext {
  }

  static class ClashFilter implements Predicate {
  }

  static class ConversionWarner extends Warner {
  }

  static class CycleChecker extends TreeScanner {
  }

  static class DefaultMethodClashFilter implements Predicate {
  }

  static class NestedCheckContext implements CheckContext {
  }

  static class PotentiallyAmbiguousFilter extends ClashFilter {
  }

  static class SerialTypeVisitor extends ElementKindVisitor14 {
  }

  static class Validator extends JCTree.Visitor {
  }
}
