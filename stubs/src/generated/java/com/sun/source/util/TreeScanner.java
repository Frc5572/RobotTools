package com.sun.source.util;

import com.sun.source.tree.AnnotatedTypeTree;
import com.sun.source.tree.AnnotationTree;
import com.sun.source.tree.AnyPatternTree;
import com.sun.source.tree.ArrayAccessTree;
import com.sun.source.tree.ArrayTypeTree;
import com.sun.source.tree.AssertTree;
import com.sun.source.tree.AssignmentTree;
import com.sun.source.tree.BinaryTree;
import com.sun.source.tree.BindingPatternTree;
import com.sun.source.tree.BlockTree;
import com.sun.source.tree.BreakTree;
import com.sun.source.tree.CaseTree;
import com.sun.source.tree.CatchTree;
import com.sun.source.tree.ClassTree;
import com.sun.source.tree.CompilationUnitTree;
import com.sun.source.tree.CompoundAssignmentTree;
import com.sun.source.tree.ConditionalExpressionTree;
import com.sun.source.tree.ConstantCaseLabelTree;
import com.sun.source.tree.ContinueTree;
import com.sun.source.tree.DeconstructionPatternTree;
import com.sun.source.tree.DefaultCaseLabelTree;
import com.sun.source.tree.DoWhileLoopTree;
import com.sun.source.tree.EmptyStatementTree;
import com.sun.source.tree.EnhancedForLoopTree;
import com.sun.source.tree.ErroneousTree;
import com.sun.source.tree.ExportsTree;
import com.sun.source.tree.ExpressionStatementTree;
import com.sun.source.tree.ForLoopTree;
import com.sun.source.tree.IdentifierTree;
import com.sun.source.tree.IfTree;
import com.sun.source.tree.ImportTree;
import com.sun.source.tree.InstanceOfTree;
import com.sun.source.tree.IntersectionTypeTree;
import com.sun.source.tree.LabeledStatementTree;
import com.sun.source.tree.LambdaExpressionTree;
import com.sun.source.tree.LiteralTree;
import com.sun.source.tree.MemberReferenceTree;
import com.sun.source.tree.MemberSelectTree;
import com.sun.source.tree.MethodInvocationTree;
import com.sun.source.tree.MethodTree;
import com.sun.source.tree.ModifiersTree;
import com.sun.source.tree.ModuleTree;
import com.sun.source.tree.NewArrayTree;
import com.sun.source.tree.NewClassTree;
import com.sun.source.tree.OpensTree;
import com.sun.source.tree.PackageTree;
import com.sun.source.tree.ParameterizedTypeTree;
import com.sun.source.tree.ParenthesizedTree;
import com.sun.source.tree.PatternCaseLabelTree;
import com.sun.source.tree.PrimitiveTypeTree;
import com.sun.source.tree.ProvidesTree;
import com.sun.source.tree.RequiresTree;
import com.sun.source.tree.ReturnTree;
import com.sun.source.tree.StringTemplateTree;
import com.sun.source.tree.SwitchExpressionTree;
import com.sun.source.tree.SwitchTree;
import com.sun.source.tree.SynchronizedTree;
import com.sun.source.tree.ThrowTree;
import com.sun.source.tree.Tree;
import com.sun.source.tree.TreeVisitor;
import com.sun.source.tree.TryTree;
import com.sun.source.tree.TypeCastTree;
import com.sun.source.tree.TypeParameterTree;
import com.sun.source.tree.UnaryTree;
import com.sun.source.tree.UnionTypeTree;
import com.sun.source.tree.UsesTree;
import com.sun.source.tree.VariableTree;
import com.sun.source.tree.WhileLoopTree;
import com.sun.source.tree.WildcardTree;
import com.sun.source.tree.YieldTree;
import java.lang.Iterable;
import java.lang.Object;

public class TreeScanner implements TreeVisitor {
  public TreeScanner() {
  }

  public Object scan(Tree arg0, Object arg1) {
    return null;
  }

  private Object scanAndReduce(Tree arg0, Object arg1, Object arg2) {
    return null;
  }

  public Object scan(Iterable arg0, Object arg1) {
    return null;
  }

  private Object scanAndReduce(Iterable arg0, Object arg1, Object arg2) {
    return null;
  }

  public Object reduce(Object arg0, Object arg1) {
    return null;
  }

  public Object visitCompilationUnit(CompilationUnitTree arg0, Object arg1) {
    return null;
  }

  public Object visitPackage(PackageTree arg0, Object arg1) {
    return null;
  }

  public Object visitImport(ImportTree arg0, Object arg1) {
    return null;
  }

  public Object visitClass(ClassTree arg0, Object arg1) {
    return null;
  }

  public Object visitMethod(MethodTree arg0, Object arg1) {
    return null;
  }

  public Object visitVariable(VariableTree arg0, Object arg1) {
    return null;
  }

  public Object visitEmptyStatement(EmptyStatementTree arg0, Object arg1) {
    return null;
  }

  public Object visitBlock(BlockTree arg0, Object arg1) {
    return null;
  }

  public Object visitDoWhileLoop(DoWhileLoopTree arg0, Object arg1) {
    return null;
  }

  public Object visitWhileLoop(WhileLoopTree arg0, Object arg1) {
    return null;
  }

  public Object visitForLoop(ForLoopTree arg0, Object arg1) {
    return null;
  }

  public Object visitEnhancedForLoop(EnhancedForLoopTree arg0, Object arg1) {
    return null;
  }

  public Object visitLabeledStatement(LabeledStatementTree arg0, Object arg1) {
    return null;
  }

  public Object visitSwitch(SwitchTree arg0, Object arg1) {
    return null;
  }

  public Object visitSwitchExpression(SwitchExpressionTree arg0, Object arg1) {
    return null;
  }

  public Object visitCase(CaseTree arg0, Object arg1) {
    return null;
  }

  public Object visitSynchronized(SynchronizedTree arg0, Object arg1) {
    return null;
  }

  public Object visitTry(TryTree arg0, Object arg1) {
    return null;
  }

  public Object visitCatch(CatchTree arg0, Object arg1) {
    return null;
  }

  public Object visitConditionalExpression(ConditionalExpressionTree arg0, Object arg1) {
    return null;
  }

  public Object visitIf(IfTree arg0, Object arg1) {
    return null;
  }

  public Object visitExpressionStatement(ExpressionStatementTree arg0, Object arg1) {
    return null;
  }

  public Object visitBreak(BreakTree arg0, Object arg1) {
    return null;
  }

  public Object visitContinue(ContinueTree arg0, Object arg1) {
    return null;
  }

  public Object visitReturn(ReturnTree arg0, Object arg1) {
    return null;
  }

  public Object visitThrow(ThrowTree arg0, Object arg1) {
    return null;
  }

  public Object visitAssert(AssertTree arg0, Object arg1) {
    return null;
  }

  public Object visitMethodInvocation(MethodInvocationTree arg0, Object arg1) {
    return null;
  }

  public Object visitNewClass(NewClassTree arg0, Object arg1) {
    return null;
  }

  public Object visitNewArray(NewArrayTree arg0, Object arg1) {
    return null;
  }

  public Object visitLambdaExpression(LambdaExpressionTree arg0, Object arg1) {
    return null;
  }

  public Object visitParenthesized(ParenthesizedTree arg0, Object arg1) {
    return null;
  }

  public Object visitAssignment(AssignmentTree arg0, Object arg1) {
    return null;
  }

  public Object visitCompoundAssignment(CompoundAssignmentTree arg0, Object arg1) {
    return null;
  }

  public Object visitUnary(UnaryTree arg0, Object arg1) {
    return null;
  }

  public Object visitBinary(BinaryTree arg0, Object arg1) {
    return null;
  }

  public Object visitTypeCast(TypeCastTree arg0, Object arg1) {
    return null;
  }

  public Object visitInstanceOf(InstanceOfTree arg0, Object arg1) {
    return null;
  }

  public Object visitAnyPattern(AnyPatternTree arg0, Object arg1) {
    return null;
  }

  public Object visitStringTemplate(StringTemplateTree arg0, Object arg1) {
    return null;
  }

  public Object visitBindingPattern(BindingPatternTree arg0, Object arg1) {
    return null;
  }

  public Object visitDefaultCaseLabel(DefaultCaseLabelTree arg0, Object arg1) {
    return null;
  }

  public Object visitConstantCaseLabel(ConstantCaseLabelTree arg0, Object arg1) {
    return null;
  }

  public Object visitPatternCaseLabel(PatternCaseLabelTree arg0, Object arg1) {
    return null;
  }

  public Object visitDeconstructionPattern(DeconstructionPatternTree arg0, Object arg1) {
    return null;
  }

  public Object visitArrayAccess(ArrayAccessTree arg0, Object arg1) {
    return null;
  }

  public Object visitMemberSelect(MemberSelectTree arg0, Object arg1) {
    return null;
  }

  public Object visitMemberReference(MemberReferenceTree arg0, Object arg1) {
    return null;
  }

  public Object visitIdentifier(IdentifierTree arg0, Object arg1) {
    return null;
  }

  public Object visitLiteral(LiteralTree arg0, Object arg1) {
    return null;
  }

  public Object visitPrimitiveType(PrimitiveTypeTree arg0, Object arg1) {
    return null;
  }

  public Object visitArrayType(ArrayTypeTree arg0, Object arg1) {
    return null;
  }

  public Object visitParameterizedType(ParameterizedTypeTree arg0, Object arg1) {
    return null;
  }

  public Object visitUnionType(UnionTypeTree arg0, Object arg1) {
    return null;
  }

  public Object visitIntersectionType(IntersectionTypeTree arg0, Object arg1) {
    return null;
  }

  public Object visitTypeParameter(TypeParameterTree arg0, Object arg1) {
    return null;
  }

  public Object visitWildcard(WildcardTree arg0, Object arg1) {
    return null;
  }

  public Object visitModifiers(ModifiersTree arg0, Object arg1) {
    return null;
  }

  public Object visitAnnotation(AnnotationTree arg0, Object arg1) {
    return null;
  }

  public Object visitAnnotatedType(AnnotatedTypeTree arg0, Object arg1) {
    return null;
  }

  public Object visitModule(ModuleTree arg0, Object arg1) {
    return null;
  }

  public Object visitExports(ExportsTree arg0, Object arg1) {
    return null;
  }

  public Object visitOpens(OpensTree arg0, Object arg1) {
    return null;
  }

  public Object visitProvides(ProvidesTree arg0, Object arg1) {
    return null;
  }

  public Object visitRequires(RequiresTree arg0, Object arg1) {
    return null;
  }

  public Object visitUses(UsesTree arg0, Object arg1) {
    return null;
  }

  public Object visitOther(Tree arg0, Object arg1) {
    return null;
  }

  public Object visitErroneous(ErroneousTree arg0, Object arg1) {
    return null;
  }

  public Object visitYield(YieldTree arg0, Object arg1) {
    return null;
  }
}
