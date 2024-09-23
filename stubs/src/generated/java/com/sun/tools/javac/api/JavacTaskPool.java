package com.sun.tools.javac.api;

import com.sun.source.util.JavacTask;
import com.sun.source.util.TaskEvent;
import com.sun.source.util.TaskListener;
import com.sun.tools.javac.main.JavaCompiler;
import com.sun.tools.javac.util.Context;
import com.sun.tools.javac.util.Log;
import java.io.PrintStream;
import java.io.Writer;
import java.lang.Class;
import java.lang.Iterable;
import java.lang.Object;
import java.util.List;
import java.util.Queue;
import javax.tools.DiagnosticListener;
import javax.tools.JavaFileManager;

public class JavacTaskPool {
  public JavacTaskPool(int arg0) {
  }

  public Object getTask(Writer arg0, JavaFileManager arg1, DiagnosticListener arg2, Iterable arg3,
      Iterable arg4, Iterable arg5, Worker arg6) {
    return null;
  }

  private long cacheSize() {
    return 0L;
  }

  public void printStatistics(PrintStream arg0) {
  }

  private static Queue lambda$getTask$1(List arg0) {
    return null;
  }

  private static int lambda$getTask$0(ReusableContext arg0, ReusableContext arg1) {
    return 0;
  }

  static class ReusableJavaCompiler extends JavaCompiler {
    ReusableJavaCompiler(Context arg0) {
    }

    public void close() {
    }

    void clear() {
    }

    protected void checkReusable() {
    }
  }

  static class ReusableLog extends Log {
    ReusableLog(Context arg0) {
    }

    void clear() {
    }
  }

  static class ReusableContext extends Context implements TaskListener {
    ReusableContext(List arg0) {
    }

    void clear() {
    }

    public void finished(TaskEvent arg0) {
    }

    public void started(TaskEvent arg0) {
    }

    void drop(Context.Key arg0) {
    }

    void drop(Class arg0) {
    }
  }

  public interface Worker {
    Object withTask(JavacTask arg0);
  }
}
