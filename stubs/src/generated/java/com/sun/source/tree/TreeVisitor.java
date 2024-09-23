package com.sun.source.tree;

import java.lang.Object;

public interface TreeVisitor {
  Object visitAnnotatedType(AnnotatedTypeTree arg0, Object arg1);

  Object visitAnnotation(AnnotationTree arg0, Object arg1);

  Object visitMethodInvocation(MethodInvocationTree arg0, Object arg1);

  Object visitAssert(AssertTree arg0, Object arg1);

  Object visitAssignment(AssignmentTree arg0, Object arg1);

  Object visitCompoundAssignment(CompoundAssignmentTree arg0, Object arg1);

  Object visitBinary(BinaryTree arg0, Object arg1);

  Object visitBlock(BlockTree arg0, Object arg1);

  Object visitBreak(BreakTree arg0, Object arg1);

  Object visitCase(CaseTree arg0, Object arg1);

  Object visitCatch(CatchTree arg0, Object arg1);

  Object visitClass(ClassTree arg0, Object arg1);

  Object visitConditionalExpression(ConditionalExpressionTree arg0, Object arg1);

  Object visitContinue(ContinueTree arg0, Object arg1);

  Object visitDoWhileLoop(DoWhileLoopTree arg0, Object arg1);

  Object visitErroneous(ErroneousTree arg0, Object arg1);

  Object visitExpressionStatement(ExpressionStatementTree arg0, Object arg1);

  Object visitEnhancedForLoop(EnhancedForLoopTree arg0, Object arg1);

  Object visitForLoop(ForLoopTree arg0, Object arg1);

  Object visitIdentifier(IdentifierTree arg0, Object arg1);

  Object visitIf(IfTree arg0, Object arg1);

  Object visitImport(ImportTree arg0, Object arg1);

  Object visitArrayAccess(ArrayAccessTree arg0, Object arg1);

  Object visitLabeledStatement(LabeledStatementTree arg0, Object arg1);

  Object visitLiteral(LiteralTree arg0, Object arg1);

  Object visitStringTemplate(StringTemplateTree arg0, Object arg1);

  Object visitAnyPattern(AnyPatternTree arg0, Object arg1);

  Object visitBindingPattern(BindingPatternTree arg0, Object arg1);

  Object visitDefaultCaseLabel(DefaultCaseLabelTree arg0, Object arg1);

  Object visitConstantCaseLabel(ConstantCaseLabelTree arg0, Object arg1);

  Object visitPatternCaseLabel(PatternCaseLabelTree arg0, Object arg1);

  Object visitDeconstructionPattern(DeconstructionPatternTree arg0, Object arg1);

  Object visitMethod(MethodTree arg0, Object arg1);

  Object visitModifiers(ModifiersTree arg0, Object arg1);

  Object visitNewArray(NewArrayTree arg0, Object arg1);

  Object visitNewClass(NewClassTree arg0, Object arg1);

  Object visitLambdaExpression(LambdaExpressionTree arg0, Object arg1);

  Object visitPackage(PackageTree arg0, Object arg1);

  Object visitParenthesized(ParenthesizedTree arg0, Object arg1);

  Object visitReturn(ReturnTree arg0, Object arg1);

  Object visitMemberSelect(MemberSelectTree arg0, Object arg1);

  Object visitMemberReference(MemberReferenceTree arg0, Object arg1);

  Object visitEmptyStatement(EmptyStatementTree arg0, Object arg1);

  Object visitSwitch(SwitchTree arg0, Object arg1);

  Object visitSwitchExpression(SwitchExpressionTree arg0, Object arg1);

  Object visitSynchronized(SynchronizedTree arg0, Object arg1);

  Object visitThrow(ThrowTree arg0, Object arg1);

  Object visitCompilationUnit(CompilationUnitTree arg0, Object arg1);

  Object visitTry(TryTree arg0, Object arg1);

  Object visitParameterizedType(ParameterizedTypeTree arg0, Object arg1);

  Object visitUnionType(UnionTypeTree arg0, Object arg1);

  Object visitIntersectionType(IntersectionTypeTree arg0, Object arg1);

  Object visitArrayType(ArrayTypeTree arg0, Object arg1);

  Object visitTypeCast(TypeCastTree arg0, Object arg1);

  Object visitPrimitiveType(PrimitiveTypeTree arg0, Object arg1);

  Object visitTypeParameter(TypeParameterTree arg0, Object arg1);

  Object visitInstanceOf(InstanceOfTree arg0, Object arg1);

  Object visitUnary(UnaryTree arg0, Object arg1);

  Object visitVariable(VariableTree arg0, Object arg1);

  Object visitWhileLoop(WhileLoopTree arg0, Object arg1);

  Object visitWildcard(WildcardTree arg0, Object arg1);

  Object visitModule(ModuleTree arg0, Object arg1);

  Object visitExports(ExportsTree arg0, Object arg1);

  Object visitOpens(OpensTree arg0, Object arg1);

  Object visitProvides(ProvidesTree arg0, Object arg1);

  Object visitRequires(RequiresTree arg0, Object arg1);

  Object visitUses(UsesTree arg0, Object arg1);

  Object visitOther(Tree arg0, Object arg1);

  Object visitYield(YieldTree arg0, Object arg1);
}
