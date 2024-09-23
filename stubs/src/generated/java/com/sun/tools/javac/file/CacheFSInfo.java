package com.sun.tools.javac.file;

import com.sun.tools.javac.util.Context;
import java.nio.file.Path;
import java.util.List;
import java.util.Optional;

public class CacheFSInfo extends FSInfo {
  public CacheFSInfo() {
  }

  public static void preRegister(Context arg0) {
  }

  public void clearCache() {
  }

  public Path getCanonicalFile(Path arg0) {
    return null;
  }

  public boolean exists(Path arg0) {
    return false;
  }

  public boolean isDirectory(Path arg0) {
    return false;
  }

  public boolean isFile(Path arg0) {
    return false;
  }

  public List getJarClassPath(Path arg0) {
    return null;
  }

  protected Optional getAttributes(Path arg0) {
    return null;
  }

  protected Optional maybeReadAttributes(Path arg0) {
    return null;
  }

  private Path lambda$getCanonicalFile$1(Path arg0) {
    return null;
  }

  private static FSInfo lambda$preRegister$0(Context arg0) {
    return null;
  }
}
