package com.sun.tools.javac.tree;

import com.sun.source.tree.Tree;
import com.sun.tools.javac.code.Symbol;
import com.sun.tools.javac.code.Type;
import com.sun.tools.javac.comp.Env;
import com.sun.tools.javac.util.JCDiagnostic;
import com.sun.tools.javac.util.List;
import com.sun.tools.javac.util.Name;
import com.sun.tools.javac.util.Names;
import java.lang.String;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class TreeInfo {
  public TreeInfo() {
  }

  public static List args(JCTree arg0) {
    return null;
  }

  public static boolean isConstructor(JCTree arg0) {
    return false;
  }

  public static boolean isCanonicalConstructor(JCTree arg0) {
    return false;
  }

  public static boolean isCompactConstructor(JCTree arg0) {
    return false;
  }

  public static boolean isReceiverParam(JCTree arg0) {
    return false;
  }

  public static boolean hasConstructors(List arg0) {
    return false;
  }

  public static Name getConstructorInvocationName(List arg0, Names arg1) {
    return null;
  }

  public static boolean isMultiCatch(JCTree.JCCatch arg0) {
    return false;
  }

  public static boolean isSyntheticInit(JCTree arg0) {
    return false;
  }

  public static Name calledMethodName(JCTree arg0) {
    return null;
  }

  public static boolean isSelfCall(JCTree arg0) {
    return false;
  }

  public static boolean isThisQualifier(JCTree arg0) {
    return false;
  }

  public static boolean isIdentOrThisDotIdent(JCTree arg0) {
    return false;
  }

  public static boolean isSuperCall(JCTree arg0) {
    return false;
  }

  public static List recordFields(JCTree.JCClassDecl arg0) {
    return null;
  }

  public static List recordFieldTypes(JCTree.JCClassDecl arg0) {
    return null;
  }

  public static boolean isInitialConstructor(JCTree arg0) {
    return false;
  }

  public static JCTree.JCMethodInvocation firstConstructorCall(JCTree arg0) {
    return null;
  }

  public static boolean isDiamond(JCTree arg0) {
    return false;
  }

  public static boolean isEnumInit(JCTree arg0) {
    return false;
  }

  public static void setPolyKind(JCTree arg0, JCTree.JCPolyExpression.PolyKind arg1) {
  }

  public static void setVarargsElement(JCTree arg0, Type arg1) {
  }

  public static boolean isExpressionStatement(JCTree.JCExpression arg0) {
    return false;
  }

  public static boolean isStatement(JCTree arg0) {
    return false;
  }

  public static boolean isStaticSelector(JCTree arg0, Names arg1) {
    return false;
  }

  private static boolean isStaticSym(JCTree arg0) {
    return false;
  }

  public static boolean isNull(JCTree arg0) {
    return false;
  }

  public static boolean isInAnnotation(Env arg0, JCTree arg1) {
    return false;
  }

  public static String getCommentText(Env arg0, JCTree arg1) {
    return null;
  }

  public static DCTree.DCDocComment getCommentTree(Env arg0, JCTree arg1) {
    return null;
  }

  public static int firstStatPos(JCTree arg0) {
    return 0;
  }

  public static int endPos(JCTree arg0) {
    return 0;
  }

  public static int getStartPos(JCTree arg0) {
    return 0;
  }

  public static int getEndPos(JCTree arg0, EndPosTable arg1) {
    return 0;
  }

  public static JCDiagnostic.DiagnosticPosition diagEndPos(JCTree arg0) {
    return null;
  }

  public static int finalizerPos(JCTree arg0, PosKind arg1) {
    return 0;
  }

  public static int positionFor(Symbol arg0, JCTree arg1) {
    return 0;
  }

  public static JCDiagnostic.DiagnosticPosition diagnosticPositionFor(Symbol arg0, JCTree arg1) {
    return null;
  }

  public static JCDiagnostic.DiagnosticPosition diagnosticPositionFor(Symbol arg0, JCTree arg1,
      boolean arg2) {
    return null;
  }

  public static JCDiagnostic.DiagnosticPosition diagnosticPositionFor(Symbol arg0, JCTree arg1,
      boolean arg2, Predicate arg3) {
    return null;
  }

  public static JCDiagnostic.DiagnosticPosition diagnosticPositionFor(Symbol arg0, List arg1) {
    return null;
  }

  public static JCTree declarationFor(Symbol arg0, JCTree arg1) {
    return null;
  }

  public static JCTree referencedStatement(JCTree.JCLabeledStatement arg0) {
    return null;
  }

  public static JCTree.JCExpression skipParens(JCTree.JCExpression arg0) {
    return null;
  }

  public static JCTree skipParens(JCTree arg0) {
    return null;
  }

  public static List types(List arg0) {
    return null;
  }

  public static Name name(JCTree arg0) {
    return null;
  }

  public static Name fullName(JCTree arg0) {
    return null;
  }

  public static Symbol symbolFor(JCTree arg0) {
    return null;
  }

  private static Symbol symbolForImpl(JCTree arg0) {
    return null;
  }

  public static boolean isDeclaration(JCTree arg0) {
    return false;
  }

  public static Symbol symbol(JCTree arg0) {
    return null;
  }

  public static JCTree.JCModifiers getModifiers(JCTree arg0) {
    return null;
  }

  public static boolean nonstaticSelect(JCTree arg0) {
    return false;
  }

  public static void setSymbol(JCTree arg0, Symbol arg1) {
  }

  public static long flags(JCTree arg0) {
    return 0L;
  }

  public static long firstFlag(long arg0) {
    return 0L;
  }

  public static String flagNames(long arg0) {
    return null;
  }

  public static int opPrec(JCTree.Tag arg0) {
    return 0;
  }

  static Tree.Kind tagToKind(JCTree.Tag arg0) {
    return null;
  }

  public static JCTree.JCExpression typeIn(JCTree.JCExpression arg0) {
    return null;
  }

  public static JCTree innermostType(JCTree arg0, boolean arg1) {
    return null;
  }

  public static boolean containsTypeAnnotation(JCTree arg0) {
    return false;
  }

  public static boolean isModuleInfo(JCTree.JCCompilationUnit arg0) {
    return false;
  }

  public static JCTree.JCModuleDecl getModule(JCTree.JCCompilationUnit arg0) {
    return null;
  }

  public static boolean isPackageInfo(JCTree.JCCompilationUnit arg0) {
    return false;
  }

  public static boolean isErrorEnumSwitch(JCTree.JCExpression arg0, List arg1) {
    return false;
  }

  public static Type primaryPatternType(JCTree arg0) {
    return null;
  }

  public static JCTree primaryPatternTypeTree(JCTree arg0) {
    return null;
  }

  public static boolean expectedExhaustive(JCTree.JCSwitch arg0) {
    return false;
  }

  public static boolean unguardedCase(JCTree.JCCase arg0) {
    return false;
  }

  public static boolean isBooleanWithValue(JCTree.JCExpression arg0, int arg1) {
    return false;
  }

  public static boolean isNullCaseLabel(JCTree.JCCaseLabel arg0) {
    return false;
  }

  private static boolean lambda$expectedExhaustive$11(JCTree.JCCaseLabel arg0) {
    return false;
  }

  private static Stream lambda$expectedExhaustive$10(JCTree.JCCase arg0) {
    return null;
  }

  private static boolean lambda$isErrorEnumSwitch$9(JCTree.JCExpression arg0) {
    return false;
  }

  private static JCTree.JCExpression lambda$isErrorEnumSwitch$8(JCTree.JCCaseLabel arg0) {
    return null;
  }

  private static boolean lambda$isErrorEnumSwitch$7(JCTree.JCCaseLabel arg0) {
    return false;
  }

  private static Stream lambda$isErrorEnumSwitch$6(JCTree.JCCase arg0) {
    return null;
  }

  private static boolean lambda$diagnosticPositionFor$5(JCDiagnostic.DiagnosticPosition arg0) {
    return false;
  }

  private static JCDiagnostic.DiagnosticPosition lambda$diagnosticPositionFor$4(Symbol arg0,
      JCTree arg1) {
    return null;
  }

  private static Type lambda$recordFieldTypes$3(JCTree.JCVariableDecl arg0) {
    return null;
  }

  private static boolean lambda$recordFields$2(JCTree.JCVariableDecl arg0) {
    return false;
  }

  private static JCTree.JCVariableDecl lambda$recordFields$1(JCTree arg0) {
    return null;
  }

  private static boolean lambda$recordFields$0(JCTree arg0) {
    return false;
  }

  static class DeclScanner extends TreeScanner {
    DeclScanner(Symbol arg0) {
    }

    DeclScanner(Symbol arg0, Predicate arg1) {
    }

    public void scan(JCTree arg0) {
    }

    public void visitTopLevel(JCTree.JCCompilationUnit arg0) {
    }

    public void visitModuleDef(JCTree.JCModuleDecl arg0) {
    }

    public void visitPackageDef(JCTree.JCPackageDecl arg0) {
    }

    public void visitClassDef(JCTree.JCClassDecl arg0) {
    }

    public void visitMethodDef(JCTree.JCMethodDecl arg0) {
    }

    public void visitVarDef(JCTree.JCVariableDecl arg0) {
    }

    public void visitTypeParameter(JCTree.JCTypeParameter arg0) {
    }

    protected boolean checkMatch(JCTree arg0, Symbol arg1) {
      return false;
    }
  }

  public final enum PosKind {
    START_POS,

    FIRST_STAT_POS,

    END_POS
  }

  static class TypeAnnotationFinder extends TreeScanner {
    private TypeAnnotationFinder() {
    }

    public void scan(JCTree arg0) {
    }

    public void visitAnnotation(JCTree.JCAnnotation arg0) {
    }
  }
}
