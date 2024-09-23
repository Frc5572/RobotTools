package com.sun.tools.javac.main;

import com.sun.tools.javac.jvm.Target;
import com.sun.tools.javac.util.Context;
import com.sun.tools.javac.util.JCDiagnostic;
import com.sun.tools.javac.util.List;
import com.sun.tools.javac.util.ListBuffer;
import java.lang.Iterable;
import java.lang.String;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;
import javax.lang.model.SourceVersion;
import javax.tools.JavaFileManager;

public class Arguments {
  protected Arguments(Context arg0) {
  }

  public static Arguments instance(Context arg0) {
    return null;
  }

  public void init(String arg0, Iterable arg1) {
  }

  public void init(String arg0, Iterable arg1, Iterable arg2, Iterable arg3) {
  }

  public void init(String arg0) {
  }

  public Set getFileObjects() {
    return null;
  }

  public Set getClassNames() {
    return null;
  }

  public boolean handleReleaseOptions(Predicate arg0) {
    return false;
  }

  private boolean processArgs(Iterable arg0, Set arg1, OptionHelper arg2, boolean arg3,
      boolean arg4) {
    return false;
  }

  private boolean doProcessArgs(Iterable arg0, Set arg1, OptionHelper arg2, boolean arg3,
      boolean arg4) {
    return false;
  }

  public boolean validate() {
    return false;
  }

  private void validateAddExports(SourceVersion arg0) {
  }

  private void validateAddReads(SourceVersion arg0) {
  }

  private void validateAddModules(SourceVersion arg0) {
  }

  private void validateLimitModules(SourceVersion arg0) {
  }

  private void validateDefaultModuleForCreatedFiles(SourceVersion arg0) {
  }

  public boolean isEmpty() {
    return false;
  }

  public void allowEmpty() {
  }

  public Map getDeferredFileManagerOptions() {
    return null;
  }

  public Set getPluginOpts() {
    return null;
  }

  public List getDocLintOpts() {
    return null;
  }

  private boolean checkDirectory(Option arg0) {
    return false;
  }

  void checkOptionAllowed(boolean arg0, ErrorReporter arg1, Option[] arg2) {
  }

  void reportDiag(JCDiagnostic.DiagnosticInfo arg0) {
  }

  void error(Option.InvalidValueException arg0) {
  }

  private void report(JCDiagnostic.DiagnosticInfo arg0) {
  }

  private JavaFileManager getFileManager() {
    return null;
  }

  ListBuffer toList(Iterable arg0) {
    return null;
  }

  Set toSet(Iterable arg0) {
    return null;
  }

  private void lambda$validate$3(Target arg0, Option arg1) {
  }

  private void lambda$validate$2(Target arg0, Option arg1) {
  }

  private boolean lambda$processArgs$1(Set arg0, OptionHelper arg1, boolean arg2, boolean arg3,
      Iterable arg4) {
    return false;
  }

  private void lambda$handleReleaseOptions$0(Option arg0) {
  }

  final enum ErrorMode {
    ILLEGAL_ARGUMENT,

    ILLEGAL_STATE,

    LOG
  }

  interface ErrorReporter {
    void report(Option arg0);
  }
}
