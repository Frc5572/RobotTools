package com.sun.tools.javac.api;

import com.sun.tools.javac.code.Type;
import com.sun.tools.javac.comp.Env;
import com.sun.tools.javac.main.Main;
import com.sun.tools.javac.util.Context;
import com.sun.tools.javac.util.ListBuffer;
import com.sun.tools.javac.util.Pair;
import java.lang.Boolean;
import java.lang.Iterable;
import java.lang.Object;
import java.lang.String;
import java.util.Locale;
import java.util.Queue;
import java.util.concurrent.Callable;
import javax.lang.model.element.TypeElement;

public class JavacTaskImpl extends BasicJavacTask {
  protected JavacTaskImpl(Context arg0) {
  }

  public Boolean call() {
    return null;
  }

  public Main.Result doCall() {
    return null;
  }

  public void addModules(Iterable arg0) {
  }

  public void setProcessors(Iterable arg0) {
  }

  public void setLocale(Locale arg0) {
  }

  private Pair invocationHelper(Callable arg0) {
    return null;
  }

  private void prepareCompiler(boolean arg0) {
  }

  String toString(Iterable arg0, String arg1) {
    return null;
  }

  void cleanup() {
  }

  public Iterable parse() {
    return null;
  }

  private Iterable parseInternal() {
    return null;
  }

  public Iterable enter() {
    return null;
  }

  public Iterable enter(Iterable arg0) {
    return null;
  }

  public Iterable analyze() {
    return null;
  }

  public Iterable analyze(Iterable arg0) {
    return null;
  }

  private void handleFlowResults(Queue arg0, ListBuffer arg1) {
  }

  public Iterable generate() {
    return null;
  }

  public Iterable generate(Iterable arg0) {
    return null;
  }

  public void ensureEntered() {
  }

  public Type parseType(String arg0, TypeElement arg1) {
    return null;
  }

  public Object call() {
    return null;
  }

  private Iterable lambda$generate$2() {
    return null;
  }

  private Iterable lambda$analyze$1() {
    return null;
  }

  private Main.Result lambda$doCall$0() {
    return null;
  }

  abstract static class Filter {
    Filter(JavacTaskImpl arg0) {
    }

    void run(Queue arg0, Iterable arg1) {
    }

    abstract void process(Env arg0);
  }
}
