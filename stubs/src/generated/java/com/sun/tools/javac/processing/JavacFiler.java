package com.sun.tools.javac.processing;

import com.sun.tools.javac.code.Symbol;
import com.sun.tools.javac.util.Context;
import com.sun.tools.javac.util.Pair;
import java.io.Closeable;
import java.io.FilterOutputStream;
import java.io.FilterWriter;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;
import java.lang.CharSequence;
import java.lang.Object;
import java.lang.String;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import javax.annotation.processing.Filer;
import javax.lang.model.element.Element;
import javax.lang.model.element.Modifier;
import javax.lang.model.element.NestingKind;
import javax.tools.FileObject;
import javax.tools.ForwardingFileObject;
import javax.tools.JavaFileManager;
import javax.tools.JavaFileObject;

public class JavacFiler implements Filer, Closeable {
  JavacFiler(Context arg0) {
  }

  public JavaFileObject createSourceFile(CharSequence arg0, Element[] arg1) {
    return null;
  }

  public JavaFileObject createClassFile(CharSequence arg0, Element[] arg1) {
    return null;
  }

  private Pair checkOrInferModule(CharSequence arg0) {
    return null;
  }

  private JavaFileObject createSourceOrClassFile(Symbol.ModuleSymbol arg0, boolean arg1,
      String arg2, Element[] arg3) {
    return null;
  }

  private JavaFileObject[] originatingFiles(Element[] arg0) {
    return null;
  }

  public FileObject createResource(JavaFileManager.Location arg0, CharSequence arg1,
      CharSequence arg2, Element[] arg3) {
    return null;
  }

  private void locationCheck(JavaFileManager.Location arg0) {
  }

  public FileObject getResource(JavaFileManager.Location arg0, CharSequence arg1,
      CharSequence arg2) {
    return null;
  }

  private Tuple3 checkOrInferModule(JavaFileManager.Location arg0, CharSequence arg1,
      boolean arg2) {
    return null;
  }

  private Symbol.ModuleSymbol inferModule(String arg0) {
    return null;
  }

  private void checkName(String arg0) {
  }

  private void checkName(String arg0, boolean arg1) {
  }

  private boolean isPackageInfo(String arg0, boolean arg1) {
    return false;
  }

  private void checkNameAndExistence(Symbol.ModuleSymbol arg0, String arg1, boolean arg2) {
  }

  private boolean containedInInitialInputs(String arg0) {
    return false;
  }

  private void checkFileReopening(FileObject arg0, boolean arg1) {
  }

  private boolean isInFileObjectHistory(FileObject arg0, boolean arg1) {
    return false;
  }

  public boolean newFiles() {
    return false;
  }

  public Set getGeneratedSourceNames() {
    return null;
  }

  public Set getGeneratedSourceFileObjects() {
    return null;
  }

  public Map getGeneratedClasses() {
    return null;
  }

  public void warnIfUnclosedFiles() {
  }

  public void newRound() {
  }

  void setLastRound(boolean arg0) {
  }

  public void setInitialState(Collection arg0, Collection arg1) {
  }

  public void close() {
  }

  private void clearRoundState() {
  }

  public void displayState() {
  }

  public String toString() {
    return null;
  }

  private void closeFileObject(Symbol.ModuleSymbol arg0, String arg1, FileObject arg2) {
  }

  private static Map lambda$closeFileObject$2(Symbol.ModuleSymbol arg0) {
    return null;
  }

  private static JavaFileObject[] lambda$originatingFiles$1(int arg0) {
    return null;
  }

  private static boolean lambda$originatingFiles$0(JavaFileObject arg0) {
    return false;
  }

  static class FilerInputFileObject extends ForwardingFileObject {
    FilerInputFileObject(JavacFiler arg0, FileObject arg1) {
    }

    public OutputStream openOutputStream() {
      return null;
    }

    public Writer openWriter() {
      return null;
    }

    public boolean delete() {
      return false;
    }
  }

  static class FilerInputJavaFileObject extends FilerInputFileObject implements JavaFileObject {
    FilerInputJavaFileObject(JavacFiler arg0, JavaFileObject arg1) {
    }

    public JavaFileObject.Kind getKind() {
      return null;
    }

    public boolean isNameCompatible(String arg0, JavaFileObject.Kind arg1) {
      return false;
    }

    public NestingKind getNestingKind() {
      return null;
    }

    public Modifier getAccessLevel() {
      return null;
    }
  }

  static class FilerOutputFileObject extends ForwardingFileObject {
    FilerOutputFileObject(JavacFiler arg0, Symbol.ModuleSymbol arg1, String arg2, FileObject arg3) {
    }

    public synchronized OutputStream openOutputStream() {
      return null;
    }

    public synchronized Writer openWriter() {
      return null;
    }

    public InputStream openInputStream() {
      return null;
    }

    public Reader openReader(boolean arg0) {
      return null;
    }

    public CharSequence getCharContent(boolean arg0) {
      return null;
    }

    public boolean delete() {
      return false;
    }
  }

  static class FilerOutputJavaFileObject extends FilerOutputFileObject implements JavaFileObject {
    FilerOutputJavaFileObject(JavacFiler arg0, Symbol.ModuleSymbol arg1, String arg2,
        JavaFileObject arg3) {
    }

    public JavaFileObject.Kind getKind() {
      return null;
    }

    public boolean isNameCompatible(String arg0, JavaFileObject.Kind arg1) {
      return false;
    }

    public NestingKind getNestingKind() {
      return null;
    }

    public Modifier getAccessLevel() {
      return null;
    }
  }

  static class FilerOutputStream extends FilterOutputStream {
    FilerOutputStream(JavacFiler arg0, Symbol.ModuleSymbol arg1, String arg2, FileObject arg3) {
    }

    public void write(byte[] arg0, int arg1, int arg2) {
    }

    public synchronized void close() {
    }
  }

  static class FilerWriter extends FilterWriter {
    FilerWriter(JavacFiler arg0, Symbol.ModuleSymbol arg1, String arg2, FileObject arg3) {
    }

    public synchronized void close() {
    }
  }

  static final class Tuple3 {
    public Tuple3(Object arg0, Object arg1, Object arg2) {
    }
  }
}
