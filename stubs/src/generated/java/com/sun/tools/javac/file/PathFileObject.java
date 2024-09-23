package com.sun.tools.javac.file;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;
import java.lang.CharSequence;
import java.lang.Error;
import java.lang.Iterable;
import java.lang.Object;
import java.lang.String;
import java.lang.Throwable;
import java.net.URI;
import java.nio.file.Path;
import javax.lang.model.element.Modifier;
import javax.lang.model.element.NestingKind;
import javax.tools.FileObject;
import javax.tools.JavaFileObject;

public abstract class PathFileObject implements JavaFileObject {
  protected PathFileObject(BaseFileManager arg0, Path arg1) {
  }

  static PathFileObject forDirectoryPath(BaseFileManager arg0, Path arg1, Path arg2,
      RelativePath arg3) {
    return null;
  }

  public static PathFileObject forJarPath(BaseFileManager arg0, Path arg1, Path arg2) {
    return null;
  }

  public static PathFileObject forJRTPath(BaseFileManager arg0, Path arg1) {
    return null;
  }

  static PathFileObject forSimplePath(BaseFileManager arg0, Path arg1, Path arg2) {
    return null;
  }

  abstract String inferBinaryName(Iterable arg0);

  abstract PathFileObject getSibling(String arg0);

  public Path getPath() {
    return null;
  }

  public String getShortName() {
    return null;
  }

  public JavaFileObject.Kind getKind() {
    return null;
  }

  public boolean isNameCompatible(String arg0, JavaFileObject.Kind arg1) {
    return false;
  }

  protected boolean isPathNameCompatible(Path arg0, String arg1, JavaFileObject.Kind arg2) {
    return false;
  }

  public NestingKind getNestingKind() {
    return null;
  }

  public Modifier getAccessLevel() {
    return null;
  }

  public URI toUri() {
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

  boolean isSameFile(PathFileObject arg0) {
    return false;
  }

  public boolean equals(Object arg0) {
    return false;
  }

  public int hashCode() {
    return 0;
  }

  public String toString() {
    return null;
  }

  private void ensureParentDirectoriesExist() {
  }

  protected static String toBinaryName(RelativePath arg0) {
    return null;
  }

  protected static String toBinaryName(Path arg0) {
    return null;
  }

  private static String toBinaryName(String arg0, String arg1) {
    return null;
  }

  private static String removeExtension(String arg0) {
    return null;
  }

  public static String getSimpleName(FileObject arg0) {
    return null;
  }

  public static class CannotCreateUriError extends Error {
    public CannotCreateUriError(String arg0, Throwable arg1) {
    }
  }

  static class DirectoryFileObject extends PathFileObject {
    private DirectoryFileObject(BaseFileManager arg0, Path arg1, Path arg2, RelativePath arg3) {
    }

    public String getName() {
      return null;
    }

    public String inferBinaryName(Iterable arg0) {
      return null;
    }

    public String toString() {
      return null;
    }

    PathFileObject getSibling(String arg0) {
      return null;
    }
  }

  static class JRTFileObject extends PathFileObject {
    private JRTFileObject(BaseFileManager arg0, Path arg1) {
    }

    public String getName() {
      return null;
    }

    public String inferBinaryName(Iterable arg0) {
      return null;
    }

    public String toString() {
      return null;
    }

    PathFileObject getSibling(String arg0) {
      return null;
    }
  }

  static class JarFileObject extends PathFileObject {
    private JarFileObject(BaseFileManager arg0, Path arg1, Path arg2) {
    }

    public String getName() {
      return null;
    }

    public String inferBinaryName(Iterable arg0) {
      return null;
    }

    public String toString() {
      return null;
    }

    PathFileObject getSibling(String arg0) {
      return null;
    }
  }

  static class SimpleFileObject extends PathFileObject {
    private SimpleFileObject(BaseFileManager arg0, Path arg1, Path arg2) {
    }

    public String getName() {
      return null;
    }

    public String getShortName() {
      return null;
    }

    public String inferBinaryName(Iterable arg0) {
      return null;
    }

    public JavaFileObject.Kind getKind() {
      return null;
    }

    public boolean isNameCompatible(String arg0, JavaFileObject.Kind arg1) {
      return false;
    }

    public URI toUri() {
      return null;
    }

    PathFileObject getSibling(String arg0) {
      return null;
    }
  }
}
