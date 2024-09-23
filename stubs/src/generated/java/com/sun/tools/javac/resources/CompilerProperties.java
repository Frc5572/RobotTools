package com.sun.tools.javac.resources;

import com.sun.tools.javac.code.Attribute;
import com.sun.tools.javac.code.Kinds;
import com.sun.tools.javac.code.Source;
import com.sun.tools.javac.code.Symbol;
import com.sun.tools.javac.code.Type;
import com.sun.tools.javac.jvm.Profile;
import com.sun.tools.javac.jvm.Target;
import com.sun.tools.javac.main.Option;
import com.sun.tools.javac.parser.Tokens;
import com.sun.tools.javac.util.JCDiagnostic;
import com.sun.tools.javac.util.Name;
import java.io.File;
import java.lang.Object;
import java.lang.String;
import java.lang.Void;
import java.net.URL;
import java.nio.file.Path;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import javax.lang.model.SourceVersion;
import javax.tools.JavaFileObject;

public class CompilerProperties {
  public CompilerProperties() {
  }

  public static class Errors {
    public Errors() {
    }

    public static JCDiagnostic.Error AbstractCantBeAccessedDirectly(Kinds.KindName arg0,
        Symbol arg1, Symbol arg2) {
      return null;
    }

    public static JCDiagnostic.Error AbstractCantBeInstantiated(Symbol arg0) {
      return null;
    }

    public static JCDiagnostic.Error AddExportsWithRelease(Symbol arg0) {
      return null;
    }

    public static JCDiagnostic.Error AddReadsWithRelease(Symbol arg0) {
      return null;
    }

    public static JCDiagnostic.Error AlreadyAnnotated(Kinds.KindName arg0, Symbol arg1) {
      return null;
    }

    public static JCDiagnostic.Error AlreadyDefined(Kinds.KindName arg0, Symbol arg1,
        Kinds.KindName arg2, Symbol arg3) {
      return null;
    }

    public static JCDiagnostic.Error AlreadyDefinedInClinit(Kinds.KindName arg0, Symbol arg1,
        Kinds.KindName arg2, Kinds.KindName arg3, Symbol arg4) {
      return null;
    }

    public static JCDiagnostic.Error AlreadyDefinedSingleImport(Symbol arg0) {
      return null;
    }

    public static JCDiagnostic.Error AlreadyDefinedStaticSingleImport(Symbol arg0) {
      return null;
    }

    public static JCDiagnostic.Error AlreadyDefinedThisUnit(Symbol arg0) {
      return null;
    }

    public static JCDiagnostic.Error AnnotationMissingDefaultValue(Type arg0, List arg1) {
      return null;
    }

    public static JCDiagnostic.Error AnnotationMissingDefaultValue1(Type arg0, List arg1) {
      return null;
    }

    public static JCDiagnostic.Error AnnotationNotValidForType(Type arg0) {
      return null;
    }

    public static JCDiagnostic.Error AnnotationTypeNotApplicableToType(Type arg0) {
      return null;
    }

    public static JCDiagnostic.Error AnnotationUnrecognizedAttributeName(Type arg0, Name arg1) {
      return null;
    }

    public static JCDiagnostic.Error AnonymousDiamondMethodDoesNotOverrideSuperclass(
        JCDiagnostic arg0) {
      return null;
    }

    public static JCDiagnostic.Error AnonymousDiamondMethodDoesNotOverrideSuperclass(
        JCDiagnostic.Fragment arg0) {
      return null;
    }

    public static JCDiagnostic.Error ArrayAndVarargs(Symbol arg0, Symbol arg1, Symbol arg2) {
      return null;
    }

    public static JCDiagnostic.Error ArrayReqButFound(Type arg0) {
      return null;
    }

    public static JCDiagnostic.Error BadFileName(String arg0) {
      return null;
    }

    public static JCDiagnostic.Error BadFunctionalIntfAnno1(JCDiagnostic arg0) {
      return null;
    }

    public static JCDiagnostic.Error BadFunctionalIntfAnno1(JCDiagnostic.Fragment arg0) {
      return null;
    }

    public static JCDiagnostic.Error BadInitializer(String arg0) {
      return null;
    }

    public static JCDiagnostic.Error BadNameForOption(Option arg0, String arg1) {
      return null;
    }

    public static JCDiagnostic.Error BadValueForOption(String arg0, String arg1) {
      return null;
    }

    public static JCDiagnostic.Error CallMustBeFirstStmtInCtor(Name arg0) {
      return null;
    }

    public static JCDiagnostic.Error CallToSuperNotAllowedInEnumCtor(Symbol arg0) {
      return null;
    }

    public static JCDiagnostic.Error CannotAssignNotDeclaredGuard(Symbol arg0) {
      return null;
    }

    public static JCDiagnostic.Error CannotGenerateClass(Symbol arg0, JCDiagnostic.Fragment arg1) {
      return null;
    }

    public static JCDiagnostic.Error CantAccess(Symbol arg0, JCDiagnostic arg1) {
      return null;
    }

    public static JCDiagnostic.Error CantAccess(Symbol arg0, JCDiagnostic.Fragment arg1) {
      return null;
    }

    public static JCDiagnostic.Error CantApplyDiamond(JCDiagnostic arg0, Void arg1) {
      return null;
    }

    public static JCDiagnostic.Error CantApplyDiamond(JCDiagnostic.Fragment arg0, Void arg1) {
      return null;
    }

    public static JCDiagnostic.Error CantApplyDiamond1(JCDiagnostic arg0, JCDiagnostic arg1) {
      return null;
    }

    public static JCDiagnostic.Error CantApplyDiamond1(JCDiagnostic arg0,
        JCDiagnostic.Fragment arg1) {
      return null;
    }

    public static JCDiagnostic.Error CantApplyDiamond1(JCDiagnostic.Fragment arg0,
        JCDiagnostic arg1) {
      return null;
    }

    public static JCDiagnostic.Error CantApplyDiamond1(JCDiagnostic.Fragment arg0,
        JCDiagnostic.Fragment arg1) {
      return null;
    }

    public static JCDiagnostic.Error CantApplyDiamond1(Type arg0, JCDiagnostic arg1) {
      return null;
    }

    public static JCDiagnostic.Error CantApplyDiamond1(Type arg0, JCDiagnostic.Fragment arg1) {
      return null;
    }

    public static JCDiagnostic.Error CantApplySymbol(Kinds.Kind arg0, Name arg1, List arg2,
        List arg3, Kinds.Kind arg4, Type arg5, JCDiagnostic arg6) {
      return null;
    }

    public static JCDiagnostic.Error CantApplySymbol(Kinds.Kind arg0, Name arg1, List arg2,
        List arg3, Kinds.Kind arg4, Type arg5, JCDiagnostic.Fragment arg6) {
      return null;
    }

    public static JCDiagnostic.Error CantApplySymbol(Kinds.Kind arg0, Name arg1, List arg2,
        JCDiagnostic arg3, Kinds.Kind arg4, Type arg5, JCDiagnostic arg6) {
      return null;
    }

    public static JCDiagnostic.Error CantApplySymbol(Kinds.Kind arg0, Name arg1, List arg2,
        JCDiagnostic arg3, Kinds.Kind arg4, Type arg5, JCDiagnostic.Fragment arg6) {
      return null;
    }

    public static JCDiagnostic.Error CantApplySymbol(Kinds.Kind arg0, Name arg1, List arg2,
        JCDiagnostic.Fragment arg3, Kinds.Kind arg4, Type arg5, JCDiagnostic arg6) {
      return null;
    }

    public static JCDiagnostic.Error CantApplySymbol(Kinds.Kind arg0, Name arg1, List arg2,
        JCDiagnostic.Fragment arg3, Kinds.Kind arg4, Type arg5, JCDiagnostic.Fragment arg6) {
      return null;
    }

    public static JCDiagnostic.Error CantApplySymbol(Kinds.Kind arg0, Name arg1, JCDiagnostic arg2,
        List arg3, Kinds.Kind arg4, Type arg5, JCDiagnostic arg6) {
      return null;
    }

    public static JCDiagnostic.Error CantApplySymbol(Kinds.Kind arg0, Name arg1, JCDiagnostic arg2,
        List arg3, Kinds.Kind arg4, Type arg5, JCDiagnostic.Fragment arg6) {
      return null;
    }

    public static JCDiagnostic.Error CantApplySymbol(Kinds.Kind arg0, Name arg1, JCDiagnostic arg2,
        JCDiagnostic arg3, Kinds.Kind arg4, Type arg5, JCDiagnostic arg6) {
      return null;
    }

    public static JCDiagnostic.Error CantApplySymbol(Kinds.Kind arg0, Name arg1, JCDiagnostic arg2,
        JCDiagnostic arg3, Kinds.Kind arg4, Type arg5, JCDiagnostic.Fragment arg6) {
      return null;
    }

    public static JCDiagnostic.Error CantApplySymbol(Kinds.Kind arg0, Name arg1, JCDiagnostic arg2,
        JCDiagnostic.Fragment arg3, Kinds.Kind arg4, Type arg5, JCDiagnostic arg6) {
      return null;
    }

    public static JCDiagnostic.Error CantApplySymbol(Kinds.Kind arg0, Name arg1, JCDiagnostic arg2,
        JCDiagnostic.Fragment arg3, Kinds.Kind arg4, Type arg5, JCDiagnostic.Fragment arg6) {
      return null;
    }

    public static JCDiagnostic.Error CantApplySymbol(Kinds.Kind arg0, Name arg1,
        JCDiagnostic.Fragment arg2, List arg3, Kinds.Kind arg4, Type arg5, JCDiagnostic arg6) {
      return null;
    }

    public static JCDiagnostic.Error CantApplySymbol(Kinds.Kind arg0, Name arg1,
        JCDiagnostic.Fragment arg2, List arg3, Kinds.Kind arg4, Type arg5,
        JCDiagnostic.Fragment arg6) {
      return null;
    }

    public static JCDiagnostic.Error CantApplySymbol(Kinds.Kind arg0, Name arg1,
        JCDiagnostic.Fragment arg2, JCDiagnostic arg3, Kinds.Kind arg4, Type arg5,
        JCDiagnostic arg6) {
      return null;
    }

    public static JCDiagnostic.Error CantApplySymbol(Kinds.Kind arg0, Name arg1,
        JCDiagnostic.Fragment arg2, JCDiagnostic arg3, Kinds.Kind arg4, Type arg5,
        JCDiagnostic.Fragment arg6) {
      return null;
    }

    public static JCDiagnostic.Error CantApplySymbol(Kinds.Kind arg0, Name arg1,
        JCDiagnostic.Fragment arg2, JCDiagnostic.Fragment arg3, Kinds.Kind arg4, Type arg5,
        JCDiagnostic arg6) {
      return null;
    }

    public static JCDiagnostic.Error CantApplySymbol(Kinds.Kind arg0, Name arg1,
        JCDiagnostic.Fragment arg2, JCDiagnostic.Fragment arg3, Kinds.Kind arg4, Type arg5,
        JCDiagnostic.Fragment arg6) {
      return null;
    }

    public static JCDiagnostic.Error CantApplySymbolNoargs(Kinds.Kind arg0, Name arg1,
        Kinds.Kind arg2, Type arg3, JCDiagnostic arg4) {
      return null;
    }

    public static JCDiagnostic.Error CantApplySymbolNoargs(Kinds.Kind arg0, Name arg1,
        Kinds.Kind arg2, Type arg3, JCDiagnostic.Fragment arg4) {
      return null;
    }

    public static JCDiagnostic.Error CantApplySymbols(Kinds.Kind arg0, Name arg1, List arg2) {
      return null;
    }

    public static JCDiagnostic.Error CantAssignValToVar(Set arg0, Symbol arg1) {
      return null;
    }

    public static JCDiagnostic.Error CantAssignValToVar(String arg0, Symbol arg1) {
      return null;
    }

    public static JCDiagnostic.Error CantDeref(Type arg0) {
      return null;
    }

    public static JCDiagnostic.Error CantInferLocalVarType(Name arg0, JCDiagnostic arg1) {
      return null;
    }

    public static JCDiagnostic.Error CantInferLocalVarType(Name arg0, JCDiagnostic.Fragment arg1) {
      return null;
    }

    public static JCDiagnostic.Error CantInheritDiffArg(Symbol arg0, String arg1, String arg2) {
      return null;
    }

    public static JCDiagnostic.Error CantInheritFromFinal(Symbol arg0) {
      return null;
    }

    public static JCDiagnostic.Error CantInheritFromSealed(Symbol arg0) {
      return null;
    }

    public static JCDiagnostic.Error CantRefBeforeCtorCalled(Symbol arg0) {
      return null;
    }

    public static JCDiagnostic.Error CantRefBeforeCtorCalled(String arg0) {
      return null;
    }

    public static JCDiagnostic.Error CantRefNonEffectivelyFinalVar(Symbol arg0, JCDiagnostic arg1) {
      return null;
    }

    public static JCDiagnostic.Error CantRefNonEffectivelyFinalVar(Symbol arg0,
        JCDiagnostic.Fragment arg1) {
      return null;
    }

    public static JCDiagnostic.Error CantResolve(Kinds.KindName arg0, Name arg1, Void arg2,
        Void arg3) {
      return null;
    }

    public static JCDiagnostic.Error CantResolveArgs(Kinds.KindName arg0, Name arg1, Void arg2,
        List arg3) {
      return null;
    }

    public static JCDiagnostic.Error CantResolveArgsParams(Kinds.KindName arg0, Name arg1,
        List arg2, List arg3) {
      return null;
    }

    public static JCDiagnostic.Error CantResolveLocation(Kinds.KindName arg0, Name arg1, Void arg2,
        Void arg3, JCDiagnostic arg4) {
      return null;
    }

    public static JCDiagnostic.Error CantResolveLocation(Kinds.KindName arg0, Name arg1, Void arg2,
        Void arg3, JCDiagnostic.Fragment arg4) {
      return null;
    }

    public static JCDiagnostic.Error CantResolveLocationArgs(Kinds.KindName arg0, Name arg1,
        Void arg2, List arg3, JCDiagnostic arg4) {
      return null;
    }

    public static JCDiagnostic.Error CantResolveLocationArgs(Kinds.KindName arg0, Name arg1,
        Void arg2, List arg3, JCDiagnostic.Fragment arg4) {
      return null;
    }

    public static JCDiagnostic.Error CantResolveLocationArgsParams(Kinds.KindName arg0, Name arg1,
        List arg2, List arg3, JCDiagnostic arg4) {
      return null;
    }

    public static JCDiagnostic.Error CantResolveLocationArgsParams(Kinds.KindName arg0, Name arg1,
        List arg2, List arg3, JCDiagnostic.Fragment arg4) {
      return null;
    }

    public static JCDiagnostic.Error CantTypeAnnotateScoping(List arg0) {
      return null;
    }

    public static JCDiagnostic.Error CantTypeAnnotateScoping1(Attribute.Compound arg0) {
      return null;
    }

    public static JCDiagnostic.Error ClashWithPkgOfSameName(Kinds.KindName arg0, Symbol arg1) {
      return null;
    }

    public static JCDiagnostic.Error ClassCantWrite(Symbol arg0, String arg1) {
      return null;
    }

    public static JCDiagnostic.Error ClassInModuleCantExtendSealedInDiffModule(Symbol arg0,
        Symbol arg1) {
      return null;
    }

    public static JCDiagnostic.Error ClassInUnnamedModuleCantExtendSealedInDiffPackage(
        Symbol arg0) {
      return null;
    }

    public static JCDiagnostic.Error ClassPublicShouldBeInFile(Kinds.KindName arg0, Name arg1) {
      return null;
    }

    public static JCDiagnostic.Error ConcreteInheritanceConflict(Symbol arg0, Type arg1,
        Symbol arg2, Type arg3, Type arg4) {
      return null;
    }

    public static JCDiagnostic.Error ConflictingExports(Symbol arg0) {
      return null;
    }

    public static JCDiagnostic.Error ConflictingExportsToModule(Symbol arg0) {
      return null;
    }

    public static JCDiagnostic.Error ConflictingOpens(Symbol arg0) {
      return null;
    }

    public static JCDiagnostic.Error ConflictingOpensToModule(Symbol arg0) {
      return null;
    }

    public static JCDiagnostic.Error ConstantLabelNotCompatible(Type arg0, Type arg1) {
      return null;
    }

    public static JCDiagnostic.Error CyclicAnnotationElement(Symbol arg0) {
      return null;
    }

    public static JCDiagnostic.Error CyclicInheritance(Symbol arg0) {
      return null;
    }

    public static JCDiagnostic.Error CyclicInheritance(Type arg0) {
      return null;
    }

    public static JCDiagnostic.Error CyclicRequires(Symbol arg0) {
      return null;
    }

    public static JCDiagnostic.Error DeconstructionPatternOnlyRecords(Symbol arg0) {
      return null;
    }

    public static JCDiagnostic.Error DefaultOverridesObjectMember(Name arg0, Kinds.KindName arg1,
        Symbol arg2) {
      return null;
    }

    public static JCDiagnostic.Error DoesNotOverrideAbstract(Symbol arg0, Symbol arg1,
        Symbol arg2) {
      return null;
    }

    public static JCDiagnostic.Error DoesntExist(Symbol arg0) {
      return null;
    }

    public static JCDiagnostic.Error DuplicateAnnotationInvalidRepeated(Type arg0) {
      return null;
    }

    public static JCDiagnostic.Error DuplicateAnnotationMemberValue(Name arg0, Type arg1) {
      return null;
    }

    public static JCDiagnostic.Error DuplicateAnnotationMissingContainer(Type arg0) {
      return null;
    }

    public static JCDiagnostic.Error DuplicateClass(Name arg0) {
      return null;
    }

    public static JCDiagnostic.Error DuplicateModule(Symbol arg0) {
      return null;
    }

    public static JCDiagnostic.Error DuplicateModuleOnPath(JCDiagnostic.Fragment arg0, Name arg1) {
      return null;
    }

    public static JCDiagnostic.Error DuplicateProvides(Symbol arg0, Symbol arg1) {
      return null;
    }

    public static JCDiagnostic.Error DuplicateRequires(Symbol arg0) {
      return null;
    }

    public static JCDiagnostic.Error DuplicateUses(Symbol arg0) {
      return null;
    }

    public static JCDiagnostic.Error EnclClassRequired(Symbol arg0) {
      return null;
    }

    public static JCDiagnostic.Error EnclosingClassTypeNonDenotable(Type arg0) {
      return null;
    }

    public static JCDiagnostic.Error ErrorReadingFile(File arg0, String arg1) {
      return null;
    }

    public static JCDiagnostic.Error ErrorReadingFile(JavaFileObject arg0, String arg1) {
      return null;
    }

    public static JCDiagnostic.Error ErrorReadingFile(Path arg0, String arg1) {
      return null;
    }

    public static JCDiagnostic.Error ErrorWritingFile(String arg0, String arg1) {
      return null;
    }

    public static JCDiagnostic.Error ExceptAlreadyCaught(Type arg0) {
      return null;
    }

    public static JCDiagnostic.Error ExceptNeverThrownInTry(Type arg0) {
      return null;
    }

    public static JCDiagnostic.Error Expected(Tokens.TokenKind arg0) {
      return null;
    }

    public static JCDiagnostic.Error ExpectedStr(String arg0) {
      return null;
    }

    public static JCDiagnostic.Error Expected2(Tokens.TokenKind arg0, Tokens.TokenKind arg1) {
      return null;
    }

    public static JCDiagnostic.Error Expected3(Tokens.TokenKind arg0, Tokens.TokenKind arg1,
        Tokens.TokenKind arg2) {
      return null;
    }

    public static JCDiagnostic.Error Expected4(Tokens.TokenKind arg0, Tokens.TokenKind arg1,
        Tokens.TokenKind arg2, String arg3) {
      return null;
    }

    public static JCDiagnostic.Error FeatureNotSupportedInSource(JCDiagnostic arg0, String arg1,
        String arg2) {
      return null;
    }

    public static JCDiagnostic.Error FeatureNotSupportedInSource(JCDiagnostic.Fragment arg0,
        String arg1, String arg2) {
      return null;
    }

    public static JCDiagnostic.Error FeatureNotSupportedInSourcePlural(JCDiagnostic arg0,
        String arg1, String arg2) {
      return null;
    }

    public static JCDiagnostic.Error FeatureNotSupportedInSourcePlural(JCDiagnostic.Fragment arg0,
        String arg1, String arg2) {
      return null;
    }

    public static JCDiagnostic.Error FileNotDirectory(String arg0) {
      return null;
    }

    public static JCDiagnostic.Error FileNotFile(Object arg0) {
      return null;
    }

    public static JCDiagnostic.Error FileNotFound(String arg0) {
      return null;
    }

    public static JCDiagnostic.Error FilePatchedAndMsp(Name arg0, Name arg1) {
      return null;
    }

    public static JCDiagnostic.Error FinalParameterMayNotBeAssigned(Symbol arg0) {
      return null;
    }

    public static JCDiagnostic.Error FirstStatementMustBeCallToAnotherConstructor(Symbol arg0) {
      return null;
    }

    public static JCDiagnostic.Error ForeachNotApplicableToType(Type arg0, JCDiagnostic arg1) {
      return null;
    }

    public static JCDiagnostic.Error ForeachNotApplicableToType(Type arg0,
        JCDiagnostic.Fragment arg1) {
      return null;
    }

    public static JCDiagnostic.Error IclsCantHaveStaticDecl(Symbol arg0) {
      return null;
    }

    public static JCDiagnostic.Error IllegalArgumentForOption(String arg0, String arg1) {
      return null;
    }

    public static JCDiagnostic.Error IllegalChar(String arg0) {
      return null;
    }

    public static JCDiagnostic.Error IllegalCharForEncoding(String arg0, String arg1) {
      return null;
    }

    public static JCDiagnostic.Error IllegalCombinationOfModifiers(Set arg0, Set arg1) {
      return null;
    }

    public static JCDiagnostic.Error IllegalDefaultSuperCall(Symbol arg0, JCDiagnostic arg1) {
      return null;
    }

    public static JCDiagnostic.Error IllegalDefaultSuperCall(Symbol arg0,
        JCDiagnostic.Fragment arg1) {
      return null;
    }

    public static JCDiagnostic.Error IllegalDefaultSuperCall(Type arg0, JCDiagnostic arg1) {
      return null;
    }

    public static JCDiagnostic.Error IllegalDefaultSuperCall(Type arg0,
        JCDiagnostic.Fragment arg1) {
      return null;
    }

    public static JCDiagnostic.Error IllegalInitializerForType(Type arg0) {
      return null;
    }

    public static JCDiagnostic.Error IllegalQualNotIcls(Symbol arg0) {
      return null;
    }

    public static JCDiagnostic.Error IllegalRecordComponentName(Symbol arg0) {
      return null;
    }

    public static JCDiagnostic.Error IllegalRefToRestrictedType(Name arg0) {
      return null;
    }

    public static JCDiagnostic.Error IllegalStaticIntfMethCall(Type arg0) {
      return null;
    }

    public static JCDiagnostic.Error ImportRequiresCanonical(Symbol arg0) {
      return null;
    }

    public static JCDiagnostic.Error IncomparableTypes(Type arg0, Type arg1) {
      return null;
    }

    public static JCDiagnostic.Error IncompatibleDiffRetSameType(Type arg0, Name arg1, List arg2) {
      return null;
    }

    public static JCDiagnostic.Error IncompatibleThrownTypesInMref(List arg0) {
      return null;
    }

    public static JCDiagnostic.Error IncorrectConstructorReceiverName(Type arg0, Type arg1) {
      return null;
    }

    public static JCDiagnostic.Error IncorrectConstructorReceiverType(Type arg0, Type arg1) {
      return null;
    }

    public static JCDiagnostic.Error IncorrectNumberOfNestedPatterns(List arg0, List arg1) {
      return null;
    }

    public static JCDiagnostic.Error IncorrectReceiverName(Type arg0, Type arg1) {
      return null;
    }

    public static JCDiagnostic.Error IncorrectReceiverType(Type arg0, Type arg1) {
      return null;
    }

    public static JCDiagnostic.Error InstanceofReifiableNotSafe(Type arg0, Type arg1) {
      return null;
    }

    public static JCDiagnostic.Error IntNumberTooLarge(String arg0) {
      return null;
    }

    public static JCDiagnostic.Error IntfAnnotationCantHaveTypeParams(Symbol arg0) {
      return null;
    }

    public static JCDiagnostic.Error IntfAnnotationMemberClash(Symbol arg0, Type arg1) {
      return null;
    }

    public static JCDiagnostic.Error InvalidAKey(String arg0) {
      return null;
    }

    public static JCDiagnostic.Error InvalidAccessorMethodInRecord(Symbol arg0,
        JCDiagnostic.Fragment arg1) {
      return null;
    }

    public static JCDiagnostic.Error InvalidCanonicalConstructorInRecord(JCDiagnostic.Fragment arg0,
        Name arg1, JCDiagnostic.Fragment arg2) {
      return null;
    }

    public static JCDiagnostic.Error InvalidFlag(String arg0) {
      return null;
    }

    public static JCDiagnostic.Error InvalidLambdaParameterDeclaration(JCDiagnostic.Fragment arg0) {
      return null;
    }

    public static JCDiagnostic.Error InvalidModuleSpecifier(String arg0) {
      return null;
    }

    public static JCDiagnostic.Error InvalidMref(Kinds.KindName arg0, JCDiagnostic arg1) {
      return null;
    }

    public static JCDiagnostic.Error InvalidMref(Kinds.KindName arg0, JCDiagnostic.Fragment arg1) {
      return null;
    }

    public static JCDiagnostic.Error InvalidPath(String arg0) {
      return null;
    }

    public static JCDiagnostic.Error InvalidPermitsClause(JCDiagnostic.Fragment arg0) {
      return null;
    }

    public static JCDiagnostic.Error InvalidProfile(String arg0) {
      return null;
    }

    public static JCDiagnostic.Error InvalidRepeatableAnnotation(Symbol arg0) {
      return null;
    }

    public static JCDiagnostic.Error InvalidRepeatableAnnotationElemNondefault(Symbol arg0,
        Symbol arg1) {
      return null;
    }

    public static JCDiagnostic.Error InvalidRepeatableAnnotationElemNondefault(Type arg0,
        Symbol arg1) {
      return null;
    }

    public static JCDiagnostic.Error InvalidRepeatableAnnotationIncompatibleTarget(Symbol arg0,
        Symbol arg1) {
      return null;
    }

    public static JCDiagnostic.Error InvalidRepeatableAnnotationInvalidValue(Type arg0) {
      return null;
    }

    public static JCDiagnostic.Error InvalidRepeatableAnnotationMultipleValues(Type arg0,
        int arg1) {
      return null;
    }

    public static JCDiagnostic.Error InvalidRepeatableAnnotationNoValue(Symbol arg0) {
      return null;
    }

    public static JCDiagnostic.Error InvalidRepeatableAnnotationNoValue(Type arg0) {
      return null;
    }

    public static JCDiagnostic.Error InvalidRepeatableAnnotationNotApplicable(Type arg0,
        Symbol arg1) {
      return null;
    }

    public static JCDiagnostic.Error InvalidRepeatableAnnotationNotApplicableInContext(Type arg0) {
      return null;
    }

    public static JCDiagnostic.Error InvalidRepeatableAnnotationNotDocumented(Symbol arg0,
        Symbol arg1) {
      return null;
    }

    public static JCDiagnostic.Error InvalidRepeatableAnnotationNotInherited(Symbol arg0,
        Symbol arg1) {
      return null;
    }

    public static JCDiagnostic.Error InvalidRepeatableAnnotationRepeatedAndContainerPresent(
        Symbol arg0) {
      return null;
    }

    public static JCDiagnostic.Error InvalidRepeatableAnnotationRetention(Symbol arg0, String arg1,
        Symbol arg2, String arg3) {
      return null;
    }

    public static JCDiagnostic.Error InvalidRepeatableAnnotationValueReturn(Symbol arg0, Type arg1,
        Type arg2) {
      return null;
    }

    public static JCDiagnostic.Error InvalidRepeatableAnnotationValueReturn(Type arg0, Type arg1,
        Type arg2) {
      return null;
    }

    public static JCDiagnostic.Error InvalidSource(String arg0) {
      return null;
    }

    public static JCDiagnostic.Error InvalidSupertypeRecord(Symbol arg0) {
      return null;
    }

    public static JCDiagnostic.Error InvalidTarget(String arg0) {
      return null;
    }

    public static JCDiagnostic.Error IsPreview(Symbol arg0) {
      return null;
    }

    public static JCDiagnostic.Error LabelAlreadyInUse(Name arg0) {
      return null;
    }

    public static JCDiagnostic.Error LimitStringOverflow(String arg0) {
      return null;
    }

    public static JCDiagnostic.Error LocalClassesCantExtendSealed(JCDiagnostic.Fragment arg0) {
      return null;
    }

    public static JCDiagnostic.Error LocnBadModuleInfo(Path arg0) {
      return null;
    }

    public static JCDiagnostic.Error LocnCantGetModuleNameForJar(Path arg0) {
      return null;
    }

    public static JCDiagnostic.Error LocnCantReadDirectory(Path arg0) {
      return null;
    }

    public static JCDiagnostic.Error LocnCantReadFile(Path arg0) {
      return null;
    }

    public static JCDiagnostic.Error LocnInvalidArgForXpatch(String arg0) {
      return null;
    }

    public static JCDiagnostic.Error LocnModuleInfoNotAllowedOnPatchPath(JavaFileObject arg0) {
      return null;
    }

    public static JCDiagnostic.Error ModNotAllowedHere(Set arg0) {
      return null;
    }

    public static JCDiagnostic.Error ModifierNotAllowedHere(Name arg0) {
      return null;
    }

    public static JCDiagnostic.Error ModuleNameMismatch(Name arg0, Name arg1) {
      return null;
    }

    public static JCDiagnostic.Error ModuleNonZeroOpens(Name arg0) {
      return null;
    }

    public static JCDiagnostic.Error ModuleNotFound(Symbol arg0) {
      return null;
    }

    public static JCDiagnostic.Error ModuleNotFoundInModuleSourcePath(String arg0) {
      return null;
    }

    public static JCDiagnostic.Error MultiModuleOutdirCannotBeExplodedModule(Path arg0) {
      return null;
    }

    public static JCDiagnostic.Error MulticatchParameterMayNotBeAssigned(Symbol arg0) {
      return null;
    }

    public static JCDiagnostic.Error MulticatchTypesMustBeDisjoint(Type arg0, Type arg1) {
      return null;
    }

    public static JCDiagnostic.Error NameClashSameErasure(Symbol arg0, Symbol arg1) {
      return null;
    }

    public static JCDiagnostic.Error NameClashSameErasureNoHide(Symbol arg0, Symbol arg1,
        Symbol arg2, Symbol arg3) {
      return null;
    }

    public static JCDiagnostic.Error NameClashSameErasureNoOverride(Name arg0, List arg1,
        Symbol arg2, Name arg3, List arg4, Symbol arg5) {
      return null;
    }

    public static JCDiagnostic.Error NameClashSameErasureNoOverride1(String arg0, Name arg1,
        Name arg2, List arg3, Symbol arg4, Name arg5, List arg6, Symbol arg7) {
      return null;
    }

    public static JCDiagnostic.Error NoAnnotationMember(Name arg0, Type arg1) {
      return null;
    }

    public static JCDiagnostic.Error NoEnclInstanceOfTypeInScope(Symbol arg0) {
      return null;
    }

    public static JCDiagnostic.Error NoSuperclass(Type arg0) {
      return null;
    }

    public static JCDiagnostic.Error NoValueForOption(String arg0) {
      return null;
    }

    public static JCDiagnostic.Error NoZipfsForArchive(Path arg0) {
      return null;
    }

    public static JCDiagnostic.Error NonStaticCantBeRef(Kinds.Kind arg0, Symbol arg1) {
      return null;
    }

    public static JCDiagnostic.Error NonSealedWithNoSealedSupertype(Symbol arg0) {
      return null;
    }

    public static JCDiagnostic.Error NotAProcessorType(Symbol arg0) {
      return null;
    }

    public static JCDiagnostic.Error NotAnnotationType(Type arg0) {
      return null;
    }

    public static JCDiagnostic.Error NotDefAccessClassIntfCantAccess(Symbol arg0, Symbol arg1) {
      return null;
    }

    public static JCDiagnostic.Error NotDefAccessClassIntfCantAccessReason(Symbol arg0, Symbol arg1,
        Symbol arg2, JCDiagnostic arg3) {
      return null;
    }

    public static JCDiagnostic.Error NotDefAccessClassIntfCantAccessReason(Symbol arg0, Symbol arg1,
        Symbol arg2, JCDiagnostic.Fragment arg3) {
      return null;
    }

    public static JCDiagnostic.Error NotDefAccessPackageCantAccess(Symbol arg0, Symbol arg1,
        JCDiagnostic arg2) {
      return null;
    }

    public static JCDiagnostic.Error NotDefAccessPackageCantAccess(Symbol arg0, Symbol arg1,
        JCDiagnostic.Fragment arg2) {
      return null;
    }

    public static JCDiagnostic.Error NotDefPublic(Symbol arg0, Symbol arg1) {
      return null;
    }

    public static JCDiagnostic.Error NotDefPublicCantAccess(Symbol arg0, Symbol arg1) {
      return null;
    }

    public static JCDiagnostic.Error NotEnclClass(Symbol arg0) {
      return null;
    }

    public static JCDiagnostic.Error NotInProfile(Symbol arg0, Object arg1) {
      return null;
    }

    public static JCDiagnostic.Error NotLoopLabel(Name arg0) {
      return null;
    }

    public static JCDiagnostic.Error NotWithinBounds(Type arg0, Type arg1) {
      return null;
    }

    public static JCDiagnostic.Error NotWithinBounds(Type arg0, Symbol arg1) {
      return null;
    }

    public static JCDiagnostic.Error OperatorCantBeApplied(Name arg0, Type arg1) {
      return null;
    }

    public static JCDiagnostic.Error OperatorCantBeApplied1(Name arg0, Type arg1, Type arg2) {
      return null;
    }

    public static JCDiagnostic.Error OptionNotAllowedWithTarget(Option arg0, Target arg1) {
      return null;
    }

    public static JCDiagnostic.Error OptionRemovedSource(String arg0, String arg1) {
      return null;
    }

    public static JCDiagnostic.Error OptionRemovedTarget(Target arg0, Target arg1) {
      return null;
    }

    public static JCDiagnostic.Error OptionTooMany(String arg0) {
      return null;
    }

    public static JCDiagnostic.Error Orphaned(Tokens.TokenKind arg0) {
      return null;
    }

    public static JCDiagnostic.Error OverrideIncompatibleRet(JCDiagnostic arg0, Type arg1,
        Type arg2) {
      return null;
    }

    public static JCDiagnostic.Error OverrideIncompatibleRet(JCDiagnostic.Fragment arg0, Type arg1,
        Type arg2) {
      return null;
    }

    public static JCDiagnostic.Error OverrideMeth(JCDiagnostic arg0, Set arg1) {
      return null;
    }

    public static JCDiagnostic.Error OverrideMeth(JCDiagnostic.Fragment arg0, Set arg1) {
      return null;
    }

    public static JCDiagnostic.Error OverrideMethDoesntThrow(JCDiagnostic arg0, Type arg1) {
      return null;
    }

    public static JCDiagnostic.Error OverrideMethDoesntThrow(JCDiagnostic.Fragment arg0,
        Type arg1) {
      return null;
    }

    public static JCDiagnostic.Error OverrideStatic(JCDiagnostic arg0) {
      return null;
    }

    public static JCDiagnostic.Error OverrideStatic(JCDiagnostic.Fragment arg0) {
      return null;
    }

    public static JCDiagnostic.Error OverrideWeakerAccess(JCDiagnostic arg0, Set arg1) {
      return null;
    }

    public static JCDiagnostic.Error OverrideWeakerAccess(JCDiagnostic arg0, String arg1) {
      return null;
    }

    public static JCDiagnostic.Error OverrideWeakerAccess(JCDiagnostic.Fragment arg0, Set arg1) {
      return null;
    }

    public static JCDiagnostic.Error OverrideWeakerAccess(JCDiagnostic.Fragment arg0, String arg1) {
      return null;
    }

    public static JCDiagnostic.Error PackageClashFromRequires(Symbol arg0, Name arg1, Symbol arg2,
        Symbol arg3) {
      return null;
    }

    public static JCDiagnostic.Error PackageClashFromRequiresInUnnamed(Name arg0, Symbol arg1,
        Symbol arg2) {
      return null;
    }

    public static JCDiagnostic.Error PackageEmptyOrNotFound(Symbol arg0) {
      return null;
    }

    public static JCDiagnostic.Error PackageInOtherModule(Symbol arg0) {
      return null;
    }

    public static JCDiagnostic.Error PackageNotVisible(Symbol arg0, JCDiagnostic arg1) {
      return null;
    }

    public static JCDiagnostic.Error PackageNotVisible(Symbol arg0, JCDiagnostic.Fragment arg1) {
      return null;
    }

    public static JCDiagnostic.Error PkgClashesWithClassOfSameName(Symbol arg0) {
      return null;
    }

    public static JCDiagnostic.Error PluginNotFound(String arg0) {
      return null;
    }

    public static JCDiagnostic.Error PreviewFeatureDisabled(JCDiagnostic arg0) {
      return null;
    }

    public static JCDiagnostic.Error PreviewFeatureDisabled(JCDiagnostic.Fragment arg0) {
      return null;
    }

    public static JCDiagnostic.Error PreviewFeatureDisabledClassfile(JavaFileObject arg0,
        String arg1) {
      return null;
    }

    public static JCDiagnostic.Error PreviewFeatureDisabledPlural(JCDiagnostic arg0) {
      return null;
    }

    public static JCDiagnostic.Error PreviewFeatureDisabledPlural(JCDiagnostic.Fragment arg0) {
      return null;
    }

    public static JCDiagnostic.Error PreviewNotLatest(String arg0, Source arg1) {
      return null;
    }

    public static JCDiagnostic.Error ProbFoundReq(JCDiagnostic arg0) {
      return null;
    }

    public static JCDiagnostic.Error ProbFoundReq(JCDiagnostic.Fragment arg0) {
      return null;
    }

    public static JCDiagnostic.Error ProcBadConfigFile(String arg0) {
      return null;
    }

    public static JCDiagnostic.Error ProcCantAccess(Symbol arg0, JCDiagnostic arg1, String arg2) {
      return null;
    }

    public static JCDiagnostic.Error ProcCantAccess(Symbol arg0, JCDiagnostic.Fragment arg1,
        String arg2) {
      return null;
    }

    public static JCDiagnostic.Error ProcCantAccess1(Symbol arg0, JCDiagnostic arg1) {
      return null;
    }

    public static JCDiagnostic.Error ProcCantAccess1(Symbol arg0, JCDiagnostic.Fragment arg1) {
      return null;
    }

    public static JCDiagnostic.Error ProcCantFindClass(String arg0) {
      return null;
    }

    public static JCDiagnostic.Error ProcCantLoadClass(String arg0) {
      return null;
    }

    public static JCDiagnostic.Error ProcMessager(String arg0) {
      return null;
    }

    public static JCDiagnostic.Error ProcNoExplicitAnnotationProcessingRequested(Collection arg0) {
      return null;
    }

    public static JCDiagnostic.Error ProcProcessorBadOptionName(String arg0, String arg1) {
      return null;
    }

    public static JCDiagnostic.Error ProcProcessorCantInstantiate(String arg0) {
      return null;
    }

    public static JCDiagnostic.Error ProcProcessorNotFound(String arg0) {
      return null;
    }

    public static JCDiagnostic.Error ProcProcessorWrongType(String arg0) {
      return null;
    }

    public static JCDiagnostic.Error ProcessorTypeCannotBeARawType(Symbol arg0) {
      return null;
    }

    public static JCDiagnostic.Error QualifiedNewOfStaticClass(Symbol arg0) {
      return null;
    }

    public static JCDiagnostic.Error RefAmbiguous(Name arg0, Kinds.Kind arg1, Symbol arg2,
        Symbol arg3, Kinds.Kind arg4, Symbol arg5, Symbol arg6) {
      return null;
    }

    public static JCDiagnostic.Error ReleaseBootclasspathConflict(Option arg0) {
      return null;
    }

    public static JCDiagnostic.Error RepeatedProvidesForService(Symbol arg0) {
      return null;
    }

    public static JCDiagnostic.Error RepeatedValueForModuleSourcePath(String arg0) {
      return null;
    }

    public static JCDiagnostic.Error RepeatedValueForPatchModule(String arg0) {
      return null;
    }

    public static JCDiagnostic.Error ReportAccess(Symbol arg0, Set arg1, Symbol arg2) {
      return null;
    }

    public static JCDiagnostic.Error ReqArg(String arg0) {
      return null;
    }

    public static JCDiagnostic.Error RestrictedTypeNotAllowed(Name arg0, Source arg1) {
      return null;
    }

    public static JCDiagnostic.Error RestrictedTypeNotAllowedArray(Name arg0) {
      return null;
    }

    public static JCDiagnostic.Error RestrictedTypeNotAllowedCompound(Name arg0) {
      return null;
    }

    public static JCDiagnostic.Error RestrictedTypeNotAllowedHere(Name arg0) {
      return null;
    }

    public static JCDiagnostic.Error SameBinaryName(Name arg0, Name arg1) {
      return null;
    }

    public static JCDiagnostic.Error SelectorTypeNotAllowed(Type arg0) {
      return null;
    }

    public static JCDiagnostic.Error ServiceDefinitionIsEnum(Symbol arg0) {
      return null;
    }

    public static JCDiagnostic.Error ServiceImplementationDoesntHaveANoArgsConstructor(
        Symbol arg0) {
      return null;
    }

    public static JCDiagnostic.Error ServiceImplementationIsAbstract(Symbol arg0) {
      return null;
    }

    public static JCDiagnostic.Error ServiceImplementationIsInner(Symbol arg0) {
      return null;
    }

    public static JCDiagnostic.Error ServiceImplementationNoArgsConstructorNotPublic(Symbol arg0) {
      return null;
    }

    public static JCDiagnostic.Error ServiceImplementationNotInRightModule(Symbol arg0) {
      return null;
    }

    public static JCDiagnostic.Error SourceCantOverwriteInputFile(JavaFileObject arg0) {
      return null;
    }

    public static JCDiagnostic.Error StackSimError(Symbol arg0) {
      return null;
    }

    public static JCDiagnostic.Error TooManyPatchedModules(Set arg0) {
      return null;
    }

    public static JCDiagnostic.Error TryResourceMayNotBeAssigned(Symbol arg0) {
      return null;
    }

    public static JCDiagnostic.Error TryWithResourcesExprEffectivelyFinalVar(Symbol arg0) {
      return null;
    }

    public static JCDiagnostic.Error TwoClassLoaders2(URL arg0, URL arg1) {
      return null;
    }

    public static JCDiagnostic.Error TypeDoesntTakeParams(Symbol arg0) {
      return null;
    }

    public static JCDiagnostic.Error TypeFoundReq(Object arg0, JCDiagnostic arg1) {
      return null;
    }

    public static JCDiagnostic.Error TypeFoundReq(Object arg0, JCDiagnostic.Fragment arg1) {
      return null;
    }

    public static JCDiagnostic.Error TypesIncompatible(Type arg0, Type arg1,
        JCDiagnostic.Fragment arg2) {
      return null;
    }

    public static JCDiagnostic.Error UndefLabel(Name arg0) {
      return null;
    }

    public static JCDiagnostic.Error UnexpectedType(Set arg0, Set arg1) {
      return null;
    }

    public static JCDiagnostic.Error UnmatchedQuote(String arg0) {
      return null;
    }

    public static JCDiagnostic.Error UnreportedExceptionDefaultConstructor(Type arg0) {
      return null;
    }

    public static JCDiagnostic.Error UnreportedExceptionImplicitClose(Type arg0, Name arg1) {
      return null;
    }

    public static JCDiagnostic.Error UnreportedExceptionNeedToCatchOrThrow(Type arg0) {
      return null;
    }

    public static JCDiagnostic.Error UnsupportedEncoding(String arg0) {
      return null;
    }

    public static JCDiagnostic.Error UnsupportedReleaseVersion(String arg0) {
      return null;
    }

    public static JCDiagnostic.Error VarMightAlreadyBeAssigned(Symbol arg0) {
      return null;
    }

    public static JCDiagnostic.Error VarMightBeAssignedInLoop(Symbol arg0) {
      return null;
    }

    public static JCDiagnostic.Error VarMightNotHaveBeenInitialized(Symbol arg0) {
      return null;
    }

    public static JCDiagnostic.Error VarNotInitializedInDefaultConstructor(Symbol arg0) {
      return null;
    }

    public static JCDiagnostic.Error VarargsInvalidTrustmeAnno(Symbol arg0, JCDiagnostic arg1) {
      return null;
    }

    public static JCDiagnostic.Error VarargsInvalidTrustmeAnno(Symbol arg0,
        JCDiagnostic.Fragment arg1) {
      return null;
    }

    public static JCDiagnostic.Error WrongNumberTypeArgs(String arg0) {
      return null;
    }
  }

  public static class Fragments {
    public Fragments() {
    }

    public static JCDiagnostic.Fragment AccessorReturnTypeDoesntMatch(Symbol arg0, Symbol arg1) {
      return null;
    }

    public static JCDiagnostic.Fragment AnachronisticModuleInfo(String arg0, String arg1) {
      return null;
    }

    public static JCDiagnostic.Fragment AnonymousClass(Name arg0) {
      return null;
    }

    public static JCDiagnostic.Fragment ApplicableMethodFound(int arg0, Symbol arg1, Void arg2) {
      return null;
    }

    public static JCDiagnostic.Fragment ApplicableMethodFound1(int arg0, Symbol arg1,
        JCDiagnostic arg2) {
      return null;
    }

    public static JCDiagnostic.Fragment ApplicableMethodFound1(int arg0, Symbol arg1,
        JCDiagnostic.Fragment arg2) {
      return null;
    }

    public static JCDiagnostic.Fragment ApplicableMethodFound2(int arg0, JCDiagnostic.Fragment arg1,
        Symbol arg2) {
      return null;
    }

    public static JCDiagnostic.Fragment ApplicableMethodFound3(int arg0, JCDiagnostic.Fragment arg1,
        Symbol arg2, JCDiagnostic arg3) {
      return null;
    }

    public static JCDiagnostic.Fragment ApplicableMethodFound3(int arg0, JCDiagnostic.Fragment arg1,
        Symbol arg2, JCDiagnostic.Fragment arg3) {
      return null;
    }

    public static JCDiagnostic.Fragment BadClassFile(Name arg0) {
      return null;
    }

    public static JCDiagnostic.Fragment BadClassFileHeader(File arg0, JCDiagnostic arg1) {
      return null;
    }

    public static JCDiagnostic.Fragment BadClassFileHeader(File arg0, JCDiagnostic.Fragment arg1) {
      return null;
    }

    public static JCDiagnostic.Fragment BadClassFileHeader(JavaFileObject arg0, JCDiagnostic arg1) {
      return null;
    }

    public static JCDiagnostic.Fragment BadClassFileHeader(JavaFileObject arg0,
        JCDiagnostic.Fragment arg1) {
      return null;
    }

    public static JCDiagnostic.Fragment BadClassFileHeader(Path arg0, JCDiagnostic arg1) {
      return null;
    }

    public static JCDiagnostic.Fragment BadClassFileHeader(Path arg0, JCDiagnostic.Fragment arg1) {
      return null;
    }

    public static JCDiagnostic.Fragment BadClassTruncatedAtOffset(int arg0) {
      return null;
    }

    public static JCDiagnostic.Fragment BadConstPoolEntry(File arg0, String arg1, int arg2) {
      return null;
    }

    public static JCDiagnostic.Fragment BadConstPoolEntry(JavaFileObject arg0, String arg1,
        int arg2) {
      return null;
    }

    public static JCDiagnostic.Fragment BadConstPoolEntry(Path arg0, String arg1, int arg2) {
      return null;
    }

    public static JCDiagnostic.Fragment BadConstPoolIndex(File arg0, int arg1, int arg2) {
      return null;
    }

    public static JCDiagnostic.Fragment BadConstPoolIndex(JavaFileObject arg0, int arg1, int arg2) {
      return null;
    }

    public static JCDiagnostic.Fragment BadConstPoolIndex(Path arg0, int arg1, int arg2) {
      return null;
    }

    public static JCDiagnostic.Fragment BadConstantRange(String arg0, Symbol arg1, Type arg2) {
      return null;
    }

    public static JCDiagnostic.Fragment BadConstantValue(String arg0, Symbol arg1, String arg2) {
      return null;
    }

    public static JCDiagnostic.Fragment BadConstantValueType(Type arg0) {
      return null;
    }

    public static JCDiagnostic.Fragment BadEnclosingMethod(Symbol arg0) {
      return null;
    }

    public static JCDiagnostic.Fragment BadInstanceMethodInUnboundLookup(Kinds.Kind arg0,
        Symbol arg1) {
      return null;
    }

    public static JCDiagnostic.Fragment BadIntersectionTargetForFunctionalExpr(JCDiagnostic arg0) {
      return null;
    }

    public static JCDiagnostic.Fragment BadIntersectionTargetForFunctionalExpr(
        JCDiagnostic.Fragment arg0) {
      return null;
    }

    public static JCDiagnostic.Fragment BadSourceFileHeader(File arg0, JCDiagnostic arg1) {
      return null;
    }

    public static JCDiagnostic.Fragment BadSourceFileHeader(File arg0, JCDiagnostic.Fragment arg1) {
      return null;
    }

    public static JCDiagnostic.Fragment BadSourceFileHeader(JavaFileObject arg0,
        JCDiagnostic arg1) {
      return null;
    }

    public static JCDiagnostic.Fragment BadSourceFileHeader(JavaFileObject arg0,
        JCDiagnostic.Fragment arg1) {
      return null;
    }

    public static JCDiagnostic.Fragment BadSourceFileHeader(Path arg0, JCDiagnostic arg1) {
      return null;
    }

    public static JCDiagnostic.Fragment BadSourceFileHeader(Path arg0, JCDiagnostic.Fragment arg1) {
      return null;
    }

    public static JCDiagnostic.Fragment BadStaticMethodInBoundLookup(Kinds.Kind arg0, Symbol arg1) {
      return null;
    }

    public static JCDiagnostic.Fragment BadStaticMethodInUnboundLookup(Kinds.Kind arg0,
        Symbol arg1) {
      return null;
    }

    public static JCDiagnostic.Fragment BadUtf8ByteSequenceAt(int arg0) {
      return null;
    }

    public static JCDiagnostic.Fragment CanonicalMustNotHaveStrongerAccess(Set arg0) {
      return null;
    }

    public static JCDiagnostic.Fragment CanonicalMustNotHaveStrongerAccess(String arg0) {
      return null;
    }

    public static JCDiagnostic.Fragment CantAccessInnerClsConstr(Symbol arg0, List arg1,
        Type arg2) {
      return null;
    }

    public static JCDiagnostic.Fragment CantApplyArrayCtor(List arg0, List arg1,
        JCDiagnostic arg2) {
      return null;
    }

    public static JCDiagnostic.Fragment CantApplyArrayCtor(List arg0, List arg1,
        JCDiagnostic.Fragment arg2) {
      return null;
    }

    public static JCDiagnostic.Fragment CantApplyArrayCtor(List arg0, JCDiagnostic arg1,
        JCDiagnostic arg2) {
      return null;
    }

    public static JCDiagnostic.Fragment CantApplyArrayCtor(List arg0, JCDiagnostic arg1,
        JCDiagnostic.Fragment arg2) {
      return null;
    }

    public static JCDiagnostic.Fragment CantApplyArrayCtor(List arg0, JCDiagnostic.Fragment arg1,
        JCDiagnostic arg2) {
      return null;
    }

    public static JCDiagnostic.Fragment CantApplyArrayCtor(List arg0, JCDiagnostic.Fragment arg1,
        JCDiagnostic.Fragment arg2) {
      return null;
    }

    public static JCDiagnostic.Fragment CantApplyArrayCtor(JCDiagnostic arg0, List arg1,
        JCDiagnostic arg2) {
      return null;
    }

    public static JCDiagnostic.Fragment CantApplyArrayCtor(JCDiagnostic arg0, List arg1,
        JCDiagnostic.Fragment arg2) {
      return null;
    }

    public static JCDiagnostic.Fragment CantApplyArrayCtor(JCDiagnostic arg0, JCDiagnostic arg1,
        JCDiagnostic arg2) {
      return null;
    }

    public static JCDiagnostic.Fragment CantApplyArrayCtor(JCDiagnostic arg0, JCDiagnostic arg1,
        JCDiagnostic.Fragment arg2) {
      return null;
    }

    public static JCDiagnostic.Fragment CantApplyArrayCtor(JCDiagnostic arg0,
        JCDiagnostic.Fragment arg1, JCDiagnostic arg2) {
      return null;
    }

    public static JCDiagnostic.Fragment CantApplyArrayCtor(JCDiagnostic arg0,
        JCDiagnostic.Fragment arg1, JCDiagnostic.Fragment arg2) {
      return null;
    }

    public static JCDiagnostic.Fragment CantApplyArrayCtor(JCDiagnostic.Fragment arg0, List arg1,
        JCDiagnostic arg2) {
      return null;
    }

    public static JCDiagnostic.Fragment CantApplyArrayCtor(JCDiagnostic.Fragment arg0, List arg1,
        JCDiagnostic.Fragment arg2) {
      return null;
    }

    public static JCDiagnostic.Fragment CantApplyArrayCtor(JCDiagnostic.Fragment arg0,
        JCDiagnostic arg1, JCDiagnostic arg2) {
      return null;
    }

    public static JCDiagnostic.Fragment CantApplyArrayCtor(JCDiagnostic.Fragment arg0,
        JCDiagnostic arg1, JCDiagnostic.Fragment arg2) {
      return null;
    }

    public static JCDiagnostic.Fragment CantApplyArrayCtor(JCDiagnostic.Fragment arg0,
        JCDiagnostic.Fragment arg1, JCDiagnostic arg2) {
      return null;
    }

    public static JCDiagnostic.Fragment CantApplyArrayCtor(JCDiagnostic.Fragment arg0,
        JCDiagnostic.Fragment arg1, JCDiagnostic.Fragment arg2) {
      return null;
    }

    public static JCDiagnostic.Fragment CantApplyDiamond1(JCDiagnostic arg0, JCDiagnostic arg1) {
      return null;
    }

    public static JCDiagnostic.Fragment CantApplyDiamond1(JCDiagnostic arg0,
        JCDiagnostic.Fragment arg1) {
      return null;
    }

    public static JCDiagnostic.Fragment CantApplyDiamond1(JCDiagnostic.Fragment arg0,
        JCDiagnostic arg1) {
      return null;
    }

    public static JCDiagnostic.Fragment CantApplyDiamond1(JCDiagnostic.Fragment arg0,
        JCDiagnostic.Fragment arg1) {
      return null;
    }

    public static JCDiagnostic.Fragment CantApplyDiamond1(Type arg0, JCDiagnostic arg1) {
      return null;
    }

    public static JCDiagnostic.Fragment CantApplyDiamond1(Type arg0, JCDiagnostic.Fragment arg1) {
      return null;
    }

    public static JCDiagnostic.Fragment CantApplySymbol(Kinds.Kind arg0, Name arg1, List arg2,
        List arg3, Kinds.Kind arg4, Type arg5, JCDiagnostic arg6) {
      return null;
    }

    public static JCDiagnostic.Fragment CantApplySymbol(Kinds.Kind arg0, Name arg1, List arg2,
        List arg3, Kinds.Kind arg4, Type arg5, JCDiagnostic.Fragment arg6) {
      return null;
    }

    public static JCDiagnostic.Fragment CantApplySymbol(Kinds.Kind arg0, Name arg1, List arg2,
        JCDiagnostic arg3, Kinds.Kind arg4, Type arg5, JCDiagnostic arg6) {
      return null;
    }

    public static JCDiagnostic.Fragment CantApplySymbol(Kinds.Kind arg0, Name arg1, List arg2,
        JCDiagnostic arg3, Kinds.Kind arg4, Type arg5, JCDiagnostic.Fragment arg6) {
      return null;
    }

    public static JCDiagnostic.Fragment CantApplySymbol(Kinds.Kind arg0, Name arg1, List arg2,
        JCDiagnostic.Fragment arg3, Kinds.Kind arg4, Type arg5, JCDiagnostic arg6) {
      return null;
    }

    public static JCDiagnostic.Fragment CantApplySymbol(Kinds.Kind arg0, Name arg1, List arg2,
        JCDiagnostic.Fragment arg3, Kinds.Kind arg4, Type arg5, JCDiagnostic.Fragment arg6) {
      return null;
    }

    public static JCDiagnostic.Fragment CantApplySymbol(Kinds.Kind arg0, Name arg1,
        JCDiagnostic arg2, List arg3, Kinds.Kind arg4, Type arg5, JCDiagnostic arg6) {
      return null;
    }

    public static JCDiagnostic.Fragment CantApplySymbol(Kinds.Kind arg0, Name arg1,
        JCDiagnostic arg2, List arg3, Kinds.Kind arg4, Type arg5, JCDiagnostic.Fragment arg6) {
      return null;
    }

    public static JCDiagnostic.Fragment CantApplySymbol(Kinds.Kind arg0, Name arg1,
        JCDiagnostic arg2, JCDiagnostic arg3, Kinds.Kind arg4, Type arg5, JCDiagnostic arg6) {
      return null;
    }

    public static JCDiagnostic.Fragment CantApplySymbol(Kinds.Kind arg0, Name arg1,
        JCDiagnostic arg2, JCDiagnostic arg3, Kinds.Kind arg4, Type arg5,
        JCDiagnostic.Fragment arg6) {
      return null;
    }

    public static JCDiagnostic.Fragment CantApplySymbol(Kinds.Kind arg0, Name arg1,
        JCDiagnostic arg2, JCDiagnostic.Fragment arg3, Kinds.Kind arg4, Type arg5,
        JCDiagnostic arg6) {
      return null;
    }

    public static JCDiagnostic.Fragment CantApplySymbol(Kinds.Kind arg0, Name arg1,
        JCDiagnostic arg2, JCDiagnostic.Fragment arg3, Kinds.Kind arg4, Type arg5,
        JCDiagnostic.Fragment arg6) {
      return null;
    }

    public static JCDiagnostic.Fragment CantApplySymbol(Kinds.Kind arg0, Name arg1,
        JCDiagnostic.Fragment arg2, List arg3, Kinds.Kind arg4, Type arg5, JCDiagnostic arg6) {
      return null;
    }

    public static JCDiagnostic.Fragment CantApplySymbol(Kinds.Kind arg0, Name arg1,
        JCDiagnostic.Fragment arg2, List arg3, Kinds.Kind arg4, Type arg5,
        JCDiagnostic.Fragment arg6) {
      return null;
    }

    public static JCDiagnostic.Fragment CantApplySymbol(Kinds.Kind arg0, Name arg1,
        JCDiagnostic.Fragment arg2, JCDiagnostic arg3, Kinds.Kind arg4, Type arg5,
        JCDiagnostic arg6) {
      return null;
    }

    public static JCDiagnostic.Fragment CantApplySymbol(Kinds.Kind arg0, Name arg1,
        JCDiagnostic.Fragment arg2, JCDiagnostic arg3, Kinds.Kind arg4, Type arg5,
        JCDiagnostic.Fragment arg6) {
      return null;
    }

    public static JCDiagnostic.Fragment CantApplySymbol(Kinds.Kind arg0, Name arg1,
        JCDiagnostic.Fragment arg2, JCDiagnostic.Fragment arg3, Kinds.Kind arg4, Type arg5,
        JCDiagnostic arg6) {
      return null;
    }

    public static JCDiagnostic.Fragment CantApplySymbol(Kinds.Kind arg0, Name arg1,
        JCDiagnostic.Fragment arg2, JCDiagnostic.Fragment arg3, Kinds.Kind arg4, Type arg5,
        JCDiagnostic.Fragment arg6) {
      return null;
    }

    public static JCDiagnostic.Fragment CantApplySymbols(Kinds.Kind arg0, Name arg1, List arg2) {
      return null;
    }

    public static JCDiagnostic.Fragment CantHide(Symbol arg0, Symbol arg1, Symbol arg2,
        Symbol arg3) {
      return null;
    }

    public static JCDiagnostic.Fragment CantImplement(Symbol arg0, Symbol arg1, Symbol arg2,
        Symbol arg3) {
      return null;
    }

    public static JCDiagnostic.Fragment CantOverride(Symbol arg0, Symbol arg1, Symbol arg2,
        Symbol arg3) {
      return null;
    }

    public static JCDiagnostic.Fragment CantResolveArgs(Kinds.KindName arg0, Name arg1, Void arg2,
        List arg3) {
      return null;
    }

    public static JCDiagnostic.Fragment CantResolveLocationArgs(Kinds.KindName arg0, Name arg1,
        Void arg2, List arg3, JCDiagnostic arg4) {
      return null;
    }

    public static JCDiagnostic.Fragment CantResolveLocationArgs(Kinds.KindName arg0, Name arg1,
        Void arg2, List arg3, JCDiagnostic.Fragment arg4) {
      return null;
    }

    public static JCDiagnostic.Fragment CantResolveLocationArgsParams(Kinds.KindName arg0,
        Name arg1, List arg2, List arg3, JCDiagnostic arg4) {
      return null;
    }

    public static JCDiagnostic.Fragment CantResolveLocationArgsParams(Kinds.KindName arg0,
        Name arg1, List arg2, List arg3, JCDiagnostic.Fragment arg4) {
      return null;
    }

    public static JCDiagnostic.Fragment CapturedType(int arg0) {
      return null;
    }

    public static JCDiagnostic.Fragment ClashesWith(Symbol arg0, Symbol arg1, Symbol arg2,
        Symbol arg3) {
      return null;
    }

    public static JCDiagnostic.Fragment ClassFileNotFound(Name arg0) {
      return null;
    }

    public static JCDiagnostic.Fragment ClassIsNotSealed(String arg0) {
      return null;
    }

    public static JCDiagnostic.Fragment CountError(int arg0) {
      return null;
    }

    public static JCDiagnostic.Fragment CountErrorPlural(int arg0) {
      return null;
    }

    public static JCDiagnostic.Fragment CountErrorRecompile(int arg0, int arg1) {
      return null;
    }

    public static JCDiagnostic.Fragment CountWarn(int arg0) {
      return null;
    }

    public static JCDiagnostic.Fragment CountWarnPlural(int arg0) {
      return null;
    }

    public static JCDiagnostic.Fragment CountWarnRecompile(int arg0, int arg1) {
      return null;
    }

    public static JCDiagnostic.Fragment Descriptor(Name arg0, List arg1, Type arg2, List arg3) {
      return null;
    }

    public static JCDiagnostic.Fragment DescriptorThrows(Name arg0, List arg1, Type arg2,
        List arg3) {
      return null;
    }

    public static JCDiagnostic.Fragment Diamond(Symbol arg0) {
      return null;
    }

    public static JCDiagnostic.Fragment DiamondAndExplicitParams(Type arg0) {
      return null;
    }

    public static JCDiagnostic.Fragment DiamondInvalidArg(List arg0, JCDiagnostic arg1) {
      return null;
    }

    public static JCDiagnostic.Fragment DiamondInvalidArg(List arg0, JCDiagnostic.Fragment arg1) {
      return null;
    }

    public static JCDiagnostic.Fragment DiamondInvalidArgs(List arg0, JCDiagnostic arg1) {
      return null;
    }

    public static JCDiagnostic.Fragment DiamondInvalidArgs(List arg0, JCDiagnostic.Fragment arg1) {
      return null;
    }

    public static JCDiagnostic.Fragment DiamondNonGeneric(Type arg0) {
      return null;
    }

    public static JCDiagnostic.Fragment DoesntExtendSealed(Type arg0) {
      return null;
    }

    public static JCDiagnostic.Fragment EqBounds(List arg0) {
      return null;
    }

    public static JCDiagnostic.Fragment ExceptionMessage(String arg0) {
      return null;
    }

    public static JCDiagnostic.Fragment ExplicitParamDoNotConformToBounds(Type arg0, List arg1) {
      return null;
    }

    public static JCDiagnostic.Fragment FatalErrCantLocateCtor(Type arg0) {
      return null;
    }

    public static JCDiagnostic.Fragment FatalErrCantLocateField(Name arg0) {
      return null;
    }

    public static JCDiagnostic.Fragment FatalErrCantLocateMeth(Name arg0) {
      return null;
    }

    public static JCDiagnostic.Fragment FeatureNotSupportedInSource(JCDiagnostic arg0, String arg1,
        String arg2) {
      return null;
    }

    public static JCDiagnostic.Fragment FeatureNotSupportedInSource(JCDiagnostic.Fragment arg0,
        String arg1, String arg2) {
      return null;
    }

    public static JCDiagnostic.Fragment FeatureNotSupportedInSourcePlural(JCDiagnostic arg0,
        String arg1, String arg2) {
      return null;
    }

    public static JCDiagnostic.Fragment FeatureNotSupportedInSourcePlural(
        JCDiagnostic.Fragment arg0, String arg1, String arg2) {
      return null;
    }

    public static JCDiagnostic.Fragment FileDoesNotContainPackage(Symbol arg0) {
      return null;
    }

    public static JCDiagnostic.Fragment FileDoesntContainClass(Name arg0) {
      return null;
    }

    public static JCDiagnostic.Fragment IllegalSignature(Symbol arg0, Type arg1) {
      return null;
    }

    public static JCDiagnostic.Fragment InaccessibleVarargsType(Type arg0, Kinds.Kind arg1,
        Symbol arg2) {
      return null;
    }

    public static JCDiagnostic.Fragment InapplicableMethod(Kinds.KindName arg0, Symbol arg1,
        Symbol arg2, JCDiagnostic arg3) {
      return null;
    }

    public static JCDiagnostic.Fragment InapplicableMethod(Kinds.KindName arg0, Symbol arg1,
        Symbol arg2, JCDiagnostic.Fragment arg3) {
      return null;
    }

    public static JCDiagnostic.Fragment IncompatibleAbstractDefault(Kinds.KindName arg0, Type arg1,
        Name arg2, List arg3, Symbol arg4, Symbol arg5) {
      return null;
    }

    public static JCDiagnostic.Fragment IncompatibleAbstracts(Kinds.KindName arg0, Symbol arg1) {
      return null;
    }

    public static JCDiagnostic.Fragment IncompatibleBounds(Type arg0, JCDiagnostic.Fragment arg1,
        JCDiagnostic.Fragment arg2) {
      return null;
    }

    public static JCDiagnostic.Fragment IncompatibleDescsInFunctionalIntf(Kinds.KindName arg0,
        Symbol arg1) {
      return null;
    }

    public static JCDiagnostic.Fragment IncompatibleDiffRet(Name arg0, List arg1) {
      return null;
    }

    public static JCDiagnostic.Fragment IncompatibleEqBounds(Type arg0, List arg1) {
      return null;
    }

    public static JCDiagnostic.Fragment IncompatibleRetTypeInLambda(JCDiagnostic arg0) {
      return null;
    }

    public static JCDiagnostic.Fragment IncompatibleRetTypeInLambda(JCDiagnostic.Fragment arg0) {
      return null;
    }

    public static JCDiagnostic.Fragment IncompatibleRetTypeInMref(JCDiagnostic arg0) {
      return null;
    }

    public static JCDiagnostic.Fragment IncompatibleRetTypeInMref(JCDiagnostic.Fragment arg0) {
      return null;
    }

    public static JCDiagnostic.Fragment IncompatibleTypeInConditional(JCDiagnostic arg0) {
      return null;
    }

    public static JCDiagnostic.Fragment IncompatibleTypeInConditional(JCDiagnostic.Fragment arg0) {
      return null;
    }

    public static JCDiagnostic.Fragment IncompatibleTypeInSwitchExpression(JCDiagnostic arg0) {
      return null;
    }

    public static JCDiagnostic.Fragment IncompatibleTypeInSwitchExpression(
        JCDiagnostic.Fragment arg0) {
      return null;
    }

    public static JCDiagnostic.Fragment IncompatibleUnrelatedDefaults(Kinds.KindName arg0,
        Type arg1, Name arg2, List arg3, Symbol arg4, Symbol arg5) {
      return null;
    }

    public static JCDiagnostic.Fragment IncompatibleUpperBounds(Type arg0, List arg1) {
      return null;
    }

    public static JCDiagnostic.Fragment InconvertibleTypes(Type arg0, Type arg1) {
      return null;
    }

    public static JCDiagnostic.Fragment InferArgLengthMismatch(List arg0) {
      return null;
    }

    public static JCDiagnostic.Fragment InferNoConformingAssignmentExists(List arg0,
        JCDiagnostic arg1) {
      return null;
    }

    public static JCDiagnostic.Fragment InferNoConformingAssignmentExists(List arg0,
        JCDiagnostic.Fragment arg1) {
      return null;
    }

    public static JCDiagnostic.Fragment InferNoConformingInstanceExists(List arg0, Type arg1,
        Type arg2) {
      return null;
    }

    public static JCDiagnostic.Fragment InferVarargsArgumentMismatch(List arg0, JCDiagnostic arg1) {
      return null;
    }

    public static JCDiagnostic.Fragment InferVarargsArgumentMismatch(List arg0,
        JCDiagnostic.Fragment arg1) {
      return null;
    }

    public static JCDiagnostic.Fragment InferredDoNotConformToEqBounds(Type arg0, List arg1) {
      return null;
    }

    public static JCDiagnostic.Fragment InferredDoNotConformToLowerBounds(Type arg0, List arg1) {
      return null;
    }

    public static JCDiagnostic.Fragment InferredDoNotConformToUpperBounds(Type arg0, List arg1) {
      return null;
    }

    public static JCDiagnostic.Fragment IntersectionType(int arg0) {
      return null;
    }

    public static JCDiagnostic.Fragment InvalidDefaultInterface(String arg0, String arg1) {
      return null;
    }

    public static JCDiagnostic.Fragment InvalidGenericLambdaTarget(Type arg0, Kinds.KindName arg1,
        Symbol arg2) {
      return null;
    }

    public static JCDiagnostic.Fragment InvalidMref(Kinds.KindName arg0, JCDiagnostic arg1) {
      return null;
    }

    public static JCDiagnostic.Fragment InvalidMref(Kinds.KindName arg0,
        JCDiagnostic.Fragment arg1) {
      return null;
    }

    public static JCDiagnostic.Fragment InvalidStaticInterface(String arg0, String arg1) {
      return null;
    }

    public static JCDiagnostic.Fragment IsATypeVariable(Type arg0) {
      return null;
    }

    public static JCDiagnostic.Fragment IsDuplicated(Type arg0) {
      return null;
    }

    public static JCDiagnostic.Fragment Location(Kinds.KindName arg0, Type arg1, Void arg2) {
      return null;
    }

    public static JCDiagnostic.Fragment Location(Kinds.KindName arg0, Symbol arg1, Void arg2) {
      return null;
    }

    public static JCDiagnostic.Fragment Location1(Kinds.KindName arg0, Symbol arg1, Type arg2) {
      return null;
    }

    public static JCDiagnostic.Fragment LowerBounds(List arg0) {
      return null;
    }

    public static JCDiagnostic.Fragment MethodDescriptorInvalid(Name arg0) {
      return null;
    }

    public static JCDiagnostic.Fragment MissingRetVal(Type arg0) {
      return null;
    }

    public static JCDiagnostic.Fragment ModuleNameMismatch(Name arg0, Name arg1) {
      return null;
    }

    public static JCDiagnostic.Fragment ModuleNonZeroOpens(Name arg0) {
      return null;
    }

    public static JCDiagnostic.Fragment MustNotBeSupertype(Type arg0) {
      return null;
    }

    public static JCDiagnostic.Fragment NoAbstracts(Kinds.KindName arg0, Symbol arg1) {
      return null;
    }

    public static JCDiagnostic.Fragment NoConformingAssignmentExists(JCDiagnostic arg0) {
      return null;
    }

    public static JCDiagnostic.Fragment NoConformingAssignmentExists(JCDiagnostic.Fragment arg0) {
      return null;
    }

    public static JCDiagnostic.Fragment NoSuitableFunctionalIntfInst(Type arg0) {
      return null;
    }

    public static JCDiagnostic.Fragment NoUniqueMaximalInstanceExists(Type arg0, List arg1) {
      return null;
    }

    public static JCDiagnostic.Fragment NoUniqueMinimalInstanceExists(Type arg0, List arg1) {
      return null;
    }

    public static JCDiagnostic.Fragment NotAFunctionalIntf(Symbol arg0) {
      return null;
    }

    public static JCDiagnostic.Fragment NotAFunctionalIntf1(Symbol arg0, JCDiagnostic arg1) {
      return null;
    }

    public static JCDiagnostic.Fragment NotAFunctionalIntf1(Symbol arg0,
        JCDiagnostic.Fragment arg1) {
      return null;
    }

    public static JCDiagnostic.Fragment NotAnIntfComponent(Symbol arg0) {
      return null;
    }

    public static JCDiagnostic.Fragment NotAnIntfComponent(Type arg0) {
      return null;
    }

    public static JCDiagnostic.Fragment NotApplicableMethodFound(int arg0, Symbol arg1,
        JCDiagnostic arg2) {
      return null;
    }

    public static JCDiagnostic.Fragment NotApplicableMethodFound(int arg0, Symbol arg1,
        JCDiagnostic.Fragment arg2) {
      return null;
    }

    public static JCDiagnostic.Fragment NotApplicableTypes(Type arg0, Type arg1) {
      return null;
    }

    public static JCDiagnostic.Fragment NotDefAccessClassIntfCantAccess(Symbol arg0, Symbol arg1) {
      return null;
    }

    public static JCDiagnostic.Fragment NotDefAccessClassIntfCantAccessReason(Symbol arg0,
        Symbol arg1, Symbol arg2, JCDiagnostic arg3) {
      return null;
    }

    public static JCDiagnostic.Fragment NotDefAccessClassIntfCantAccessReason(Symbol arg0,
        Symbol arg1, Symbol arg2, JCDiagnostic.Fragment arg3) {
      return null;
    }

    public static JCDiagnostic.Fragment NotDefAccessDoesNotRead(Symbol arg0, Symbol arg1,
        Symbol arg2) {
      return null;
    }

    public static JCDiagnostic.Fragment NotDefAccessDoesNotReadFromUnnamed(Symbol arg0,
        Symbol arg1) {
      return null;
    }

    public static JCDiagnostic.Fragment NotDefAccessDoesNotReadUnnamed(Symbol arg0, Symbol arg1) {
      return null;
    }

    public static JCDiagnostic.Fragment NotDefAccessNotExported(Symbol arg0, Symbol arg1) {
      return null;
    }

    public static JCDiagnostic.Fragment NotDefAccessNotExportedFromUnnamed(Symbol arg0,
        Symbol arg1) {
      return null;
    }

    public static JCDiagnostic.Fragment NotDefAccessNotExportedToModule(Symbol arg0, Symbol arg1,
        Symbol arg2) {
      return null;
    }

    public static JCDiagnostic.Fragment NotDefAccessNotExportedToModuleFromUnnamed(Symbol arg0,
        Symbol arg1) {
      return null;
    }

    public static JCDiagnostic.Fragment NotDefAccessPackageCantAccess(Symbol arg0, Symbol arg1,
        JCDiagnostic arg2) {
      return null;
    }

    public static JCDiagnostic.Fragment NotDefAccessPackageCantAccess(Symbol arg0, Symbol arg1,
        JCDiagnostic.Fragment arg2) {
      return null;
    }

    public static JCDiagnostic.Fragment NotDefPublicCantAccess(Symbol arg0, Symbol arg1) {
      return null;
    }

    public static JCDiagnostic.Fragment OverriddenDefault(Symbol arg0, Type arg1) {
      return null;
    }

    public static JCDiagnostic.Fragment PackageNotVisible(Symbol arg0, JCDiagnostic arg1) {
      return null;
    }

    public static JCDiagnostic.Fragment PackageNotVisible(Symbol arg0, JCDiagnostic.Fragment arg1) {
      return null;
    }

    public static JCDiagnostic.Fragment PartialInstSig(Type arg0) {
      return null;
    }

    public static JCDiagnostic.Fragment PossibleLossOfPrecision(Type arg0, Type arg1) {
      return null;
    }

    public static JCDiagnostic.Fragment ProbFoundReq(JCDiagnostic arg0) {
      return null;
    }

    public static JCDiagnostic.Fragment ProbFoundReq(JCDiagnostic.Fragment arg0) {
      return null;
    }

    public static JCDiagnostic.Fragment RedundantSupertype(Symbol arg0, Type arg1) {
      return null;
    }

    public static JCDiagnostic.Fragment RedundantSupertype(Symbol arg0, Symbol arg1) {
      return null;
    }

    public static JCDiagnostic.Fragment RefAmbiguous(Name arg0, Kinds.Kind arg1, Symbol arg2,
        Symbol arg3, Kinds.Kind arg4, Symbol arg5, Symbol arg6) {
      return null;
    }

    public static JCDiagnostic.Fragment ReportAccess(Symbol arg0, Set arg1, Symbol arg2) {
      return null;
    }

    public static JCDiagnostic.Fragment SyntheticNameConflict(Symbol arg0, Symbol arg1) {
      return null;
    }

    public static JCDiagnostic.Fragment ThrowsClauseNotAllowedForCanonicalConstructor(
        JCDiagnostic.Fragment arg0) {
      return null;
    }

    public static JCDiagnostic.Fragment TryNotApplicableToType(JCDiagnostic arg0) {
      return null;
    }

    public static JCDiagnostic.Fragment TryNotApplicableToType(JCDiagnostic.Fragment arg0) {
      return null;
    }

    public static JCDiagnostic.Fragment TypeCaptureof(Name arg0, Type arg1) {
      return null;
    }

    public static JCDiagnostic.Fragment TypeParameter(Type arg0) {
      return null;
    }

    public static JCDiagnostic.Fragment TypeVar(Name arg0, int arg1) {
      return null;
    }

    public static JCDiagnostic.Fragment UncheckedClashWith(Symbol arg0, Symbol arg1, Symbol arg2,
        Symbol arg3) {
      return null;
    }

    public static JCDiagnostic.Fragment UncheckedImplement(Symbol arg0, Symbol arg1, Symbol arg2,
        Symbol arg3) {
      return null;
    }

    public static JCDiagnostic.Fragment UncheckedOverride(Symbol arg0, Symbol arg1, Symbol arg2,
        Symbol arg3) {
      return null;
    }

    public static JCDiagnostic.Fragment UpperBounds(List arg0) {
      return null;
    }

    public static JCDiagnostic.Fragment VarargsArgumentMismatch(JCDiagnostic arg0) {
      return null;
    }

    public static JCDiagnostic.Fragment VarargsArgumentMismatch(JCDiagnostic.Fragment arg0) {
      return null;
    }

    public static JCDiagnostic.Fragment VarargsClashWith(Symbol arg0, Symbol arg1, Symbol arg2,
        Symbol arg3) {
      return null;
    }

    public static JCDiagnostic.Fragment VarargsImplement(Symbol arg0, Symbol arg1, Symbol arg2,
        Symbol arg3) {
      return null;
    }

    public static JCDiagnostic.Fragment VarargsOverride(Symbol arg0, Symbol arg1, Symbol arg2,
        Symbol arg3) {
      return null;
    }

    public static JCDiagnostic.Fragment VarargsTrustmeOnNonVarargsAccessor(Symbol arg0) {
      return null;
    }

    public static JCDiagnostic.Fragment VarargsTrustmeOnNonVarargsMeth(Symbol arg0) {
      return null;
    }

    public static JCDiagnostic.Fragment VarargsTrustmeOnReifiableVarargs(Type arg0) {
      return null;
    }

    public static JCDiagnostic.Fragment VarargsTrustmeOnVirtualVarargs(Symbol arg0) {
      return null;
    }

    public static JCDiagnostic.Fragment VarargsTrustmeOnVirtualVarargsFinalOnly(Symbol arg0) {
      return null;
    }

    public static JCDiagnostic.Fragment VerboseCheckingAttribution(Symbol arg0) {
      return null;
    }

    public static JCDiagnostic.Fragment VerboseClasspath(String arg0) {
      return null;
    }

    public static JCDiagnostic.Fragment VerboseLoading(String arg0) {
      return null;
    }

    public static JCDiagnostic.Fragment VerboseParsingDone(String arg0) {
      return null;
    }

    public static JCDiagnostic.Fragment VerboseParsingStarted(File arg0) {
      return null;
    }

    public static JCDiagnostic.Fragment VerboseParsingStarted(JavaFileObject arg0) {
      return null;
    }

    public static JCDiagnostic.Fragment VerboseParsingStarted(Path arg0) {
      return null;
    }

    public static JCDiagnostic.Fragment VerboseSourcepath(String arg0) {
      return null;
    }

    public static JCDiagnostic.Fragment VerboseTotal(String arg0) {
      return null;
    }

    public static JCDiagnostic.Fragment VerboseWroteFile(File arg0) {
      return null;
    }

    public static JCDiagnostic.Fragment VerboseWroteFile(JavaFileObject arg0) {
      return null;
    }

    public static JCDiagnostic.Fragment VerboseWroteFile(Path arg0) {
      return null;
    }

    public static JCDiagnostic.Fragment WhereCaptured(Type arg0, Type arg1, Type arg2, Type arg3) {
      return null;
    }

    public static JCDiagnostic.Fragment WhereCaptured1(Type arg0, Type arg1, Void arg2, Type arg3) {
      return null;
    }

    public static JCDiagnostic.Fragment WhereDescriptionCaptured1(Set arg0) {
      return null;
    }

    public static JCDiagnostic.Fragment WhereDescriptionIntersection(Set arg0) {
      return null;
    }

    public static JCDiagnostic.Fragment WhereDescriptionIntersection1(Set arg0) {
      return null;
    }

    public static JCDiagnostic.Fragment WhereDescriptionTypevar(Set arg0) {
      return null;
    }

    public static JCDiagnostic.Fragment WhereDescriptionTypevar1(Set arg0) {
      return null;
    }

    public static JCDiagnostic.Fragment WhereFreshTypevar(Type arg0, List arg1) {
      return null;
    }

    public static JCDiagnostic.Fragment WhereIntersection(Type arg0, List arg1) {
      return null;
    }

    public static JCDiagnostic.Fragment WhereTypevar(Type arg0, List arg1, Kinds.Kind arg2,
        Symbol arg3) {
      return null;
    }

    public static JCDiagnostic.Fragment WhereTypevar1(Type arg0, List arg1, Kinds.Kind arg2,
        Symbol arg3) {
      return null;
    }

    public static JCDiagnostic.Fragment WrongNumberTypeArgs(String arg0) {
      return null;
    }

    public static JCDiagnostic.Fragment XPrintProcessorInfo(String arg0, String arg1,
        boolean arg2) {
      return null;
    }

    public static JCDiagnostic.Fragment XPrintRounds(int arg0, String arg1, Set arg2,
        boolean arg3) {
      return null;
    }
  }

  public static class Notes {
    public Notes() {
    }

    public static JCDiagnostic.Note DeferredMethodInst(Symbol arg0, Type arg1, Type arg2) {
      return null;
    }

    public static JCDiagnostic.Note DeprecatedFilename(File arg0) {
      return null;
    }

    public static JCDiagnostic.Note DeprecatedFilename(JavaFileObject arg0) {
      return null;
    }

    public static JCDiagnostic.Note DeprecatedFilename(Path arg0) {
      return null;
    }

    public static JCDiagnostic.Note DeprecatedFilenameAdditional(File arg0) {
      return null;
    }

    public static JCDiagnostic.Note DeprecatedFilenameAdditional(JavaFileObject arg0) {
      return null;
    }

    public static JCDiagnostic.Note DeprecatedFilenameAdditional(Path arg0) {
      return null;
    }

    public static JCDiagnostic.Note LambdaStat(boolean arg0, Symbol arg1) {
      return null;
    }

    public static JCDiagnostic.Note MethodRefSearchResultsMulti(JCDiagnostic.Fragment arg0,
        String arg1, int arg2) {
      return null;
    }

    public static JCDiagnostic.Note MrefStat(boolean arg0, Void arg1) {
      return null;
    }

    public static JCDiagnostic.Note MrefStat1(boolean arg0, Symbol arg1) {
      return null;
    }

    public static JCDiagnostic.Note MultipleElements(String arg0, String arg1, String arg2) {
      return null;
    }

    public static JCDiagnostic.Note PreviewFilename(File arg0, Source arg1) {
      return null;
    }

    public static JCDiagnostic.Note PreviewFilename(JavaFileObject arg0, Source arg1) {
      return null;
    }

    public static JCDiagnostic.Note PreviewFilename(Path arg0, Source arg1) {
      return null;
    }

    public static JCDiagnostic.Note PreviewFilenameAdditional(File arg0, Source arg1) {
      return null;
    }

    public static JCDiagnostic.Note PreviewFilenameAdditional(JavaFileObject arg0, Source arg1) {
      return null;
    }

    public static JCDiagnostic.Note PreviewFilenameAdditional(Path arg0, Source arg1) {
      return null;
    }

    public static JCDiagnostic.Note PreviewPlural(Source arg0) {
      return null;
    }

    public static JCDiagnostic.Note PreviewPluralAdditional(Source arg0) {
      return null;
    }

    public static JCDiagnostic.Note ProcMessager(String arg0) {
      return null;
    }

    public static JCDiagnostic.Note RemovalFilename(File arg0) {
      return null;
    }

    public static JCDiagnostic.Note RemovalFilename(JavaFileObject arg0) {
      return null;
    }

    public static JCDiagnostic.Note RemovalFilename(Path arg0) {
      return null;
    }

    public static JCDiagnostic.Note RemovalFilenameAdditional(File arg0) {
      return null;
    }

    public static JCDiagnostic.Note RemovalFilenameAdditional(JavaFileObject arg0) {
      return null;
    }

    public static JCDiagnostic.Note RemovalFilenameAdditional(Path arg0) {
      return null;
    }

    public static JCDiagnostic.Note UncheckedFilename(File arg0) {
      return null;
    }

    public static JCDiagnostic.Note UncheckedFilename(JavaFileObject arg0) {
      return null;
    }

    public static JCDiagnostic.Note UncheckedFilename(Path arg0) {
      return null;
    }

    public static JCDiagnostic.Note UncheckedFilenameAdditional(File arg0) {
      return null;
    }

    public static JCDiagnostic.Note UncheckedFilenameAdditional(JavaFileObject arg0) {
      return null;
    }

    public static JCDiagnostic.Note UncheckedFilenameAdditional(Path arg0) {
      return null;
    }

    public static JCDiagnostic.Note VerboseL2mDeduplicate(Symbol arg0) {
      return null;
    }

    public static JCDiagnostic.Note VerboseResolveMulti(Name arg0, Symbol arg1, int arg2,
        String arg3, List arg4, List arg5) {
      return null;
    }

    public static JCDiagnostic.Note VerboseResolveMulti(Name arg0, Symbol arg1, int arg2,
        String arg3, List arg4, JCDiagnostic arg5) {
      return null;
    }

    public static JCDiagnostic.Note VerboseResolveMulti(Name arg0, Symbol arg1, int arg2,
        String arg3, List arg4, JCDiagnostic.Fragment arg5) {
      return null;
    }

    public static JCDiagnostic.Note VerboseResolveMulti(Name arg0, Symbol arg1, int arg2,
        String arg3, JCDiagnostic arg4, List arg5) {
      return null;
    }

    public static JCDiagnostic.Note VerboseResolveMulti(Name arg0, Symbol arg1, int arg2,
        String arg3, JCDiagnostic arg4, JCDiagnostic arg5) {
      return null;
    }

    public static JCDiagnostic.Note VerboseResolveMulti(Name arg0, Symbol arg1, int arg2,
        String arg3, JCDiagnostic arg4, JCDiagnostic.Fragment arg5) {
      return null;
    }

    public static JCDiagnostic.Note VerboseResolveMulti(Name arg0, Symbol arg1, int arg2,
        String arg3, JCDiagnostic.Fragment arg4, List arg5) {
      return null;
    }

    public static JCDiagnostic.Note VerboseResolveMulti(Name arg0, Symbol arg1, int arg2,
        String arg3, JCDiagnostic.Fragment arg4, JCDiagnostic arg5) {
      return null;
    }

    public static JCDiagnostic.Note VerboseResolveMulti(Name arg0, Symbol arg1, int arg2,
        String arg3, JCDiagnostic.Fragment arg4, JCDiagnostic.Fragment arg5) {
      return null;
    }

    public static JCDiagnostic.Note VerboseResolveMulti1(Name arg0, Symbol arg1, Void arg2,
        String arg3, List arg4, List arg5) {
      return null;
    }

    public static JCDiagnostic.Note VerboseResolveMulti1(Name arg0, Symbol arg1, Void arg2,
        String arg3, List arg4, JCDiagnostic arg5) {
      return null;
    }

    public static JCDiagnostic.Note VerboseResolveMulti1(Name arg0, Symbol arg1, Void arg2,
        String arg3, List arg4, JCDiagnostic.Fragment arg5) {
      return null;
    }

    public static JCDiagnostic.Note VerboseResolveMulti1(Name arg0, Symbol arg1, Void arg2,
        String arg3, JCDiagnostic arg4, List arg5) {
      return null;
    }

    public static JCDiagnostic.Note VerboseResolveMulti1(Name arg0, Symbol arg1, Void arg2,
        String arg3, JCDiagnostic arg4, JCDiagnostic arg5) {
      return null;
    }

    public static JCDiagnostic.Note VerboseResolveMulti1(Name arg0, Symbol arg1, Void arg2,
        String arg3, JCDiagnostic arg4, JCDiagnostic.Fragment arg5) {
      return null;
    }

    public static JCDiagnostic.Note VerboseResolveMulti1(Name arg0, Symbol arg1, Void arg2,
        String arg3, JCDiagnostic.Fragment arg4, List arg5) {
      return null;
    }

    public static JCDiagnostic.Note VerboseResolveMulti1(Name arg0, Symbol arg1, Void arg2,
        String arg3, JCDiagnostic.Fragment arg4, JCDiagnostic arg5) {
      return null;
    }

    public static JCDiagnostic.Note VerboseResolveMulti1(Name arg0, Symbol arg1, Void arg2,
        String arg3, JCDiagnostic.Fragment arg4, JCDiagnostic.Fragment arg5) {
      return null;
    }
  }

  public static class Warnings {
    public Warnings() {
    }

    public static JCDiagnostic.Warning AccessToMemberFromSerializableElement(Symbol arg0) {
      return null;
    }

    public static JCDiagnostic.Warning AccessToMemberFromSerializableLambda(Symbol arg0) {
      return null;
    }

    public static JCDiagnostic.Warning AnnotationMethodNotFound(Type arg0, Name arg1) {
      return null;
    }

    public static JCDiagnostic.Warning AnnotationMethodNotFoundReason(Type arg0, Name arg1,
        JCDiagnostic arg2) {
      return null;
    }

    public static JCDiagnostic.Warning AnnotationMethodNotFoundReason(Type arg0, Name arg1,
        JCDiagnostic.Fragment arg2) {
      return null;
    }

    public static JCDiagnostic.Warning AuxiliaryClassAccessedFromOutsideOfItsSourceFile(Symbol arg0,
        File arg1) {
      return null;
    }

    public static JCDiagnostic.Warning AuxiliaryClassAccessedFromOutsideOfItsSourceFile(Symbol arg0,
        JavaFileObject arg1) {
      return null;
    }

    public static JCDiagnostic.Warning AuxiliaryClassAccessedFromOutsideOfItsSourceFile(Symbol arg0,
        Path arg1) {
      return null;
    }

    public static JCDiagnostic.Warning AuxiliaryClassAccessedFromOutsideOfItsSourceFile(Type arg0,
        File arg1) {
      return null;
    }

    public static JCDiagnostic.Warning AuxiliaryClassAccessedFromOutsideOfItsSourceFile(Type arg0,
        JavaFileObject arg1) {
      return null;
    }

    public static JCDiagnostic.Warning AuxiliaryClassAccessedFromOutsideOfItsSourceFile(Type arg0,
        Path arg1) {
      return null;
    }

    public static JCDiagnostic.Warning BadNameForOption(Option arg0, String arg1) {
      return null;
    }

    public static JCDiagnostic.Warning BigMajorVersion(File arg0, int arg1, int arg2) {
      return null;
    }

    public static JCDiagnostic.Warning BigMajorVersion(JavaFileObject arg0, int arg1, int arg2) {
      return null;
    }

    public static JCDiagnostic.Warning BigMajorVersion(Path arg0, int arg1, int arg2) {
      return null;
    }

    public static JCDiagnostic.Warning ConstantSVUID(Symbol arg0) {
      return null;
    }

    public static JCDiagnostic.Warning DeclaredUsingPreview(Kinds.KindName arg0, Symbol arg1) {
      return null;
    }

    public static JCDiagnostic.Warning DeprecatedAnnotationHasNoEffect(Kinds.KindName arg0) {
      return null;
    }

    public static JCDiagnostic.Warning DirPathElementNotDirectory(File arg0) {
      return null;
    }

    public static JCDiagnostic.Warning DirPathElementNotDirectory(JavaFileObject arg0) {
      return null;
    }

    public static JCDiagnostic.Warning DirPathElementNotDirectory(Path arg0) {
      return null;
    }

    public static JCDiagnostic.Warning DirPathElementNotFound(Path arg0) {
      return null;
    }

    public static JCDiagnostic.Warning FileFromFuture(File arg0) {
      return null;
    }

    public static JCDiagnostic.Warning FileFromFuture(JavaFileObject arg0) {
      return null;
    }

    public static JCDiagnostic.Warning FileFromFuture(Path arg0) {
      return null;
    }

    public static JCDiagnostic.Warning ForwardRef(Symbol arg0) {
      return null;
    }

    public static JCDiagnostic.Warning FutureAttr(Name arg0, int arg1, int arg2, int arg3,
        int arg4) {
      return null;
    }

    public static JCDiagnostic.Warning HasBeenDeprecated(Symbol arg0, Symbol arg1) {
      return null;
    }

    public static JCDiagnostic.Warning HasBeenDeprecatedForRemoval(Symbol arg0, Symbol arg1) {
      return null;
    }

    public static JCDiagnostic.Warning HasBeenDeprecatedForRemovalModule(Symbol arg0) {
      return null;
    }

    public static JCDiagnostic.Warning HasBeenDeprecatedModule(Symbol arg0) {
      return null;
    }

    public static JCDiagnostic.Warning IllegalRefToRestrictedType(Name arg0) {
      return null;
    }

    public static JCDiagnostic.Warning ImproperSVUID(Symbol arg0) {
      return null;
    }

    public static JCDiagnostic.Warning IncubatingModules(String arg0) {
      return null;
    }

    public static JCDiagnostic.Warning IneffectualSerialFieldEnum(String arg0) {
      return null;
    }

    public static JCDiagnostic.Warning IneffectualSerialMethodEnum(String arg0) {
      return null;
    }

    public static JCDiagnostic.Warning IneffectualSerialMethodExternalizable(Name arg0) {
      return null;
    }

    public static JCDiagnostic.Warning IneffectualSerialMethodRecord(String arg0) {
      return null;
    }

    public static JCDiagnostic.Warning InexactNonVarargsCall(Type arg0, Type arg1) {
      return null;
    }

    public static JCDiagnostic.Warning InvalidArchiveFile(Path arg0) {
      return null;
    }

    public static JCDiagnostic.Warning InvalidPath(String arg0) {
      return null;
    }

    public static JCDiagnostic.Warning InvalidUtf8InClassfile(File arg0,
        JCDiagnostic.Fragment arg1) {
      return null;
    }

    public static JCDiagnostic.Warning InvalidUtf8InClassfile(JavaFileObject arg0,
        JCDiagnostic.Fragment arg1) {
      return null;
    }

    public static JCDiagnostic.Warning InvalidUtf8InClassfile(Path arg0,
        JCDiagnostic.Fragment arg1) {
      return null;
    }

    public static JCDiagnostic.Warning IsPreview(Symbol arg0) {
      return null;
    }

    public static JCDiagnostic.Warning IsPreviewReflective(Symbol arg0) {
      return null;
    }

    public static JCDiagnostic.Warning LeaksNotAccessible(Kinds.KindName arg0, Symbol arg1,
        Symbol arg2) {
      return null;
    }

    public static JCDiagnostic.Warning LeaksNotAccessibleNotRequiredTransitive(Kinds.KindName arg0,
        Symbol arg1, Symbol arg2) {
      return null;
    }

    public static JCDiagnostic.Warning LeaksNotAccessibleUnexported(Kinds.KindName arg0,
        Symbol arg1, Symbol arg2) {
      return null;
    }

    public static JCDiagnostic.Warning LeaksNotAccessibleUnexportedQualified(Kinds.KindName arg0,
        Symbol arg1, Symbol arg2) {
      return null;
    }

    public static JCDiagnostic.Warning LintOption(Option arg0) {
      return null;
    }

    public static JCDiagnostic.Warning LocnUnknownFileOnModulePath(Path arg0) {
      return null;
    }

    public static JCDiagnostic.Warning LongSVUID(Symbol arg0) {
      return null;
    }

    public static JCDiagnostic.Warning MissingExplicitCtor(Symbol arg0, Symbol arg1, Symbol arg2) {
      return null;
    }

    public static JCDiagnostic.Warning MissingSVUID(Symbol arg0) {
      return null;
    }

    public static JCDiagnostic.Warning ModuleForOptionNotFound(Option arg0, Symbol arg1) {
      return null;
    }

    public static JCDiagnostic.Warning ModuleNotFound(Symbol arg0) {
      return null;
    }

    public static JCDiagnostic.Warning NonSerializableInstanceFieldArray(Type arg0) {
      return null;
    }

    public static JCDiagnostic.Warning OptionObsoleteSource(String arg0) {
      return null;
    }

    public static JCDiagnostic.Warning OptionObsoleteTarget(Target arg0) {
      return null;
    }

    public static JCDiagnostic.Warning OutdirIsInExplodedModule(Path arg0) {
      return null;
    }

    public static JCDiagnostic.Warning OutputFileClash(Path arg0) {
      return null;
    }

    public static JCDiagnostic.Warning OverrideBridge(JCDiagnostic arg0) {
      return null;
    }

    public static JCDiagnostic.Warning OverrideBridge(JCDiagnostic.Fragment arg0) {
      return null;
    }

    public static JCDiagnostic.Warning OverrideEqualsButNotHashcode(Symbol arg0) {
      return null;
    }

    public static JCDiagnostic.Warning OverrideUncheckedRet(JCDiagnostic arg0, Type arg1,
        Type arg2) {
      return null;
    }

    public static JCDiagnostic.Warning OverrideUncheckedRet(JCDiagnostic.Fragment arg0, Type arg1,
        Type arg2) {
      return null;
    }

    public static JCDiagnostic.Warning OverrideUncheckedThrown(JCDiagnostic arg0, Type arg1) {
      return null;
    }

    public static JCDiagnostic.Warning OverrideUncheckedThrown(JCDiagnostic.Fragment arg0,
        Type arg1) {
      return null;
    }

    public static JCDiagnostic.Warning OverrideVarargsExtra(JCDiagnostic arg0) {
      return null;
    }

    public static JCDiagnostic.Warning OverrideVarargsExtra(JCDiagnostic.Fragment arg0) {
      return null;
    }

    public static JCDiagnostic.Warning OverrideVarargsMissing(JCDiagnostic arg0) {
      return null;
    }

    public static JCDiagnostic.Warning OverrideVarargsMissing(JCDiagnostic.Fragment arg0) {
      return null;
    }

    public static JCDiagnostic.Warning PackageEmptyOrNotFound(Symbol arg0) {
      return null;
    }

    public static JCDiagnostic.Warning PathElementNotFound(Path arg0) {
      return null;
    }

    public static JCDiagnostic.Warning PkgInfoAlreadySeen(Symbol arg0) {
      return null;
    }

    public static JCDiagnostic.Warning PoorChoiceForModuleName(Name arg0) {
      return null;
    }

    public static JCDiagnostic.Warning PositionOverflow(int arg0) {
      return null;
    }

    public static JCDiagnostic.Warning PossibleLossOfPrecision(Type arg0, Type arg1) {
      return null;
    }

    public static JCDiagnostic.Warning PotentiallyAmbiguousOverload(Symbol arg0, Symbol arg1,
        Symbol arg2, Symbol arg3) {
      return null;
    }

    public static JCDiagnostic.Warning PreviewFeatureUse(JCDiagnostic arg0) {
      return null;
    }

    public static JCDiagnostic.Warning PreviewFeatureUse(JCDiagnostic.Fragment arg0) {
      return null;
    }

    public static JCDiagnostic.Warning PreviewFeatureUseClassfile(JavaFileObject arg0,
        String arg1) {
      return null;
    }

    public static JCDiagnostic.Warning PreviewFeatureUsePlural(JCDiagnostic arg0) {
      return null;
    }

    public static JCDiagnostic.Warning PreviewFeatureUsePlural(JCDiagnostic.Fragment arg0) {
      return null;
    }

    public static JCDiagnostic.Warning ProbFoundReq(JCDiagnostic arg0, Type arg1, Type arg2) {
      return null;
    }

    public static JCDiagnostic.Warning ProbFoundReq(JCDiagnostic.Fragment arg0, Type arg1,
        Type arg2) {
      return null;
    }

    public static JCDiagnostic.Warning ProcAnnotationsWithoutProcessors(Set arg0) {
      return null;
    }

    public static JCDiagnostic.Warning ProcDuplicateOptionName(String arg0, String arg1) {
      return null;
    }

    public static JCDiagnostic.Warning ProcDuplicateSupportedAnnotation(String arg0, String arg1) {
      return null;
    }

    public static JCDiagnostic.Warning ProcFileCreateLastRound(String arg0) {
      return null;
    }

    public static JCDiagnostic.Warning ProcFileReopening(String arg0) {
      return null;
    }

    public static JCDiagnostic.Warning ProcIllegalFileName(String arg0) {
      return null;
    }

    public static JCDiagnostic.Warning ProcMalformedSupportedString(String arg0, String arg1) {
      return null;
    }

    public static JCDiagnostic.Warning ProcMessager(String arg0) {
      return null;
    }

    public static JCDiagnostic.Warning ProcPackageDoesNotExist(String arg0) {
      return null;
    }

    public static JCDiagnostic.Warning ProcProcessorIncompatibleSourceVersion(SourceVersion arg0,
        String arg1, String arg2) {
      return null;
    }

    public static JCDiagnostic.Warning ProcRedundantTypesWithWildcard(String arg0) {
      return null;
    }

    public static JCDiagnostic.Warning ProcSuspiciousClassName(String arg0, String arg1) {
      return null;
    }

    public static JCDiagnostic.Warning ProcTypeAlreadyExists(String arg0) {
      return null;
    }

    public static JCDiagnostic.Warning ProcTypeRecreate(String arg0) {
      return null;
    }

    public static JCDiagnostic.Warning ProcUnclosedTypeFiles(Set arg0) {
      return null;
    }

    public static JCDiagnostic.Warning ProcUnmatchedProcessorOptions(String arg0) {
      return null;
    }

    public static JCDiagnostic.Warning ProfileTargetConflict(Profile arg0, Target arg1) {
      return null;
    }

    public static JCDiagnostic.Warning RawClassUse(Type arg0, Type arg1) {
      return null;
    }

    public static JCDiagnostic.Warning RedundantCast(Type arg0) {
      return null;
    }

    public static JCDiagnostic.Warning RestrictedTypeNotAllowed(Name arg0, Source arg1) {
      return null;
    }

    public static JCDiagnostic.Warning RestrictedTypeNotAllowedPreview(Name arg0, Source arg1) {
      return null;
    }

    public static JCDiagnostic.Warning SelfRef(Symbol arg0) {
      return null;
    }

    public static JCDiagnostic.Warning SerialConcreteInstanceMethod(Name arg0) {
      return null;
    }

    public static JCDiagnostic.Warning SerialMethodNoArgs(Name arg0) {
      return null;
    }

    public static JCDiagnostic.Warning SerialMethodNotPrivate(Name arg0) {
      return null;
    }

    public static JCDiagnostic.Warning SerialMethodOneArg(Name arg0, int arg1) {
      return null;
    }

    public static JCDiagnostic.Warning SerialMethodParameterType(Name arg0, Type arg1, Type arg2) {
      return null;
    }

    public static JCDiagnostic.Warning SerialMethodStatic(Name arg0) {
      return null;
    }

    public static JCDiagnostic.Warning SerialMethodUnexpectedException(Name arg0, Type arg1) {
      return null;
    }

    public static JCDiagnostic.Warning SerialMethodUnexpectedReturnType(Name arg0, Type arg1,
        Type arg2) {
      return null;
    }

    public static JCDiagnostic.Warning SerializableMissingAccessNoArgCtor(Name arg0) {
      return null;
    }

    public static JCDiagnostic.Warning ServiceProvidedButNotExportedOrUsed(Symbol arg0) {
      return null;
    }

    public static JCDiagnostic.Warning SourceNoBootclasspath(String arg0) {
      return null;
    }

    public static JCDiagnostic.Warning SourceNoSystemModulesPath(String arg0) {
      return null;
    }

    public static JCDiagnostic.Warning SourceTargetConflict(String arg0, Target arg1) {
      return null;
    }

    public static JCDiagnostic.Warning StaticNotQualifiedByType(Kinds.KindName arg0, Symbol arg1) {
      return null;
    }

    public static JCDiagnostic.Warning StaticNotQualifiedByType2(Kinds.KindName arg0) {
      return null;
    }

    public static JCDiagnostic.Warning SunProprietary(Symbol arg0) {
      return null;
    }

    public static JCDiagnostic.Warning TargetDefaultSourceConflict(String arg0, Target arg1) {
      return null;
    }

    public static JCDiagnostic.Warning TryResourceNotReferenced(Symbol arg0) {
      return null;
    }

    public static JCDiagnostic.Warning TryResourceThrowsInterruptedExc(Type arg0) {
      return null;
    }

    public static JCDiagnostic.Warning UncheckedAssignToVar(Symbol arg0, Type arg1) {
      return null;
    }

    public static JCDiagnostic.Warning UncheckedCallMbrOfRawType(Symbol arg0, Type arg1) {
      return null;
    }

    public static JCDiagnostic.Warning UncheckedGenericArrayCreation(Type arg0) {
      return null;
    }

    public static JCDiagnostic.Warning UncheckedMethInvocationApplied(Kinds.KindName arg0,
        Name arg1, Object arg2, Object arg3, Kinds.KindName arg4, Symbol arg5) {
      return null;
    }

    public static JCDiagnostic.Warning UncheckedVarargsNonReifiableType(Type arg0) {
      return null;
    }

    public static JCDiagnostic.Warning UnexpectedArchiveFile(Path arg0) {
      return null;
    }

    public static JCDiagnostic.Warning UnknownEnumConstant(JavaFileObject arg0, Symbol arg1,
        Name arg2) {
      return null;
    }

    public static JCDiagnostic.Warning UnknownEnumConstantReason(JavaFileObject arg0, Symbol arg1,
        Name arg2, JCDiagnostic arg3) {
      return null;
    }

    public static JCDiagnostic.Warning UnknownEnumConstantReason(JavaFileObject arg0, Symbol arg1,
        Name arg2, JCDiagnostic.Fragment arg3) {
      return null;
    }

    public static JCDiagnostic.Warning UnreachableCatch(List arg0) {
      return null;
    }

    public static JCDiagnostic.Warning UnreachableCatch1(List arg0) {
      return null;
    }

    public static JCDiagnostic.Warning VarargsRedundantTrustmeAnno(Symbol arg0, JCDiagnostic arg1) {
      return null;
    }

    public static JCDiagnostic.Warning VarargsRedundantTrustmeAnno(Symbol arg0,
        JCDiagnostic.Fragment arg1) {
      return null;
    }

    public static JCDiagnostic.Warning VarargsUnsafeUseVarargsParam(Symbol arg0) {
      return null;
    }
  }
}
