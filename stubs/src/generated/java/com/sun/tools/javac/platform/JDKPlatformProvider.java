package com.sun.tools.javac.platform;

import com.sun.tools.javac.file.JavacFileManager;
import com.sun.tools.javac.jvm.Target;
import java.lang.Iterable;
import java.lang.String;
import java.nio.file.Path;
import java.util.List;
import javax.tools.ForwardingJavaFileObject;
import javax.tools.JavaFileManager;
import javax.tools.JavaFileObject;
import javax.tools.StandardJavaFileManager;

public class JDKPlatformProvider implements PlatformProvider {
  public JDKPlatformProvider() {
  }

  public Iterable getSupportedPlatformNames() {
    return null;
  }

  public PlatformDescription getPlatform(String arg0, String arg1) {
    return null;
  }

  private static String targetNumericVersion(Target arg0) {
    return null;
  }

  static Path findCtSym() {
    return null;
  }

  private static int lambda$static$0(String arg0, String arg1) {
    return 0;
  }

  static class SigJavaFileObject extends ForwardingJavaFileObject {
    public SigJavaFileObject(JavaFileObject arg0) {
    }

    public JavaFileObject.Kind getKind() {
      return null;
    }

    public boolean isNameCompatible(String arg0, JavaFileObject.Kind arg1) {
      return false;
    }

    public JavaFileObject getDelegate() {
      return null;
    }
  }

  static class PlatformDescriptionImpl implements PlatformDescription {
    PlatformDescriptionImpl(String arg0) {
    }

    public JavaFileManager getFileManager() {
      return null;
    }

    private static void setModule(StandardJavaFileManager arg0, Path arg1) {
    }

    public String getSourceVersion() {
      return null;
    }

    public String getTargetVersion() {
      return null;
    }

    public List getAnnotationProcessors() {
      return null;
    }

    public List getPlugins() {
      return null;
    }

    public List getAdditionalOptions() {
      return null;
    }

    public void close() {
    }

    private static List lambda$getFileManager$3(String arg0) {
      return null;
    }

    private static void lambda$getFileManager$2(JavacFileManager arg0, Path arg1) {
    }

    private static boolean lambda$getFileManager$1(Path arg0) {
      return false;
    }

    private static Path lambda$getFileManager$0(Path arg0, String arg1) {
      return null;
    }
  }
}
