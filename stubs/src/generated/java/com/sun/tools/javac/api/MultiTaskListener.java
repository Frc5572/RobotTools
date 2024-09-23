package com.sun.tools.javac.api;

import com.sun.source.util.TaskEvent;
import com.sun.source.util.TaskListener;
import com.sun.tools.javac.util.Context;
import java.lang.String;
import java.util.Collection;

public class MultiTaskListener implements TaskListener {
  protected MultiTaskListener(Context arg0) {
  }

  public static MultiTaskListener instance(Context arg0) {
    return null;
  }

  public Collection getTaskListeners() {
    return null;
  }

  public boolean isEmpty() {
    return false;
  }

  public void add(TaskListener arg0) {
  }

  public void remove(TaskListener arg0) {
  }

  public void started(TaskEvent arg0) {
  }

  public void finished(TaskEvent arg0) {
  }

  public String toString() {
    return null;
  }

  public void clear() {
  }
}
