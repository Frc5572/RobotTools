package com.sun.tools.javac.code;

import com.sun.tools.javac.comp.Env;
import com.sun.tools.javac.jvm.PoolConstant;
import com.sun.tools.javac.util.Context;
import com.sun.tools.javac.util.JCDiagnostic;
import com.sun.tools.javac.util.List;
import com.sun.tools.javac.util.ListBuffer;
import com.sun.tools.javac.util.Name;
import com.sun.tools.javac.util.Warner;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Iterable;
import java.lang.Object;
import java.lang.RuntimeException;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.Throwable;
import java.lang.Void;
import java.util.Locale;
import java.util.Optional;
import java.util.Set;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collector;

public class Types {
  protected Types(Context arg0) {
  }

  public static Types instance(Context arg0) {
    return null;
  }

  public Type wildUpperBound(Type arg0) {
    return null;
  }

  public Type cvarUpperBound(Type arg0) {
    return null;
  }

  public Type wildLowerBound(Type arg0) {
    return null;
  }

  public Type cvarLowerBound(Type arg0) {
    return null;
  }

  public Type skipTypeVars(Type arg0, boolean arg1) {
    return null;
  }

  public Type upward(Type arg0, List arg1) {
    return null;
  }

  public List captures(Type arg0) {
    return null;
  }

  public boolean isUnbounded(Type arg0) {
    return false;
  }

  public Type asSub(Type arg0, Symbol arg1) {
    return null;
  }

  public boolean isConvertible(Type arg0, Type arg1, Warner arg2) {
    return false;
  }

  public boolean isConvertible(Type arg0, Type arg1) {
    return false;
  }

  public Symbol findDescriptorSymbol(Symbol.TypeSymbol arg0) {
    return null;
  }

  public Type findDescriptorType(Type arg0) {
    return null;
  }

  public boolean isFunctionalInterface(Symbol.TypeSymbol arg0) {
    return false;
  }

  public boolean isFunctionalInterface(Type arg0) {
    return false;
  }

  public Type removeWildcards(Type arg0) {
    return null;
  }

  public Symbol.ClassSymbol makeFunctionalInterfaceClass(Env arg0, Name arg1, Type arg2,
      long arg3) {
    return null;
  }

  public List functionalInterfaceBridges(Symbol.TypeSymbol arg0) {
    return null;
  }

  private boolean pendingBridges(Symbol.ClassSymbol arg0, Symbol.TypeSymbol arg1) {
    return false;
  }

  public boolean isSubtypeUnchecked(Type arg0, Type arg1) {
    return false;
  }

  public boolean isSubtypeUnchecked(Type arg0, Type arg1, Warner arg2) {
    return false;
  }

  private boolean isSubtypeUncheckedInternal(Type arg0, Type arg1, boolean arg2, Warner arg3) {
    return false;
  }

  private void checkUnsafeVarargsConversion(Type arg0, Type arg1, Warner arg2) {
  }

  public final boolean isSubtype(Type arg0, Type arg1) {
    return false;
  }

  public final boolean isSubtypeNoCapture(Type arg0, Type arg1) {
    return false;
  }

  public boolean isSubtype(Type arg0, Type arg1, boolean arg2) {
    return false;
  }

  public boolean isSubtypeUnchecked(Type arg0, List arg1, Warner arg2) {
    return false;
  }

  public boolean isSubtypes(List arg0, List arg1) {
    return false;
  }

  public boolean isSubtypesUnchecked(List arg0, List arg1, Warner arg2) {
    return false;
  }

  public boolean isSuperType(Type arg0, Type arg1) {
    return false;
  }

  public boolean isSameTypes(List arg0, List arg1) {
    return false;
  }

  public boolean isSignaturePolymorphic(Symbol.MethodSymbol arg0) {
    return false;
  }

  public boolean isSameType(Type arg0, Type arg1) {
    return false;
  }

  public boolean containedBy(Type arg0, Type arg1) {
    return false;
  }

  boolean containsType(List arg0, List arg1) {
    return false;
  }

  public boolean containsType(Type arg0, Type arg1) {
    return false;
  }

  public boolean isCaptureOf(Type arg0, Type.WildcardType arg1) {
    return false;
  }

  public boolean isSameWildcard(Type.WildcardType arg0, Type arg1) {
    return false;
  }

  public boolean containsTypeEquivalent(List arg0, List arg1) {
    return false;
  }

  public boolean isCastable(Type arg0, Type arg1) {
    return false;
  }

  public boolean isCastable(Type arg0, Type arg1, Warner arg2) {
    return false;
  }

  private boolean areDisjoint(Symbol.ClassSymbol arg0, Symbol.ClassSymbol arg1) {
    return false;
  }

  public boolean disjointTypes(List arg0, List arg1) {
    return false;
  }

  public boolean disjointType(Type arg0, Type arg1) {
    return false;
  }

  public List cvarLowerBounds(List arg0) {
    return null;
  }

  public boolean notSoftSubtype(Type arg0, Type arg1) {
    return false;
  }

  private Type relaxBound(Type arg0) {
    return null;
  }

  public boolean isReifiable(Type arg0) {
    return false;
  }

  public boolean isArray(Type arg0) {
    return false;
  }

  public Type elemtype(Type arg0) {
    return null;
  }

  public Type elemtypeOrType(Type arg0) {
    return null;
  }

  public int dimensions(Type arg0) {
    return 0;
  }

  public Type.ArrayType makeArrayType(Type arg0) {
    return null;
  }

  public Type asSuper(Type arg0, Symbol arg1) {
    return null;
  }

  public Type asOuterSuper(Type arg0, Symbol arg1) {
    return null;
  }

  public Type asEnclosingSuper(Type arg0, Symbol arg1) {
    return null;
  }

  public Type memberType(Type arg0, Symbol arg1) {
    return null;
  }

  public boolean isAssignable(Type arg0, Type arg1) {
    return false;
  }

  public boolean isAssignable(Type arg0, Type arg1, Warner arg2) {
    return false;
  }

  public Type erasure(Type arg0) {
    return null;
  }

  private boolean eraseNotNeeded(Type arg0) {
    return false;
  }

  private Type erasure(Type arg0, boolean arg1) {
    return null;
  }

  public List erasure(List arg0) {
    return null;
  }

  public Type erasureRecursive(Type arg0) {
    return null;
  }

  public List erasureRecursive(List arg0) {
    return null;
  }

  public Type.IntersectionClassType makeIntersectionType(List arg0) {
    return null;
  }

  public Type.IntersectionClassType makeIntersectionType(List arg0, boolean arg1) {
    return null;
  }

  public Type supertype(Type arg0) {
    return null;
  }

  public List interfaces(Type arg0) {
    return null;
  }

  public List directSupertypes(Type arg0) {
    return null;
  }

  public boolean isDirectSuperInterface(Symbol.TypeSymbol arg0, Symbol.TypeSymbol arg1) {
    return false;
  }

  public boolean isDerivedRaw(Type arg0) {
    return false;
  }

  public boolean isDerivedRawInternal(Type arg0) {
    return false;
  }

  public boolean isDerivedRaw(List arg0) {
    return false;
  }

  public void setBounds(Type.TypeVar arg0, List arg1) {
  }

  public void setBounds(Type.TypeVar arg0, List arg1, boolean arg2) {
  }

  public List getBounds(Type.TypeVar arg0) {
    return null;
  }

  public Type classBound(Type arg0) {
    return null;
  }

  public boolean isSubSignature(Type arg0, Type arg1) {
    return false;
  }

  public boolean overrideEquivalent(Type arg0, Type arg1) {
    return false;
  }

  public boolean overridesObjectMethod(Symbol.TypeSymbol arg0, Symbol arg1) {
    return false;
  }

  public Optional mergeAbstracts(List arg0, Type arg1, boolean arg2) {
    return null;
  }

  public Symbol.MethodSymbol implementation(Symbol.MethodSymbol arg0, Symbol.TypeSymbol arg1,
      boolean arg2, Predicate arg3) {
    return null;
  }

  public Scope.CompoundScope membersClosure(Type arg0, boolean arg1) {
    return null;
  }

  public Symbol.MethodSymbol firstUnimplementedAbstract(Symbol.ClassSymbol arg0) {
    return null;
  }

  private Symbol.MethodSymbol firstUnimplementedAbstractImpl(Symbol.ClassSymbol arg0,
      Symbol.ClassSymbol arg1) {
    return null;
  }

  public List interfaceCandidates(Type arg0, Symbol.MethodSymbol arg1) {
    return null;
  }

  public List prune(List arg0) {
    return null;
  }

  public boolean hasSameArgs(Type arg0, Type arg1) {
    return false;
  }

  public boolean hasSameArgs(Type arg0, Type arg1, boolean arg2) {
    return false;
  }

  private boolean hasSameArgs(Type arg0, Type arg1, TypeRelation arg2) {
    return false;
  }

  public List subst(List arg0, List arg1, List arg2) {
    return null;
  }

  public Type subst(Type arg0, List arg1, List arg2) {
    return null;
  }

  public List substBounds(List arg0, List arg1, List arg2) {
    return null;
  }

  public Type.TypeVar substBound(Type.TypeVar arg0, List arg1, List arg2) {
    return null;
  }

  public boolean hasSameBounds(Type.ForAll arg0, Type.ForAll arg1) {
    return false;
  }

  public List newInstances(List arg0) {
    return null;
  }

  public Type createMethodTypeWithParameters(Type arg0, List arg1) {
    return null;
  }

  public Type createMethodTypeWithThrown(Type arg0, List arg1) {
    return null;
  }

  public Type createMethodTypeWithReturn(Type arg0, Type arg1) {
    return null;
  }

  public Type createErrorType(Type arg0) {
    return null;
  }

  public Type createErrorType(Symbol.ClassSymbol arg0, Type arg1) {
    return null;
  }

  public Type createErrorType(Name arg0, Symbol.TypeSymbol arg1, Type arg2) {
    return null;
  }

  public int rank(Type arg0) {
    return 0;
  }

  public String toString(Type arg0, Locale arg1) {
    return null;
  }

  public String toString(Symbol arg0, Locale arg1) {
    return null;
  }

  public String toString(Type arg0) {
    return null;
  }

  private String typaramsString(List arg0) {
    return null;
  }

  private void appendTyparamString(Type.TypeVar arg0, StringBuilder arg1) {
  }

  public List closure(Type arg0) {
    return null;
  }

  public Collector closureCollector(boolean arg0, BiPredicate arg1) {
    return null;
  }

  public List insert(List arg0, Type arg1, BiPredicate arg2) {
    return null;
  }

  public List insert(List arg0, Type arg1) {
    return null;
  }

  public List union(List arg0, List arg1, BiPredicate arg2) {
    return null;
  }

  public List union(List arg0, List arg1) {
    return null;
  }

  public List intersect(List arg0, List arg1) {
    return null;
  }

  private Type merge(Type arg0, Type arg1) {
    return null;
  }

  private Type compoundMin(List arg0) {
    return null;
  }

  private List closureMin(List arg0) {
    return null;
  }

  public Type lub(List arg0) {
    return null;
  }

  public Type lub(Type[] arg0) {
    return null;
  }

  List erasedSupertypes(Type arg0) {
    return null;
  }

  private Type arraySuperType() {
    return null;
  }

  public Type glb(List arg0) {
    return null;
  }

  public Type glb(Type arg0, Type arg1) {
    return null;
  }

  private Type glbFlattened(List arg0, Type arg1) {
    return null;
  }

  public int hashCode(Type arg0) {
    return 0;
  }

  public int hashCode(Type arg0, boolean arg1) {
    return 0;
  }

  public boolean resultSubtype(Type arg0, Type arg1, Warner arg2) {
    return false;
  }

  public boolean returnTypeSubstitutable(Type arg0, Type arg1) {
    return false;
  }

  public boolean returnTypeSubstitutable(Type arg0, Type arg1, Type arg2, Warner arg3) {
    return false;
  }

  public boolean covariantReturnType(Type arg0, Type arg1, Warner arg2) {
    return false;
  }

  public Symbol.ClassSymbol boxedClass(Type arg0) {
    return null;
  }

  public Type boxedTypeOrType(Type arg0) {
    return null;
  }

  public Type unboxedType(Type arg0) {
    return null;
  }

  public Type unboxedTypeOrType(Type arg0) {
    return null;
  }

  public List capture(List arg0) {
    return null;
  }

  public Type capture(Type arg0) {
    return null;
  }

  public List freshTypeVariables(List arg0) {
    return null;
  }

  private boolean sideCast(Type arg0, Type arg1, Warner arg2) {
    return false;
  }

  private boolean sideCastFinal(Type arg0, Type arg1, Warner arg2) {
    return false;
  }

  private boolean giveWarning(Type arg0, Type arg1) {
    return false;
  }

  private List superClosure(Type arg0, Type arg1) {
    return null;
  }

  private boolean containsTypeEquivalent(Type arg0, Type arg1) {
    return false;
  }

  public void adapt(Type arg0, Type arg1, ListBuffer arg2, ListBuffer arg3) {
  }

  private void adaptSelf(Type arg0, ListBuffer arg1, ListBuffer arg2) {
  }

  private Type rewriteQuantifiers(Type arg0, boolean arg1, boolean arg2) {
    return null;
  }

  private Type.WildcardType makeExtendsWildcard(Type arg0, Type.TypeVar arg1) {
    return null;
  }

  private Type.WildcardType makeSuperWildcard(Type arg0, Type.TypeVar arg1) {
    return null;
  }

  public Attribute.RetentionPolicy getRetention(Attribute.Compound arg0) {
    return null;
  }

  public Attribute.RetentionPolicy getRetention(Symbol.TypeSymbol arg0) {
    return null;
  }

  public Type constantType(PoolConstant.LoadableConstant arg0) {
    return null;
  }

  public void newRound() {
  }

  private static boolean lambda$new$4(Type arg0, Type arg1) {
    return false;
  }

  private ClosureHolder lambda$closureCollector$3(boolean arg0, BiPredicate arg1) {
    return null;
  }

  private static String lambda$membersClosure$2(Type arg0) {
    return null;
  }

  private boolean lambda$areDisjoint$1(Symbol.ClassSymbol arg0, Type arg1) {
    return false;
  }

  private static boolean lambda$removeWildcards$0(Type arg0) {
    return false;
  }

  public static class AdaptFailure extends RuntimeException {
    public AdaptFailure() {
    }
  }

  static class Adapter extends SimpleVisitor {
    Adapter(Types arg0, ListBuffer arg1, ListBuffer arg2) {
    }

    public void adapt(Type arg0, Type arg1) {
    }

    public Void visitClassType(Type.ClassType arg0, Type arg1) {
      return null;
    }

    public Void visitArrayType(Type.ArrayType arg0, Type arg1) {
      return null;
    }

    public Void visitWildcardType(Type.WildcardType arg0, Type arg1) {
      return null;
    }

    public Void visitTypeVar(Type.TypeVar arg0, Type arg1) {
      return null;
    }

    public Void visitType(Type arg0, Type arg1) {
      return null;
    }

    private void adaptRecursive(Type arg0, Type arg1) {
    }

    private void adaptRecursive(List arg0, List arg1) {
    }

    public Object visitTypeVar(Type.TypeVar arg0, Object arg1) {
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

    public Object visitType(Type arg0, Object arg1) {
      return null;
    }
  }

  static class Entry {
    Entry(CandidatesCache arg0, Type arg1, Symbol.MethodSymbol arg2) {
    }

    public boolean equals(Object arg0) {
      return false;
    }

    public int hashCode() {
      return 0;
    }
  }

  public static class CandidatesCache {
    public CandidatesCache(Types arg0) {
    }

    public List get(CandidatesCache.Entry arg0) {
      return null;
    }

    public void put(CandidatesCache.Entry arg0, List arg1) {
    }
  }

  static class CaptureScanner extends SimpleVisitor {
    CaptureScanner(Types arg0) {
    }

    public Void visitType(Type arg0, Set arg1) {
      return null;
    }

    public Void visitClassType(Type.ClassType arg0, Set arg1) {
      return null;
    }

    public Void visitArrayType(Type.ArrayType arg0, Set arg1) {
      return null;
    }

    public Void visitWildcardType(Type.WildcardType arg0, Set arg1) {
      return null;
    }

    public Void visitTypeVar(Type.TypeVar arg0, Set arg1) {
      return null;
    }

    public Void visitCapturedType(Type.CapturedType arg0, Set arg1) {
      return null;
    }

    public Object visitCapturedType(Type.CapturedType arg0, Object arg1) {
      return null;
    }

    public Object visitTypeVar(Type.TypeVar arg0, Object arg1) {
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

    public Object visitType(Type arg0, Object arg1) {
      return null;
    }

    private void lambda$visitClassType$1(Set arg0, Type arg1) {
    }

    private void lambda$visitClassType$0(Set arg0, Type arg1) {
    }
  }

  static class ClosureHolder {
    ClosureHolder(Types arg0, boolean arg1, BiPredicate arg2) {
    }

    void add(Type arg0) {
    }

    ClosureHolder merge(ClosureHolder arg0) {
      return null;
    }

    List closure() {
      return null;
    }
  }

  public abstract static class DefaultSymbolVisitor implements Symbol.Visitor {
    public DefaultSymbolVisitor() {
    }

    public final Object visit(Symbol arg0, Object arg1) {
      return null;
    }

    public Object visitClassSymbol(Symbol.ClassSymbol arg0, Object arg1) {
      return null;
    }

    public Object visitMethodSymbol(Symbol.MethodSymbol arg0, Object arg1) {
      return null;
    }

    public Object visitOperatorSymbol(Symbol.OperatorSymbol arg0, Object arg1) {
      return null;
    }

    public Object visitPackageSymbol(Symbol.PackageSymbol arg0, Object arg1) {
      return null;
    }

    public Object visitTypeSymbol(Symbol.TypeSymbol arg0, Object arg1) {
      return null;
    }

    public Object visitVarSymbol(Symbol.VarSymbol arg0, Object arg1) {
      return null;
    }
  }

  public abstract static class DefaultTypeVisitor implements Type.Visitor {
    public DefaultTypeVisitor() {
    }

    public final Object visit(Type arg0, Object arg1) {
      return null;
    }

    public Object visitClassType(Type.ClassType arg0, Object arg1) {
      return null;
    }

    public Object visitWildcardType(Type.WildcardType arg0, Object arg1) {
      return null;
    }

    public Object visitArrayType(Type.ArrayType arg0, Object arg1) {
      return null;
    }

    public Object visitMethodType(Type.MethodType arg0, Object arg1) {
      return null;
    }

    public Object visitPackageType(Type.PackageType arg0, Object arg1) {
      return null;
    }

    public Object visitModuleType(Type.ModuleType arg0, Object arg1) {
      return null;
    }

    public Object visitTypeVar(Type.TypeVar arg0, Object arg1) {
      return null;
    }

    public Object visitCapturedType(Type.CapturedType arg0, Object arg1) {
      return null;
    }

    public Object visitForAll(Type.ForAll arg0, Object arg1) {
      return null;
    }

    public Object visitUndetVar(Type.UndetVar arg0, Object arg1) {
      return null;
    }

    public Object visitErrorType(Type.ErrorType arg0, Object arg1) {
      return null;
    }
  }

  static class Entry {
    public Entry(DescriptorCache arg0, DescriptorCache.FunctionDescriptor arg1, int arg2) {
    }

    boolean matches(int arg0) {
      return false;
    }
  }

  static class FunctionDescriptor {
    FunctionDescriptor(DescriptorCache arg0, Symbol arg1) {
    }

    public Symbol getSymbol() {
      return null;
    }

    public Type getType(Type arg0) {
      return null;
    }
  }

  static class DescriptorCache {
    DescriptorCache(Types arg0) {
    }

    DescriptorCache.FunctionDescriptor get(Symbol.TypeSymbol arg0) {
      return null;
    }

    public DescriptorCache.FunctionDescriptor findDescriptorInternal(Symbol.TypeSymbol arg0,
        Scope.CompoundScope arg1) {
      return null;
    }

    private DescriptorCache.FunctionDescriptor mergeDescriptors(Symbol.TypeSymbol arg0, List arg1) {
      return null;
    }

    FunctionDescriptorLookupError failure(String arg0, Object[] arg1) {
      return null;
    }

    FunctionDescriptorLookupError failure(JCDiagnostic arg0) {
      return null;
    }

    private DescriptorCache.1 lambda$mergeDescriptors$3(Symbol arg0) {
      return null;
    }

    private boolean lambda$findDescriptorInternal$2(Type arg0, Type arg1) {
      return false;
    }

    private Type lambda$findDescriptorInternal$1(Symbol.TypeSymbol arg0, Symbol arg1) {
      return null;
    }

    private boolean lambda$findDescriptorInternal$0(Symbol arg0, Symbol arg1) {
      return false;
    }
  }

  static class DescriptorFilter implements Predicate {
    DescriptorFilter(Types arg0, Symbol.TypeSymbol arg1) {
    }

    public boolean test(Symbol arg0) {
      return false;
    }

    public boolean test(Object arg0) {
      return false;
    }
  }

  public static class FunctionDescriptorLookupError extends RuntimeException {
    FunctionDescriptorLookupError() {
    }

    FunctionDescriptorLookupError setMessage(JCDiagnostic arg0) {
      return null;
    }

    public JCDiagnostic getDiagnostic() {
      return null;
    }

    public Throwable fillInStackTrace() {
      return null;
    }
  }

  static class HasSameArgs extends TypeRelation {
    public HasSameArgs(Types arg0, boolean arg1) {
    }

    public Boolean visitType(Type arg0, Type arg1) {
      return null;
    }

    public Boolean visitMethodType(Type.MethodType arg0, Type arg1) {
      return null;
    }

    public Boolean visitForAll(Type.ForAll arg0, Type arg1) {
      return null;
    }

    public Boolean visitErrorType(Type.ErrorType arg0, Type arg1) {
      return null;
    }

    public Object visitForAll(Type.ForAll arg0, Object arg1) {
      return null;
    }

    public Object visitErrorType(Type.ErrorType arg0, Object arg1) {
      return null;
    }

    public Object visitMethodType(Type.MethodType arg0, Object arg1) {
      return null;
    }

    public Object visitType(Type arg0, Object arg1) {
      return null;
    }
  }

  static class HashCodeVisitor extends UnaryVisitor {
    private HashCodeVisitor() {
    }

    public Integer visitType(Type arg0, Void arg1) {
      return null;
    }

    public Integer visitClassType(Type.ClassType arg0, Void arg1) {
      return null;
    }

    public Integer visitMethodType(Type.MethodType arg0, Void arg1) {
      return null;
    }

    public Integer visitWildcardType(Type.WildcardType arg0, Void arg1) {
      return null;
    }

    public Integer visitArrayType(Type.ArrayType arg0, Void arg1) {
      return null;
    }

    public Integer visitTypeVar(Type.TypeVar arg0, Void arg1) {
      return null;
    }

    public Integer visitUndetVar(Type.UndetVar arg0, Void arg1) {
      return null;
    }

    public Integer visitErrorType(Type.ErrorType arg0, Void arg1) {
      return null;
    }

    public Object visitUndetVar(Type.UndetVar arg0, Object arg1) {
      return null;
    }

    public Object visitErrorType(Type.ErrorType arg0, Object arg1) {
      return null;
    }

    public Object visitTypeVar(Type.TypeVar arg0, Object arg1) {
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

    public Object visitType(Type arg0, Object arg1) {
      return null;
    }
  }

  static class Entry {
    public Entry(ImplementationCache arg0, Symbol.MethodSymbol arg1, Predicate arg2, boolean arg3,
        int arg4) {
    }

    boolean matches(Predicate arg0, boolean arg1, int arg2) {
      return false;
    }
  }

  static class ImplementationCache {
    ImplementationCache(Types arg0) {
    }

    Symbol.MethodSymbol get(Symbol.MethodSymbol arg0, Symbol.TypeSymbol arg1, boolean arg2,
        Predicate arg3) {
      return null;
    }

    private Symbol.MethodSymbol implementationInternal(Symbol.MethodSymbol arg0,
        Symbol.TypeSymbol arg1, boolean arg2, Predicate arg3) {
      return null;
    }
  }

  public static class MapVisitor extends DefaultTypeVisitor {
    public MapVisitor() {
    }

    public final Type visit(Type arg0) {
      return null;
    }

    public Type visitType(Type arg0, Object arg1) {
      return null;
    }

    public Object visitType(Type arg0, Object arg1) {
      return null;
    }
  }

  static class MembersScope extends Scope.CompoundScope {
    public MembersScope(MembersClosureCache arg0, Scope.CompoundScope arg1) {
    }

    Predicate combine(Predicate arg0) {
      return null;
    }

    public Iterable getSymbols(Predicate arg0, Scope.LookupKind arg1) {
      return null;
    }

    public Iterable getSymbolsByName(Name arg0, Predicate arg1, Scope.LookupKind arg2) {
      return null;
    }

    public int getMark() {
      return 0;
    }

    private static boolean lambda$combine$0(Predicate arg0, Symbol arg1) {
      return false;
    }
  }

  static class MembersClosureCache extends SimpleVisitor {
    MembersClosureCache(Types arg0) {
    }

    public Scope.CompoundScope visitType(Type arg0, Void arg1) {
      return null;
    }

    public Scope.CompoundScope visitClassType(Type.ClassType arg0, Void arg1) {
      return null;
    }

    public Scope.CompoundScope visitTypeVar(Type.TypeVar arg0, Void arg1) {
      return null;
    }

    public Object visitTypeVar(Type.TypeVar arg0, Object arg1) {
      return null;
    }

    public Object visitClassType(Type.ClassType arg0, Object arg1) {
      return null;
    }

    public Object visitType(Type arg0, Object arg1) {
      return null;
    }
  }

  static class MethodFilter implements Predicate {
    MethodFilter(Types arg0, Symbol arg1, Type arg2) {
    }

    public boolean test(Symbol arg0) {
      return false;
    }

    public boolean test(Object arg0) {
      return false;
    }
  }

  public abstract enum MostSpecificReturnCheck {
    BASIC,

    RTS
  }

  abstract enum ProjectionKind {
    UPWARDS,

    DOWNWARDS
  }

  static class Rewriter extends UnaryVisitor {
    Rewriter(Types arg0, boolean arg1, boolean arg2) {
    }

    public Type visitClassType(Type.ClassType arg0, Void arg1) {
      return null;
    }

    public Type visitType(Type arg0, Void arg1) {
      return null;
    }

    public Type visitCapturedType(Type.CapturedType arg0, Void arg1) {
      return null;
    }

    public Type visitTypeVar(Type.TypeVar arg0, Void arg1) {
      return null;
    }

    public Type visitWildcardType(Type.WildcardType arg0, Void arg1) {
      return null;
    }

    private Type rewriteAsWildcardType(Type arg0, Type.TypeVar arg1, BoundKind arg2) {
      return null;
    }

    Type B(Type arg0) {
      return null;
    }

    public Object visitCapturedType(Type.CapturedType arg0, Object arg1) {
      return null;
    }

    public Object visitTypeVar(Type.TypeVar arg0, Object arg1) {
      return null;
    }

    public Object visitWildcardType(Type.WildcardType arg0, Object arg1) {
      return null;
    }

    public Object visitClassType(Type.ClassType arg0, Object arg1) {
      return null;
    }

    public Object visitType(Type arg0, Object arg1) {
      return null;
    }
  }

  public static class InvalidSignatureException extends RuntimeException {
    InvalidSignatureException(Type arg0) {
    }

    public Type type() {
      return null;
    }

    public Throwable fillInStackTrace() {
      return null;
    }
  }

  public abstract static class SignatureGenerator {
    protected SignatureGenerator(Types arg0) {
    }

    protected abstract void append(char arg0);

    protected abstract void append(byte[] arg0);

    protected abstract void append(Name arg0);

    protected void classReference(Symbol.ClassSymbol arg0) {
    }

    protected void reportIllegalSignature(Type arg0) {
    }

    public void assembleSig(Type arg0) {
    }

    public boolean hasTypeVar(List arg0) {
      return false;
    }

    public void assembleClassSig(Type arg0) {
    }

    public void assembleParamsSig(List arg0) {
    }

    public void assembleSig(List arg0) {
    }
  }

  public abstract static class SimpleVisitor extends DefaultTypeVisitor {
    public SimpleVisitor() {
    }

    public Object visitCapturedType(Type.CapturedType arg0, Object arg1) {
      return null;
    }

    public Object visitForAll(Type.ForAll arg0, Object arg1) {
      return null;
    }

    public Object visitUndetVar(Type.UndetVar arg0, Object arg1) {
      return null;
    }
  }

  static class Subst extends Type.StructuralTypeMapping {
    public Subst(Types arg0, List arg1, List arg2) {
    }

    public Type visitTypeVar(Type.TypeVar arg0, Void arg1) {
      return null;
    }

    public Type visitClassType(Type.ClassType arg0, Void arg1) {
      return null;
    }

    public Type visitWildcardType(Type.WildcardType arg0, Void arg1) {
      return null;
    }

    public Type visitForAll(Type.ForAll arg0, Void arg1) {
      return null;
    }

    public Type visitForAll(Type.ForAll arg0, Object arg1) {
      return null;
    }

    public Type visitWildcardType(Type.WildcardType arg0, Object arg1) {
      return null;
    }

    public Type visitClassType(Type.ClassType arg0, Object arg1) {
      return null;
    }

    public Object visitForAll(Type.ForAll arg0, Object arg1) {
      return null;
    }

    public Object visitTypeVar(Type.TypeVar arg0, Object arg1) {
      return null;
    }

    public Object visitWildcardType(Type.WildcardType arg0, Object arg1) {
      return null;
    }

    public Object visitClassType(Type.ClassType arg0, Object arg1) {
      return null;
    }
  }

  public static class TypeMapping extends MapVisitor implements Function {
    public TypeMapping() {
    }

    public Type apply(Type arg0) {
      return null;
    }

    List visit(List arg0, Object arg1) {
      return null;
    }

    public Type visitCapturedType(Type.CapturedType arg0, Object arg1) {
      return null;
    }

    public Object visitCapturedType(Type.CapturedType arg0, Object arg1) {
      return null;
    }

    public Object apply(Object arg0) {
      return null;
    }

    private Type lambda$visit$0(Object arg0, Type arg1) {
      return null;
    }
  }

  static class TypePair {
    TypePair(Types arg0, Type arg1, Type arg2) {
    }

    public int hashCode() {
      return 0;
    }

    public boolean equals(Object arg0) {
      return false;
    }
  }

  static class TypeArgumentProjection extends TypeMapping {
    TypeArgumentProjection(TypeProjection arg0, Type arg1, Type arg2) {
    }

    public Type visitType(Type arg0, ProjectionKind arg1) {
      return null;
    }

    public Type visitWildcardType(Type.WildcardType arg0, ProjectionKind arg1) {
      return null;
    }

    private Type makeWildcard(Type arg0, BoundKind arg1) {
      return null;
    }

    public Type visitType(Type arg0, Object arg1) {
      return null;
    }

    public Object visitWildcardType(Type.WildcardType arg0, Object arg1) {
      return null;
    }

    public Object visitType(Type arg0, Object arg1) {
      return null;
    }
  }

  static class TypeProjection extends TypeMapping {
    public TypeProjection(Types arg0, List arg1) {
    }

    public Type visitClassType(Type.ClassType arg0, ProjectionKind arg1) {
      return null;
    }

    public Type visitArrayType(Type.ArrayType arg0, ProjectionKind arg1) {
      return null;
    }

    public Type visitTypeVar(Type.TypeVar arg0, ProjectionKind arg1) {
      return null;
    }

    private Type mapTypeArgument(Type arg0, Type arg1, Type arg2, ProjectionKind arg3) {
      return null;
    }

    public Object visitTypeVar(Type.TypeVar arg0, Object arg1) {
      return null;
    }

    public Object visitArrayType(Type.ArrayType arg0, Object arg1) {
      return null;
    }

    public Object visitClassType(Type.ClassType arg0, Object arg1) {
      return null;
    }

    private Type lambda$visitClassType$0(ProjectionKind arg0, Type arg1) {
      return null;
    }
  }

  public abstract static class TypeRelation extends SimpleVisitor {
    public TypeRelation() {
    }
  }

  public abstract static class UnaryVisitor extends SimpleVisitor {
    public UnaryVisitor() {
    }

    public final Object visit(Type arg0) {
      return null;
    }
  }

  public static class UniqueType {
    public UniqueType(Type arg0, Types arg1) {
    }

    public int hashCode() {
      return 0;
    }

    public boolean equals(Object arg0) {
      return false;
    }

    public String toString() {
      return null;
    }
  }
}
