package com.sun.tools.javac.jvm;

import java.lang.Record;

public interface PoolConstant {
  class BsmKey {
  }

  final class PoolKey extends Record {
  }

  interface Dynamic extends PoolConstant {
  }

  class BasicConstant implements LoadableConstant {
  }

  interface LoadableConstant extends PoolConstant {
  }

  final class NameAndType implements PoolConstant {
  }
}
