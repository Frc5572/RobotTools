package com.sun.tools.javac.api;

import java.lang.Iterable;
import java.lang.String;
import java.net.URI;
import java.util.Set;
import javax.tools.FileObject;
import javax.tools.ForwardingJavaFileManager;
import javax.tools.JavaFileManager;
import javax.tools.JavaFileObject;

public class WrappingJavaFileManager extends ForwardingJavaFileManager {
  protected WrappingJavaFileManager(JavaFileManager arg0) {
  }

  protected FileObject wrap(FileObject arg0) {
    return null;
  }

  protected JavaFileObject wrap(JavaFileObject arg0) {
    return null;
  }

  protected FileObject unwrap(FileObject arg0) {
    return null;
  }

  protected JavaFileObject unwrap(JavaFileObject arg0) {
    return null;
  }

  protected Iterable wrap(Iterable arg0) {
    return null;
  }

  protected URI unwrap(URI arg0) {
    return null;
  }

  public Iterable list(JavaFileManager.Location arg0, String arg1, Set arg2, boolean arg3) {
    return null;
  }

  public String inferBinaryName(JavaFileManager.Location arg0, JavaFileObject arg1) {
    return null;
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

  public FileObject getFileForOutput(JavaFileManager.Location arg0, String arg1, String arg2,
      FileObject arg3) {
    return null;
  }

  public boolean contains(JavaFileManager.Location arg0, FileObject arg1) {
    return false;
  }
}
