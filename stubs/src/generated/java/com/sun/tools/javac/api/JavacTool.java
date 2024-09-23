package com.sun.tools.javac.api;

import com.sun.source.util.JavacTask;
import com.sun.tools.javac.file.JavacFileManager;
import com.sun.tools.javac.util.Context;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Writer;
import java.lang.Iterable;
import java.lang.String;
import java.nio.charset.Charset;
import java.util.Locale;
import java.util.Set;
import javax.tools.DiagnosticListener;
import javax.tools.JavaCompiler;
import javax.tools.JavaFileManager;
import javax.tools.StandardJavaFileManager;

public final class JavacTool implements JavaCompiler {
  public JavacTool() {
  }

  public String name() {
    return null;
  }

  public static JavacTool create() {
    return null;
  }

  public JavacFileManager getStandardFileManager(DiagnosticListener arg0, Locale arg1,
      Charset arg2) {
    return null;
  }

  public JavacTask getTask(Writer arg0, JavaFileManager arg1, DiagnosticListener arg2,
      Iterable arg3, Iterable arg4, Iterable arg5) {
    return null;
  }

  public JavacTask getTask(Writer arg0, JavaFileManager arg1, DiagnosticListener arg2,
      Iterable arg3, Iterable arg4, Iterable arg5, Context arg6) {
    return null;
  }

  public int run(InputStream arg0, OutputStream arg1, OutputStream arg2, String[] arg3) {
    return 0;
  }

  public Set getSourceVersions() {
    return null;
  }

  public int isSupportedOption(String arg0) {
    return 0;
  }

  public StandardJavaFileManager getStandardFileManager(DiagnosticListener arg0, Locale arg1,
      Charset arg2) {
    return null;
  }

  public JavaCompiler.CompilationTask getTask(Writer arg0, JavaFileManager arg1,
      DiagnosticListener arg2, Iterable arg3, Iterable arg4, Iterable arg5) {
    return null;
  }
}
