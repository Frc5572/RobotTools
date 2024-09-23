package com.sun.tools.javac.code;

import javax.lang.model.element.ModuleElement;

public abstract class Directive implements ModuleElement.Directive {
  public static class ExportsDirective extends Directive implements ModuleElement.ExportsDirective {
  }

  public final enum ExportsFlag {
    SYNTHETIC,

    MANDATED
  }

  public static class OpensDirective extends Directive implements ModuleElement.OpensDirective {
  }

  public final enum OpensFlag {
    SYNTHETIC,

    MANDATED
  }

  public static class ProvidesDirective extends Directive implements ModuleElement.ProvidesDirective {
  }

  public static class RequiresDirective extends Directive implements ModuleElement.RequiresDirective {
  }

  public final enum RequiresFlag {
    TRANSITIVE,

    STATIC_PHASE,

    SYNTHETIC,

    MANDATED,

    EXTRA
  }

  public static class UsesDirective extends Directive implements ModuleElement.UsesDirective {
  }
}
