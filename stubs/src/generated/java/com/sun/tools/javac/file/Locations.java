package com.sun.tools.javac.file;

import com.sun.tools.javac.main.Option;
import com.sun.tools.javac.util.ListBuffer;
import com.sun.tools.javac.util.Log;
import com.sun.tools.javac.util.Pair;
import java.io.Closeable;
import java.lang.Iterable;
import java.lang.Object;
import java.lang.String;
import java.nio.file.Path;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.tools.JavaFileManager;
import javax.tools.StandardJavaFileManager;

public class Locations {
  Locations() {
  }

  Path getPath(String arg0, String[] arg1) {
    return null;
  }

  public void close() {
  }

  void update(Log arg0, boolean arg1, FSInfo arg2) {
  }

  void setPathFactory(StandardJavaFileManager.PathFactory arg0) {
  }

  boolean isDefaultBootClassPath() {
    return false;
  }

  boolean isDefaultSystemModulesPath() {
    return false;
  }

  private Iterable getPathEntries(String arg0) {
    return null;
  }

  private Iterable getPathEntries(String arg0, Path arg1) {
    return null;
  }

  public void setMultiReleaseValue(String arg0) {
  }

  private boolean contains(Collection arg0, Path arg1) {
    return false;
  }

  void initHandlers() {
  }

  boolean handleOption(Option arg0, String arg1) {
    return false;
  }

  boolean hasLocation(JavaFileManager.Location arg0) {
    return false;
  }

  boolean hasExplicitLocation(JavaFileManager.Location arg0) {
    return false;
  }

  Collection getLocation(JavaFileManager.Location arg0) {
    return null;
  }

  Path getOutputLocation(JavaFileManager.Location arg0) {
    return null;
  }

  void setLocation(JavaFileManager.Location arg0, Iterable arg1) {
  }

  JavaFileManager.Location getLocationForModule(JavaFileManager.Location arg0, String arg1) {
    return null;
  }

  JavaFileManager.Location getLocationForModule(JavaFileManager.Location arg0, Path arg1) {
    return null;
  }

  void setLocationForModule(JavaFileManager.Location arg0, String arg1, Iterable arg2) {
  }

  String inferModuleName(JavaFileManager.Location arg0) {
    return null;
  }

  Iterable listLocationsForModules(JavaFileManager.Location arg0) {
    return null;
  }

  boolean contains(JavaFileManager.Location arg0, Path arg1) {
    return false;
  }

  protected LocationHandler getHandler(JavaFileManager.Location arg0) {
    return null;
  }

  private boolean isArchive(Path arg0) {
    return false;
  }

  static Path normalize(Path arg0) {
    return null;
  }

  private static void lambda$close$0(ListBuffer arg0, Closeable arg1) {
  }

  abstract static class BasicLocationHandler extends LocationHandler {
    protected BasicLocationHandler(JavaFileManager.Location arg0, Option[] arg1) {
    }

    void setPathsForModule(String arg0, Iterable arg1) {
    }

    protected Path checkSingletonDirectory(Iterable arg0) {
      return null;
    }

    protected Path checkDirectory(Path arg0) {
      return null;
    }

    boolean isExplicit() {
      return false;
    }
  }

  static class BootClassPathLocationHandler extends BasicLocationHandler {
    BootClassPathLocationHandler(Locations arg0) {
    }

    boolean isDefault() {
      return false;
    }

    boolean handleOption(Option arg0, String arg1) {
      return false;
    }

    private Option canonicalize(Option arg0) {
      return null;
    }

    Collection getPaths() {
      return null;
    }

    void setPaths(Iterable arg0) {
    }

    SearchPath computePath() {
      return null;
    }

    private Collection systemClasses() {
      return null;
    }

    private void lazy() {
    }

    boolean contains(Path arg0) {
      return false;
    }
  }

  static class ClassPathLocationHandler extends SimpleLocationHandler {
    ClassPathLocationHandler(Locations arg0) {
    }

    Collection getPaths() {
      return null;
    }

    protected SearchPath computePath(String arg0) {
      return null;
    }

    protected SearchPath createPath() {
      return null;
    }

    private void lazy() {
    }
  }

  public abstract static class LocationHandler {
    protected LocationHandler() {
    }

    abstract boolean handleOption(Option arg0, String arg1);

    boolean isSet() {
      return false;
    }

    abstract boolean isExplicit();

    abstract Collection getPaths();

    abstract void setPaths(Iterable arg0);

    abstract void setPathsForModule(String arg0, Iterable arg1);

    JavaFileManager.Location getLocationForModule(String arg0) {
      return null;
    }

    JavaFileManager.Location getLocationForModule(Path arg0) {
      return null;
    }

    String inferModuleName() {
      return null;
    }

    Iterable listLocationsForModules() {
      return null;
    }

    abstract boolean contains(Path arg0);
  }

  static class ModuleLocationHandler extends LocationHandler implements JavaFileManager.Location {
    ModuleLocationHandler(Locations arg0, LocationHandler arg1, String arg2, String arg3,
        Collection arg4, boolean arg5) {
    }

    public String getName() {
      return null;
    }

    public boolean isOutputLocation() {
      return false;
    }

    boolean handleOption(Option arg0, String arg1) {
      return false;
    }

    Collection getPaths() {
      return null;
    }

    boolean isExplicit() {
      return false;
    }

    void setPaths(Iterable arg0) {
    }

    void setPathsForModule(String arg0, Iterable arg1) {
    }

    String inferModuleName() {
      return null;
    }

    boolean contains(Path arg0) {
      return false;
    }

    public String toString() {
      return null;
    }
  }

  static class ModulePathIterator implements Iterator {
    ModulePathIterator(ModulePathLocationHandler arg0) {
    }

    public boolean hasNext() {
      return false;
    }

    public Set next() {
      return null;
    }

    private Set scanDirectory(Path arg0) {
      return null;
    }

    private Set scanFile(Path arg0) {
      return null;
    }

    private Pair inferModuleName(Path arg0) {
      return null;
    }

    private String readModuleName(Path arg0) {
      return null;
    }

    public Object next() {
      return null;
    }
  }

  static class ModulePathLocationHandler extends SimpleLocationHandler {
    ModulePathLocationHandler(Locations arg0, JavaFileManager.Location arg1, Option[] arg2) {
    }

    public boolean handleOption(Option arg0, String arg1) {
      return false;
    }

    public JavaFileManager.Location getLocationForModule(String arg0) {
      return null;
    }

    public JavaFileManager.Location getLocationForModule(Path arg0) {
      return null;
    }

    Iterable listLocationsForModules() {
      return null;
    }

    boolean contains(Path arg0) {
      return false;
    }

    void setPaths(Iterable arg0) {
    }

    void setPathsForModule(String arg0, Iterable arg1) {
    }

    private List checkPaths(Iterable arg0) {
      return null;
    }

    private void initModuleLocations() {
    }

    private void checkValidModulePathEntry(Path arg0) {
    }

    private boolean isModuleName(String arg0) {
      return false;
    }

    private static Iterator lambda$listLocationsForModules$1(Iterable arg0, Iterable arg1) {
      return null;
    }

    private Iterator lambda$listLocationsForModules$0() {
      return null;
    }
  }

  static class ModuleSourcePathLocationHandler extends BasicLocationHandler {
    ModuleSourcePathLocationHandler(Locations arg0) {
    }

    boolean handleOption(Option arg0, String arg1) {
      return false;
    }

    void init(String arg0) {
    }

    void initForModule(String arg0) {
    }

    void initFromPattern(String arg0) {
    }

    private void initModuleTable(Map arg0) {
    }

    private boolean isSeparator(char arg0) {
      return false;
    }

    void add(Map arg0, Path arg1, Path arg2) {
    }

    private void expandBraces(String arg0, Collection arg1) {
    }

    int getMatchingBrace(String arg0, int arg1) {
      return 0;
    }

    boolean isSet() {
      return false;
    }

    Collection getPaths() {
      return null;
    }

    void setPaths(Iterable arg0) {
    }

    void setPathsForModule(String arg0, Iterable arg1) {
    }

    private List checkPaths(Iterable arg0) {
      return null;
    }

    JavaFileManager.Location getLocationForModule(String arg0) {
      return null;
    }

    JavaFileManager.Location getLocationForModule(Path arg0) {
      return null;
    }

    Iterable listLocationsForModules() {
      return null;
    }

    boolean contains(Path arg0) {
      return false;
    }

    private static boolean lambda$add$2(Path arg0) {
      return false;
    }

    private static boolean lambda$new$1(Path arg0) {
      return false;
    }

    private void lambda$initModuleTable$0(String arg0, List arg1) {
    }
  }

  static class ModuleTable {
    private ModuleTable(Locations arg0) {
    }

    void add(ModuleLocationHandler arg0) {
    }

    void updatePaths(ModuleLocationHandler arg0) {
    }

    ModuleLocationHandler get(String arg0) {
      return null;
    }

    ModuleLocationHandler get(Path arg0) {
      return null;
    }

    void clear() {
    }

    boolean isEmpty() {
      return false;
    }

    boolean contains(Path arg0) {
      return false;
    }

    Set locations() {
      return null;
    }

    Set explicitLocations() {
      return null;
    }

    private static ModuleLocationHandler lambda$explicitLocations$1(Map.Entry arg0) {
      return null;
    }

    private static boolean lambda$explicitLocations$0(Map.Entry arg0) {
      return false;
    }
  }

  static class OutputLocationHandler extends BasicLocationHandler {
    OutputLocationHandler(Locations arg0, JavaFileManager.Location arg1, Option[] arg2) {
    }

    boolean handleOption(Option arg0, String arg1) {
      return false;
    }

    Collection getPaths() {
      return null;
    }

    void setPaths(Iterable arg0) {
    }

    JavaFileManager.Location getLocationForModule(String arg0) {
      return null;
    }

    void setPathsForModule(String arg0, Iterable arg1) {
    }

    JavaFileManager.Location getLocationForModule(Path arg0) {
      return null;
    }

    Iterable listLocationsForModules() {
      return null;
    }

    boolean contains(Path arg0) {
      return false;
    }
  }

  static class PatchModulesLocationHandler extends BasicLocationHandler {
    PatchModulesLocationHandler(Locations arg0) {
    }

    boolean handleOption(Option arg0, String arg1) {
      return false;
    }

    boolean isSet() {
      return false;
    }

    Collection getPaths() {
      return null;
    }

    void setPaths(Iterable arg0) {
    }

    void setPathsForModule(String arg0, Iterable arg1) {
    }

    JavaFileManager.Location getLocationForModule(String arg0) {
      return null;
    }

    JavaFileManager.Location getLocationForModule(Path arg0) {
      return null;
    }

    Iterable listLocationsForModules() {
      return null;
    }

    boolean contains(Path arg0) {
      return false;
    }
  }

  static class SearchPath extends LinkedHashSet {
    private SearchPath(Locations arg0) {
    }

    public SearchPath expandJarClassPaths(boolean arg0) {
      return null;
    }

    public SearchPath emptyPathDefault(Path arg0) {
      return null;
    }

    public SearchPath addDirectories(String arg0, boolean arg1) {
      return null;
    }

    public SearchPath addDirectories(String arg0) {
      return null;
    }

    private void addDirectory(Path arg0, boolean arg1) {
    }

    public SearchPath addFiles(String arg0, boolean arg1) {
      return null;
    }

    public SearchPath addFiles(String arg0) {
      return null;
    }

    public SearchPath addFiles(Iterable arg0, boolean arg1) {
      return null;
    }

    public SearchPath addFiles(Iterable arg0) {
      return null;
    }

    public void addFile(Path arg0, boolean arg1) {
    }

    private void addJarClassPath(Path arg0, boolean arg1) {
    }

    private void lambda$addDirectory$0(boolean arg0, Path arg1) {
    }
  }

  static class SimpleLocationHandler extends BasicLocationHandler {
    SimpleLocationHandler(Locations arg0, JavaFileManager.Location arg1, Option[] arg2) {
    }

    boolean handleOption(Option arg0, String arg1) {
      return false;
    }

    Collection getPaths() {
      return null;
    }

    void setPaths(Iterable arg0) {
    }

    protected SearchPath computePath(String arg0) {
      return null;
    }

    protected SearchPath createPath() {
      return null;
    }

    boolean contains(Path arg0) {
      return false;
    }
  }

  static class SystemModulesLocationHandler extends BasicLocationHandler {
    SystemModulesLocationHandler(Locations arg0) {
    }

    boolean handleOption(Option arg0, String arg1) {
      return false;
    }

    Collection getPaths() {
      return null;
    }

    void setPaths(Iterable arg0) {
    }

    void setPathsForModule(String arg0, Iterable arg1) {
    }

    private List checkPaths(Iterable arg0) {
      return null;
    }

    private void update(Path arg0) {
    }

    private boolean isCurrentPlatform(Path arg0) {
      return false;
    }

    JavaFileManager.Location getLocationForModule(String arg0) {
      return null;
    }

    JavaFileManager.Location getLocationForModule(Path arg0) {
      return null;
    }

    Iterable listLocationsForModules() {
      return null;
    }

    boolean contains(Path arg0) {
      return false;
    }

    private void initSystemModules() {
    }

    private static boolean lambda$initSystemModules$0(Path arg0) {
      return false;
    }
  }
}
