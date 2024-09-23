package com.sun.tools.javac.util;

import com.sun.tools.javac.tree.EndPosTable;
import java.lang.String;
import javax.tools.JavaFileObject;

public class DiagnosticSource {
  public DiagnosticSource(JavaFileObject arg0, AbstractLog arg1) {
  }

  private DiagnosticSource() {
  }

  public JavaFileObject getFile() {
    return null;
  }

  public int getLineNumber(int arg0) {
    return 0;
  }

  public int getColumnNumber(int arg0, boolean arg1) {
    return 0;
  }

  public String getLine(int arg0) {
    return null;
  }

  public EndPosTable getEndPosTable() {
    return null;
  }

  public void setEndPosTable(EndPosTable arg0) {
  }

  protected boolean findLine(int arg0) {
    return false;
  }

  protected char[] initBuf(JavaFileObject arg0) {
    return null;
  }
}
