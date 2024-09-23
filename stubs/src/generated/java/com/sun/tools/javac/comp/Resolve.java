package com.sun.tools.javac.comp;

import com.sun.tools.javac.code.Symbol;
import java.lang.RuntimeException;
import java.util.LinkedHashMap;
import java.util.function.Predicate;

public class Resolve {
  static class SharedInapplicableMethodException extends InapplicableMethodException {
  }

  abstract static class AbstractMethodCheck implements MethodCheck {
  }

  static class AccessError extends InvalidSymbolError {
  }

  static class AmbiguityError extends ResolveError {
  }

  static class ArrayConstructorReferenceLookupHelper extends ReferenceLookupHelper {
  }

  static class BadClassFileError extends InvalidSymbolError {
  }

  static class BadConstructorReferenceError extends InvalidSymbolError {
  }

  static class BadMethodReferenceError extends StaticError {
  }

  static class BadRestrictedTypeError extends ResolveError {
  }

  static class BadVarargsMethod extends ResolveError {
  }

  abstract static class BasicLookupHelper extends LookupHelper {
  }

  static class ConstructorReferenceLookupHelper extends ReferenceLookupHelper {
  }

  static class DiamondError extends InapplicableSymbolError {
  }

  public static class InapplicableMethodException extends RuntimeException {
  }

  static class InapplicableSymbolError extends ResolveError {
  }

  static class MostSpecificMap extends LinkedHashMap {
  }

  static class InapplicableSymbolsError extends InapplicableSymbolError {
  }

  abstract enum InterfaceLookupPhase {
    ABSTRACT_OK,

    DEFAULT_OK
  }

  abstract static class InvalidSymbolError extends ResolveError {
  }

  static class InvisibleSymbolError extends InvalidSymbolError {
  }

  interface LogResolveHelper {
  }

  static class LookupFilter implements Predicate {
  }

  abstract static class LookupHelper {
  }

  interface MethodCheck {
  }

  abstract static class MethodCheckContext implements Check.CheckContext {
  }

  final enum MethodCheckDiag {
    ARITY_MISMATCH,

    ARG_MISMATCH,

    VARARG_MISMATCH,

    INACCESSIBLE_VARARGS
  }

  static class MethodReferenceCheck extends AbstractMethodCheck {
  }

  static class MethodReferenceLookupHelper extends ReferenceLookupHelper {
  }

  static class Candidate {
  }

  static class MethodResolutionContext {
  }

  static class ArgMismatchRewriter implements MethodResolutionDiagHelper.DiagnosticRewriter {
  }

  interface DiagnosticRewriter {
  }

  static class Template {
  }

  static class MethodResolutionDiagHelper {
  }

  enum MethodResolutionPhase {
    BASIC,

    BOX,

    VARARITY
  }

  static class MethodResultInfo extends Attr.ResultInfo {
  }

  static class MostSpecificFunctionReturnChecker extends DeferredAttr.PolyScanner {
  }

  static class MostSpecificCheckContext extends MethodCheckContext {
  }

  static class MostSpecificCheck implements MethodCheck {
  }

  public interface RecoveryLoadClass {
  }

  abstract static class ReferenceChooser {
  }

  abstract static class ReferenceLookupHelper extends LookupHelper {
  }

  final enum StaticKind {
    STATIC,

    NON_STATIC,

    BOTH,

    UNDEFINED
  }

  static class ReferenceLookupResult {
  }

  static class ResolveDeferredRecoveryMap extends DeferredAttr.RecoveryDeferredTypeMap {
  }

  abstract static class ResolveError extends Symbol {
  }

  static class StaticError extends InvalidSymbolError {
  }

  static class SymbolNotFoundError extends ResolveError {
  }

  static class UnboundMethodReferenceLookupHelper extends MethodReferenceLookupHelper {
  }

  final enum VerboseResolutionMode {
    SUCCESS,

    FAILURE,

    APPLICABLE,

    INAPPLICABLE,

    DEFERRED_INST,

    PREDEF,

    OBJECT_INIT,

    INTERNAL
  }
}
