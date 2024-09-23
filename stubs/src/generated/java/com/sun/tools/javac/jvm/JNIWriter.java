package com.sun.tools.javac.jvm;

import com.sun.tools.javac.code.Type;
import java.lang.Exception;

public class JNIWriter {
  final enum EncoderType {
    CLASS,

    FIELDSTUB,

    FIELD,

    JNI,

    SIGNATURE
  }

  static class SimpleTypeVisitor implements Type.Visitor {
  }

  static class JvmTypeVisitor extends SimpleTypeVisitor {
  }

  static class SignatureException extends Exception {
  }

  static class TypeSignature {
  }
}
