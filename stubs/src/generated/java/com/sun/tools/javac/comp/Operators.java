package com.sun.tools.javac.comp;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class Operators {
  static class BinaryBooleanOperator extends BinaryOperatorHelper {
  }

  static class BinaryEqualityOperator extends BinaryOperatorHelper {
  }

  static class BinaryNumericOperator extends BinaryOperatorHelper {
  }

  abstract static class BinaryOperatorHelper extends OperatorHelper implements BiPredicate {
  }

  static class BinaryShiftOperator extends BinaryOperatorHelper {
  }

  static class BinaryStringOperator extends BinaryOperatorHelper {
  }

  final enum ComparisonKind {
    NUMERIC_OR_BOOLEAN,

    REFERENCE,

    INVALID
  }

  abstract static class OperatorHelper {
  }

  final enum OperatorType {
    BYTE,

    SHORT,

    INT,

    LONG,

    FLOAT,

    DOUBLE,

    CHAR,

    BOOLEAN,

    OBJECT,

    STRING,

    BOT
  }

  static class UnaryBooleanOperator extends UnaryOperatorHelper {
  }

  static class UnaryNumericOperator extends UnaryOperatorHelper {
  }

  abstract static class UnaryOperatorHelper extends OperatorHelper implements Predicate {
  }

  static class UnaryPrefixPostfixOperator extends UnaryNumericOperator {
  }

  static class UnaryReferenceOperator extends UnaryOperatorHelper {
  }
}
