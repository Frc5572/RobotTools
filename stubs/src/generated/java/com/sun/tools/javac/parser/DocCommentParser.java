package com.sun.tools.javac.parser;

import com.sun.source.doctree.DocTree;
import com.sun.tools.javac.tree.DCTree;
import com.sun.tools.javac.util.DiagnosticSource;
import com.sun.tools.javac.util.List;
import com.sun.tools.javac.util.ListBuffer;
import com.sun.tools.javac.util.Name;
import java.lang.Exception;
import java.lang.String;
import java.util.Map;

public class DocCommentParser {
  public DocCommentParser(ParserFactory arg0, DiagnosticSource arg1, Tokens.Comment arg2,
      boolean arg3) {
  }

  public DocCommentParser(ParserFactory arg0, DiagnosticSource arg1, Tokens.Comment arg2) {
  }

  public DCTree.DCDocComment parse() {
    return null;
  }

  void nextChar() {
  }

  char peekChar() {
    return '_';
  }

  protected List blockContent() {
    return null;
  }

  protected List blockContent(Phase arg0) {
    return null;
  }

  protected List blockTags() {
    return null;
  }

  protected DCTree blockTag() {
    return null;
  }

  protected void inlineTag(ListBuffer arg0) {
  }

  protected DCTree inlineTag() {
    return null;
  }

  private DCTree.DCText inlineText(WhitespaceRetentionPolicy arg0) {
    return null;
  }

  protected DCTree.DCReference reference(ReferenceParser.Mode arg0) {
    return null;
  }

  protected DCTree.DCIdentifier identifier() {
    return null;
  }

  protected DCTree.DCText quotedString() {
    return null;
  }

  protected DCTree.DCText inlineWord() {
    return null;
  }

  private List inlineContent() {
    return null;
  }

  protected void entity(ListBuffer arg0) {
  }

  protected DCTree entity() {
    return null;
  }

  boolean isEndPreamble() {
    return false;
  }

  boolean isEndBody() {
    return false;
  }

  boolean peek(String arg0) {
    return false;
  }

  private DCTree html() {
    return null;
  }

  protected List htmlAttrs() {
    return null;
  }

  protected void attrValueChar(ListBuffer arg0) {
  }

  protected void addPendingText(ListBuffer arg0, int arg1) {
  }

  protected DCTree.DCErroneous erroneous(String arg0, int arg1) {
    return null;
  }

  protected DCTree.DCErroneous erroneous(String arg0, int arg1, int arg2) {
    return null;
  }

  protected boolean isIdentifierStart(char arg0) {
    return false;
  }

  protected Name readIdentifier() {
    return null;
  }

  protected Name readAttributeName() {
    return null;
  }

  protected Name readTagName() {
    return null;
  }

  protected boolean isJavaIdentifierStart(char arg0) {
    return false;
  }

  protected Name readJavaIdentifier() {
    return null;
  }

  protected Name readSystemPropertyName() {
    return null;
  }

  protected boolean isDecimalDigit(char arg0) {
    return false;
  }

  protected boolean isHexDigit(char arg0) {
    return false;
  }

  protected boolean isUnquotedAttrValueTerminator(char arg0) {
    return false;
  }

  protected boolean isWhitespace(char arg0) {
    return false;
  }

  protected boolean isHorizontalWhitespace(char arg0) {
    return false;
  }

  protected void skipWhitespace() {
  }

  String newString(int arg0, int arg1) {
    return null;
  }

  private Map createTagParsers() {
    return null;
  }

  static class ParseException extends Exception {
    ParseException(String arg0) {
    }

    ParseException(int arg0, String arg1) {
    }
  }

  final enum Phase {
    PREAMBLE,

    BODY,

    POSTAMBLE
  }

  final enum Kind {
    INLINE,

    BLOCK,

    EITHER
  }

  abstract static class TagParser {
    TagParser(TagParser.Kind arg0, DocTree.Kind arg1) {
    }

    TagParser(TagParser.Kind arg0, DocTree.Kind arg1, boolean arg2) {
    }

    boolean allowsBlock() {
      return false;
    }

    boolean allowsInline() {
      return false;
    }

    DocTree.Kind getTreeKind() {
      return null;
    }

    DCTree parse(int arg0, TagParser.Kind arg1) {
      return null;
    }

    DCTree parse(int arg0) {
      return null;
    }
  }

  final enum WhitespaceRetentionPolicy {
    RETAIN_ALL,

    REMOVE_FIRST_SPACE,

    REMOVE_ALL
  }
}
