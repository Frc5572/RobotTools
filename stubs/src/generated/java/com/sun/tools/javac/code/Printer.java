package com.sun.tools.javac.code;

import com.sun.tools.javac.api.Messages;
import com.sun.tools.javac.util.List;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;
import java.util.Locale;

public abstract class Printer implements Type.Visitor, Symbol.Visitor {
  protected Printer() {
  }

  protected abstract String localize(Locale arg0, String arg1, Object[] arg2);

  protected abstract String capturedVarId(Type.CapturedType arg0, Locale arg1);

  public static Printer createStandardPrinter(Messages arg0) {
    return null;
  }

  public String visitTypes(List arg0, Locale arg1) {
    return null;
  }

  public String visitSymbols(List arg0, Locale arg1) {
    return null;
  }

  public String visit(Type arg0, Locale arg1) {
    return null;
  }

  public String visit(Symbol arg0, Locale arg1) {
    return null;
  }

  public String visitCapturedType(Type.CapturedType arg0, Locale arg1) {
    return null;
  }

  public String visitForAll(Type.ForAll arg0, Locale arg1) {
    return null;
  }

  public String visitUndetVar(Type.UndetVar arg0, Locale arg1) {
    return null;
  }

  public String visitArrayType(Type.ArrayType arg0, Locale arg1) {
    return null;
  }

  private String printAnnotations(Type arg0) {
    return null;
  }

  private String printAnnotations(Type arg0, boolean arg1) {
    return null;
  }

  private void printBaseElementType(Type arg0, StringBuilder arg1, Locale arg2) {
  }

  private void printBrackets(Type arg0, StringBuilder arg1, Locale arg2) {
  }

  public String visitClassType(Type.ClassType arg0, Locale arg1) {
    return null;
  }

  public String visitMethodType(Type.MethodType arg0, Locale arg1) {
    return null;
  }

  public String visitPackageType(Type.PackageType arg0, Locale arg1) {
    return null;
  }

  public String visitWildcardType(Type.WildcardType arg0, Locale arg1) {
    return null;
  }

  public String visitErrorType(Type.ErrorType arg0, Locale arg1) {
    return null;
  }

  public String visitTypeVar(Type.TypeVar arg0, Locale arg1) {
    return null;
  }

  public String visitModuleType(Type.ModuleType arg0, Locale arg1) {
    return null;
  }

  public String visitType(Type arg0, Locale arg1) {
    return null;
  }

  protected String className(Type.ClassType arg0, boolean arg1, Locale arg2) {
    return null;
  }

  protected String printMethodArgs(List arg0, boolean arg1, Locale arg2) {
    return null;
  }

  public String visitClassSymbol(Symbol.ClassSymbol arg0, Locale arg1) {
    return null;
  }

  public String visitMethodSymbol(Symbol.MethodSymbol arg0, Locale arg1) {
    return null;
  }

  public String visitOperatorSymbol(Symbol.OperatorSymbol arg0, Locale arg1) {
    return null;
  }

  public String visitPackageSymbol(Symbol.PackageSymbol arg0, Locale arg1) {
    return null;
  }

  public String visitTypeSymbol(Symbol.TypeSymbol arg0, Locale arg1) {
    return null;
  }

  public String visitVarSymbol(Symbol.VarSymbol arg0, Locale arg1) {
    return null;
  }

  public String visitSymbol(Symbol arg0, Locale arg1) {
    return null;
  }

  public Object visitType(Type arg0, Object arg1) {
    return null;
  }

  public Object visitErrorType(Type.ErrorType arg0, Object arg1) {
    return null;
  }

  public Object visitUndetVar(Type.UndetVar arg0, Object arg1) {
    return null;
  }

  public Object visitForAll(Type.ForAll arg0, Object arg1) {
    return null;
  }

  public Object visitCapturedType(Type.CapturedType arg0, Object arg1) {
    return null;
  }

  public Object visitTypeVar(Type.TypeVar arg0, Object arg1) {
    return null;
  }

  public Object visitModuleType(Type.ModuleType arg0, Object arg1) {
    return null;
  }

  public Object visitPackageType(Type.PackageType arg0, Object arg1) {
    return null;
  }

  public Object visitMethodType(Type.MethodType arg0, Object arg1) {
    return null;
  }

  public Object visitArrayType(Type.ArrayType arg0, Object arg1) {
    return null;
  }

  public Object visitWildcardType(Type.WildcardType arg0, Object arg1) {
    return null;
  }

  public Object visitClassType(Type.ClassType arg0, Object arg1) {
    return null;
  }

  public Object visitSymbol(Symbol arg0, Object arg1) {
    return null;
  }

  public Object visitTypeSymbol(Symbol.TypeSymbol arg0, Object arg1) {
    return null;
  }

  public Object visitVarSymbol(Symbol.VarSymbol arg0, Object arg1) {
    return null;
  }

  public Object visitOperatorSymbol(Symbol.OperatorSymbol arg0, Object arg1) {
    return null;
  }

  public Object visitPackageSymbol(Symbol.PackageSymbol arg0, Object arg1) {
    return null;
  }

  public Object visitMethodSymbol(Symbol.MethodSymbol arg0, Object arg1) {
    return null;
  }

  public Object visitClassSymbol(Symbol.ClassSymbol arg0, Object arg1) {
    return null;
  }
}
