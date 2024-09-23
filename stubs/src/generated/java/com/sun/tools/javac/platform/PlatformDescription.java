package com.sun.tools.javac.platform;

import java.io.Closeable;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.tools.JavaFileManager;

public interface PlatformDescription extends Closeable {
  JavaFileManager getFileManager();

  String getSourceVersion();

  String getTargetVersion();

  List getAnnotationProcessors();

  List getPlugins();

  List getAdditionalOptions();

  void close();

  interface PluginInfo {
    String getName();

    Map getOptions();

    Object getPlugin();
  }
}
