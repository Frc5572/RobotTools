package com.sun.tools.javac.file;

import com.sun.tools.javac.util.Context;
import java.lang.String;
import java.net.URL;
import java.nio.file.Path;
import java.nio.file.spi.FileSystemProvider;
import java.util.List;

public class FSInfo {
  protected FSInfo() {
  }

  protected FSInfo(Context arg0) {
  }

  public static FSInfo instance(Context arg0) {
    return null;
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

  static URL tryResolveFile(URL arg0, String arg1) {
    return null;
  }

  public synchronized FileSystemProvider getJarFSProvider() {
    return null;
  }
}
