package com.sun.tools.javac.api;

import com.sun.source.util.JavacTask;
import com.sun.source.util.ParameterNameProvider;
import com.sun.source.util.Plugin;
import com.sun.source.util.TaskListener;
import com.sun.tools.javac.util.Context;
import com.sun.tools.javac.util.List;
import java.lang.Boolean;
import java.lang.Iterable;
import java.lang.Object;
import java.lang.String;
import java.util.Collection;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import javax.lang.model.type.TypeMirror;
import javax.lang.model.util.Elements;
import javax.lang.model.util.Types;

public class BasicJavacTask extends JavacTask {
  public BasicJavacTask(Context arg0, boolean arg1) {
  }

  public static JavacTask instance(Context arg0) {
    return null;
  }

  public Iterable parse() {
    return null;
  }

  public Iterable analyze() {
    return null;
  }

  public Iterable generate() {
    return null;
  }

  public void setTaskListener(TaskListener arg0) {
  }

  public void addTaskListener(TaskListener arg0) {
  }

  public void removeTaskListener(TaskListener arg0) {
  }

  public void setParameterNameProvider(ParameterNameProvider arg0) {
  }

  public Collection getTaskListeners() {
    return null;
  }

  public TypeMirror getTypeMirror(Iterable arg0) {
    return null;
  }

  public Elements getElements() {
    return null;
  }

  public Types getTypes() {
    return null;
  }

  public void addModules(Iterable arg0) {
  }

  public void setProcessors(Iterable arg0) {
  }

  public void setLocale(Locale arg0) {
  }

  public Boolean call() {
    return null;
  }

  public Context getContext() {
    return null;
  }

  public void initPlugins(Set arg0) {
  }

  private void initPlugin(Plugin arg0, String[] arg1) {
  }

  public void initDocLint(List arg0) {
  }

  public Object call() {
    return null;
  }

  private static String lambda$initPlugins$0(Map.Entry arg0) {
    return null;
  }
}
