package com.sun.tools.javac.parser;

import com.sun.source.tree.ModuleTree;
import com.sun.tools.javac.code.Source;
import com.sun.tools.javac.code.TypeTag;
import com.sun.tools.javac.tree.DocCommentTable;
import com.sun.tools.javac.tree.EndPosTable;
import com.sun.tools.javac.tree.JCTree;
import com.sun.tools.javac.util.JCDiagnostic;
import com.sun.tools.javac.util.List;
import com.sun.tools.javac.util.ListBuffer;
import com.sun.tools.javac.util.Name;
import java.lang.String;
import java.util.function.Function;
import java.util.function.Predicate;

public class JavacParser implements Parser {
  protected JavacParser(ParserFactory arg0, Lexer arg1, boolean arg2, boolean arg3, boolean arg4) {
  }

  protected JavacParser(ParserFactory arg0, Lexer arg1, boolean arg2, boolean arg3, boolean arg4,
      boolean arg5) {
  }

  protected JavacParser(JavacParser arg0, Lexer arg1) {
  }

  protected AbstractEndPosTable newEndPosTable(boolean arg0) {
    return null;
  }

  protected DocCommentTable newDocCommentTable(boolean arg0, ParserFactory arg1) {
    return null;
  }

  protected void setMode(int arg0) {
  }

  protected void setLastMode(int arg0) {
  }

  protected boolean isMode(int arg0) {
    return false;
  }

  protected boolean wasTypeMode() {
    return false;
  }

  protected void selectExprMode() {
  }

  protected void selectTypeMode() {
  }

  public Tokens.Token token() {
    return null;
  }

  public void nextToken() {
  }

  protected boolean peekToken(Predicate arg0) {
    return false;
  }

  protected boolean peekToken(int arg0, Predicate arg1) {
    return false;
  }

  protected boolean peekToken(Predicate arg0, Predicate arg1) {
    return false;
  }

  protected boolean peekToken(int arg0, Predicate arg1, Predicate arg2) {
    return false;
  }

  protected boolean peekToken(Predicate arg0, Predicate arg1, Predicate arg2) {
    return false;
  }

  protected boolean peekToken(int arg0, Predicate arg1, Predicate arg2, Predicate arg3) {
    return false;
  }

  protected boolean peekToken(Predicate[] arg0) {
    return false;
  }

  protected boolean peekToken(int arg0, Predicate[] arg1) {
    return false;
  }

  protected void skip(boolean arg0, boolean arg1, boolean arg2, boolean arg3) {
  }

  protected JCTree.JCErroneous syntaxError(int arg0, JCDiagnostic.Error arg1) {
    return null;
  }

  protected JCTree.JCErroneous syntaxError(int arg0, List arg1, JCDiagnostic.Error arg2) {
    return null;
  }

  protected void reportSyntaxError(int arg0, JCDiagnostic.Error arg1) {
  }

  protected void reportSyntaxError(JCDiagnostic.DiagnosticPosition arg0, JCDiagnostic.Error arg1) {
  }

  public void accept(Tokens.TokenKind arg0) {
  }

  public void accept(Tokens.TokenKind arg0, Function arg1) {
  }

  JCTree.JCExpression illegal(int arg0) {
    return null;
  }

  JCTree.JCExpression illegal() {
    return null;
  }

  protected void checkNoMods(long arg0) {
  }

  protected void checkNoMods(int arg0, long arg1) {
  }

  protected void attach(JCTree arg0, Tokens.Comment arg1) {
  }

  protected void setErrorEndPos(int arg0) {
  }

  protected void storeEnd(JCTree arg0, int arg1) {
  }

  protected JCTree to(JCTree arg0) {
    return null;
  }

  protected JCTree toP(JCTree arg0) {
    return null;
  }

  public int getStartPos(JCTree arg0) {
    return 0;
  }

  public int getEndPos(JCTree arg0) {
    return 0;
  }

  public Name ident() {
    return null;
  }

  protected Name ident(boolean arg0) {
    return null;
  }

  public Name identOrUnderscore() {
    return null;
  }

  protected Name ident(boolean arg0, boolean arg1) {
    return null;
  }

  public JCTree.JCExpression qualident(boolean arg0) {
    return null;
  }

  JCTree.JCExpression stringTemplate(JCTree.JCExpression arg0) {
    return null;
  }

  JCTree.JCExpression literal(Name arg0) {
    return null;
  }

  JCTree.JCExpression literal(Name arg0, int arg1) {
    return null;
  }

  boolean isZero(String arg0) {
    return false;
  }

  String strval(Name arg0) {
    return null;
  }

  public JCTree.JCExpression parseExpression() {
    return null;
  }

  public JCTree.JCPattern parsePattern(int arg0, JCTree.JCModifiers arg1, JCTree.JCExpression arg2,
      boolean arg3, boolean arg4) {
    return null;
  }

  public JCTree.JCExpression parseType() {
    return null;
  }

  public JCTree.JCExpression parseType(boolean arg0) {
    return null;
  }

  public JCTree.JCExpression parseType(boolean arg0, List arg1) {
    return null;
  }

  public JCTree.JCExpression unannotatedType(boolean arg0) {
    return null;
  }

  public JCTree.JCExpression unannotatedType(boolean arg0, int arg1) {
    return null;
  }

  protected JCTree.JCExpression term(int arg0) {
    return null;
  }

  JCTree.JCExpression term() {
    return null;
  }

  JCTree.JCExpression termRest(JCTree.JCExpression arg0) {
    return null;
  }

  JCTree.JCExpression term1() {
    return null;
  }

  JCTree.JCExpression term1Rest(JCTree.JCExpression arg0) {
    return null;
  }

  JCTree.JCExpression term2() {
    return null;
  }

  JCTree.JCExpression term2Rest(JCTree.JCExpression arg0, int arg1) {
    return null;
  }

  protected JCTree.JCExpression foldStrings(JCTree.JCExpression arg0) {
    return null;
  }

  private boolean foldIfNeeded(JCTree.JCExpression arg0, ListBuffer arg1, ListBuffer arg2,
      boolean arg3) {
    return false;
  }

  boolean merge(ListBuffer arg0, ListBuffer arg1) {
    return false;
  }

  private JCTree.JCLiteral stringLiteral(JCTree arg0) {
    return null;
  }

  private JCTree.JCExpression[] newOdStack() {
    return null;
  }

  private Tokens.Token[] newOpStack() {
    return null;
  }

  protected JCTree.JCExpression term3() {
    return null;
  }

  private List switchExpressionStatementGroup() {
    return null;
  }

  JCTree.JCExpression term3Rest(JCTree.JCExpression arg0, List arg1) {
    return null;
  }

  boolean isUnboundMemberRef() {
    return false;
  }

  ParensResult analyzeParens() {
    return null;
  }

  private int skipAnnotation(int arg0) {
    return 0;
  }

  JCTree.JCExpression lambdaExpressionOrStatement(boolean arg0, boolean arg1, int arg2) {
    return null;
  }

  JCTree.JCExpression lambdaExpressionOrStatementRest(List arg0, int arg1) {
    return null;
  }

  JCTree.JCExpression lambdaStatement(List arg0, int arg1, int arg2) {
    return null;
  }

  JCTree.JCExpression lambdaExpression(List arg0, int arg1) {
    return null;
  }

  JCTree.JCExpression superSuffix(List arg0, JCTree.JCExpression arg1) {
    return null;
  }

  JCTree.JCPrimitiveTypeTree basicType() {
    return null;
  }

  JCTree.JCExpression argumentsOpt(List arg0, JCTree.JCExpression arg1) {
    return null;
  }

  List arguments() {
    return null;
  }

  JCTree.JCExpression arguments(List arg0, JCTree.JCExpression arg1) {
    return null;
  }

  boolean isInvalidUnqualifiedMethodIdentifier(int arg0, Name arg1) {
    return false;
  }

  JCTree.JCExpression typeArgumentsOpt(JCTree.JCExpression arg0) {
    return null;
  }

  List typeArgumentsOpt() {
    return null;
  }

  List typeArgumentsOpt(int arg0) {
    return null;
  }

  List typeArguments(boolean arg0) {
    return null;
  }

  JCTree.JCExpression typeArgument() {
    return null;
  }

  JCTree.JCTypeApply typeArguments(JCTree.JCExpression arg0, boolean arg1) {
    return null;
  }

  private JCTree.JCExpression bracketsOpt(JCTree.JCExpression arg0, List arg1) {
    return null;
  }

  private JCTree.JCExpression bracketsOpt(JCTree.JCExpression arg0) {
    return null;
  }

  private JCTree.JCExpression bracketsOptCont(JCTree.JCExpression arg0, int arg1, List arg2) {
    return null;
  }

  JCTree.JCExpression bracketsSuffix(JCTree.JCExpression arg0) {
    return null;
  }

  JCTree.JCExpression memberReferenceSuffix(JCTree.JCExpression arg0) {
    return null;
  }

  JCTree.JCExpression memberReferenceSuffix(int arg0, JCTree.JCExpression arg1) {
    return null;
  }

  JCTree.JCExpression creator(int arg0, List arg1) {
    return null;
  }

  JCTree.JCExpression innerCreator(int arg0, List arg1, JCTree.JCExpression arg2) {
    return null;
  }

  JCTree.JCExpression arrayCreatorRest(int arg0, JCTree.JCExpression arg1) {
    return null;
  }

  JCTree.JCNewClass classCreatorRest(int arg0, JCTree.JCExpression arg1, List arg2,
      JCTree.JCExpression arg3) {
    return null;
  }

  JCTree.JCExpression arrayInitializer(int arg0, JCTree.JCExpression arg1) {
    return null;
  }

  List arrayInitializerElements(int arg0, JCTree.JCExpression arg1) {
    return null;
  }

  public JCTree.JCExpression variableInitializer() {
    return null;
  }

  JCTree.JCExpression parExpression() {
    return null;
  }

  JCTree.JCBlock block(int arg0, long arg1) {
    return null;
  }

  public JCTree.JCBlock block() {
    return null;
  }

  List blockStatements() {
    return null;
  }

  JCTree.JCStatement parseStatementAsBlock() {
    return null;
  }

  List blockStatement() {
    return null;
  }

  private List localVariableDeclarations(JCTree.JCModifiers arg0, JCTree.JCExpression arg1) {
    return null;
  }

  public JCTree.JCStatement parseSimpleStatement() {
    return null;
  }

  public JCTree.JCStatement parseStatement() {
    return null;
  }

  private JCTree.JCStatement doRecover(int arg0, ErrorRecoveryAction arg1,
      JCDiagnostic.Error arg2) {
    return null;
  }

  protected JCTree.JCCatch catchClause() {
    return null;
  }

  List catchTypes() {
    return null;
  }

  List switchBlockStatementGroups() {
    return null;
  }

  protected List switchBlockStatementGroup() {
    return null;
  }

  private JCTree.JCCaseLabel parseCaseLabel(boolean arg0) {
    return null;
  }

  private JCTree.JCExpression parseGuard(JCTree.JCCaseLabel arg0) {
    return null;
  }

  PatternResult analyzePattern(int arg0) {
    return null;
  }

  ListBuffer moreStatementExpressions(int arg0, JCTree.JCExpression arg1, ListBuffer arg2) {
    return null;
  }

  List forInit() {
    return null;
  }

  List forUpdate() {
    return null;
  }

  protected List annotationsOpt(JCTree.Tag arg0) {
    return null;
  }

  List typeAnnotationsOpt() {
    return null;
  }

  protected JCTree.JCModifiers modifiersOpt() {
    return null;
  }

  protected JCTree.JCModifiers modifiersOpt(JCTree.JCModifiers arg0) {
    return null;
  }

  JCTree.JCAnnotation annotation(int arg0, JCTree.Tag arg1) {
    return null;
  }

  List annotationFieldValuesOpt() {
    return null;
  }

  List annotationFieldValues() {
    return null;
  }

  JCTree.JCExpression annotationFieldValue() {
    return null;
  }

  JCTree.JCExpression annotationValue() {
    return null;
  }

  public ListBuffer variableDeclarators(JCTree.JCModifiers arg0, JCTree.JCExpression arg1,
      ListBuffer arg2, boolean arg3) {
    return null;
  }

  protected ListBuffer variableDeclaratorsRest(int arg0, JCTree.JCModifiers arg1,
      JCTree.JCExpression arg2, Name arg3, boolean arg4, Tokens.Comment arg5, ListBuffer arg6,
      boolean arg7) {
    return null;
  }

  JCTree.JCVariableDecl variableDeclarator(JCTree.JCModifiers arg0, JCTree.JCExpression arg1,
      boolean arg2, Tokens.Comment arg3, boolean arg4) {
    return null;
  }

  JCTree.JCVariableDecl variableDeclaratorRest(int arg0, JCTree.JCModifiers arg1,
      JCTree.JCExpression arg2, Name arg3, boolean arg4, Tokens.Comment arg5, boolean arg6,
      boolean arg7) {
    return null;
  }

  Name restrictedTypeName(JCTree.JCExpression arg0, boolean arg1) {
    return null;
  }

  Source restrictedTypeNameStartingAtSource(Name arg0, int arg1, boolean arg2) {
    return null;
  }

  JCTree.JCVariableDecl variableDeclaratorId(JCTree.JCModifiers arg0, JCTree.JCExpression arg1,
      boolean arg2, boolean arg3, boolean arg4) {
    return null;
  }

  List resources() {
    return null;
  }

  protected JCTree resource() {
    return null;
  }

  public JCTree.JCCompilationUnit parseCompilationUnit() {
    return null;
  }

  private List constructUnnamedClass(List arg0) {
    return null;
  }

  JCTree.JCModuleDecl moduleDecl(JCTree.JCModifiers arg0, ModuleTree.ModuleKind arg1,
      Tokens.Comment arg2) {
    return null;
  }

  List moduleDirectiveList() {
    return null;
  }

  protected JCTree importDeclaration() {
    return null;
  }

  JCTree typeDeclaration(JCTree.JCModifiers arg0, Tokens.Comment arg1) {
    return null;
  }

  protected JCTree.JCStatement classOrRecordOrInterfaceOrEnumDeclaration(JCTree.JCModifiers arg0,
      Tokens.Comment arg1) {
    return null;
  }

  protected JCTree.JCClassDecl classDeclaration(JCTree.JCModifiers arg0, Tokens.Comment arg1) {
    return null;
  }

  protected JCTree.JCClassDecl recordDeclaration(JCTree.JCModifiers arg0, Tokens.Comment arg1) {
    return null;
  }

  Name typeName() {
    return null;
  }

  protected JCTree.JCClassDecl interfaceDeclaration(JCTree.JCModifiers arg0, Tokens.Comment arg1) {
    return null;
  }

  List permitsClause(JCTree.JCModifiers arg0, String arg1) {
    return null;
  }

  protected JCTree.JCClassDecl enumDeclaration(JCTree.JCModifiers arg0, Tokens.Comment arg1) {
    return null;
  }

  List enumBody(Name arg0) {
    return null;
  }

  private EnumeratorEstimate estimateEnumeratorOrMember(Name arg0) {
    return null;
  }

  JCTree enumeratorDeclaration(Name arg0) {
    return null;
  }

  List typeList() {
    return null;
  }

  List classInterfaceOrRecordBody(Name arg0, boolean arg1, boolean arg2) {
    return null;
  }

  protected List classOrInterfaceOrRecordBodyDeclaration(JCTree.JCModifiers arg0, Name arg1,
      boolean arg2, boolean arg3) {
    return null;
  }

  private List constructorOrMethodOrFieldDeclaration(JCTree.JCModifiers arg0, Name arg1,
      boolean arg2, boolean arg3, Tokens.Comment arg4) {
    return null;
  }

  private List topLevelMethodOrFieldDeclaration(JCTree.JCModifiers arg0) {
    return null;
  }

  protected boolean isDeclaration() {
    return false;
  }

  protected boolean isRecordStart() {
    return false;
  }

  protected boolean isNonSealedClassStart(boolean arg0) {
    return false;
  }

  protected boolean isNonSealedIdentifier(Tokens.Token arg0, int arg1) {
    return false;
  }

  protected boolean isSealedClassStart(boolean arg0) {
    return false;
  }

  private boolean allowedAfterSealedOrNonSealed(Tokens.Token arg0, boolean arg1, boolean arg2) {
    return false;
  }

  protected JCTree methodDeclaratorRest(int arg0, JCTree.JCModifiers arg1, JCTree.JCExpression arg2,
      Name arg3, List arg4, boolean arg5, boolean arg6, boolean arg7, Tokens.Comment arg8) {
    return null;
  }

  List qualidentList(boolean arg0) {
    return null;
  }

  protected List typeParametersOpt() {
    return null;
  }

  protected List typeParametersOpt(boolean arg0) {
    return null;
  }

  JCTree.JCTypeParameter typeParameter() {
    return null;
  }

  List formalParameters() {
    return null;
  }

  List formalParameters(boolean arg0, boolean arg1) {
    return null;
  }

  List implicitParameters(boolean arg0) {
    return null;
  }

  JCTree.JCModifiers optFinal(long arg0) {
    return null;
  }

  private JCTree.JCExpression insertAnnotationsToMostInner(JCTree.JCExpression arg0, List arg1,
      boolean arg2) {
    return null;
  }

  protected JCTree.JCVariableDecl formalParameter(boolean arg0, boolean arg1) {
    return null;
  }

  protected JCTree.JCVariableDecl implicitParameter() {
    return null;
  }

  protected JCTree.JCExpression checkExprStat(JCTree.JCExpression arg0) {
    return null;
  }

  static int prec(Tokens.TokenKind arg0) {
    return 0;
  }

  static int earlier(int arg0, int arg1) {
    return 0;
  }

  static JCTree.Tag optag(Tokens.TokenKind arg0) {
    return null;
  }

  static JCTree.Tag unoptag(Tokens.TokenKind arg0) {
    return null;
  }

  static TypeTag typetag(Tokens.TokenKind arg0) {
    return null;
  }

  void checkSourceLevel(Source.Feature arg0) {
  }

  protected void checkSourceLevel(int arg0, Source.Feature arg1) {
  }

  private static JCDiagnostic.Error lambda$annotationValue$10(Tokens.TokenKind arg0) {
    return null;
  }

  private static boolean lambda$analyzePattern$9(Tokens.TokenKind arg0) {
    return false;
  }

  private static boolean lambda$analyzePattern$8(Tokens.TokenKind arg0) {
    return false;
  }

  private static boolean lambda$analyzePattern$7(Tokens.TokenKind arg0) {
    return false;
  }

  private static JCDiagnostic.Error lambda$switchBlockStatementGroup$6(Tokens.TokenKind arg0) {
    return null;
  }

  private static JCDiagnostic.Error lambda$switchBlockStatementGroup$5(Tokens.TokenKind arg0) {
    return null;
  }

  private static JCDiagnostic.Error lambda$arguments$4(Tokens.TokenKind arg0) {
    return null;
  }

  private static boolean lambda$new$3(Tokens.TokenKind arg0) {
    return false;
  }

  private static JCDiagnostic.Error lambda$switchExpressionStatementGroup$2(Tokens.TokenKind arg0) {
    return null;
  }

  private static String lambda$merge$1(JCTree.JCLiteral arg0) {
    return null;
  }

  private JCTree.JCAnnotation lambda$term2Rest$0(JCTree.JCAnnotation arg0) {
    return null;
  }

  public abstract static class AbstractEndPosTable implements EndPosTable {
    public AbstractEndPosTable(JavacParser arg0) {
    }

    protected abstract JCTree to(JCTree arg0);

    protected abstract JCTree toP(JCTree arg0);

    public void setErrorEndPos(int arg0) {
    }

    public void setParser(JavacParser arg0) {
    }
  }

  abstract enum BasicErrorRecoveryAction {
    BLOCK_STMT,

    CATCH_CLAUSE
  }

  public static class EmptyEndPosTable extends AbstractEndPosTable {
    EmptyEndPosTable(JavacParser arg0) {
    }

    public void storeEnd(JCTree arg0, int arg1) {
    }

    protected JCTree to(JCTree arg0) {
      return null;
    }

    protected JCTree toP(JCTree arg0) {
      return null;
    }

    public int getEndPos(JCTree arg0) {
      return 0;
    }

    public int replaceTree(JCTree arg0, JCTree arg1) {
      return 0;
    }
  }

  final enum EnumeratorEstimate {
    ENUMERATOR,

    MEMBER,

    UNKNOWN
  }

  interface ErrorRecoveryAction {
    JCTree doRecover(JavacParser arg0);
  }

  static class LambdaClassifier {
    LambdaClassifier(JavacParser arg0) {
    }

    void addParameter(JCTree.JCVariableDecl arg0) {
    }

    private void reduce(LambdaParameterKind arg0) {
    }

    LambdaParameterKind result() {
      return null;
    }
  }

  final enum LambdaParameterKind {
    VAR,

    EXPLICIT,

    IMPLICIT,

    ERROR
  }

  final enum ParensResult {
    CAST,

    EXPLICIT_LAMBDA,

    IMPLICIT_LAMBDA,

    PARENS
  }

  final enum PatternResult {
    EXPRESSION,

    PATTERN
  }

  public static class SimpleEndPosTable extends AbstractEndPosTable {
    SimpleEndPosTable(JavacParser arg0) {
    }

    public void storeEnd(JCTree arg0, int arg1) {
    }

    protected JCTree to(JCTree arg0) {
      return null;
    }

    protected JCTree toP(JCTree arg0) {
      return null;
    }

    public int getEndPos(JCTree arg0) {
      return 0;
    }

    public int replaceTree(JCTree arg0, JCTree arg1) {
      return 0;
    }
  }
}
