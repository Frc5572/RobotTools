package com.sun.tools.javac.main;

import com.sun.tools.javac.util.Context;
import java.io.File;
import java.lang.Class;
import java.lang.ClassLoader;
import java.lang.Iterable;
import java.lang.String;
import java.nio.file.Path;
import java.util.Collection;
import java.util.Iterator;
import java.util.ServiceLoader;
import java.util.Set;
import javax.tools.FileObject;
import javax.tools.JavaFileManager;
import javax.tools.JavaFileObject;
import javax.tools.StandardJavaFileManager;

public class DelegatingJavaFileManager implements JavaFileManager {
  private DelegatingJavaFileManager(JavaFileManager arg0, JavaFileManager arg1) {
  }

  public static void installReleaseFileManager(Context arg0, JavaFileManager arg1,
      JavaFileManager arg2) {
  }

  private JavaFileManager delegate(JavaFileManager.Location arg0) {
    return null;
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

  public JavaFileObject getJavaFileForOutputForOriginatingFiles(JavaFileManager.Location arg0,
      String arg1, JavaFileObject.Kind arg2, FileObject[] arg3) {
    return null;
  }

  public FileObject getFileForInput(JavaFileManager.Location arg0, String arg1, String arg2) {
    return null;
  }

  public FileObject getFileForOutput(JavaFileManager.Location arg0, String arg1, String arg2,
      FileObject arg3) {
    return null;
  }

  public FileObject getFileForOutputForOriginatingFiles(JavaFileManager.Location arg0, String arg1,
      String arg2, FileObject[] arg3) {
    return null;
  }

  public void flush() {
  }

  public void close() {
  }

  public JavaFileManager.Location getLocationForModule(JavaFileManager.Location arg0, String arg1) {
    return null;
  }

  public JavaFileManager.Location getLocationForModule(JavaFileManager.Location arg0,
      JavaFileObject arg1) {
    return null;
  }

  public ServiceLoader getServiceLoader(JavaFileManager.Location arg0, Class arg1) {
    return null;
  }

  public String inferModuleName(JavaFileManager.Location arg0) {
    return null;
  }

  public Iterable listLocationsForModules(JavaFileManager.Location arg0) {
    return null;
  }

  public boolean contains(JavaFileManager.Location arg0, FileObject arg1) {
    return false;
  }

  public int isSupportedOption(String arg0) {
    return 0;
  }

  public JavaFileManager getBaseFileManager() {
    return null;
  }

  static final class DelegatingSJFM extends DelegatingJavaFileManager implements StandardJavaFileManager {
    private DelegatingSJFM(JavaFileManager arg0, StandardJavaFileManager arg1) {
    }

    public boolean isSameFile(FileObject arg0, FileObject arg1) {
      return false;
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

    public void setLocationForModule(JavaFileManager.Location arg0, String arg1, Collection arg2) {
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
  }
}
