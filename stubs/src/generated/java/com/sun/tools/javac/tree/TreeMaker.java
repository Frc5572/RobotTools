package com.sun.tools.javac.tree;

import com.sun.source.tree.CaseTree;
import com.sun.source.tree.MemberReferenceTree;
import com.sun.source.tree.ModuleTree;
import com.sun.tools.javac.code.Attribute;
import com.sun.tools.javac.code.BoundKind;
import com.sun.tools.javac.code.Symbol;
import com.sun.tools.javac.code.Symtab;
import com.sun.tools.javac.code.Type;
import com.sun.tools.javac.code.TypeTag;
import com.sun.tools.javac.code.Types;
import com.sun.tools.javac.util.Context;
import com.sun.tools.javac.util.JCDiagnostic;
import com.sun.tools.javac.util.List;
import com.sun.tools.javac.util.Name;
import com.sun.tools.javac.util.Names;
import java.lang.Object;
import java.lang.String;

public class TreeMaker implements JCTree.Factory {
  protected TreeMaker(Context arg0) {
  }

  protected TreeMaker(JCTree.JCCompilationUnit arg0, Names arg1, Types arg2, Symtab arg3) {
  }

  public static TreeMaker instance(Context arg0) {
    return null;
  }

  public TreeMaker forToplevel(JCTree.JCCompilationUnit arg0) {
    return null;
  }

  public TreeMaker at(int arg0) {
    return null;
  }

  public TreeMaker at(JCDiagnostic.DiagnosticPosition arg0) {
    return null;
  }

  public JCTree.JCCompilationUnit TopLevel(List arg0) {
    return null;
  }

  public JCTree.JCPackageDecl PackageDecl(List arg0, JCTree.JCExpression arg1) {
    return null;
  }

  public JCTree.JCImport Import(JCTree.JCFieldAccess arg0, boolean arg1) {
    return null;
  }

  public JCTree.JCClassDecl ClassDef(JCTree.JCModifiers arg0, Name arg1, List arg2,
      JCTree.JCExpression arg3, List arg4, List arg5) {
    return null;
  }

  public JCTree.JCClassDecl ClassDef(JCTree.JCModifiers arg0, Name arg1, List arg2,
      JCTree.JCExpression arg3, List arg4, List arg5, List arg6) {
    return null;
  }

  public JCTree.JCMethodDecl MethodDef(JCTree.JCModifiers arg0, Name arg1, JCTree.JCExpression arg2,
      List arg3, List arg4, List arg5, JCTree.JCBlock arg6, JCTree.JCExpression arg7) {
    return null;
  }

  public JCTree.JCMethodDecl MethodDef(JCTree.JCModifiers arg0, Name arg1, JCTree.JCExpression arg2,
      List arg3, JCTree.JCVariableDecl arg4, List arg5, List arg6, JCTree.JCBlock arg7,
      JCTree.JCExpression arg8) {
    return null;
  }

  public JCTree.JCVariableDecl VarDef(JCTree.JCModifiers arg0, Name arg1, JCTree.JCExpression arg2,
      JCTree.JCExpression arg3) {
    return null;
  }

  public JCTree.JCVariableDecl VarDef(JCTree.JCModifiers arg0, Name arg1, JCTree.JCExpression arg2,
      JCTree.JCExpression arg3, boolean arg4) {
    return null;
  }

  public JCTree.JCVariableDecl ReceiverVarDef(JCTree.JCModifiers arg0, JCTree.JCExpression arg1,
      JCTree.JCExpression arg2) {
    return null;
  }

  public JCTree.JCSkip Skip() {
    return null;
  }

  public JCTree.JCBlock Block(long arg0, List arg1) {
    return null;
  }

  public JCTree.JCDoWhileLoop DoLoop(JCTree.JCStatement arg0, JCTree.JCExpression arg1) {
    return null;
  }

  public JCTree.JCWhileLoop WhileLoop(JCTree.JCExpression arg0, JCTree.JCStatement arg1) {
    return null;
  }

  public JCTree.JCForLoop ForLoop(List arg0, JCTree.JCExpression arg1, List arg2,
      JCTree.JCStatement arg3) {
    return null;
  }

  public JCTree.JCEnhancedForLoop ForeachLoop(JCTree.JCVariableDecl arg0, JCTree.JCExpression arg1,
      JCTree.JCStatement arg2) {
    return null;
  }

  public JCTree.JCLabeledStatement Labelled(Name arg0, JCTree.JCStatement arg1) {
    return null;
  }

  public JCTree.JCSwitch Switch(JCTree.JCExpression arg0, List arg1) {
    return null;
  }

  public JCTree.JCCase Case(CaseTree.CaseKind arg0, List arg1, JCTree.JCExpression arg2, List arg3,
      JCTree arg4) {
    return null;
  }

  public JCTree.JCSwitchExpression SwitchExpression(JCTree.JCExpression arg0, List arg1) {
    return null;
  }

  public JCTree.JCSynchronized Synchronized(JCTree.JCExpression arg0, JCTree.JCBlock arg1) {
    return null;
  }

  public JCTree.JCTry Try(JCTree.JCBlock arg0, List arg1, JCTree.JCBlock arg2) {
    return null;
  }

  public JCTree.JCTry Try(List arg0, JCTree.JCBlock arg1, List arg2, JCTree.JCBlock arg3) {
    return null;
  }

  public JCTree.JCCatch Catch(JCTree.JCVariableDecl arg0, JCTree.JCBlock arg1) {
    return null;
  }

  public JCTree.JCConditional Conditional(JCTree.JCExpression arg0, JCTree.JCExpression arg1,
      JCTree.JCExpression arg2) {
    return null;
  }

  public JCTree.JCIf If(JCTree.JCExpression arg0, JCTree.JCStatement arg1,
      JCTree.JCStatement arg2) {
    return null;
  }

  public JCTree.JCExpressionStatement Exec(JCTree.JCExpression arg0) {
    return null;
  }

  public JCTree.JCBreak Break(Name arg0) {
    return null;
  }

  public JCTree.JCYield Yield(JCTree.JCExpression arg0) {
    return null;
  }

  public JCTree.JCContinue Continue(Name arg0) {
    return null;
  }

  public JCTree.JCReturn Return(JCTree.JCExpression arg0) {
    return null;
  }

  public JCTree.JCThrow Throw(JCTree.JCExpression arg0) {
    return null;
  }

  public JCTree.JCAssert Assert(JCTree.JCExpression arg0, JCTree.JCExpression arg1) {
    return null;
  }

  public JCTree.JCMethodInvocation Apply(List arg0, JCTree.JCExpression arg1, List arg2) {
    return null;
  }

  public JCTree.JCNewClass NewClass(JCTree.JCExpression arg0, List arg1, JCTree.JCExpression arg2,
      List arg3, JCTree.JCClassDecl arg4) {
    return null;
  }

  public JCTree.JCNewClass SpeculativeNewClass(JCTree.JCExpression arg0, List arg1,
      JCTree.JCExpression arg2, List arg3, JCTree.JCClassDecl arg4, boolean arg5) {
    return null;
  }

  public JCTree.JCNewArray NewArray(JCTree.JCExpression arg0, List arg1, List arg2) {
    return null;
  }

  public JCTree.JCLambda Lambda(List arg0, JCTree arg1) {
    return null;
  }

  public JCTree.JCParens Parens(JCTree.JCExpression arg0) {
    return null;
  }

  public JCTree.JCAssign Assign(JCTree.JCExpression arg0, JCTree.JCExpression arg1) {
    return null;
  }

  public JCTree.JCAssignOp Assignop(JCTree.Tag arg0, JCTree arg1, JCTree arg2) {
    return null;
  }

  public JCTree.JCUnary Unary(JCTree.Tag arg0, JCTree.JCExpression arg1) {
    return null;
  }

  public JCTree.JCBinary Binary(JCTree.Tag arg0, JCTree.JCExpression arg1,
      JCTree.JCExpression arg2) {
    return null;
  }

  public JCTree.JCTypeCast TypeCast(JCTree arg0, JCTree.JCExpression arg1) {
    return null;
  }

  public JCTree.JCInstanceOf TypeTest(JCTree.JCExpression arg0, JCTree arg1) {
    return null;
  }

  public JCTree.JCAnyPattern AnyPattern() {
    return null;
  }

  public JCTree.JCBindingPattern BindingPattern(JCTree.JCVariableDecl arg0) {
    return null;
  }

  public JCTree.JCDefaultCaseLabel DefaultCaseLabel() {
    return null;
  }

  public JCTree.JCConstantCaseLabel ConstantCaseLabel(JCTree.JCExpression arg0) {
    return null;
  }

  public JCTree.JCPatternCaseLabel PatternCaseLabel(JCTree.JCPattern arg0) {
    return null;
  }

  public JCTree.JCRecordPattern RecordPattern(JCTree.JCExpression arg0, List arg1) {
    return null;
  }

  public JCTree.JCArrayAccess Indexed(JCTree.JCExpression arg0, JCTree.JCExpression arg1) {
    return null;
  }

  public JCTree.JCFieldAccess Select(JCTree.JCExpression arg0, Name arg1) {
    return null;
  }

  public JCTree.JCMemberReference Reference(MemberReferenceTree.ReferenceMode arg0, Name arg1,
      JCTree.JCExpression arg2, List arg3) {
    return null;
  }

  public JCTree.JCIdent Ident(Name arg0) {
    return null;
  }

  public JCTree.JCLiteral Literal(TypeTag arg0, Object arg1) {
    return null;
  }

  public JCTree.JCStringTemplate StringTemplate(JCTree.JCExpression arg0, List arg1, List arg2) {
    return null;
  }

  public JCTree.JCPrimitiveTypeTree TypeIdent(TypeTag arg0) {
    return null;
  }

  public JCTree.JCArrayTypeTree TypeArray(JCTree.JCExpression arg0) {
    return null;
  }

  public JCTree.JCTypeApply TypeApply(JCTree.JCExpression arg0, List arg1) {
    return null;
  }

  public JCTree.JCTypeUnion TypeUnion(List arg0) {
    return null;
  }

  public JCTree.JCTypeIntersection TypeIntersection(List arg0) {
    return null;
  }

  public JCTree.JCTypeParameter TypeParameter(Name arg0, List arg1) {
    return null;
  }

  public JCTree.JCTypeParameter TypeParameter(Name arg0, List arg1, List arg2) {
    return null;
  }

  public JCTree.JCWildcard Wildcard(JCTree.TypeBoundKind arg0, JCTree arg1) {
    return null;
  }

  public JCTree.TypeBoundKind TypeBoundKind(BoundKind arg0) {
    return null;
  }

  public JCTree.JCAnnotation Annotation(JCTree arg0, List arg1) {
    return null;
  }

  public JCTree.JCAnnotation TypeAnnotation(JCTree arg0, List arg1) {
    return null;
  }

  public JCTree.JCModifiers Modifiers(long arg0, List arg1) {
    return null;
  }

  public JCTree.JCModifiers Modifiers(long arg0) {
    return null;
  }

  public JCTree.JCModuleDecl ModuleDef(JCTree.JCModifiers arg0, ModuleTree.ModuleKind arg1,
      JCTree.JCExpression arg2, List arg3) {
    return null;
  }

  public JCTree.JCExports Exports(JCTree.JCExpression arg0, List arg1) {
    return null;
  }

  public JCTree.JCOpens Opens(JCTree.JCExpression arg0, List arg1) {
    return null;
  }

  public JCTree.JCProvides Provides(JCTree.JCExpression arg0, List arg1) {
    return null;
  }

  public JCTree.JCRequires Requires(boolean arg0, boolean arg1, JCTree.JCExpression arg2) {
    return null;
  }

  public JCTree.JCUses Uses(JCTree.JCExpression arg0) {
    return null;
  }

  public JCTree.JCAnnotatedType AnnotatedType(List arg0, JCTree.JCExpression arg1) {
    return null;
  }

  public JCTree.JCErroneous Erroneous() {
    return null;
  }

  public JCTree.JCErroneous Erroneous(List arg0) {
    return null;
  }

  public JCTree.LetExpr LetExpr(List arg0, JCTree.JCExpression arg1) {
    return null;
  }

  public JCTree.JCClassDecl AnonymousClassDef(JCTree.JCModifiers arg0, List arg1) {
    return null;
  }

  public JCTree.LetExpr LetExpr(JCTree.JCVariableDecl arg0, JCTree.JCExpression arg1) {
    return null;
  }

  public JCTree.JCIdent Ident(Symbol arg0) {
    return null;
  }

  public JCTree.JCFieldAccess Select(JCTree.JCExpression arg0, Symbol arg1) {
    return null;
  }

  public JCTree.JCExpression QualIdent(Symbol arg0) {
    return null;
  }

  public JCTree.JCExpression Ident(JCTree.JCVariableDecl arg0) {
    return null;
  }

  public List Idents(List arg0) {
    return null;
  }

  public JCTree.JCExpression This(Type arg0) {
    return null;
  }

  public JCTree.JCExpression QualThis(Type arg0) {
    return null;
  }

  public JCTree.JCExpression ClassLiteral(Symbol.ClassSymbol arg0) {
    return null;
  }

  public JCTree.JCExpression ClassLiteral(Type arg0) {
    return null;
  }

  public JCTree.JCIdent Super(Type arg0, Symbol.TypeSymbol arg1) {
    return null;
  }

  public JCTree.JCMethodInvocation App(JCTree.JCExpression arg0, List arg1) {
    return null;
  }

  public JCTree.JCMethodInvocation App(JCTree.JCExpression arg0) {
    return null;
  }

  public JCTree.JCExpression Create(Symbol arg0, List arg1) {
    return null;
  }

  public JCTree.JCExpression Type(Type arg0) {
    return null;
  }

  public List Types(List arg0) {
    return null;
  }

  public JCTree.JCVariableDecl VarDef(Symbol.VarSymbol arg0, JCTree.JCExpression arg1) {
    return null;
  }

  public List Annotations(List arg0) {
    return null;
  }

  public JCTree.JCLiteral Literal(Object arg0) {
    return null;
  }

  public JCTree.JCAnnotation Annotation(Attribute arg0) {
    return null;
  }

  public JCTree.JCAnnotation TypeAnnotation(Attribute arg0) {
    return null;
  }

  public JCTree.JCMethodDecl MethodDef(Symbol.MethodSymbol arg0, JCTree.JCBlock arg1) {
    return null;
  }

  public JCTree.JCMethodDecl MethodDef(Symbol.MethodSymbol arg0, Type arg1, JCTree.JCBlock arg2) {
    return null;
  }

  public JCTree.JCTypeParameter TypeParam(Name arg0, Type.TypeVar arg1) {
    return null;
  }

  public List TypeParams(List arg0) {
    return null;
  }

  public JCTree.JCVariableDecl Param(Name arg0, Type arg1, Symbol arg2) {
    return null;
  }

  public List Params(Symbol.MethodSymbol arg0) {
    return null;
  }

  public List Params(Symbol.MethodSymbol arg0, List arg1) {
    return null;
  }

  public JCTree.JCStatement Call(JCTree.JCExpression arg0) {
    return null;
  }

  public JCTree.JCStatement Assignment(Symbol arg0, JCTree.JCExpression arg1) {
    return null;
  }

  public JCTree.JCArrayAccess Indexed(Symbol arg0, JCTree.JCExpression arg1) {
    return null;
  }

  public JCTree.JCTypeCast TypeCast(Type arg0, JCTree.JCExpression arg1) {
    return null;
  }

  boolean isUnqualifiable(Symbol arg0) {
    return false;
  }

  public Name paramName(int arg0) {
    return null;
  }

  public Name typaramName(int arg0) {
    return null;
  }

  private static String lambda$TopLevel$0(JCTree arg0) {
    return null;
  }

  static class AnnotationBuilder implements Attribute.Visitor {
    AnnotationBuilder(TreeMaker arg0) {
    }

    public void visitConstant(Attribute.Constant arg0) {
    }

    public void visitClass(Attribute.Class arg0) {
    }

    public void visitEnum(Attribute.Enum arg0) {
    }

    public void visitError(Attribute.Error arg0) {
    }

    public void visitCompound(Attribute.Compound arg0) {
    }

    public JCTree.JCAnnotation visitCompoundInternal(Attribute.Compound arg0) {
      return null;
    }

    public JCTree.JCAnnotation visitTypeCompoundInternal(Attribute.TypeCompound arg0) {
      return null;
    }

    public void visitArray(Attribute.Array arg0) {
    }

    JCTree.JCExpression translate(Attribute arg0) {
      return null;
    }

    JCTree.JCAnnotation translate(Attribute.Compound arg0) {
      return null;
    }

    JCTree.JCAnnotation translate(Attribute.TypeCompound arg0) {
      return null;
    }
  }
}
