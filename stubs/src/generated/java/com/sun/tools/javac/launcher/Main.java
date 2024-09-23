package com.sun.tools.javac.launcher;

import com.sun.source.util.JavacTask;
import com.sun.source.util.TaskEvent;
import com.sun.source.util.TaskListener;
import com.sun.tools.javac.util.JCDiagnostic;
import java.io.InputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.lang.Class;
import java.lang.ClassLoader;
import java.lang.Exception;
import java.lang.String;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLStreamHandler;
import java.nio.file.Path;
import java.util.Enumeration;
import java.util.List;
import java.util.Map;
import javax.tools.FileObject;
import javax.tools.ForwardingJavaFileManager;
import javax.tools.JavaFileManager;
import javax.tools.JavaFileObject;
import javax.tools.StandardJavaFileManager;

public class Main {
  public Main(PrintStream arg0) {
  }

  public Main(PrintWriter arg0) {
  }

  public static void main(String[] arg0) {
  }

  private Main checkSecurityManager() {
    return null;
  }

  public void run(String[] arg0, String[] arg1) {
  }

  private Path getFile(String[] arg0) {
    return null;
  }

  private JavaFileObject readFile(Path arg0) {
    return null;
  }

  private List getJavacOpts(String[] arg0) {
    return null;
  }

  private String compile(Path arg0, List arg1, Context arg2) {
    return null;
  }

  private void execute(String arg0, String[] arg1, Context arg2) {
  }

  private String getMessage(JCDiagnostic.Error arg0) {
    return null;
  }

  static class Context {
    Context(Path arg0) {
    }

    JavaFileManager getFileManager(StandardJavaFileManager arg0) {
      return null;
    }

    ClassLoader getClassLoader(ClassLoader arg0) {
      return null;
    }
  }

  public static class Fault extends Exception {
    Fault(Main arg0, JCDiagnostic.Error arg1) {
    }
  }

  static class MainClassListener implements TaskListener {
    MainClassListener(JavacTask arg0) {
    }

    public void started(TaskEvent arg0) {
    }
  }

  static class MemoryURLConnection extends URLConnection {
    MemoryURLConnection(URL arg0, byte[] arg1) {
    }

    public void connect() {
    }

    public InputStream getInputStream() {
      return null;
    }

    public long getContentLengthLong() {
      return 0L;
    }

    public String getContentType() {
      return null;
    }
  }

  static class MemoryURLStreamHandler extends URLStreamHandler {
    private MemoryURLStreamHandler(MemoryClassLoader arg0) {
    }

    public URLConnection openConnection(URL arg0) {
      return null;
    }
  }

  static class MemoryClassLoader extends ClassLoader {
    MemoryClassLoader(Map arg0, ClassLoader arg1, Path arg2) {
    }

    protected Class loadClass(String arg0, boolean arg1) {
      return null;
    }

    public URL getResource(String arg0) {
      return null;
    }

    public Enumeration getResources(String arg0) {
      return null;
    }

    protected Class findClass(String arg0) {
      return null;
    }

    public URL findResource(String arg0) {
      return null;
    }

    public Enumeration findResources(String arg0) {
      return null;
    }

    private String toBinaryName(String arg0) {
      return null;
    }
  }

  static class MemoryFileManager extends ForwardingJavaFileManager {
    MemoryFileManager(Map arg0, JavaFileManager arg1) {
    }

    public JavaFileObject getJavaFileForOutput(JavaFileManager.Location arg0, String arg1,
        JavaFileObject.Kind arg2, FileObject arg3) {
      return null;
    }

    private JavaFileObject createInMemoryClassFile(String arg0) {
      return null;
    }
  }
}
