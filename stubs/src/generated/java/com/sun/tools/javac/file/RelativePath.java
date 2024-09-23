package com.sun.tools.javac.file;

import java.lang.CharSequence;
import java.lang.Comparable;
import java.lang.Object;
import java.lang.String;
import java.nio.file.FileSystem;
import java.nio.file.Path;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import javax.tools.JavaFileObject;

public abstract class RelativePath implements Comparable {
  protected RelativePath(String arg0) {
  }

  public abstract RelativeDirectory dirname();

  public abstract String basename();

  public Path resolveAgainst(Path arg0) {
    return null;
  }

  public Path resolveAgainst(FileSystem arg0) {
    return null;
  }

  public int compareTo(RelativePath arg0) {
    return 0;
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

  public String getPath() {
    return null;
  }

  public int compareTo(Object arg0) {
    return 0;
  }

  public static class RelativeDirectory extends RelativePath {
    public RelativeDirectory(String arg0) {
    }

    public RelativeDirectory(RelativeDirectory arg0, String arg1) {
    }

    static RelativeDirectory forPackage(CharSequence arg0) {
      return null;
    }

    public RelativeDirectory dirname() {
      return null;
    }

    public String basename() {
      return null;
    }

    boolean contains(RelativePath arg0) {
      return false;
    }

    public String toString() {
      return null;
    }

    public int compareTo(Object arg0) {
      return 0;
    }
  }

  public static class RelativeFile extends RelativePath {
    public RelativeFile(String arg0) {
    }

    public RelativeFile(RelativeDirectory arg0, String arg1) {
    }

    RelativeFile(RelativeDirectory arg0, RelativePath arg1) {
    }

    static RelativeFile forClass(CharSequence arg0, JavaFileObject.Kind arg1) {
      return null;
    }

    public RelativeDirectory dirname() {
      return null;
    }

    public String basename() {
      return null;
    }

    ZipEntry getZipEntry(ZipFile arg0) {
      return null;
    }

    public String toString() {
      return null;
    }

    public int compareTo(Object arg0) {
      return 0;
    }
  }
}
