package com.sun.tools.javac.code;

public abstract class Scope {
  public static class CompoundScope extends Scope implements ScopeListener {
  }

  static class Entry {
  }

  public static class ErrorScope extends ScopeImpl {
  }

  abstract static class SymbolImporter {
  }

  static class FilterImportScope extends Scope {
  }

  public interface ImportFilter {
  }

  public static class ImportScope extends CompoundScope {
  }

  public final enum LookupKind {
    RECURSIVE,

    NON_RECURSIVE
  }

  static class SingleEntryScope extends Scope {
  }

  public static class NamedImportScope extends ImportScope {
  }

  static class ScopeImpl extends WriteableScope {
  }

  public interface ScopeListener {
  }

  public static class ScopeListenerList {
  }

  public static class StarImportScope extends ImportScope {
  }

  public abstract static class WriteableScope extends Scope {
  }
}
