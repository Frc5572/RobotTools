package com.sun.source.util;

public final class TaskEvent {
  public final enum Kind {
    PARSE,

    ENTER,

    ANALYZE,

    GENERATE,

    ANNOTATION_PROCESSING,

    ANNOTATION_PROCESSING_ROUND,

    COMPILATION
  }
}
