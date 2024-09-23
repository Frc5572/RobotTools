package com.sun.tools.javac.code;

import com.sun.tools.javac.util.List;
import com.sun.tools.javac.util.ListBuffer;
import java.lang.Object;
import java.lang.Record;
import java.lang.String;

public interface TypeMetadata {
  final class Annotations extends Record implements TypeMetadata {
    Annotations() {
    }

    Annotations(List arg0) {
    }

    public Annotations(ListBuffer arg0) {
    }

    List annotations() {
      return null;
    }

    public final String toString() {
      return null;
    }

    public final int hashCode() {
      return 0;
    }

    public final boolean equals(Object arg0) {
      return false;
    }

    public ListBuffer annotationBuffer() {
      return null;
    }
  }

  final class ConstantValue extends Record implements TypeMetadata {
    public ConstantValue(Object arg0) {
    }

    public final String toString() {
      return null;
    }

    public final int hashCode() {
      return 0;
    }

    public final boolean equals(Object arg0) {
      return false;
    }

    public Object value() {
      return null;
    }
  }
}
