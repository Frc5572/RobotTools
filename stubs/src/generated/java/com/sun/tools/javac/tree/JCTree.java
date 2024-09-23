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
import com.sun.source.tree.CaseLabelTree;
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
import com.sun.source.tree.DirectiveTree;
import com.sun.source.tree.DoWhileLoopTree;
import com.sun.source.tree.EmptyStatementTree;
import com.sun.source.tree.EnhancedForLoopTree;
import com.sun.source.tree.ErroneousTree;
import com.sun.source.tree.ExportsTree;
import com.sun.source.tree.ExpressionStatementTree;
import com.sun.source.tree.ExpressionTree;
import com.sun.source.tree.ForLoopTree;
import com.sun.source.tree.IdentifierTree;
import com.sun.source.tree.IfTree;
import com.sun.source.tree.ImportTree;
import com.sun.source.tree.InstanceOfTree;
import com.sun.source.tree.IntersectionTypeTree;
import com.sun.source.tree.LabeledStatementTree;
import com.sun.source.tree.LambdaExpressionTree;
import com.sun.source.tree.LineMap;
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
import com.sun.source.tree.PatternTree;
import com.sun.source.tree.PrimitiveTypeTree;
import com.sun.source.tree.ProvidesTree;
import com.sun.source.tree.RequiresTree;
import com.sun.source.tree.ReturnTree;
import com.sun.source.tree.StatementTree;
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
import com.sun.tools.javac.code.BoundKind;
import com.sun.tools.javac.code.Symbol;
import com.sun.tools.javac.code.Type;
import com.sun.tools.javac.code.TypeTag;
import com.sun.tools.javac.code.Types;
import com.sun.tools.javac.util.JCDiagnostic;
import com.sun.tools.javac.util.List;
import com.sun.tools.javac.util.Name;
import com.sun.tools.javac.util.Position;
import java.lang.Cloneable;
import java.lang.Object;
import java.lang.Record;
import java.lang.String;
import java.util.Set;
import javax.lang.model.type.TypeKind;
import javax.tools.JavaFileObject;

public abstract class JCTree implements Tree, Cloneable, JCDiagnostic.DiagnosticPosition {
  public JCTree() {
  }

  public abstract Tag getTag();

  public boolean hasTag(Tag arg0) {
    return false;
  }

  public String toString() {
    return null;
  }

  public JCTree setPos(int arg0) {
    return null;
  }

  public JCTree setType(Type arg0) {
    return null;
  }

  public abstract void accept(Visitor arg0);

  public abstract Object accept(TreeVisitor arg0, Object arg1);

  public Object clone() {
    return null;
  }

  public JCDiagnostic.DiagnosticPosition pos() {
    return null;
  }

  public JCTree getTree() {
    return null;
  }

  public int getStartPosition() {
    return 0;
  }

  public int getPreferredPosition() {
    return 0;
  }

  public int getEndPosition(EndPosTable arg0) {
    return 0;
  }

  public interface Factory {
    JCCompilationUnit TopLevel(List arg0);

    JCPackageDecl PackageDecl(List arg0, JCExpression arg1);

    JCImport Import(JCFieldAccess arg0, boolean arg1);

    JCClassDecl ClassDef(JCModifiers arg0, Name arg1, List arg2, JCExpression arg3, List arg4,
        List arg5);

    JCMethodDecl MethodDef(JCModifiers arg0, Name arg1, JCExpression arg2, List arg3,
        JCVariableDecl arg4, List arg5, List arg6, JCBlock arg7, JCExpression arg8);

    JCVariableDecl VarDef(JCModifiers arg0, Name arg1, JCExpression arg2, JCExpression arg3);

    JCSkip Skip();

    JCBlock Block(long arg0, List arg1);

    JCDoWhileLoop DoLoop(JCStatement arg0, JCExpression arg1);

    JCWhileLoop WhileLoop(JCExpression arg0, JCStatement arg1);

    JCForLoop ForLoop(List arg0, JCExpression arg1, List arg2, JCStatement arg3);

    JCEnhancedForLoop ForeachLoop(JCVariableDecl arg0, JCExpression arg1, JCStatement arg2);

    JCLabeledStatement Labelled(Name arg0, JCStatement arg1);

    JCSwitch Switch(JCExpression arg0, List arg1);

    JCSwitchExpression SwitchExpression(JCExpression arg0, List arg1);

    JCCase Case(CaseTree.CaseKind arg0, List arg1, JCExpression arg2, List arg3, JCTree arg4);

    JCSynchronized Synchronized(JCExpression arg0, JCBlock arg1);

    JCTry Try(JCBlock arg0, List arg1, JCBlock arg2);

    JCTry Try(List arg0, JCBlock arg1, List arg2, JCBlock arg3);

    JCCatch Catch(JCVariableDecl arg0, JCBlock arg1);

    JCConditional Conditional(JCExpression arg0, JCExpression arg1, JCExpression arg2);

    JCIf If(JCExpression arg0, JCStatement arg1, JCStatement arg2);

    JCExpressionStatement Exec(JCExpression arg0);

    JCBreak Break(Name arg0);

    JCYield Yield(JCExpression arg0);

    JCContinue Continue(Name arg0);

    JCReturn Return(JCExpression arg0);

    JCThrow Throw(JCExpression arg0);

    JCAssert Assert(JCExpression arg0, JCExpression arg1);

    JCMethodInvocation Apply(List arg0, JCExpression arg1, List arg2);

    JCNewClass NewClass(JCExpression arg0, List arg1, JCExpression arg2, List arg3,
        JCClassDecl arg4);

    JCNewArray NewArray(JCExpression arg0, List arg1, List arg2);

    JCParens Parens(JCExpression arg0);

    JCAssign Assign(JCExpression arg0, JCExpression arg1);

    JCAssignOp Assignop(Tag arg0, JCTree arg1, JCTree arg2);

    JCUnary Unary(Tag arg0, JCExpression arg1);

    JCBinary Binary(Tag arg0, JCExpression arg1, JCExpression arg2);

    JCTypeCast TypeCast(JCTree arg0, JCExpression arg1);

    JCInstanceOf TypeTest(JCExpression arg0, JCTree arg1);

    JCBindingPattern BindingPattern(JCVariableDecl arg0);

    JCArrayAccess Indexed(JCExpression arg0, JCExpression arg1);

    JCFieldAccess Select(JCExpression arg0, Name arg1);

    JCIdent Ident(Name arg0);

    JCLiteral Literal(TypeTag arg0, Object arg1);

    JCStringTemplate StringTemplate(JCExpression arg0, List arg1, List arg2);

    JCPrimitiveTypeTree TypeIdent(TypeTag arg0);

    JCArrayTypeTree TypeArray(JCExpression arg0);

    JCTypeApply TypeApply(JCExpression arg0, List arg1);

    JCTypeParameter TypeParameter(Name arg0, List arg1);

    JCWildcard Wildcard(TypeBoundKind arg0, JCTree arg1);

    TypeBoundKind TypeBoundKind(BoundKind arg0);

    JCAnnotation Annotation(JCTree arg0, List arg1);

    JCModifiers Modifiers(long arg0, List arg1);

    JCErroneous Erroneous(List arg0);

    JCModuleDecl ModuleDef(JCModifiers arg0, ModuleTree.ModuleKind arg1, JCExpression arg2,
        List arg3);

    JCExports Exports(JCExpression arg0, List arg1);

    JCOpens Opens(JCExpression arg0, List arg1);

    JCProvides Provides(JCExpression arg0, List arg1);

    JCRequires Requires(boolean arg0, boolean arg1, JCExpression arg2);

    JCUses Uses(JCExpression arg0);

    LetExpr LetExpr(List arg0, JCExpression arg1);
  }

  public static class JCAnnotatedType extends JCExpression implements AnnotatedTypeTree {
    protected JCAnnotatedType(List arg0, JCExpression arg1) {
    }

    public void accept(Visitor arg0) {
    }

    public Tree.Kind getKind() {
      return null;
    }

    public List getAnnotations() {
      return null;
    }

    public JCExpression getUnderlyingType() {
      return null;
    }

    public Object accept(TreeVisitor arg0, Object arg1) {
      return null;
    }

    public Tag getTag() {
      return null;
    }

    public ExpressionTree getUnderlyingType() {
      return null;
    }

    public java.util.List getAnnotations() {
      return null;
    }
  }

  public static class JCAnnotation extends JCExpression implements AnnotationTree {
    protected JCAnnotation(Tag arg0, JCTree arg1, List arg2) {
    }

    public void accept(Visitor arg0) {
    }

    public Tree.Kind getKind() {
      return null;
    }

    public JCTree getAnnotationType() {
      return null;
    }

    public List getArguments() {
      return null;
    }

    public Object accept(TreeVisitor arg0, Object arg1) {
      return null;
    }

    public Tag getTag() {
      return null;
    }

    public java.util.List getArguments() {
      return null;
    }

    public Tree getAnnotationType() {
      return null;
    }
  }

  public static class JCAnyPattern extends JCPattern implements AnyPatternTree {
    protected JCAnyPattern() {
    }

    public void accept(Visitor arg0) {
    }

    public Tree.Kind getKind() {
      return null;
    }

    public Object accept(TreeVisitor arg0, Object arg1) {
      return null;
    }

    public Tag getTag() {
      return null;
    }
  }

  public static class JCArrayAccess extends JCExpression implements ArrayAccessTree {
    protected JCArrayAccess(JCExpression arg0, JCExpression arg1) {
    }

    public void accept(Visitor arg0) {
    }

    public Tree.Kind getKind() {
      return null;
    }

    public JCExpression getExpression() {
      return null;
    }

    public JCExpression getIndex() {
      return null;
    }

    public Object accept(TreeVisitor arg0, Object arg1) {
      return null;
    }

    public Tag getTag() {
      return null;
    }

    public ExpressionTree getIndex() {
      return null;
    }

    public ExpressionTree getExpression() {
      return null;
    }
  }

  public static class JCArrayTypeTree extends JCExpression implements ArrayTypeTree {
    protected JCArrayTypeTree(JCExpression arg0) {
    }

    public void accept(Visitor arg0) {
    }

    public Tree.Kind getKind() {
      return null;
    }

    public JCTree getType() {
      return null;
    }

    public Object accept(TreeVisitor arg0, Object arg1) {
      return null;
    }

    public Tag getTag() {
      return null;
    }

    public Tree getType() {
      return null;
    }
  }

  public static class JCAssert extends JCStatement implements AssertTree {
    protected JCAssert(JCExpression arg0, JCExpression arg1) {
    }

    public void accept(Visitor arg0) {
    }

    public Tree.Kind getKind() {
      return null;
    }

    public JCExpression getCondition() {
      return null;
    }

    public JCExpression getDetail() {
      return null;
    }

    public Object accept(TreeVisitor arg0, Object arg1) {
      return null;
    }

    public Tag getTag() {
      return null;
    }

    public ExpressionTree getDetail() {
      return null;
    }

    public ExpressionTree getCondition() {
      return null;
    }
  }

  public static class JCAssign extends JCExpression implements AssignmentTree {
    protected JCAssign(JCExpression arg0, JCExpression arg1) {
    }

    public void accept(Visitor arg0) {
    }

    public Tree.Kind getKind() {
      return null;
    }

    public JCExpression getVariable() {
      return null;
    }

    public JCExpression getExpression() {
      return null;
    }

    public Object accept(TreeVisitor arg0, Object arg1) {
      return null;
    }

    public Tag getTag() {
      return null;
    }

    public ExpressionTree getExpression() {
      return null;
    }

    public ExpressionTree getVariable() {
      return null;
    }
  }

  public static class JCAssignOp extends JCOperatorExpression implements CompoundAssignmentTree {
    protected JCAssignOp(Tag arg0, JCTree arg1, JCTree arg2, Symbol.OperatorSymbol arg3) {
    }

    public void accept(Visitor arg0) {
    }

    public Tree.Kind getKind() {
      return null;
    }

    public JCExpression getVariable() {
      return null;
    }

    public JCExpression getExpression() {
      return null;
    }

    public Object accept(TreeVisitor arg0, Object arg1) {
      return null;
    }

    public JCExpression getOperand(JCOperatorExpression.OperandPos arg0) {
      return null;
    }

    public ExpressionTree getExpression() {
      return null;
    }

    public ExpressionTree getVariable() {
      return null;
    }
  }

  public static class JCBinary extends JCOperatorExpression implements BinaryTree {
    protected JCBinary(Tag arg0, JCExpression arg1, JCExpression arg2, Symbol.OperatorSymbol arg3) {
    }

    public void accept(Visitor arg0) {
    }

    public Tree.Kind getKind() {
      return null;
    }

    public JCExpression getLeftOperand() {
      return null;
    }

    public JCExpression getRightOperand() {
      return null;
    }

    public Object accept(TreeVisitor arg0, Object arg1) {
      return null;
    }

    public JCExpression getOperand(JCOperatorExpression.OperandPos arg0) {
      return null;
    }

    public ExpressionTree getRightOperand() {
      return null;
    }

    public ExpressionTree getLeftOperand() {
      return null;
    }
  }

  public static class JCBindingPattern extends JCPattern implements BindingPatternTree {
    protected JCBindingPattern(JCVariableDecl arg0) {
    }

    public VariableTree getVariable() {
      return null;
    }

    public void accept(Visitor arg0) {
    }

    public Tree.Kind getKind() {
      return null;
    }

    public Object accept(TreeVisitor arg0, Object arg1) {
      return null;
    }

    public Tag getTag() {
      return null;
    }
  }

  public static final class PatternMatchingCatch extends Record {
    public PatternMatchingCatch(JCCatch arg0, Set arg1) {
    }

    public final String toString() {
      return null;
    }

    public final int hashCode() {
      return 0;
    }

    public final boolean equals(Object arg0) {
      return false;
    }

    public JCCatch handler() {
      return null;
    }

    public Set calls2Handle() {
      return null;
    }
  }

  public static class JCBlock extends JCStatement implements BlockTree {
    protected JCBlock(long arg0, List arg1) {
    }

    public void accept(Visitor arg0) {
    }

    public Tree.Kind getKind() {
      return null;
    }

    public List getStatements() {
      return null;
    }

    public boolean isStatic() {
      return false;
    }

    public Object accept(TreeVisitor arg0, Object arg1) {
      return null;
    }

    public Tag getTag() {
      return null;
    }

    public java.util.List getStatements() {
      return null;
    }
  }

  public static class JCBreak extends JCStatement implements BreakTree {
    protected JCBreak(Name arg0, JCTree arg1) {
    }

    public void accept(Visitor arg0) {
    }

    public boolean isValueBreak() {
      return false;
    }

    public Tree.Kind getKind() {
      return null;
    }

    public Name getLabel() {
      return null;
    }

    public Object accept(TreeVisitor arg0, Object arg1) {
      return null;
    }

    public Tag getTag() {
      return null;
    }

    public javax.lang.model.element.Name getLabel() {
      return null;
    }
  }

  public static class JCCase extends JCStatement implements CaseTree {
    protected JCCase(CaseTree.CaseKind arg0, List arg1, JCExpression arg2, List arg3, JCTree arg4) {
    }

    public void accept(Visitor arg0) {
    }

    public Tree.Kind getKind() {
      return null;
    }

    public JCExpression getExpression() {
      return null;
    }

    public List getExpressions() {
      return null;
    }

    public List getLabels() {
      return null;
    }

    public JCExpression getGuard() {
      return null;
    }

    public List getStatements() {
      return null;
    }

    public JCTree getBody() {
      return null;
    }

    public CaseTree.CaseKind getCaseKind() {
      return null;
    }

    public Object accept(TreeVisitor arg0, Object arg1) {
      return null;
    }

    public Tag getTag() {
      return null;
    }

    public Tree getBody() {
      return null;
    }

    public java.util.List getStatements() {
      return null;
    }

    public ExpressionTree getGuard() {
      return null;
    }

    public java.util.List getLabels() {
      return null;
    }

    public java.util.List getExpressions() {
      return null;
    }

    public ExpressionTree getExpression() {
      return null;
    }

    private static JCExpression lambda$getExpressions$1(JCCaseLabel arg0) {
      return null;
    }

    private static boolean lambda$getExpressions$0(JCCaseLabel arg0) {
      return false;
    }
  }

  public abstract static class JCCaseLabel extends JCTree implements CaseLabelTree {
    public JCCaseLabel() {
    }
  }

  public static class JCCatch extends JCTree implements CatchTree {
    protected JCCatch(JCVariableDecl arg0, JCBlock arg1) {
    }

    public void accept(Visitor arg0) {
    }

    public Tree.Kind getKind() {
      return null;
    }

    public JCVariableDecl getParameter() {
      return null;
    }

    public JCBlock getBlock() {
      return null;
    }

    public Object accept(TreeVisitor arg0, Object arg1) {
      return null;
    }

    public Tag getTag() {
      return null;
    }

    public BlockTree getBlock() {
      return null;
    }

    public VariableTree getParameter() {
      return null;
    }
  }

  public static class JCClassDecl extends JCStatement implements ClassTree {
    protected JCClassDecl(JCModifiers arg0, Name arg1, List arg2, JCExpression arg3, List arg4,
        List arg5, List arg6, Symbol.ClassSymbol arg7) {
    }

    public void accept(Visitor arg0) {
    }

    public Tree.Kind getKind() {
      return null;
    }

    public JCModifiers getModifiers() {
      return null;
    }

    public Name getSimpleName() {
      return null;
    }

    public List getTypeParameters() {
      return null;
    }

    public JCExpression getExtendsClause() {
      return null;
    }

    public List getImplementsClause() {
      return null;
    }

    public List getPermitsClause() {
      return null;
    }

    public List getMembers() {
      return null;
    }

    public Object accept(TreeVisitor arg0, Object arg1) {
      return null;
    }

    public Tag getTag() {
      return null;
    }

    public java.util.List getMembers() {
      return null;
    }

    public java.util.List getPermitsClause() {
      return null;
    }

    public java.util.List getImplementsClause() {
      return null;
    }

    public Tree getExtendsClause() {
      return null;
    }

    public java.util.List getTypeParameters() {
      return null;
    }

    public javax.lang.model.element.Name getSimpleName() {
      return null;
    }

    public ModifiersTree getModifiers() {
      return null;
    }
  }

  public static class JCCompilationUnit extends JCTree implements CompilationUnitTree {
    protected JCCompilationUnit(List arg0) {
    }

    public void accept(Visitor arg0) {
    }

    public Tree.Kind getKind() {
      return null;
    }

    public JCModuleDecl getModuleDecl() {
      return null;
    }

    public JCModuleDecl getModule() {
      return null;
    }

    public JCPackageDecl getPackage() {
      return null;
    }

    public List getPackageAnnotations() {
      return null;
    }

    public ExpressionTree getPackageName() {
      return null;
    }

    public List getImports() {
      return null;
    }

    public JavaFileObject getSourceFile() {
      return null;
    }

    public Position.LineMap getLineMap() {
      return null;
    }

    public List getTypeDecls() {
      return null;
    }

    public Object accept(TreeVisitor arg0, Object arg1) {
      return null;
    }

    public Tag getTag() {
      return null;
    }

    public LineMap getLineMap() {
      return null;
    }

    public java.util.List getTypeDecls() {
      return null;
    }

    public java.util.List getImports() {
      return null;
    }

    public PackageTree getPackage() {
      return null;
    }

    public java.util.List getPackageAnnotations() {
      return null;
    }

    public ModuleTree getModule() {
      return null;
    }
  }

  public static class JCConditional extends JCPolyExpression implements ConditionalExpressionTree {
    protected JCConditional(JCExpression arg0, JCExpression arg1, JCExpression arg2) {
    }

    public void accept(Visitor arg0) {
    }

    public Tree.Kind getKind() {
      return null;
    }

    public JCExpression getCondition() {
      return null;
    }

    public JCExpression getTrueExpression() {
      return null;
    }

    public JCExpression getFalseExpression() {
      return null;
    }

    public Object accept(TreeVisitor arg0, Object arg1) {
      return null;
    }

    public Tag getTag() {
      return null;
    }

    public ExpressionTree getFalseExpression() {
      return null;
    }

    public ExpressionTree getTrueExpression() {
      return null;
    }

    public ExpressionTree getCondition() {
      return null;
    }
  }

  public static class JCConstantCaseLabel extends JCCaseLabel implements ConstantCaseLabelTree {
    protected JCConstantCaseLabel(JCExpression arg0) {
    }

    public JCExpression getConstantExpression() {
      return null;
    }

    public void accept(Visitor arg0) {
    }

    public Tree.Kind getKind() {
      return null;
    }

    public Object accept(TreeVisitor arg0, Object arg1) {
      return null;
    }

    public Tag getTag() {
      return null;
    }

    public ExpressionTree getConstantExpression() {
      return null;
    }
  }

  public static class JCContinue extends JCStatement implements ContinueTree {
    protected JCContinue(Name arg0, JCTree arg1) {
    }

    public void accept(Visitor arg0) {
    }

    public Tree.Kind getKind() {
      return null;
    }

    public Name getLabel() {
      return null;
    }

    public Object accept(TreeVisitor arg0, Object arg1) {
      return null;
    }

    public Tag getTag() {
      return null;
    }

    public javax.lang.model.element.Name getLabel() {
      return null;
    }
  }

  public static class JCDefaultCaseLabel extends JCCaseLabel implements DefaultCaseLabelTree {
    protected JCDefaultCaseLabel() {
    }

    public void accept(Visitor arg0) {
    }

    public Tree.Kind getKind() {
      return null;
    }

    public Object accept(TreeVisitor arg0, Object arg1) {
      return null;
    }

    public Tag getTag() {
      return null;
    }
  }

  public abstract static class JCDirective extends JCTree implements DirectiveTree {
    public JCDirective() {
    }
  }

  public static class JCDoWhileLoop extends JCStatement implements DoWhileLoopTree {
    protected JCDoWhileLoop(JCStatement arg0, JCExpression arg1) {
    }

    public void accept(Visitor arg0) {
    }

    public Tree.Kind getKind() {
      return null;
    }

    public JCExpression getCondition() {
      return null;
    }

    public JCStatement getStatement() {
      return null;
    }

    public Object accept(TreeVisitor arg0, Object arg1) {
      return null;
    }

    public Tag getTag() {
      return null;
    }

    public StatementTree getStatement() {
      return null;
    }

    public ExpressionTree getCondition() {
      return null;
    }
  }

  public static class JCEnhancedForLoop extends JCStatement implements EnhancedForLoopTree {
    protected JCEnhancedForLoop(JCVariableDecl arg0, JCExpression arg1, JCStatement arg2) {
    }

    public void accept(Visitor arg0) {
    }

    public Tree.Kind getKind() {
      return null;
    }

    public JCVariableDecl getVariable() {
      return null;
    }

    public JCExpression getExpression() {
      return null;
    }

    public JCStatement getStatement() {
      return null;
    }

    public Object accept(TreeVisitor arg0, Object arg1) {
      return null;
    }

    public Tag getTag() {
      return null;
    }

    public StatementTree getStatement() {
      return null;
    }

    public ExpressionTree getExpression() {
      return null;
    }

    public VariableTree getVariable() {
      return null;
    }
  }

  public static class JCErroneous extends JCExpression implements ErroneousTree {
    protected JCErroneous(List arg0) {
    }

    public void accept(Visitor arg0) {
    }

    public Tree.Kind getKind() {
      return null;
    }

    public List getErrorTrees() {
      return null;
    }

    public Object accept(TreeVisitor arg0, Object arg1) {
      return null;
    }

    public Tag getTag() {
      return null;
    }

    public java.util.List getErrorTrees() {
      return null;
    }
  }

  public static class JCExports extends JCDirective implements ExportsTree {
    protected JCExports(JCExpression arg0, List arg1) {
    }

    public void accept(Visitor arg0) {
    }

    public Tree.Kind getKind() {
      return null;
    }

    public JCExpression getPackageName() {
      return null;
    }

    public List getModuleNames() {
      return null;
    }

    public Object accept(TreeVisitor arg0, Object arg1) {
      return null;
    }

    public Tag getTag() {
      return null;
    }

    public java.util.List getModuleNames() {
      return null;
    }

    public ExpressionTree getPackageName() {
      return null;
    }
  }

  public abstract static class JCExpression extends JCTree implements ExpressionTree {
    public JCExpression() {
    }

    public JCExpression setType(Type arg0) {
      return null;
    }

    public JCExpression setPos(int arg0) {
      return null;
    }

    public boolean isPoly() {
      return false;
    }

    public boolean isStandalone() {
      return false;
    }

    public JCTree setType(Type arg0) {
      return null;
    }

    public JCTree setPos(int arg0) {
      return null;
    }
  }

  public static class JCExpressionStatement extends JCStatement implements ExpressionStatementTree {
    protected JCExpressionStatement(JCExpression arg0) {
    }

    public void accept(Visitor arg0) {
    }

    public Tree.Kind getKind() {
      return null;
    }

    public JCExpression getExpression() {
      return null;
    }

    public Object accept(TreeVisitor arg0, Object arg1) {
      return null;
    }

    public Tag getTag() {
      return null;
    }

    public String toString() {
      return null;
    }

    public ExpressionTree getExpression() {
      return null;
    }
  }

  public static class JCFieldAccess extends JCExpression implements MemberSelectTree {
    protected JCFieldAccess(JCExpression arg0, Name arg1, Symbol arg2) {
    }

    public void accept(Visitor arg0) {
    }

    public Tree.Kind getKind() {
      return null;
    }

    public JCExpression getExpression() {
      return null;
    }

    public Object accept(TreeVisitor arg0, Object arg1) {
      return null;
    }

    public Name getIdentifier() {
      return null;
    }

    public Tag getTag() {
      return null;
    }

    public javax.lang.model.element.Name getIdentifier() {
      return null;
    }

    public ExpressionTree getExpression() {
      return null;
    }
  }

  public static class JCForLoop extends JCStatement implements ForLoopTree {
    protected JCForLoop(List arg0, JCExpression arg1, List arg2, JCStatement arg3) {
    }

    public void accept(Visitor arg0) {
    }

    public Tree.Kind getKind() {
      return null;
    }

    public JCExpression getCondition() {
      return null;
    }

    public JCStatement getStatement() {
      return null;
    }

    public List getInitializer() {
      return null;
    }

    public List getUpdate() {
      return null;
    }

    public Object accept(TreeVisitor arg0, Object arg1) {
      return null;
    }

    public Tag getTag() {
      return null;
    }

    public StatementTree getStatement() {
      return null;
    }

    public java.util.List getUpdate() {
      return null;
    }

    public ExpressionTree getCondition() {
      return null;
    }

    public java.util.List getInitializer() {
      return null;
    }
  }

  public abstract static class JCFunctionalExpression extends JCPolyExpression {
    public JCFunctionalExpression() {
    }

    public Type getDescriptorType(Types arg0) {
      return null;
    }
  }

  public static class JCIdent extends JCExpression implements IdentifierTree {
    protected JCIdent(Name arg0, Symbol arg1) {
    }

    public void accept(Visitor arg0) {
    }

    public Tree.Kind getKind() {
      return null;
    }

    public Name getName() {
      return null;
    }

    public Object accept(TreeVisitor arg0, Object arg1) {
      return null;
    }

    public Tag getTag() {
      return null;
    }

    public javax.lang.model.element.Name getName() {
      return null;
    }
  }

  public static class JCIf extends JCStatement implements IfTree {
    protected JCIf(JCExpression arg0, JCStatement arg1, JCStatement arg2) {
    }

    public void accept(Visitor arg0) {
    }

    public Tree.Kind getKind() {
      return null;
    }

    public JCExpression getCondition() {
      return null;
    }

    public JCStatement getThenStatement() {
      return null;
    }

    public JCStatement getElseStatement() {
      return null;
    }

    public Object accept(TreeVisitor arg0, Object arg1) {
      return null;
    }

    public Tag getTag() {
      return null;
    }

    public StatementTree getElseStatement() {
      return null;
    }

    public StatementTree getThenStatement() {
      return null;
    }

    public ExpressionTree getCondition() {
      return null;
    }
  }

  public static class JCImport extends JCTree implements ImportTree {
    protected JCImport(JCFieldAccess arg0, boolean arg1) {
    }

    public void accept(Visitor arg0) {
    }

    public boolean isStatic() {
      return false;
    }

    public JCFieldAccess getQualifiedIdentifier() {
      return null;
    }

    public Tree.Kind getKind() {
      return null;
    }

    public Object accept(TreeVisitor arg0, Object arg1) {
      return null;
    }

    public Tag getTag() {
      return null;
    }

    public Tree getQualifiedIdentifier() {
      return null;
    }
  }

  public static class JCInstanceOf extends JCExpression implements InstanceOfTree {
    protected JCInstanceOf(JCExpression arg0, JCTree arg1) {
    }

    public void accept(Visitor arg0) {
    }

    public Tree.Kind getKind() {
      return null;
    }

    public JCTree getType() {
      return null;
    }

    public JCPattern getPattern() {
      return null;
    }

    public JCExpression getExpression() {
      return null;
    }

    public Object accept(TreeVisitor arg0, Object arg1) {
      return null;
    }

    public Tag getTag() {
      return null;
    }

    public PatternTree getPattern() {
      return null;
    }

    public Tree getType() {
      return null;
    }

    public ExpressionTree getExpression() {
      return null;
    }
  }

  public static class JCLabeledStatement extends JCStatement implements LabeledStatementTree {
    protected JCLabeledStatement(Name arg0, JCStatement arg1) {
    }

    public void accept(Visitor arg0) {
    }

    public Tree.Kind getKind() {
      return null;
    }

    public Name getLabel() {
      return null;
    }

    public JCStatement getStatement() {
      return null;
    }

    public Object accept(TreeVisitor arg0, Object arg1) {
      return null;
    }

    public Tag getTag() {
      return null;
    }

    public StatementTree getStatement() {
      return null;
    }

    public javax.lang.model.element.Name getLabel() {
      return null;
    }
  }

  public final enum ParameterKind {
    IMPLICIT,

    EXPLICIT
  }

  public static class JCLambda extends JCFunctionalExpression implements LambdaExpressionTree {
    public JCLambda(List arg0, JCTree arg1) {
    }

    public Tag getTag() {
      return null;
    }

    public void accept(Visitor arg0) {
    }

    public Object accept(TreeVisitor arg0, Object arg1) {
      return null;
    }

    public Tree.Kind getKind() {
      return null;
    }

    public JCTree getBody() {
      return null;
    }

    public java.util.List getParameters() {
      return null;
    }

    public JCLambda setType(Type arg0) {
      return null;
    }

    public LambdaExpressionTree.BodyKind getBodyKind() {
      return null;
    }

    public JCExpression setType(Type arg0) {
      return null;
    }

    public JCTree setType(Type arg0) {
      return null;
    }

    public Tree getBody() {
      return null;
    }
  }

  public static class JCLiteral extends JCExpression implements LiteralTree {
    protected JCLiteral(TypeTag arg0, Object arg1) {
    }

    public void accept(Visitor arg0) {
    }

    public Tree.Kind getKind() {
      return null;
    }

    public Object getValue() {
      return null;
    }

    public Object accept(TreeVisitor arg0, Object arg1) {
      return null;
    }

    public JCLiteral setType(Type arg0) {
      return null;
    }

    public Tag getTag() {
      return null;
    }

    public JCExpression setType(Type arg0) {
      return null;
    }

    public JCTree setType(Type arg0) {
      return null;
    }
  }

  public final enum OverloadKind {
    OVERLOADED,

    UNOVERLOADED,

    ERROR
  }

  public final enum ReferenceKind {
    SUPER,

    UNBOUND,

    STATIC,

    BOUND,

    IMPLICIT_INNER,

    TOPLEVEL,

    ARRAY_CTOR
  }

  public static class JCMemberReference extends JCFunctionalExpression implements MemberReferenceTree {
    public JCMemberReference(MemberReferenceTree.ReferenceMode arg0, Name arg1, JCExpression arg2,
        List arg3) {
    }

    public void accept(Visitor arg0) {
    }

    public Tree.Kind getKind() {
      return null;
    }

    public MemberReferenceTree.ReferenceMode getMode() {
      return null;
    }

    public JCExpression getQualifierExpression() {
      return null;
    }

    public Name getName() {
      return null;
    }

    public List getTypeArguments() {
      return null;
    }

    public Object accept(TreeVisitor arg0, Object arg1) {
      return null;
    }

    public Tag getTag() {
      return null;
    }

    public boolean hasKind(JCMemberReference.ReferenceKind arg0) {
      return false;
    }

    public JCMemberReference.OverloadKind getOverloadKind() {
      return null;
    }

    public void setOverloadKind(JCMemberReference.OverloadKind arg0) {
    }

    public java.util.List getTypeArguments() {
      return null;
    }

    public javax.lang.model.element.Name getName() {
      return null;
    }

    public ExpressionTree getQualifierExpression() {
      return null;
    }
  }

  public static class JCMethodDecl extends JCTree implements MethodTree {
    protected JCMethodDecl(JCModifiers arg0, Name arg1, JCExpression arg2, List arg3,
        JCVariableDecl arg4, List arg5, List arg6, JCBlock arg7, JCExpression arg8,
        Symbol.MethodSymbol arg9) {
    }

    public void accept(Visitor arg0) {
    }

    public Tree.Kind getKind() {
      return null;
    }

    public JCModifiers getModifiers() {
      return null;
    }

    public Name getName() {
      return null;
    }

    public JCTree getReturnType() {
      return null;
    }

    public List getTypeParameters() {
      return null;
    }

    public List getParameters() {
      return null;
    }

    public JCVariableDecl getReceiverParameter() {
      return null;
    }

    public List getThrows() {
      return null;
    }

    public JCBlock getBody() {
      return null;
    }

    public JCTree getDefaultValue() {
      return null;
    }

    public Object accept(TreeVisitor arg0, Object arg1) {
      return null;
    }

    public Tag getTag() {
      return null;
    }

    public Tree getDefaultValue() {
      return null;
    }

    public BlockTree getBody() {
      return null;
    }

    public java.util.List getThrows() {
      return null;
    }

    public VariableTree getReceiverParameter() {
      return null;
    }

    public java.util.List getParameters() {
      return null;
    }

    public java.util.List getTypeParameters() {
      return null;
    }

    public Tree getReturnType() {
      return null;
    }

    public javax.lang.model.element.Name getName() {
      return null;
    }

    public ModifiersTree getModifiers() {
      return null;
    }
  }

  public static class JCMethodInvocation extends JCPolyExpression implements MethodInvocationTree {
    protected JCMethodInvocation(List arg0, JCExpression arg1, List arg2) {
    }

    public void accept(Visitor arg0) {
    }

    public Tree.Kind getKind() {
      return null;
    }

    public List getTypeArguments() {
      return null;
    }

    public JCExpression getMethodSelect() {
      return null;
    }

    public List getArguments() {
      return null;
    }

    public Object accept(TreeVisitor arg0, Object arg1) {
      return null;
    }

    public JCMethodInvocation setType(Type arg0) {
      return null;
    }

    public Tag getTag() {
      return null;
    }

    public JCExpression setType(Type arg0) {
      return null;
    }

    public JCTree setType(Type arg0) {
      return null;
    }

    public java.util.List getArguments() {
      return null;
    }

    public ExpressionTree getMethodSelect() {
      return null;
    }

    public java.util.List getTypeArguments() {
      return null;
    }
  }

  public static class JCModifiers extends JCTree implements ModifiersTree {
    protected JCModifiers(long arg0, List arg1) {
    }

    public void accept(Visitor arg0) {
    }

    public Tree.Kind getKind() {
      return null;
    }

    public Set getFlags() {
      return null;
    }

    public List getAnnotations() {
      return null;
    }

    public Object accept(TreeVisitor arg0, Object arg1) {
      return null;
    }

    public Tag getTag() {
      return null;
    }

    public java.util.List getAnnotations() {
      return null;
    }
  }

  public static class JCModuleDecl extends JCTree implements ModuleTree {
    protected JCModuleDecl(JCModifiers arg0, ModuleTree.ModuleKind arg1, JCExpression arg2,
        List arg3) {
    }

    public void accept(Visitor arg0) {
    }

    public Tree.Kind getKind() {
      return null;
    }

    public List getAnnotations() {
      return null;
    }

    public ModuleTree.ModuleKind getModuleType() {
      return null;
    }

    public JCExpression getName() {
      return null;
    }

    public List getDirectives() {
      return null;
    }

    public Object accept(TreeVisitor arg0, Object arg1) {
      return null;
    }

    public Tag getTag() {
      return null;
    }

    public java.util.List getDirectives() {
      return null;
    }

    public ExpressionTree getName() {
      return null;
    }

    public java.util.List getAnnotations() {
      return null;
    }
  }

  public static class JCNewArray extends JCExpression implements NewArrayTree {
    protected JCNewArray(JCExpression arg0, List arg1, List arg2) {
    }

    public void accept(Visitor arg0) {
    }

    public Tree.Kind getKind() {
      return null;
    }

    public JCExpression getType() {
      return null;
    }

    public List getDimensions() {
      return null;
    }

    public List getInitializers() {
      return null;
    }

    public Object accept(TreeVisitor arg0, Object arg1) {
      return null;
    }

    public Tag getTag() {
      return null;
    }

    public List getAnnotations() {
      return null;
    }

    public List getDimAnnotations() {
      return null;
    }

    public java.util.List getDimAnnotations() {
      return null;
    }

    public java.util.List getAnnotations() {
      return null;
    }

    public java.util.List getInitializers() {
      return null;
    }

    public java.util.List getDimensions() {
      return null;
    }

    public Tree getType() {
      return null;
    }
  }

  public static class JCNewClass extends JCPolyExpression implements NewClassTree {
    protected JCNewClass(JCExpression arg0, List arg1, JCExpression arg2, List arg3,
        JCClassDecl arg4) {
    }

    public void accept(Visitor arg0) {
    }

    public Tree.Kind getKind() {
      return null;
    }

    public JCExpression getEnclosingExpression() {
      return null;
    }

    public List getTypeArguments() {
      return null;
    }

    public JCExpression getIdentifier() {
      return null;
    }

    public List getArguments() {
      return null;
    }

    public JCClassDecl getClassBody() {
      return null;
    }

    public Object accept(TreeVisitor arg0, Object arg1) {
      return null;
    }

    public Tag getTag() {
      return null;
    }

    public boolean classDeclRemoved() {
      return false;
    }

    public ClassTree getClassBody() {
      return null;
    }

    public java.util.List getArguments() {
      return null;
    }

    public ExpressionTree getIdentifier() {
      return null;
    }

    public java.util.List getTypeArguments() {
      return null;
    }

    public ExpressionTree getEnclosingExpression() {
      return null;
    }
  }

  public static class JCOpens extends JCDirective implements OpensTree {
    protected JCOpens(JCExpression arg0, List arg1) {
    }

    public void accept(Visitor arg0) {
    }

    public Tree.Kind getKind() {
      return null;
    }

    public JCExpression getPackageName() {
      return null;
    }

    public List getModuleNames() {
      return null;
    }

    public Object accept(TreeVisitor arg0, Object arg1) {
      return null;
    }

    public Tag getTag() {
      return null;
    }

    public java.util.List getModuleNames() {
      return null;
    }

    public ExpressionTree getPackageName() {
      return null;
    }
  }

  public final enum OperandPos {
    LEFT,

    RIGHT
  }

  public abstract static class JCOperatorExpression extends JCExpression {
    public JCOperatorExpression() {
    }

    public Symbol.OperatorSymbol getOperator() {
      return null;
    }

    public Tag getTag() {
      return null;
    }

    public abstract JCExpression getOperand(JCOperatorExpression.OperandPos arg0);
  }

  public static class JCPackageDecl extends JCTree implements PackageTree {
    public JCPackageDecl(List arg0, JCExpression arg1) {
    }

    public void accept(Visitor arg0) {
    }

    public Tree.Kind getKind() {
      return null;
    }

    public List getAnnotations() {
      return null;
    }

    public JCExpression getPackageName() {
      return null;
    }

    public Object accept(TreeVisitor arg0, Object arg1) {
      return null;
    }

    public Tag getTag() {
      return null;
    }

    public ExpressionTree getPackageName() {
      return null;
    }

    public java.util.List getAnnotations() {
      return null;
    }
  }

  public static class JCParens extends JCExpression implements ParenthesizedTree {
    protected JCParens(JCExpression arg0) {
    }

    public void accept(Visitor arg0) {
    }

    public Tree.Kind getKind() {
      return null;
    }

    public JCExpression getExpression() {
      return null;
    }

    public Object accept(TreeVisitor arg0, Object arg1) {
      return null;
    }

    public Tag getTag() {
      return null;
    }

    public ExpressionTree getExpression() {
      return null;
    }
  }

  public abstract static class JCPattern extends JCTree implements PatternTree {
    public JCPattern() {
    }
  }

  public static class JCPatternCaseLabel extends JCCaseLabel implements PatternCaseLabelTree {
    protected JCPatternCaseLabel(JCPattern arg0) {
    }

    public JCPattern getPattern() {
      return null;
    }

    public void accept(Visitor arg0) {
    }

    public Tree.Kind getKind() {
      return null;
    }

    public Object accept(TreeVisitor arg0, Object arg1) {
      return null;
    }

    public Tag getTag() {
      return null;
    }

    public PatternTree getPattern() {
      return null;
    }
  }

  public final enum PolyKind {
    STANDALONE,

    POLY
  }

  public abstract static class JCPolyExpression extends JCExpression {
    public JCPolyExpression() {
    }

    public boolean isPoly() {
      return false;
    }

    public boolean isStandalone() {
      return false;
    }
  }

  public static class JCPrimitiveTypeTree extends JCExpression implements PrimitiveTypeTree {
    protected JCPrimitiveTypeTree(TypeTag arg0) {
    }

    public void accept(Visitor arg0) {
    }

    public Tree.Kind getKind() {
      return null;
    }

    public TypeKind getPrimitiveTypeKind() {
      return null;
    }

    public Object accept(TreeVisitor arg0, Object arg1) {
      return null;
    }

    public Tag getTag() {
      return null;
    }
  }

  public static class JCProvides extends JCDirective implements ProvidesTree {
    protected JCProvides(JCExpression arg0, List arg1) {
    }

    public void accept(Visitor arg0) {
    }

    public Tree.Kind getKind() {
      return null;
    }

    public Object accept(TreeVisitor arg0, Object arg1) {
      return null;
    }

    public JCExpression getServiceName() {
      return null;
    }

    public List getImplementationNames() {
      return null;
    }

    public Tag getTag() {
      return null;
    }

    public java.util.List getImplementationNames() {
      return null;
    }

    public ExpressionTree getServiceName() {
      return null;
    }
  }

  public static class JCRecordPattern extends JCPattern implements DeconstructionPatternTree {
    protected JCRecordPattern(JCExpression arg0, List arg1) {
    }

    public Name getBinding() {
      return null;
    }

    public ExpressionTree getDeconstructor() {
      return null;
    }

    public List getNestedPatterns() {
      return null;
    }

    public void accept(Visitor arg0) {
    }

    public Tree.Kind getKind() {
      return null;
    }

    public Object accept(TreeVisitor arg0, Object arg1) {
      return null;
    }

    public Tag getTag() {
      return null;
    }

    public java.util.List getNestedPatterns() {
      return null;
    }
  }

  public static class JCRequires extends JCDirective implements RequiresTree {
    protected JCRequires(boolean arg0, boolean arg1, JCExpression arg2) {
    }

    public void accept(Visitor arg0) {
    }

    public Tree.Kind getKind() {
      return null;
    }

    public Object accept(TreeVisitor arg0, Object arg1) {
      return null;
    }

    public boolean isTransitive() {
      return false;
    }

    public boolean isStatic() {
      return false;
    }

    public JCExpression getModuleName() {
      return null;
    }

    public Tag getTag() {
      return null;
    }

    public ExpressionTree getModuleName() {
      return null;
    }
  }

  public static class JCReturn extends JCStatement implements ReturnTree {
    protected JCReturn(JCExpression arg0) {
    }

    public void accept(Visitor arg0) {
    }

    public Tree.Kind getKind() {
      return null;
    }

    public JCExpression getExpression() {
      return null;
    }

    public Object accept(TreeVisitor arg0, Object arg1) {
      return null;
    }

    public Tag getTag() {
      return null;
    }

    public ExpressionTree getExpression() {
      return null;
    }
  }

  public static class JCSkip extends JCStatement implements EmptyStatementTree {
    protected JCSkip() {
    }

    public void accept(Visitor arg0) {
    }

    public Tree.Kind getKind() {
      return null;
    }

    public Object accept(TreeVisitor arg0, Object arg1) {
      return null;
    }

    public Tag getTag() {
      return null;
    }
  }

  public abstract static class JCStatement extends JCTree implements StatementTree {
    public JCStatement() {
    }

    public JCStatement setType(Type arg0) {
      return null;
    }

    public JCStatement setPos(int arg0) {
      return null;
    }

    public JCTree setType(Type arg0) {
      return null;
    }

    public JCTree setPos(int arg0) {
      return null;
    }
  }

  public static class JCStringTemplate extends JCExpression implements StringTemplateTree {
    protected JCStringTemplate(JCExpression arg0, List arg1, List arg2) {
    }

    public ExpressionTree getProcessor() {
      return null;
    }

    public List getFragments() {
      return null;
    }

    public List getExpressions() {
      return null;
    }

    public Tree.Kind getKind() {
      return null;
    }

    public Tag getTag() {
      return null;
    }

    public void accept(Visitor arg0) {
    }

    public Object accept(TreeVisitor arg0, Object arg1) {
      return null;
    }

    public java.util.List getExpressions() {
      return null;
    }

    public java.util.List getFragments() {
      return null;
    }
  }

  public static class JCSwitch extends JCStatement implements SwitchTree {
    protected JCSwitch(JCExpression arg0, List arg1) {
    }

    public void accept(Visitor arg0) {
    }

    public Tree.Kind getKind() {
      return null;
    }

    public JCExpression getExpression() {
      return null;
    }

    public List getCases() {
      return null;
    }

    public Object accept(TreeVisitor arg0, Object arg1) {
      return null;
    }

    public Tag getTag() {
      return null;
    }

    public java.util.List getCases() {
      return null;
    }

    public ExpressionTree getExpression() {
      return null;
    }
  }

  public static class JCSwitchExpression extends JCPolyExpression implements SwitchExpressionTree {
    protected JCSwitchExpression(JCExpression arg0, List arg1) {
    }

    public void accept(Visitor arg0) {
    }

    public Tree.Kind getKind() {
      return null;
    }

    public JCExpression getExpression() {
      return null;
    }

    public List getCases() {
      return null;
    }

    public Object accept(TreeVisitor arg0, Object arg1) {
      return null;
    }

    public Tag getTag() {
      return null;
    }

    public java.util.List getCases() {
      return null;
    }

    public ExpressionTree getExpression() {
      return null;
    }
  }

  public static class JCSynchronized extends JCStatement implements SynchronizedTree {
    protected JCSynchronized(JCExpression arg0, JCBlock arg1) {
    }

    public void accept(Visitor arg0) {
    }

    public Tree.Kind getKind() {
      return null;
    }

    public JCExpression getExpression() {
      return null;
    }

    public JCBlock getBlock() {
      return null;
    }

    public Object accept(TreeVisitor arg0, Object arg1) {
      return null;
    }

    public Tag getTag() {
      return null;
    }

    public BlockTree getBlock() {
      return null;
    }

    public ExpressionTree getExpression() {
      return null;
    }
  }

  public static class JCThrow extends JCStatement implements ThrowTree {
    protected JCThrow(JCExpression arg0) {
    }

    public void accept(Visitor arg0) {
    }

    public Tree.Kind getKind() {
      return null;
    }

    public JCExpression getExpression() {
      return null;
    }

    public Object accept(TreeVisitor arg0, Object arg1) {
      return null;
    }

    public Tag getTag() {
      return null;
    }

    public ExpressionTree getExpression() {
      return null;
    }
  }

  public static class JCTry extends JCStatement implements TryTree {
    protected JCTry(List arg0, JCBlock arg1, List arg2, JCBlock arg3) {
    }

    public void accept(Visitor arg0) {
    }

    public Tree.Kind getKind() {
      return null;
    }

    public JCBlock getBlock() {
      return null;
    }

    public List getCatches() {
      return null;
    }

    public JCBlock getFinallyBlock() {
      return null;
    }

    public Object accept(TreeVisitor arg0, Object arg1) {
      return null;
    }

    public List getResources() {
      return null;
    }

    public Tag getTag() {
      return null;
    }

    public java.util.List getResources() {
      return null;
    }

    public BlockTree getFinallyBlock() {
      return null;
    }

    public java.util.List getCatches() {
      return null;
    }

    public BlockTree getBlock() {
      return null;
    }
  }

  public static class JCTypeApply extends JCExpression implements ParameterizedTypeTree {
    protected JCTypeApply(JCExpression arg0, List arg1) {
    }

    public void accept(Visitor arg0) {
    }

    public Tree.Kind getKind() {
      return null;
    }

    public JCTree getType() {
      return null;
    }

    public List getTypeArguments() {
      return null;
    }

    public Object accept(TreeVisitor arg0, Object arg1) {
      return null;
    }

    public Tag getTag() {
      return null;
    }

    public java.util.List getTypeArguments() {
      return null;
    }

    public Tree getType() {
      return null;
    }
  }

  public static class JCTypeCast extends JCExpression implements TypeCastTree {
    protected JCTypeCast(JCTree arg0, JCExpression arg1) {
    }

    public void accept(Visitor arg0) {
    }

    public Tree.Kind getKind() {
      return null;
    }

    public JCTree getType() {
      return null;
    }

    public JCExpression getExpression() {
      return null;
    }

    public Object accept(TreeVisitor arg0, Object arg1) {
      return null;
    }

    public Tag getTag() {
      return null;
    }

    public ExpressionTree getExpression() {
      return null;
    }

    public Tree getType() {
      return null;
    }
  }

  public static class JCTypeIntersection extends JCExpression implements IntersectionTypeTree {
    protected JCTypeIntersection(List arg0) {
    }

    public void accept(Visitor arg0) {
    }

    public Tree.Kind getKind() {
      return null;
    }

    public List getBounds() {
      return null;
    }

    public Object accept(TreeVisitor arg0, Object arg1) {
      return null;
    }

    public Tag getTag() {
      return null;
    }

    public java.util.List getBounds() {
      return null;
    }
  }

  public static class JCTypeParameter extends JCTree implements TypeParameterTree {
    protected JCTypeParameter(Name arg0, List arg1, List arg2) {
    }

    public void accept(Visitor arg0) {
    }

    public Tree.Kind getKind() {
      return null;
    }

    public Name getName() {
      return null;
    }

    public List getBounds() {
      return null;
    }

    public List getAnnotations() {
      return null;
    }

    public Object accept(TreeVisitor arg0, Object arg1) {
      return null;
    }

    public Tag getTag() {
      return null;
    }

    public java.util.List getAnnotations() {
      return null;
    }

    public java.util.List getBounds() {
      return null;
    }

    public javax.lang.model.element.Name getName() {
      return null;
    }
  }

  public static class JCTypeUnion extends JCExpression implements UnionTypeTree {
    protected JCTypeUnion(List arg0) {
    }

    public void accept(Visitor arg0) {
    }

    public Tree.Kind getKind() {
      return null;
    }

    public List getTypeAlternatives() {
      return null;
    }

    public Object accept(TreeVisitor arg0, Object arg1) {
      return null;
    }

    public Tag getTag() {
      return null;
    }

    public java.util.List getTypeAlternatives() {
      return null;
    }
  }

  public static class JCUnary extends JCOperatorExpression implements UnaryTree {
    protected JCUnary(Tag arg0, JCExpression arg1) {
    }

    public void accept(Visitor arg0) {
    }

    public Tree.Kind getKind() {
      return null;
    }

    public JCExpression getExpression() {
      return null;
    }

    public Object accept(TreeVisitor arg0, Object arg1) {
      return null;
    }

    public void setTag(Tag arg0) {
    }

    public JCExpression getOperand(JCOperatorExpression.OperandPos arg0) {
      return null;
    }

    public ExpressionTree getExpression() {
      return null;
    }
  }

  public static class JCUses extends JCDirective implements UsesTree {
    protected JCUses(JCExpression arg0) {
    }

    public void accept(Visitor arg0) {
    }

    public Tree.Kind getKind() {
      return null;
    }

    public JCExpression getServiceName() {
      return null;
    }

    public Object accept(TreeVisitor arg0, Object arg1) {
      return null;
    }

    public Tag getTag() {
      return null;
    }

    public ExpressionTree getServiceName() {
      return null;
    }
  }

  public static class JCVariableDecl extends JCStatement implements VariableTree {
    protected JCVariableDecl(JCModifiers arg0, Name arg1, JCExpression arg2, JCExpression arg3,
        Symbol.VarSymbol arg4) {
    }

    protected JCVariableDecl(JCModifiers arg0, Name arg1, JCExpression arg2, JCExpression arg3,
        Symbol.VarSymbol arg4, boolean arg5) {
    }

    protected JCVariableDecl(JCModifiers arg0, JCExpression arg1, JCExpression arg2) {
    }

    public boolean isImplicitlyTyped() {
      return false;
    }

    public boolean declaredUsingVar() {
      return false;
    }

    public void accept(Visitor arg0) {
    }

    public Tree.Kind getKind() {
      return null;
    }

    public JCModifiers getModifiers() {
      return null;
    }

    public Name getName() {
      return null;
    }

    public JCExpression getNameExpression() {
      return null;
    }

    public JCTree getType() {
      return null;
    }

    public JCExpression getInitializer() {
      return null;
    }

    public Object accept(TreeVisitor arg0, Object arg1) {
      return null;
    }

    public Tag getTag() {
      return null;
    }

    public ExpressionTree getInitializer() {
      return null;
    }

    public Tree getType() {
      return null;
    }

    public ExpressionTree getNameExpression() {
      return null;
    }

    public javax.lang.model.element.Name getName() {
      return null;
    }

    public ModifiersTree getModifiers() {
      return null;
    }
  }

  public static class JCWhileLoop extends JCStatement implements WhileLoopTree {
    protected JCWhileLoop(JCExpression arg0, JCStatement arg1) {
    }

    public void accept(Visitor arg0) {
    }

    public Tree.Kind getKind() {
      return null;
    }

    public JCExpression getCondition() {
      return null;
    }

    public JCStatement getStatement() {
      return null;
    }

    public Object accept(TreeVisitor arg0, Object arg1) {
      return null;
    }

    public Tag getTag() {
      return null;
    }

    public StatementTree getStatement() {
      return null;
    }

    public ExpressionTree getCondition() {
      return null;
    }
  }

  public static class JCWildcard extends JCExpression implements WildcardTree {
    protected JCWildcard(TypeBoundKind arg0, JCTree arg1) {
    }

    public void accept(Visitor arg0) {
    }

    public Tree.Kind getKind() {
      return null;
    }

    public JCTree getBound() {
      return null;
    }

    public Object accept(TreeVisitor arg0, Object arg1) {
      return null;
    }

    public Tag getTag() {
      return null;
    }

    public Tree getBound() {
      return null;
    }
  }

  public static class JCYield extends JCStatement implements YieldTree {
    protected JCYield(JCExpression arg0, JCTree arg1) {
    }

    public void accept(Visitor arg0) {
    }

    public Tree.Kind getKind() {
      return null;
    }

    public JCExpression getValue() {
      return null;
    }

    public Object accept(TreeVisitor arg0, Object arg1) {
      return null;
    }

    public Tag getTag() {
      return null;
    }

    public ExpressionTree getValue() {
      return null;
    }
  }

  public static class LetExpr extends JCExpression {
    protected LetExpr(List arg0, JCExpression arg1) {
    }

    public void accept(Visitor arg0) {
    }

    public Tree.Kind getKind() {
      return null;
    }

    public Object accept(TreeVisitor arg0, Object arg1) {
      return null;
    }

    public Tag getTag() {
      return null;
    }
  }

  public final enum Tag {
    NO_TAG,

    TOPLEVEL,

    PACKAGEDEF,

    IMPORT,

    CLASSDEF,

    METHODDEF,

    VARDEF,

    SKIP,

    BLOCK,

    DOLOOP,

    WHILELOOP,

    FORLOOP,

    FOREACHLOOP,

    LABELLED,

    SWITCH,

    CASE,

    SWITCH_EXPRESSION,

    SYNCHRONIZED,

    TRY,

    CATCH,

    CONDEXPR,

    IF,

    EXEC,

    BREAK,

    YIELD,

    CONTINUE,

    RETURN,

    THROW,

    ASSERT,

    APPLY,

    NEWCLASS,

    NEWARRAY,

    LAMBDA,

    PARENS,

    ASSIGN,

    TYPECAST,

    TYPETEST,

    ANYPATTERN,

    BINDINGPATTERN,

    RECORDPATTERN,

    DEFAULTCASELABEL,

    CONSTANTCASELABEL,

    PATTERNCASELABEL,

    INDEXED,

    SELECT,

    REFERENCE,

    IDENT,

    LITERAL,

    STRING_TEMPLATE,

    TYPEIDENT,

    TYPEARRAY,

    TYPEAPPLY,

    TYPEUNION,

    TYPEINTERSECTION,

    TYPEPARAMETER,

    WILDCARD,

    TYPEBOUNDKIND,

    ANNOTATION,

    TYPE_ANNOTATION,

    MODIFIERS,

    ANNOTATED_TYPE,

    ERRONEOUS,

    POS,

    NEG,

    NOT,

    COMPL,

    PREINC,

    PREDEC,

    POSTINC,

    POSTDEC,

    NULLCHK,

    OR,

    AND,

    BITOR,

    BITXOR,

    BITAND,

    EQ,

    NE,

    LT,

    GT,

    LE,

    GE,

    SL,

    SR,

    USR,

    PLUS,

    MINUS,

    MUL,

    DIV,

    MOD,

    BITOR_ASG,

    BITXOR_ASG,

    BITAND_ASG,

    SL_ASG,

    SR_ASG,

    USR_ASG,

    PLUS_ASG,

    MINUS_ASG,

    MUL_ASG,

    DIV_ASG,

    MOD_ASG,

    MODULEDEF,

    EXPORTS,

    OPENS,

    PROVIDES,

    REQUIRES,

    USES,

    LETEXPR
  }

  public static class TypeBoundKind extends JCTree {
    protected TypeBoundKind(BoundKind arg0) {
    }

    public void accept(Visitor arg0) {
    }

    public Tree.Kind getKind() {
      return null;
    }

    public Object accept(TreeVisitor arg0, Object arg1) {
      return null;
    }

    public Tag getTag() {
      return null;
    }
  }

  public abstract static class Visitor {
    public Visitor() {
    }

    public void visitTopLevel(JCCompilationUnit arg0) {
    }

    public void visitPackageDef(JCPackageDecl arg0) {
    }

    public void visitImport(JCImport arg0) {
    }

    public void visitClassDef(JCClassDecl arg0) {
    }

    public void visitMethodDef(JCMethodDecl arg0) {
    }

    public void visitVarDef(JCVariableDecl arg0) {
    }

    public void visitSkip(JCSkip arg0) {
    }

    public void visitBlock(JCBlock arg0) {
    }

    public void visitDoLoop(JCDoWhileLoop arg0) {
    }

    public void visitWhileLoop(JCWhileLoop arg0) {
    }

    public void visitForLoop(JCForLoop arg0) {
    }

    public void visitForeachLoop(JCEnhancedForLoop arg0) {
    }

    public void visitLabelled(JCLabeledStatement arg0) {
    }

    public void visitSwitch(JCSwitch arg0) {
    }

    public void visitCase(JCCase arg0) {
    }

    public void visitSwitchExpression(JCSwitchExpression arg0) {
    }

    public void visitSynchronized(JCSynchronized arg0) {
    }

    public void visitTry(JCTry arg0) {
    }

    public void visitCatch(JCCatch arg0) {
    }

    public void visitConditional(JCConditional arg0) {
    }

    public void visitIf(JCIf arg0) {
    }

    public void visitExec(JCExpressionStatement arg0) {
    }

    public void visitBreak(JCBreak arg0) {
    }

    public void visitYield(JCYield arg0) {
    }

    public void visitContinue(JCContinue arg0) {
    }

    public void visitReturn(JCReturn arg0) {
    }

    public void visitThrow(JCThrow arg0) {
    }

    public void visitAssert(JCAssert arg0) {
    }

    public void visitApply(JCMethodInvocation arg0) {
    }

    public void visitNewClass(JCNewClass arg0) {
    }

    public void visitNewArray(JCNewArray arg0) {
    }

    public void visitLambda(JCLambda arg0) {
    }

    public void visitParens(JCParens arg0) {
    }

    public void visitAssign(JCAssign arg0) {
    }

    public void visitAssignop(JCAssignOp arg0) {
    }

    public void visitUnary(JCUnary arg0) {
    }

    public void visitBinary(JCBinary arg0) {
    }

    public void visitTypeCast(JCTypeCast arg0) {
    }

    public void visitTypeTest(JCInstanceOf arg0) {
    }

    public void visitAnyPattern(JCAnyPattern arg0) {
    }

    public void visitBindingPattern(JCBindingPattern arg0) {
    }

    public void visitDefaultCaseLabel(JCDefaultCaseLabel arg0) {
    }

    public void visitConstantCaseLabel(JCConstantCaseLabel arg0) {
    }

    public void visitPatternCaseLabel(JCPatternCaseLabel arg0) {
    }

    public void visitRecordPattern(JCRecordPattern arg0) {
    }

    public void visitIndexed(JCArrayAccess arg0) {
    }

    public void visitSelect(JCFieldAccess arg0) {
    }

    public void visitReference(JCMemberReference arg0) {
    }

    public void visitIdent(JCIdent arg0) {
    }

    public void visitLiteral(JCLiteral arg0) {
    }

    public void visitStringTemplate(JCStringTemplate arg0) {
    }

    public void visitTypeIdent(JCPrimitiveTypeTree arg0) {
    }

    public void visitTypeArray(JCArrayTypeTree arg0) {
    }

    public void visitTypeApply(JCTypeApply arg0) {
    }

    public void visitTypeUnion(JCTypeUnion arg0) {
    }

    public void visitTypeIntersection(JCTypeIntersection arg0) {
    }

    public void visitTypeParameter(JCTypeParameter arg0) {
    }

    public void visitWildcard(JCWildcard arg0) {
    }

    public void visitTypeBoundKind(TypeBoundKind arg0) {
    }

    public void visitAnnotation(JCAnnotation arg0) {
    }

    public void visitModifiers(JCModifiers arg0) {
    }

    public void visitAnnotatedType(JCAnnotatedType arg0) {
    }

    public void visitErroneous(JCErroneous arg0) {
    }

    public void visitModuleDef(JCModuleDecl arg0) {
    }

    public void visitExports(JCExports arg0) {
    }

    public void visitOpens(JCOpens arg0) {
    }

    public void visitProvides(JCProvides arg0) {
    }

    public void visitRequires(JCRequires arg0) {
    }

    public void visitUses(JCUses arg0) {
    }

    public void visitLetExpr(LetExpr arg0) {
    }

    public void visitTree(JCTree arg0) {
    }
  }
}
