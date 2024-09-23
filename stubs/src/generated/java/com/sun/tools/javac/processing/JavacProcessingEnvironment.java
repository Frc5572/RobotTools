package com.sun.tools.javac.processing;

import com.sun.tools.javac.code.DeferredCompletionFailureHandler;
import com.sun.tools.javac.code.Source;
import com.sun.tools.javac.code.Symbol;
import com.sun.tools.javac.model.JavacElements;
import com.sun.tools.javac.model.JavacTypes;
import com.sun.tools.javac.tree.JCTree;
import com.sun.tools.javac.util.Context;
import com.sun.tools.javac.util.JCDiagnostic;
import com.sun.tools.javac.util.List;
import com.sun.tools.javac.util.Log;
import java.io.Closeable;
import java.lang.Class;
import java.lang.ClassLoader;
import java.lang.Exception;
import java.lang.Iterable;
import java.lang.Object;
import java.lang.String;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.ServiceLoader;
import java.util.Set;
import java.util.regex.Pattern;
import javax.annotation.processing.Filer;
import javax.annotation.processing.Messager;
import javax.annotation.processing.ProcessingEnvironment;
import javax.annotation.processing.Processor;
import javax.annotation.processing.RoundEnvironment;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.Element;
import javax.lang.model.element.ExecutableElement;
import javax.lang.model.element.PackageElement;
import javax.lang.model.element.TypeElement;
import javax.lang.model.util.ElementScanner14;
import javax.lang.model.util.Elements;
import javax.lang.model.util.Types;
import javax.tools.JavaFileObject;

public class JavacProcessingEnvironment implements ProcessingEnvironment, Closeable {
  protected JavacProcessingEnvironment(Context arg0) {
  }

  public static JavacProcessingEnvironment instance(Context arg0) {
    return null;
  }

  public void setProcessors(Iterable arg0) {
  }

  private Set initPlatformAnnotations() {
    return null;
  }

  private void initProcessorLoader() {
  }

  private void initProcessorIterator(Iterable arg0) {
  }

  public ServiceLoader getServiceLoader(Class arg0) {
    return null;
  }

  private Iterator handleServiceLoaderUnavailability(String arg0, Exception arg1) {
    return null;
  }

  private void handleException(String arg0, Exception arg1) {
  }

  public boolean atLeastOneProcessor() {
    return false;
  }

  private Map initProcessorOptions() {
    return null;
  }

  private Set initUnmatchedProcessorOptions() {
    return null;
  }

  private void discoverAndRunProcs(Set arg0, List arg1, List arg2, List arg3) {
  }

  private boolean callProcessor(Processor arg0, Set arg1, RoundEnvironment arg2) {
    return false;
  }

  public boolean doProcessing(List arg0, List arg1, Iterable arg2,
      Log.DeferredDiagnosticHandler arg3) {
    return false;
  }

  private void warnIfUnmatchedOptions() {
  }

  public void close() {
  }

  private List getTopLevelClasses(List arg0) {
    return null;
  }

  private List getTopLevelClassesFromClasses(List arg0) {
    return null;
  }

  private List getPackageInfoFiles(List arg0) {
    return null;
  }

  private List getPackageInfoFilesFromClasses(List arg0) {
    return null;
  }

  private List getModuleInfoFiles(List arg0) {
    return null;
  }

  private static List join(List arg0, List arg1) {
    return null;
  }

  private boolean isPkgInfo(JavaFileObject arg0, JavaFileObject.Kind arg1) {
    return false;
  }

  private boolean isPkgInfo(Symbol.ClassSymbol arg0) {
    return false;
  }

  private boolean isModuleInfo(JavaFileObject arg0, JavaFileObject.Kind arg1) {
    return false;
  }

  private boolean needClassLoader(String arg0, Iterable arg1) {
    return false;
  }

  private boolean moreToDo() {
    return false;
  }

  public Map getOptions() {
    return null;
  }

  public Messager getMessager() {
    return null;
  }

  public JavacFiler getFiler() {
    return null;
  }

  public JavacElements getElementUtils() {
    return null;
  }

  public JavacTypes getTypeUtils() {
    return null;
  }

  public SourceVersion getSourceVersion() {
    return null;
  }

  public Locale getLocale() {
    return null;
  }

  public boolean isPreviewEnabled() {
    return false;
  }

  public Set getSpecifiedPackages() {
    return null;
  }

  private static Pattern importStringToPattern(boolean arg0, String arg1, Processor arg2, Log arg3,
      boolean arg4) {
    return null;
  }

  private static Pattern warnAndNoMatches(String arg0, Processor arg1, Log arg2, boolean arg3) {
    return null;
  }

  public Context getContext() {
    return null;
  }

  public ClassLoader getProcessorClassLoader() {
    return null;
  }

  public String toString() {
    return null;
  }

  public static boolean isValidOptionName(String arg0) {
    return false;
  }

  public Types getTypeUtils() {
    return null;
  }

  public Elements getElementUtils() {
    return null;
  }

  public Filer getFiler() {
    return null;
  }

  private static Iterator lambda$initProcessorIterator$0(Iterator arg0) {
    return null;
  }

  public static class ComputeAnnotationSet extends ElementScanner14 {
    public ComputeAnnotationSet(Elements arg0) {
    }

    public Set visitPackage(PackageElement arg0, Set arg1) {
      return null;
    }

    public Set visitType(TypeElement arg0, Set arg1) {
      return null;
    }

    public Set visitExecutable(ExecutableElement arg0, Set arg1) {
      return null;
    }

    void addAnnotations(Element arg0, Set arg1) {
    }

    public Set scan(Element arg0, Set arg1) {
      return null;
    }

    public Object visitExecutable(ExecutableElement arg0, Object arg1) {
      return null;
    }

    public Object visitType(TypeElement arg0, Object arg1) {
      return null;
    }

    public Object visitPackage(PackageElement arg0, Object arg1) {
      return null;
    }

    public Object scan(Element arg0, Object arg1) {
      return null;
    }
  }

  static class ProcessorStateIterator implements Iterator {
    ProcessorStateIterator(DiscoveredProcessors arg0, DiscoveredProcessors arg1) {
    }

    public ProcessorState next() {
      return null;
    }

    public boolean hasNext() {
      return false;
    }

    public void remove() {
    }

    public void runContributingProcs(RoundEnvironment arg0) {
    }

    public Object next() {
      return null;
    }
  }

  static class DiscoveredProcessors implements Iterable {
    DiscoveredProcessors(JavacProcessingEnvironment arg0, Iterator arg1) {
    }

    public DiscoveredProcessors.ProcessorStateIterator iterator() {
      return null;
    }

    public void close() {
    }

    public Iterator iterator() {
      return null;
    }
  }

  static class ImplicitCompleter implements Symbol.Completer {
    public ImplicitCompleter(JavacProcessingEnvironment arg0, JCTree.JCCompilationUnit arg1) {
    }

    public void complete(Symbol arg0) {
    }
  }

  static class NameProcessIterator implements Iterator {
    NameProcessIterator(String arg0, ClassLoader arg1, Log arg2) {
    }

    public boolean hasNext() {
      return false;
    }

    private Processor getNextProcessor(String arg0) {
      return null;
    }

    public Processor next() {
      return null;
    }

    public void remove() {
    }

    private void ensureReadable(Class arg0) {
    }

    public Object next() {
      return null;
    }
  }

  static class NameServiceIterator extends ServiceIterator {
    public NameServiceIterator(JavacProcessingEnvironment arg0, ServiceLoader arg1, Log arg2,
        String arg3) {
    }

    boolean internalHasNext() {
      return false;
    }

    Processor internalNext() {
      return null;
    }
  }

  static class ProcessorState {
    ProcessorState(Processor arg0, Log arg1, Source arg2, DeferredCompletionFailureHandler arg3,
        boolean arg4, ProcessingEnvironment arg5, boolean arg6) {
    }

    private void checkSourceVersionCompatibility(Source arg0, Log arg1) {
    }

    private boolean checkOptionName(String arg0, Log arg1) {
      return false;
    }

    public boolean annotationSupported(String arg0) {
      return false;
    }

    public void removeSupportedOptions(Set arg0) {
    }
  }

  static class Round {
    private Round(JavacProcessingEnvironment arg0, int arg1, Set arg2,
        Log.DeferredDiagnosticHandler arg3) {
    }

    Round(JavacProcessingEnvironment arg0, List arg1, List arg2, Set arg3,
        Log.DeferredDiagnosticHandler arg4) {
    }

    private Round(JavacProcessingEnvironment arg0, Round arg1, Set arg2, Map arg3) {
    }

    Round next(Set arg0, Map arg1) {
      return null;
    }

    void finalCompiler() {
    }

    int errorCount() {
      return 0;
    }

    int warningCount() {
      return 0;
    }

    boolean unrecoverableError() {
      return false;
    }

    void findAnnotationsPresent() {
    }

    private List enterClassFiles(Map arg0) {
      return null;
    }

    private void enterTrees(List arg0) {
    }

    void run(boolean arg0, boolean arg1) {
    }

    void showDiagnostics(boolean arg0) {
    }

    private void printRoundInfo(boolean arg0) {
    }

    private void newRound() {
    }

    private static boolean lambda$new$2(JCDiagnostic arg0) {
      return false;
    }

    private static boolean lambda$new$1(JCDiagnostic arg0) {
      return false;
    }

    private static Map lambda$new$0(Symbol.ModuleSymbol arg0) {
      return null;
    }
  }

  static class ServiceIterator implements Iterator {
    ServiceIterator(JavacProcessingEnvironment arg0, ClassLoader arg1, Log arg2) {
    }

    ServiceIterator(JavacProcessingEnvironment arg0, ServiceLoader arg1, Log arg2) {
    }

    public boolean hasNext() {
      return false;
    }

    boolean internalHasNext() {
      return false;
    }

    public Processor next() {
      return null;
    }

    Processor internalNext() {
      return null;
    }

    public void remove() {
    }

    public void close() {
    }

    public Object next() {
      return null;
    }
  }
}
