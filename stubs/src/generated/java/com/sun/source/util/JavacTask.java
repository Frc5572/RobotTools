package com.sun.source.util;

import java.lang.Iterable;
import javax.annotation.processing.ProcessingEnvironment;
import javax.lang.model.type.TypeMirror;
import javax.lang.model.util.Elements;
import javax.lang.model.util.Types;
import javax.tools.JavaCompiler;

public abstract class JavacTask implements JavaCompiler.CompilationTask {
  protected JavacTask() {
  }

  public static JavacTask instance(ProcessingEnvironment arg0) {
    return null;
  }

  public abstract Iterable parse();

  public abstract Iterable analyze();

  public abstract Iterable generate();

  public abstract void setTaskListener(TaskListener arg0);

  public abstract void addTaskListener(TaskListener arg0);

  public abstract void removeTaskListener(TaskListener arg0);

  public void setParameterNameProvider(ParameterNameProvider arg0) {
  }

  public abstract TypeMirror getTypeMirror(Iterable arg0);

  public abstract Elements getElements();

  public abstract Types getTypes();
}
