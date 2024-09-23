package com.sun.tools.javac.tree;

import com.sun.tools.javac.code.Symbol;
import com.sun.tools.javac.util.List;
import java.io.Writer;
import java.lang.Object;
import java.lang.String;

public class Pretty extends JCTree.Visitor {
  public Pretty(Writer arg0, boolean arg1) {
  }

  void align() {
  }

  void indent() {
  }

  void undent() {
  }

  void open(int arg0, int arg1) {
  }

  void close(int arg0, int arg1) {
  }

  public void print(Object arg0) {
  }

  private void print(char arg0) {
  }

  public void println() {
  }

  public static String toSimpleString(JCTree arg0) {
    return null;
  }

  public static String toSimpleString(JCTree arg0, int arg1) {
    return null;
  }

  public void printExpr(JCTree arg0, int arg1) {
  }

  public void printExpr(JCTree arg0) {
  }

  public void printStat(JCTree arg0) {
  }

  public void printExprs(List arg0, String arg1) {
  }

  public void printExprs(List arg0) {
  }

  public void printPattern(JCTree arg0) {
  }

  public void printStats(List arg0) {
  }

  public void printFlags(long arg0) {
  }

  public void printAnnotations(List arg0) {
  }

  public void printTypeAnnotations(List arg0) {
  }

  public void printDocComment(JCTree arg0) {
  }

  static int lineEndPos(String arg0, int arg1) {
    return 0;
  }

  public void printTypeParameters(List arg0) {
  }

  public void printBlock(List arg0) {
  }

  public void printEnumBody(List arg0) {
  }

  boolean isEnumerator(JCTree arg0) {
    return false;
  }

  public void printUnit(JCTree.JCCompilationUnit arg0, JCTree.JCClassDecl arg1) {
  }

  boolean isUsed(Symbol arg0, JCTree arg1) {
    return false;
  }

  public void visitTopLevel(JCTree.JCCompilationUnit arg0) {
  }

  public void visitPackageDef(JCTree.JCPackageDecl arg0) {
  }

  public void visitModuleDef(JCTree.JCModuleDecl arg0) {
  }

  public void visitExports(JCTree.JCExports arg0) {
  }

  public void visitOpens(JCTree.JCOpens arg0) {
  }

  public void visitProvides(JCTree.JCProvides arg0) {
  }

  public void visitRequires(JCTree.JCRequires arg0) {
  }

  public void visitUses(JCTree.JCUses arg0) {
  }

  public void visitImport(JCTree.JCImport arg0) {
  }

  public void visitClassDef(JCTree.JCClassDecl arg0) {
  }

  public void visitMethodDef(JCTree.JCMethodDecl arg0) {
  }

  public void visitVarDef(JCTree.JCVariableDecl arg0) {
  }

  public void visitSkip(JCTree.JCSkip arg0) {
  }

  public void visitBlock(JCTree.JCBlock arg0) {
  }

  public void visitDoLoop(JCTree.JCDoWhileLoop arg0) {
  }

  public void visitWhileLoop(JCTree.JCWhileLoop arg0) {
  }

  public void visitForLoop(JCTree.JCForLoop arg0) {
  }

  public void visitForeachLoop(JCTree.JCEnhancedForLoop arg0) {
  }

  public void visitLabelled(JCTree.JCLabeledStatement arg0) {
  }

  public void visitSwitch(JCTree.JCSwitch arg0) {
  }

  public void visitCase(JCTree.JCCase arg0) {
  }

  public void visitDefaultCaseLabel(JCTree.JCDefaultCaseLabel arg0) {
  }

  public void visitConstantCaseLabel(JCTree.JCConstantCaseLabel arg0) {
  }

  public void visitPatternCaseLabel(JCTree.JCPatternCaseLabel arg0) {
  }

  public void visitSwitchExpression(JCTree.JCSwitchExpression arg0) {
  }

  public void visitBindingPattern(JCTree.JCBindingPattern arg0) {
  }

  public void visitAnyPattern(JCTree.JCAnyPattern arg0) {
  }

  public void visitRecordPattern(JCTree.JCRecordPattern arg0) {
  }

  public void visitSynchronized(JCTree.JCSynchronized arg0) {
  }

  public void visitTry(JCTree.JCTry arg0) {
  }

  public void visitCatch(JCTree.JCCatch arg0) {
  }

  public void visitConditional(JCTree.JCConditional arg0) {
  }

  public void visitIf(JCTree.JCIf arg0) {
  }

  public void visitExec(JCTree.JCExpressionStatement arg0) {
  }

  public void visitBreak(JCTree.JCBreak arg0) {
  }

  public void visitYield(JCTree.JCYield arg0) {
  }

  public void visitContinue(JCTree.JCContinue arg0) {
  }

  public void visitReturn(JCTree.JCReturn arg0) {
  }

  public void visitThrow(JCTree.JCThrow arg0) {
  }

  public void visitAssert(JCTree.JCAssert arg0) {
  }

  public void visitApply(JCTree.JCMethodInvocation arg0) {
  }

  public void visitNewClass(JCTree.JCNewClass arg0) {
  }

  public void visitNewArray(JCTree.JCNewArray arg0) {
  }

  public void visitLambda(JCTree.JCLambda arg0) {
  }

  public void visitParens(JCTree.JCParens arg0) {
  }

  public void visitAssign(JCTree.JCAssign arg0) {
  }

  public String operatorName(JCTree.Tag arg0) {
    return null;
  }

  public void visitAssignop(JCTree.JCAssignOp arg0) {
  }

  public void visitUnary(JCTree.JCUnary arg0) {
  }

  public void visitBinary(JCTree.JCBinary arg0) {
  }

  public void visitTypeCast(JCTree.JCTypeCast arg0) {
  }

  public void visitTypeTest(JCTree.JCInstanceOf arg0) {
  }

  public void visitIndexed(JCTree.JCArrayAccess arg0) {
  }

  public void visitSelect(JCTree.JCFieldAccess arg0) {
  }

  public void visitReference(JCTree.JCMemberReference arg0) {
  }

  public void visitIdent(JCTree.JCIdent arg0) {
  }

  public void visitLiteral(JCTree.JCLiteral arg0) {
  }

  public void visitStringTemplate(JCTree.JCStringTemplate arg0) {
  }

  public void visitTypeIdent(JCTree.JCPrimitiveTypeTree arg0) {
  }

  public void visitTypeArray(JCTree.JCArrayTypeTree arg0) {
  }

  private void printBaseElementType(JCTree arg0) {
  }

  private void printBrackets(JCTree arg0) {
  }

  public void visitTypeApply(JCTree.JCTypeApply arg0) {
  }

  public void visitTypeUnion(JCTree.JCTypeUnion arg0) {
  }

  public void visitTypeIntersection(JCTree.JCTypeIntersection arg0) {
  }

  public void visitTypeParameter(JCTree.JCTypeParameter arg0) {
  }

  public void visitWildcard(JCTree.JCWildcard arg0) {
  }

  public void visitTypeBoundKind(JCTree.TypeBoundKind arg0) {
  }

  public void visitErroneous(JCTree.JCErroneous arg0) {
  }

  public void visitLetExpr(JCTree.LetExpr arg0) {
  }

  public void visitModifiers(JCTree.JCModifiers arg0) {
  }

  public void visitAnnotation(JCTree.JCAnnotation arg0) {
  }

  public void visitAnnotatedType(JCTree.JCAnnotatedType arg0) {
  }

  public void visitTree(JCTree arg0) {
  }
}
