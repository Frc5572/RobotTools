package com.sun.tools.javac.main;

import com.sun.source.util.TaskEvent;
import com.sun.tools.javac.code.Symbol;
import com.sun.tools.javac.comp.CompileStates;
import com.sun.tools.javac.comp.Env;
import com.sun.tools.javac.tree.JCTree;
import com.sun.tools.javac.util.Context;
import com.sun.tools.javac.util.JCDiagnostic;
import com.sun.tools.javac.util.List;
import com.sun.tools.javac.util.Log;
import com.sun.tools.javac.util.Name;
import com.sun.tools.javac.util.Options;
import java.lang.CharSequence;
import java.lang.Iterable;
import java.lang.String;
import java.util.Collection;
import java.util.Map;
import java.util.Queue;
import java.util.function.Function;
import javax.tools.JavaFileManager;
import javax.tools.JavaFileObject;

public class JavaCompiler {
  public JavaCompiler(Context arg0) {
  }

  public static JavaCompiler instance(Context arg0) {
    return null;
  }

  public static String version() {
    return null;
  }

  public static String fullVersion() {
    return null;
  }

  private static String version(String arg0) {
    return null;
  }

  protected boolean shouldStop(CompileStates.CompileState arg0) {
    return false;
  }

  public int errorCount() {
    return 0;
  }

  protected final Queue stopIfError(CompileStates.CompileState arg0, Queue arg1) {
    return null;
  }

  protected final List stopIfError(CompileStates.CompileState arg0, List arg1) {
    return null;
  }

  public int warningCount() {
    return 0;
  }

  public CharSequence readSource(JavaFileObject arg0) {
    return null;
  }

  protected JCTree.JCCompilationUnit parse(JavaFileObject arg0, CharSequence arg1) {
    return null;
  }

  private JCTree.JCCompilationUnit parse(JavaFileObject arg0, CharSequence arg1, boolean arg2) {
    return null;
  }

  protected boolean keepComments() {
    return false;
  }

  public JCTree.JCCompilationUnit parse(String arg0) {
    return null;
  }

  public JCTree.JCCompilationUnit parse(JavaFileObject arg0) {
    return null;
  }

  public Symbol resolveBinaryNameOrIdent(String arg0) {
    return null;
  }

  public Symbol resolveBinaryNameOrIdent(Symbol.ModuleSymbol arg0, String arg1) {
    return null;
  }

  public Symbol resolveIdent(Symbol.ModuleSymbol arg0, String arg1) {
    return null;
  }

  JavaFileObject genCode(Env arg0, JCTree.JCClassDecl arg1) {
    return null;
  }

  JavaFileObject printSource(Env arg0, JCTree.JCClassDecl arg1) {
    return null;
  }

  private void readSourceFile(Symbol.ClassSymbol arg0) {
  }

  public void readSourceFile(JCTree.JCCompilationUnit arg0, Symbol.ClassSymbol arg1) {
  }

  public void compile(List arg0) {
  }

  public void compile(Collection arg0, Collection arg1, Iterable arg2, Collection arg3) {
  }

  protected void checkReusable() {
  }

  public List parseFiles(Iterable arg0) {
    return null;
  }

  public List parseFiles(Iterable arg0, boolean arg1) {
    return null;
  }

  public boolean continueAfterProcessAnnotations() {
    return false;
  }

  public List initModules(List arg0) {
    return null;
  }

  public List enterTrees(List arg0) {
    return null;
  }

  public void initProcessAnnotations(Iterable arg0, Collection arg1, Collection arg2) {
  }

  public void processAnnotations(List arg0) {
  }

  public void processAnnotations(List arg0, Collection arg1) {
  }

  private boolean unrecoverableError() {
    return false;
  }

  boolean explicitAnnotationProcessingRequested() {
    return false;
  }

  static boolean explicitAnnotationProcessingRequested(Options arg0, JavaFileManager arg1) {
    return false;
  }

  public void setDeferredDiagnosticHandler(Log.DeferredDiagnosticHandler arg0) {
  }

  public Queue attribute(Queue arg0) {
    return null;
  }

  public Env attribute(Env arg0) {
    return null;
  }

  public Queue flow(Queue arg0) {
    return null;
  }

  public Queue flow(Env arg0) {
    return null;
  }

  protected void flow(Env arg0, Queue arg1) {
  }

  private TaskEvent newAnalyzeTaskEvent(Env arg0) {
    return null;
  }

  public Queue desugar(Queue arg0) {
    return null;
  }

  protected void desugar(Env arg0, Queue arg1) {
  }

  public void generate(Queue arg0) {
  }

  public void generate(Queue arg0, Queue arg1) {
  }

  Map groupByFile(Queue arg0) {
    return null;
  }

  JCTree.JCClassDecl removeMethodBodies(JCTree.JCClassDecl arg0) {
    return null;
  }

  public void reportDeferredDiagnostics() {
  }

  public void enterDone() {
  }

  public boolean isEnterDone() {
    return false;
  }

  private Name readModuleName(JavaFileObject arg0) {
    return null;
  }

  private Name findPackageInFile(JavaFileObject arg0) {
    return null;
  }

  private Name parseAndGetName(JavaFileObject arg0, Function arg1) {
    return null;
  }

  public void close() {
  }

  protected void printNote(String arg0) {
  }

  public void printCount(String arg0, int arg1) {
  }

  private void printSuppressedCount(int arg0, int arg1, String arg2) {
  }

  private static long now() {
    return 0L;
  }

  private static long elapsed(long arg0) {
    return 0L;
  }

  public void newRound() {
  }

  private static Name lambda$findPackageInFile$4(JCTree.JCCompilationUnit arg0) {
    return null;
  }

  private static Name lambda$readModuleName$3(JCTree.JCCompilationUnit arg0) {
    return null;
  }

  private JCDiagnostic lambda$readSourceFile$2() {
    return null;
  }

  private JCDiagnostic lambda$readSourceFile$1() {
    return null;
  }

  private void lambda$new$0(Symbol arg0) {
  }

  public final enum CompilePolicy {
    SIMPLE,

    BY_FILE,

    BY_TODO
  }

  public final enum ImplicitSourcePolicy {
    NONE,

    CLASS,

    UNSET
  }

  public static class InitialFileParser implements InitialFileParserIntf {
    private InitialFileParser(Context arg0) {
    }

    public static InitialFileParserIntf instance(Context arg0) {
      return null;
    }

    public List parse(Iterable arg0) {
      return null;
    }
  }

  public interface InitialFileParserIntf {
    List parse(Iterable arg0);
  }
}
