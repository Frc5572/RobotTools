package com.sun.tools.javac.file;

import com.sun.tools.javac.util.Context;
import java.lang.CharSequence;
import java.lang.String;
import java.util.Map;
import java.util.Set;
import javax.tools.FileObject;

public class JRTIndex {
  private JRTIndex() {
  }

  public static synchronized JRTIndex getSharedInstance() {
    return null;
  }

  public static JRTIndex instance(Context arg0) {
    return null;
  }

  public static boolean isAvailable() {
    return false;
  }

  public CtSym getCtSym(CharSequence arg0) {
    return null;
  }

  synchronized Entry getEntry(RelativePath.RelativeDirectory arg0) {
    return null;
  }

  public boolean isInJRT(FileObject arg0) {
    return false;
  }

  private CtSym getCtInfo(RelativePath.RelativeDirectory arg0) {
    return null;
  }

  public static class CtSym {
    CtSym(boolean arg0, boolean arg1, String arg2) {
    }

    public String toString() {
      return null;
    }
  }

  static class Entry {
    private Entry(JRTIndex arg0, Map arg1, Set arg2, CtSym arg3) {
    }
  }
}
