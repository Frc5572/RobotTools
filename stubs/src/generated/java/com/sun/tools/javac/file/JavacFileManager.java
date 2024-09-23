package com.sun.tools.javac.file;

import com.sun.tools.javac.main.Option;
import com.sun.tools.javac.util.Context;
import com.sun.tools.javac.util.ListBuffer;
import java.io.File;
import java.io.IOException;
import java.lang.Class;
import java.lang.ClassLoader;
import java.lang.Comparable;
import java.lang.Iterable;
import java.lang.Object;
import java.lang.String;
import java.net.URI;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.file.Path;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.ServiceLoader;
import java.util.Set;
import javax.tools.FileObject;
import javax.tools.JavaFileManager;
import javax.tools.JavaFileObject;
import javax.tools.StandardJavaFileManager;

public class JavacFileManager extends BaseFileManager implements StandardJavaFileManager {
  public JavacFileManager(Context arg0, boolean arg1, Charset arg2) {
  }

  public static char[] toArray(CharBuffer arg0) {
    return null;
  }

  public static void preRegister(Context arg0) {
  }

  public void setContext(Context arg0) {
  }

  public void setPathFactory(StandardJavaFileManager.PathFactory arg0) {
  }

  private Path getPath(String arg0, String[] arg1) {
    return null;
  }

  public void setSymbolFileEnabled(boolean arg0) {
  }

  public boolean isSymbolFileEnabled() {
    return false;
  }

  public JavaFileObject getJavaFileObject(String arg0) {
    return null;
  }

  public JavaFileObject getJavaFileObject(Path arg0) {
    return null;
  }

  public JavaFileObject getFileForOutput(String arg0, JavaFileObject.Kind arg1,
      JavaFileObject arg2) {
    return null;
  }

  public Iterable getJavaFileObjectsFromStrings(Iterable arg0) {
    return null;
  }

  public Iterable getJavaFileObjects(String[] arg0) {
    return null;
  }

  private static boolean isValidName(String arg0) {
    return false;
  }

  private static void validateClassName(String arg0) {
  }

  private static void validatePackageName(String arg0) {
  }

  public static void testName(String arg0, boolean arg1, boolean arg2) {
  }

  private static void printAscii(String arg0, Object[] arg1) {
  }

  synchronized Container getContainer(Path arg0) {
    return null;
  }

  private synchronized JRTIndex getJRTIndex() {
    return null;
  }

  private boolean isValidFile(String arg0, Set arg1) {
    return false;
  }

  private boolean caseMapCheck(Path arg0, RelativePath arg1) {
    return false;
  }

  public void flush() {
  }

  public void close() {
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

  public boolean hasLocation(JavaFileManager.Location arg0) {
    return false;
  }

  protected boolean hasExplicitLocation(JavaFileManager.Location arg0) {
    return false;
  }

  public JavaFileObject getJavaFileForInput(JavaFileManager.Location arg0, String arg1,
      JavaFileObject.Kind arg2) {
    return null;
  }

  public FileObject getFileForInput(JavaFileManager.Location arg0, String arg1, String arg2) {
    return null;
  }

  private JavaFileObject getFileForInput(JavaFileManager.Location arg0,
      RelativePath.RelativeFile arg1) {
    return null;
  }

  public JavaFileObject getJavaFileForOutput(JavaFileManager.Location arg0, String arg1,
      JavaFileObject.Kind arg2, FileObject arg3) {
    return null;
  }

  public FileObject getFileForOutput(JavaFileManager.Location arg0, String arg1, String arg2,
      FileObject arg3) {
    return null;
  }

  private JavaFileObject getFileForOutput(JavaFileManager.Location arg0,
      RelativePath.RelativeFile arg1, FileObject arg2) {
    return null;
  }

  public Iterable getJavaFileObjectsFromFiles(Iterable arg0) {
    return null;
  }

  public Iterable getJavaFileObjectsFromPaths(Collection arg0) {
    return null;
  }

  public Iterable getJavaFileObjects(File[] arg0) {
    return null;
  }

  public Iterable getJavaFileObjects(Path[] arg0) {
    return null;
  }

  public void setLocation(JavaFileManager.Location arg0, Iterable arg1) {
  }

  public void setLocationFromPaths(JavaFileManager.Location arg0, Collection arg1) {
  }

  public Iterable getLocation(JavaFileManager.Location arg0) {
    return null;
  }

  public Collection getLocationAsPaths(JavaFileManager.Location arg0) {
    return null;
  }

  private List pathsAndContainers(JavaFileManager.Location arg0,
      RelativePath.RelativeDirectory arg1) {
    return null;
  }

  private Map indexPathsAndContainersByRelativeDirectory(JavaFileManager.Location arg0) {
    return null;
  }

  private List pathsAndContainers(JavaFileManager.Location arg0) {
    return null;
  }

  public boolean contains(JavaFileManager.Location arg0, FileObject arg1) {
    return false;
  }

  private Path getClassOutDir() {
    return null;
  }

  private Path getSourceOutDir() {
    return null;
  }

  public JavaFileManager.Location getLocationForModule(JavaFileManager.Location arg0, String arg1) {
    return null;
  }

  public ServiceLoader getServiceLoader(JavaFileManager.Location arg0, Class arg1) {
    return null;
  }

  public JavaFileManager.Location getLocationForModule(JavaFileManager.Location arg0,
      JavaFileObject arg1) {
    return null;
  }

  public void setLocationForModule(JavaFileManager.Location arg0, String arg1, Collection arg2) {
  }

  public String inferModuleName(JavaFileManager.Location arg0) {
    return null;
  }

  public Iterable listLocationsForModules(JavaFileManager.Location arg0) {
    return null;
  }

  public Path asPath(FileObject arg0) {
    return null;
  }

  protected static boolean isRelativeUri(URI arg0) {
    return false;
  }

  protected static boolean isRelativeUri(String arg0) {
    return false;
  }

  public static String getRelativeName(File arg0) {
    return null;
  }

  public static String getMessage(IOException arg0) {
    return null;
  }

  private void checkOutputLocation(JavaFileManager.Location arg0) {
  }

  private void checkModuleOrientedOrOutputLocation(JavaFileManager.Location arg0) {
  }

  private void checkNotModuleOrientedLocation(JavaFileManager.Location arg0) {
  }

  private static Iterable asPaths(Iterable arg0) {
    return null;
  }

  private static Iterable asFiles(Iterable arg0) {
    return null;
  }

  public boolean handleOption(Option arg0, String arg1) {
    return false;
  }

  private void clearCachesForLocation(JavaFileManager.Location arg0) {
  }

  public Iterable getLocationAsPaths(JavaFileManager.Location arg0) {
    return null;
  }

  private static Iterator lambda$asFiles$5(Iterable arg0) {
    return null;
  }

  private static Iterator lambda$asPaths$4(Iterable arg0) {
    return null;
  }

  private static void lambda$indexPathsAndContainersByRelativeDirectory$3(List arg0) {
  }

  private static List lambda$indexPathsAndContainersByRelativeDirectory$2(List arg0,
      RelativePath.RelativeDirectory arg1) {
    return null;
  }

  private List lambda$pathsAndContainers$1(JavaFileManager.Location arg0,
      RelativePath.RelativeDirectory arg1) {
    return null;
  }

  private static JavaFileManager lambda$preRegister$0(Context arg0) {
    return null;
  }

  static final class ArchiveContainer implements Container {
    public ArchiveContainer(JavacFileManager arg0, Path arg1) {
    }

    public void list(Path arg0, RelativePath.RelativeDirectory arg1, Set arg2, boolean arg3,
        ListBuffer arg4) {
    }

    private boolean isValid(Path arg0) {
      return false;
    }

    public JavaFileObject getFileObject(Path arg0, RelativePath.RelativeFile arg1) {
      return null;
    }

    public void close() {
    }

    public boolean maintainsDirectoryIndex() {
      return false;
    }

    public Iterable indexedDirectories() {
      return null;
    }
  }

  interface Container {
    void list(Path arg0, RelativePath.RelativeDirectory arg1, Set arg2, boolean arg3,
        ListBuffer arg4);

    JavaFileObject getFileObject(Path arg0, RelativePath.RelativeFile arg1);

    void close();

    boolean maintainsDirectoryIndex();

    Iterable indexedDirectories();
  }

  static final class DirectoryContainer implements Container {
    public DirectoryContainer(JavacFileManager arg0, Path arg1) {
    }

    public void list(Path arg0, RelativePath.RelativeDirectory arg1, Set arg2, boolean arg3,
        ListBuffer arg4) {
    }

    public JavaFileObject getFileObject(Path arg0, RelativePath.RelativeFile arg1) {
      return null;
    }

    public void close() {
    }

    public boolean maintainsDirectoryIndex() {
      return false;
    }

    public Iterable indexedDirectories() {
      return null;
    }
  }

  static final class JRTImageContainer implements Container {
    private JRTImageContainer(JavacFileManager arg0) {
    }

    public void list(Path arg0, RelativePath.RelativeDirectory arg1, Set arg2, boolean arg3,
        ListBuffer arg4) {
    }

    public JavaFileObject getFileObject(Path arg0, RelativePath.RelativeFile arg1) {
      return null;
    }

    public void close() {
    }

    public boolean maintainsDirectoryIndex() {
      return false;
    }

    public Iterable indexedDirectories() {
      return null;
    }
  }

  static class PathAndContainer implements Comparable {
    PathAndContainer(Path arg0, Container arg1, int arg2) {
    }

    public int compareTo(PathAndContainer arg0) {
      return 0;
    }

    public boolean equals(Object arg0) {
      return false;
    }

    public int hashCode() {
      return 0;
    }

    public int compareTo(Object arg0) {
      return 0;
    }
  }

  public abstract enum SortFiles {
    FORWARD,

    REVERSE
  }
}
