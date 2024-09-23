package com.sun.tools.javac.file;

import com.sun.tools.javac.main.Option;
import com.sun.tools.javac.util.Context;
import java.io.InputStream;
import java.lang.ClassLoader;
import java.lang.Object;
import java.lang.String;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.file.Path;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import javax.tools.JavaFileManager;
import javax.tools.JavaFileObject;

public abstract class BaseFileManager implements JavaFileManager {
  protected BaseFileManager(Charset arg0) {
  }

  public void setContext(Context arg0) {
  }

  protected Locations createLocations() {
    return null;
  }

  protected void deferredClose() {
  }

  synchronized void updateLastUsedTime() {
  }

  public void clear() {
  }

  protected ClassLoader getClassLoader(URL[] arg0) {
    return null;
  }

  public boolean isDefaultBootClassPath() {
    return false;
  }

  public boolean isDefaultSystemModulesPath() {
    return false;
  }

  public boolean handleOption(String arg0, Iterator arg1) {
    return false;
  }

  public int isSupportedOption(String arg0) {
    return 0;
  }

  public boolean handleOption(Option arg0, String arg1) {
    return false;
  }

  public boolean handleOptions(Map arg0) {
    return false;
  }

  private String getDefaultEncodingName() {
    return null;
  }

  public String getEncodingName() {
    return null;
  }

  public CharBuffer decode(ByteBuffer arg0, boolean arg1) {
    return null;
  }

  public CharsetDecoder getDecoder(String arg0, boolean arg1) {
    return null;
  }

  public ByteBuffer makeByteBuffer(InputStream arg0) {
    return null;
  }

  public void recycleByteBuffer(ByteBuffer arg0) {
  }

  public CharBuffer getCachedContent(JavaFileObject arg0) {
    return null;
  }

  public void cache(JavaFileObject arg0, CharBuffer arg1) {
  }

  public void flushCache(JavaFileObject arg0) {
  }

  public synchronized void resetOutputFilesWritten() {
  }

  public static JavaFileObject.Kind getKind(Path arg0) {
    return null;
  }

  public static JavaFileObject.Kind getKind(String arg0) {
    return null;
  }

  protected static Object nullCheck(Object arg0) {
    return null;
  }

  protected static Collection nullCheck(Collection arg0) {
    return null;
  }

  synchronized void newOutputToPath(Path arg0) {
  }

  private void lambda$clear$0(String arg0) {
  }

  public static class ContentCacheEntry {
    ContentCacheEntry(JavaFileObject arg0, CharBuffer arg1) {
    }

    boolean isValid(JavaFileObject arg0) {
      return false;
    }

    CharBuffer getValue() {
      return null;
    }
  }
}
