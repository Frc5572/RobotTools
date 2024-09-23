package com.sun.tools.javac.jvm;

import com.sun.tools.javac.code.Attribute;
import java.lang.RuntimeException;

public class ClassWriter extends ClassFile {
  static class AttributeWriter implements Attribute.Visitor {
  }

  public static class PoolOverflow extends RuntimeException {
  }

  static class AppendFrame extends StackMapTableFrame {
  }

  static class ChopFrame extends StackMapTableFrame {
  }

  static class FullFrame extends StackMapTableFrame {
  }

  static class SameFrame extends StackMapTableFrame {
  }

  static class SameLocals1StackItemFrame extends StackMapTableFrame {
  }

  abstract static class StackMapTableFrame {
  }

  public static class StringOverflow extends RuntimeException {
  }
}
