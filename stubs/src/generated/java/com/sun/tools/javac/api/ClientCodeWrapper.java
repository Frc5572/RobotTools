package com.sun.tools.javac.api;

import com.sun.source.util.TaskEvent;
import com.sun.source.util.TaskListener;
import com.sun.tools.javac.util.Context;
import com.sun.tools.javac.util.JCDiagnostic;
import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;
import java.lang.CharSequence;
import java.lang.Class;
import java.lang.ClassLoader;
import java.lang.Iterable;
import java.lang.Object;
import java.lang.String;
import java.net.URI;
import java.nio.file.Path;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;
import java.util.ServiceLoader;
import java.util.Set;
import javax.lang.model.element.Modifier;
import javax.lang.model.element.NestingKind;
import javax.tools.Diagnostic;
import javax.tools.DiagnosticListener;
import javax.tools.FileObject;
import javax.tools.JavaFileManager;
import javax.tools.JavaFileObject;
import javax.tools.StandardJavaFileManager;

public class ClientCodeWrapper {
  protected ClientCodeWrapper(Context arg0) {
  }

  public static ClientCodeWrapper instance(Context arg0) {
    return null;
  }

  public JavaFileManager wrap(JavaFileManager arg0) {
    return null;
  }

  public FileObject wrap(FileObject arg0) {
    return null;
  }

  FileObject unwrap(FileObject arg0) {
    return null;
  }

  public JavaFileObject wrap(JavaFileObject arg0) {
    return null;
  }

  public Iterable wrapJavaFileObjects(Iterable arg0) {
    return null;
  }

  JavaFileObject unwrap(JavaFileObject arg0) {
    return null;
  }

  public DiagnosticListener wrap(DiagnosticListener arg0) {
    return null;
  }

  TaskListener wrap(TaskListener arg0) {
    return null;
  }

  TaskListener unwrap(TaskListener arg0) {
    return null;
  }

  Collection unwrap(Collection arg0) {
    return null;
  }

  private Diagnostic unwrap(Diagnostic arg0) {
    return null;
  }

  protected boolean isTrusted(Object arg0) {
    return false;
  }

  private String wrappedToString(Class arg0, Object arg1) {
    return null;
  }

  public static class DiagnosticSourceUnwrapper implements Diagnostic {
    DiagnosticSourceUnwrapper(ClientCodeWrapper arg0, JCDiagnostic arg1) {
    }

    public Diagnostic.Kind getKind() {
      return null;
    }

    public JavaFileObject getSource() {
      return null;
    }

    public long getPosition() {
      return 0L;
    }

    public long getStartPosition() {
      return 0L;
    }

    public long getEndPosition() {
      return 0L;
    }

    public long getLineNumber() {
      return 0L;
    }

    public long getColumnNumber() {
      return 0L;
    }

    public String getCode() {
      return null;
    }

    public String getMessage(Locale arg0) {
      return null;
    }

    public String toString() {
      return null;
    }

    public Object getSource() {
      return null;
    }
  }

  public static class Trusted {
  }

  public static class WrappedDiagnosticListener implements DiagnosticListener {
    WrappedDiagnosticListener(ClientCodeWrapper arg0, DiagnosticListener arg1) {
    }

    public void report(Diagnostic arg0) {
    }

    public String toString() {
      return null;
    }
  }

  public static class WrappedFileObject implements FileObject {
    WrappedFileObject(ClientCodeWrapper arg0, FileObject arg1) {
    }

    public URI toUri() {
      return null;
    }

    public String getName() {
      return null;
    }

    public InputStream openInputStream() {
      return null;
    }

    public OutputStream openOutputStream() {
      return null;
    }

    public Reader openReader(boolean arg0) {
      return null;
    }

    public CharSequence getCharContent(boolean arg0) {
      return null;
    }

    public Writer openWriter() {
      return null;
    }

    public long getLastModified() {
      return 0L;
    }

    public boolean delete() {
      return false;
    }

    public String toString() {
      return null;
    }
  }

  public static class WrappedJavaFileManager implements JavaFileManager {
    WrappedJavaFileManager(ClientCodeWrapper arg0, JavaFileManager arg1) {
    }

    public ClassLoader getClassLoader(JavaFileManager.Location arg0) {
      return null;
    }

    public Iterable list(JavaFileManager.Location arg0, String arg1, Set arg2, boolean arg3) {
      return null;
    }

    public String inferBinaryName(JavaFileManager.Location arg0, JavaFileObject arg1) {
      return null;
    }

    public boolean isSameFile(FileObject arg0, FileObject arg1) {
      return false;
    }

    public boolean handleOption(String arg0, Iterator arg1) {
      return false;
    }

    public boolean hasLocation(JavaFileManager.Location arg0) {
      return false;
    }

    public JavaFileObject getJavaFileForInput(JavaFileManager.Location arg0, String arg1,
        JavaFileObject.Kind arg2) {
      return null;
    }

    public JavaFileObject getJavaFileForOutput(JavaFileManager.Location arg0, String arg1,
        JavaFileObject.Kind arg2, FileObject arg3) {
      return null;
    }

    public FileObject getFileForInput(JavaFileManager.Location arg0, String arg1, String arg2) {
      return null;
    }

    public JavaFileObject getJavaFileForOutputForOriginatingFiles(JavaFileManager.Location arg0,
        String arg1, JavaFileObject.Kind arg2, FileObject[] arg3) {
      return null;
    }

    public FileObject getFileForOutput(JavaFileManager.Location arg0, String arg1, String arg2,
        FileObject arg3) {
      return null;
    }

    public FileObject getFileForOutputForOriginatingFiles(JavaFileManager.Location arg0,
        String arg1, String arg2, FileObject[] arg3) {
      return null;
    }

    public boolean contains(JavaFileManager.Location arg0, FileObject arg1) {
      return false;
    }

    public void flush() {
    }

    public void close() {
    }

    public JavaFileManager.Location getLocationForModule(JavaFileManager.Location arg0,
        String arg1) {
      return null;
    }

    public JavaFileManager.Location getLocationForModule(JavaFileManager.Location arg0,
        JavaFileObject arg1) {
      return null;
    }

    public String inferModuleName(JavaFileManager.Location arg0) {
      return null;
    }

    public Iterable listLocationsForModules(JavaFileManager.Location arg0) {
      return null;
    }

    public int isSupportedOption(String arg0) {
      return 0;
    }

    public String toString() {
      return null;
    }

    public ServiceLoader getServiceLoader(JavaFileManager.Location arg0, Class arg1) {
      return null;
    }
  }

  public static class WrappedJavaFileObject extends WrappedFileObject implements JavaFileObject {
    WrappedJavaFileObject(ClientCodeWrapper arg0, JavaFileObject arg1) {
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

    public String toString() {
      return null;
    }
  }

  public static class WrappedStandardJavaFileManager extends WrappedJavaFileManager implements StandardJavaFileManager {
    WrappedStandardJavaFileManager(ClientCodeWrapper arg0, StandardJavaFileManager arg1) {
    }

    public Iterable getJavaFileObjectsFromFiles(Iterable arg0) {
      return null;
    }

    public Iterable getJavaFileObjectsFromPaths(Collection arg0) {
      return null;
    }

    public Iterable getJavaFileObjectsFromPaths(Iterable arg0) {
      return null;
    }

    public Iterable getJavaFileObjects(File[] arg0) {
      return null;
    }

    public Iterable getJavaFileObjects(Path[] arg0) {
      return null;
    }

    public Iterable getJavaFileObjectsFromStrings(Iterable arg0) {
      return null;
    }

    public Iterable getJavaFileObjects(String[] arg0) {
      return null;
    }

    public void setLocation(JavaFileManager.Location arg0, Iterable arg1) {
    }

    public void setLocationFromPaths(JavaFileManager.Location arg0, Collection arg1) {
    }

    public Iterable getLocation(JavaFileManager.Location arg0) {
      return null;
    }

    public Iterable getLocationAsPaths(JavaFileManager.Location arg0) {
      return null;
    }

    public Path asPath(FileObject arg0) {
      return null;
    }

    public void setPathFactory(StandardJavaFileManager.PathFactory arg0) {
    }

    public void setLocationForModule(JavaFileManager.Location arg0, String arg1, Collection arg2) {
    }
  }

  public static class WrappedTaskListener implements TaskListener {
    WrappedTaskListener(ClientCodeWrapper arg0, TaskListener arg1) {
    }

    public void started(TaskEvent arg0) {
    }

    public void finished(TaskEvent arg0) {
    }

    public String toString() {
      return null;
    }
  }
}
