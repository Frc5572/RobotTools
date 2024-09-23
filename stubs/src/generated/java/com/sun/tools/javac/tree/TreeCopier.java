package com.sun.tools.javac.tree;

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
import com.sun.tools.javac.util.List;
import java.lang.Object;

public class TreeCopier implements TreeVisitor {
  public TreeCopier(TreeMaker arg0) {
  }

  public JCTree copy(JCTree arg0) {
    return null;
  }

  public JCTree copy(JCTree arg0, Object arg1) {
    return null;
  }

  public List copy(List arg0) {
    return null;
  }

  public List copy(List arg0, Object arg1) {
    return null;
  }

  public JCTree visitAnnotatedType(AnnotatedTypeTree arg0, Object arg1) {
    return null;
  }

  public JCTree visitAnnotation(AnnotationTree arg0, Object arg1) {
    return null;
  }

  public JCTree visitAssert(AssertTree arg0, Object arg1) {
    return null;
  }

  public JCTree visitAssignment(AssignmentTree arg0, Object arg1) {
    return null;
  }

  public JCTree visitCompoundAssignment(CompoundAssignmentTree arg0, Object arg1) {
    return null;
  }

  public JCTree visitBinary(BinaryTree arg0, Object arg1) {
    return null;
  }

  public JCTree visitBlock(BlockTree arg0, Object arg1) {
    return null;
  }

  public JCTree visitBreak(BreakTree arg0, Object arg1) {
    return null;
  }

  public JCTree visitYield(YieldTree arg0, Object arg1) {
    return null;
  }

  public JCTree visitCase(CaseTree arg0, Object arg1) {
    return null;
  }

  public JCTree visitCatch(CatchTree arg0, Object arg1) {
    return null;
  }

  public JCTree visitClass(ClassTree arg0, Object arg1) {
    return null;
  }

  public JCTree visitConditionalExpression(ConditionalExpressionTree arg0, Object arg1) {
    return null;
  }

  public JCTree visitContinue(ContinueTree arg0, Object arg1) {
    return null;
  }

  public JCTree visitDoWhileLoop(DoWhileLoopTree arg0, Object arg1) {
    return null;
  }

  public JCTree visitErroneous(ErroneousTree arg0, Object arg1) {
    return null;
  }

  public JCTree visitExpressionStatement(ExpressionStatementTree arg0, Object arg1) {
    return null;
  }

  public JCTree visitEnhancedForLoop(EnhancedForLoopTree arg0, Object arg1) {
    return null;
  }

  public JCTree visitForLoop(ForLoopTree arg0, Object arg1) {
    return null;
  }

  public JCTree visitIdentifier(IdentifierTree arg0, Object arg1) {
    return null;
  }

  public JCTree visitIf(IfTree arg0, Object arg1) {
    return null;
  }

  public JCTree visitImport(ImportTree arg0, Object arg1) {
    return null;
  }

  public JCTree visitArrayAccess(ArrayAccessTree arg0, Object arg1) {
    return null;
  }

  public JCTree visitLabeledStatement(LabeledStatementTree arg0, Object arg1) {
    return null;
  }

  public JCTree visitLiteral(LiteralTree arg0, Object arg1) {
    return null;
  }

  public JCTree visitStringTemplate(StringTemplateTree arg0, Object arg1) {
    return null;
  }

  public JCTree visitMethod(MethodTree arg0, Object arg1) {
    return null;
  }

  public JCTree visitMethodInvocation(MethodInvocationTree arg0, Object arg1) {
    return null;
  }

  public JCTree visitModifiers(ModifiersTree arg0, Object arg1) {
    return null;
  }

  public JCTree visitNewArray(NewArrayTree arg0, Object arg1) {
    return null;
  }

  public JCTree visitNewClass(NewClassTree arg0, Object arg1) {
    return null;
  }

  public JCTree visitLambdaExpression(LambdaExpressionTree arg0, Object arg1) {
    return null;
  }

  public JCTree visitParenthesized(ParenthesizedTree arg0, Object arg1) {
    return null;
  }

  public JCTree visitReturn(ReturnTree arg0, Object arg1) {
    return null;
  }

  public JCTree visitMemberSelect(MemberSelectTree arg0, Object arg1) {
    return null;
  }

  public JCTree visitMemberReference(MemberReferenceTree arg0, Object arg1) {
    return null;
  }

  public JCTree visitEmptyStatement(EmptyStatementTree arg0, Object arg1) {
    return null;
  }

  public JCTree visitSwitch(SwitchTree arg0, Object arg1) {
    return null;
  }

  public JCTree visitSwitchExpression(SwitchExpressionTree arg0, Object arg1) {
    return null;
  }

  public JCTree visitSynchronized(SynchronizedTree arg0, Object arg1) {
    return null;
  }

  public JCTree visitThrow(ThrowTree arg0, Object arg1) {
    return null;
  }

  public JCTree visitCompilationUnit(CompilationUnitTree arg0, Object arg1) {
    return null;
  }

  public JCTree visitPackage(PackageTree arg0, Object arg1) {
    return null;
  }

  public JCTree visitTry(TryTree arg0, Object arg1) {
    return null;
  }

  public JCTree visitParameterizedType(ParameterizedTypeTree arg0, Object arg1) {
    return null;
  }

  public JCTree visitUnionType(UnionTypeTree arg0, Object arg1) {
    return null;
  }

  public JCTree visitIntersectionType(IntersectionTypeTree arg0, Object arg1) {
    return null;
  }

  public JCTree visitArrayType(ArrayTypeTree arg0, Object arg1) {
    return null;
  }

  public JCTree visitTypeCast(TypeCastTree arg0, Object arg1) {
    return null;
  }

  public JCTree visitPrimitiveType(PrimitiveTypeTree arg0, Object arg1) {
    return null;
  }

  public JCTree visitTypeParameter(TypeParameterTree arg0, Object arg1) {
    return null;
  }

  public JCTree visitInstanceOf(InstanceOfTree arg0, Object arg1) {
    return null;
  }

  public JCTree visitAnyPattern(AnyPatternTree arg0, Object arg1) {
    return null;
  }

  public JCTree visitBindingPattern(BindingPatternTree arg0, Object arg1) {
    return null;
  }

  public JCTree visitDefaultCaseLabel(DefaultCaseLabelTree arg0, Object arg1) {
    return null;
  }

  public JCTree visitConstantCaseLabel(ConstantCaseLabelTree arg0, Object arg1) {
    return null;
  }

  public JCTree visitPatternCaseLabel(PatternCaseLabelTree arg0, Object arg1) {
    return null;
  }

  public JCTree visitDeconstructionPattern(DeconstructionPatternTree arg0, Object arg1) {
    return null;
  }

  public JCTree visitUnary(UnaryTree arg0, Object arg1) {
    return null;
  }

  public JCTree visitVariable(VariableTree arg0, Object arg1) {
    return null;
  }

  public JCTree visitWhileLoop(WhileLoopTree arg0, Object arg1) {
    return null;
  }

  public JCTree visitWildcard(WildcardTree arg0, Object arg1) {
    return null;
  }

  public JCTree visitModule(ModuleTree arg0, Object arg1) {
    return null;
  }

  public JCTree.JCExports visitExports(ExportsTree arg0, Object arg1) {
    return null;
  }

  public JCTree.JCOpens visitOpens(OpensTree arg0, Object arg1) {
    return null;
  }

  public JCTree.JCProvides visitProvides(ProvidesTree arg0, Object arg1) {
    return null;
  }

  public JCTree.JCRequires visitRequires(RequiresTree arg0, Object arg1) {
    return null;
  }

  public JCTree.JCUses visitUses(UsesTree arg0, Object arg1) {
    return null;
  }

  public JCTree visitOther(Tree arg0, Object arg1) {
    return null;
  }

  public Object visitYield(YieldTree arg0, Object arg1) {
    return null;
  }

  public Object visitOther(Tree arg0, Object arg1) {
    return null;
  }

  public Object visitUses(UsesTree arg0, Object arg1) {
    return null;
  }

  public Object visitRequires(RequiresTree arg0, Object arg1) {
    return null;
  }

  public Object visitProvides(ProvidesTree arg0, Object arg1) {
    return null;
  }

  public Object visitOpens(OpensTree arg0, Object arg1) {
    return null;
  }

  public Object visitExports(ExportsTree arg0, Object arg1) {
    return null;
  }

  public Object visitModule(ModuleTree arg0, Object arg1) {
    return null;
  }

  public Object visitWildcard(WildcardTree arg0, Object arg1) {
    return null;
  }

  public Object visitWhileLoop(WhileLoopTree arg0, Object arg1) {
    return null;
  }

  public Object visitVariable(VariableTree arg0, Object arg1) {
    return null;
  }

  public Object visitUnary(UnaryTree arg0, Object arg1) {
    return null;
  }

  public Object visitInstanceOf(InstanceOfTree arg0, Object arg1) {
    return null;
  }

  public Object visitTypeParameter(TypeParameterTree arg0, Object arg1) {
    return null;
  }

  public Object visitPrimitiveType(PrimitiveTypeTree arg0, Object arg1) {
    return null;
  }

  public Object visitTypeCast(TypeCastTree arg0, Object arg1) {
    return null;
  }

  public Object visitArrayType(ArrayTypeTree arg0, Object arg1) {
    return null;
  }

  public Object visitIntersectionType(IntersectionTypeTree arg0, Object arg1) {
    return null;
  }

  public Object visitUnionType(UnionTypeTree arg0, Object arg1) {
    return null;
  }

  public Object visitParameterizedType(ParameterizedTypeTree arg0, Object arg1) {
    return null;
  }

  public Object visitTry(TryTree arg0, Object arg1) {
    return null;
  }

  public Object visitCompilationUnit(CompilationUnitTree arg0, Object arg1) {
    return null;
  }

  public Object visitThrow(ThrowTree arg0, Object arg1) {
    return null;
  }

  public Object visitSynchronized(SynchronizedTree arg0, Object arg1) {
    return null;
  }

  public Object visitSwitchExpression(SwitchExpressionTree arg0, Object arg1) {
    return null;
  }

  public Object visitSwitch(SwitchTree arg0, Object arg1) {
    return null;
  }

  public Object visitEmptyStatement(EmptyStatementTree arg0, Object arg1) {
    return null;
  }

  public Object visitMemberReference(MemberReferenceTree arg0, Object arg1) {
    return null;
  }

  public Object visitMemberSelect(MemberSelectTree arg0, Object arg1) {
    return null;
  }

  public Object visitReturn(ReturnTree arg0, Object arg1) {
    return null;
  }

  public Object visitParenthesized(ParenthesizedTree arg0, Object arg1) {
    return null;
  }

  public Object visitPackage(PackageTree arg0, Object arg1) {
    return null;
  }

  public Object visitLambdaExpression(LambdaExpressionTree arg0, Object arg1) {
    return null;
  }

  public Object visitNewClass(NewClassTree arg0, Object arg1) {
    return null;
  }

  public Object visitNewArray(NewArrayTree arg0, Object arg1) {
    return null;
  }

  public Object visitModifiers(ModifiersTree arg0, Object arg1) {
    return null;
  }

  public Object visitMethod(MethodTree arg0, Object arg1) {
    return null;
  }

  public Object visitDeconstructionPattern(DeconstructionPatternTree arg0, Object arg1) {
    return null;
  }

  public Object visitPatternCaseLabel(PatternCaseLabelTree arg0, Object arg1) {
    return null;
  }

  public Object visitConstantCaseLabel(ConstantCaseLabelTree arg0, Object arg1) {
    return null;
  }

  public Object visitDefaultCaseLabel(DefaultCaseLabelTree arg0, Object arg1) {
    return null;
  }

  public Object visitBindingPattern(BindingPatternTree arg0, Object arg1) {
    return null;
  }

  public Object visitAnyPattern(AnyPatternTree arg0, Object arg1) {
    return null;
  }

  public Object visitStringTemplate(StringTemplateTree arg0, Object arg1) {
    return null;
  }

  public Object visitLiteral(LiteralTree arg0, Object arg1) {
    return null;
  }

  public Object visitLabeledStatement(LabeledStatementTree arg0, Object arg1) {
    return null;
  }

  public Object visitArrayAccess(ArrayAccessTree arg0, Object arg1) {
    return null;
  }

  public Object visitImport(ImportTree arg0, Object arg1) {
    return null;
  }

  public Object visitIf(IfTree arg0, Object arg1) {
    return null;
  }

  public Object visitIdentifier(IdentifierTree arg0, Object arg1) {
    return null;
  }

  public Object visitForLoop(ForLoopTree arg0, Object arg1) {
    return null;
  }

  public Object visitEnhancedForLoop(EnhancedForLoopTree arg0, Object arg1) {
    return null;
  }

  public Object visitExpressionStatement(ExpressionStatementTree arg0, Object arg1) {
    return null;
  }

  public Object visitErroneous(ErroneousTree arg0, Object arg1) {
    return null;
  }

  public Object visitDoWhileLoop(DoWhileLoopTree arg0, Object arg1) {
    return null;
  }

  public Object visitContinue(ContinueTree arg0, Object arg1) {
    return null;
  }

  public Object visitConditionalExpression(ConditionalExpressionTree arg0, Object arg1) {
    return null;
  }

  public Object visitClass(ClassTree arg0, Object arg1) {
    return null;
  }

  public Object visitCatch(CatchTree arg0, Object arg1) {
    return null;
  }

  public Object visitCase(CaseTree arg0, Object arg1) {
    return null;
  }

  public Object visitBreak(BreakTree arg0, Object arg1) {
    return null;
  }

  public Object visitBlock(BlockTree arg0, Object arg1) {
    return null;
  }

  public Object visitBinary(BinaryTree arg0, Object arg1) {
    return null;
  }

  public Object visitCompoundAssignment(CompoundAssignmentTree arg0, Object arg1) {
    return null;
  }

  public Object visitAssignment(AssignmentTree arg0, Object arg1) {
    return null;
  }

  public Object visitAssert(AssertTree arg0, Object arg1) {
    return null;
  }

  public Object visitMethodInvocation(MethodInvocationTree arg0, Object arg1) {
    return null;
  }

  public Object visitAnnotation(AnnotationTree arg0, Object arg1) {
    return null;
  }

  public Object visitAnnotatedType(AnnotatedTypeTree arg0, Object arg1) {
    return null;
  }
}
