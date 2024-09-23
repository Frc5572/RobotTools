package com.sun.tools.javac.tree;

import com.sun.source.doctree.AttributeTree;
import com.sun.source.doctree.AuthorTree;
import com.sun.source.doctree.CommentTree;
import com.sun.source.doctree.DeprecatedTree;
import com.sun.source.doctree.DocCommentTree;
import com.sun.source.doctree.DocRootTree;
import com.sun.source.doctree.DocTree;
import com.sun.source.doctree.DocTreeVisitor;
import com.sun.source.doctree.DocTypeTree;
import com.sun.source.doctree.EndElementTree;
import com.sun.source.doctree.EntityTree;
import com.sun.source.doctree.ErroneousTree;
import com.sun.source.doctree.EscapeTree;
import com.sun.source.doctree.HiddenTree;
import com.sun.source.doctree.IdentifierTree;
import com.sun.source.doctree.IndexTree;
import com.sun.source.doctree.InheritDocTree;
import com.sun.source.doctree.LinkTree;
import com.sun.source.doctree.LiteralTree;
import com.sun.source.doctree.ParamTree;
import com.sun.source.doctree.ProvidesTree;
import com.sun.source.doctree.ReferenceTree;
import com.sun.source.doctree.ReturnTree;
import com.sun.source.doctree.SeeTree;
import com.sun.source.doctree.SerialDataTree;
import com.sun.source.doctree.SerialFieldTree;
import com.sun.source.doctree.SerialTree;
import com.sun.source.doctree.SinceTree;
import com.sun.source.doctree.SnippetTree;
import com.sun.source.doctree.SpecTree;
import com.sun.source.doctree.StartElementTree;
import com.sun.source.doctree.SummaryTree;
import com.sun.source.doctree.SystemPropertyTree;
import com.sun.source.doctree.TextTree;
import com.sun.source.doctree.ThrowsTree;
import com.sun.source.doctree.UnknownBlockTagTree;
import com.sun.source.doctree.UnknownInlineTagTree;
import com.sun.source.doctree.UsesTree;
import com.sun.source.doctree.ValueTree;
import com.sun.source.doctree.VersionTree;
import java.io.Writer;
import java.lang.Object;
import java.lang.Void;
import java.util.List;

public class DocPretty implements DocTreeVisitor {
  public DocPretty(Writer arg0) {
  }

  public void print(DocTree arg0) {
  }

  protected void print(Object arg0) {
  }

  private void print(char arg0) {
  }

  public void print(List arg0) {
  }

  private void print(List arg0, char arg1) {
  }

  protected void println() {
  }

  protected void printTagName(DocTree arg0) {
  }

  public Void visitAttribute(AttributeTree arg0, Void arg1) {
    return null;
  }

  public Void visitAuthor(AuthorTree arg0, Void arg1) {
    return null;
  }

  public Void visitComment(CommentTree arg0, Void arg1) {
    return null;
  }

  public Void visitDeprecated(DeprecatedTree arg0, Void arg1) {
    return null;
  }

  public Void visitDocComment(DocCommentTree arg0, Void arg1) {
    return null;
  }

  public Void visitDocRoot(DocRootTree arg0, Void arg1) {
    return null;
  }

  public Void visitDocType(DocTypeTree arg0, Void arg1) {
    return null;
  }

  public Void visitEndElement(EndElementTree arg0, Void arg1) {
    return null;
  }

  public Void visitEntity(EntityTree arg0, Void arg1) {
    return null;
  }

  public Void visitErroneous(ErroneousTree arg0, Void arg1) {
    return null;
  }

  public Void visitEscape(EscapeTree arg0, Void arg1) {
    return null;
  }

  public Void visitHidden(HiddenTree arg0, Void arg1) {
    return null;
  }

  public Void visitIdentifier(IdentifierTree arg0, Void arg1) {
    return null;
  }

  public Void visitIndex(IndexTree arg0, Void arg1) {
    return null;
  }

  public Void visitInheritDoc(InheritDocTree arg0, Void arg1) {
    return null;
  }

  public Void visitLink(LinkTree arg0, Void arg1) {
    return null;
  }

  public Void visitLiteral(LiteralTree arg0, Void arg1) {
    return null;
  }

  public Void visitParam(ParamTree arg0, Void arg1) {
    return null;
  }

  public Void visitProvides(ProvidesTree arg0, Void arg1) {
    return null;
  }

  public Void visitReference(ReferenceTree arg0, Void arg1) {
    return null;
  }

  public Void visitReturn(ReturnTree arg0, Void arg1) {
    return null;
  }

  public Void visitSee(SeeTree arg0, Void arg1) {
    return null;
  }

  public Void visitSerial(SerialTree arg0, Void arg1) {
    return null;
  }

  public Void visitSerialData(SerialDataTree arg0, Void arg1) {
    return null;
  }

  public Void visitSerialField(SerialFieldTree arg0, Void arg1) {
    return null;
  }

  public Void visitSince(SinceTree arg0, Void arg1) {
    return null;
  }

  public Void visitSnippet(SnippetTree arg0, Void arg1) {
    return null;
  }

  public Void visitSpec(SpecTree arg0, Void arg1) {
    return null;
  }

  public Void visitStartElement(StartElementTree arg0, Void arg1) {
    return null;
  }

  public Void visitSummary(SummaryTree arg0, Void arg1) {
    return null;
  }

  public Void visitSystemProperty(SystemPropertyTree arg0, Void arg1) {
    return null;
  }

  public Void visitText(TextTree arg0, Void arg1) {
    return null;
  }

  public Void visitThrows(ThrowsTree arg0, Void arg1) {
    return null;
  }

  public Void visitUnknownBlockTag(UnknownBlockTagTree arg0, Void arg1) {
    return null;
  }

  public Void visitUnknownInlineTag(UnknownInlineTagTree arg0, Void arg1) {
    return null;
  }

  public Void visitUses(UsesTree arg0, Void arg1) {
    return null;
  }

  public Void visitValue(ValueTree arg0, Void arg1) {
    return null;
  }

  public Void visitVersion(VersionTree arg0, Void arg1) {
    return null;
  }

  public Void visitOther(DocTree arg0, Void arg1) {
    return null;
  }

  public Object visitOther(DocTree arg0, Object arg1) {
    return null;
  }

  public Object visitVersion(VersionTree arg0, Object arg1) {
    return null;
  }

  public Object visitValue(ValueTree arg0, Object arg1) {
    return null;
  }

  public Object visitUses(UsesTree arg0, Object arg1) {
    return null;
  }

  public Object visitUnknownInlineTag(UnknownInlineTagTree arg0, Object arg1) {
    return null;
  }

  public Object visitUnknownBlockTag(UnknownBlockTagTree arg0, Object arg1) {
    return null;
  }

  public Object visitThrows(ThrowsTree arg0, Object arg1) {
    return null;
  }

  public Object visitText(TextTree arg0, Object arg1) {
    return null;
  }

  public Object visitSystemProperty(SystemPropertyTree arg0, Object arg1) {
    return null;
  }

  public Object visitSummary(SummaryTree arg0, Object arg1) {
    return null;
  }

  public Object visitStartElement(StartElementTree arg0, Object arg1) {
    return null;
  }

  public Object visitSpec(SpecTree arg0, Object arg1) {
    return null;
  }

  public Object visitSnippet(SnippetTree arg0, Object arg1) {
    return null;
  }

  public Object visitSince(SinceTree arg0, Object arg1) {
    return null;
  }

  public Object visitSerialField(SerialFieldTree arg0, Object arg1) {
    return null;
  }

  public Object visitSerialData(SerialDataTree arg0, Object arg1) {
    return null;
  }

  public Object visitSerial(SerialTree arg0, Object arg1) {
    return null;
  }

  public Object visitSee(SeeTree arg0, Object arg1) {
    return null;
  }

  public Object visitReturn(ReturnTree arg0, Object arg1) {
    return null;
  }

  public Object visitReference(ReferenceTree arg0, Object arg1) {
    return null;
  }

  public Object visitProvides(ProvidesTree arg0, Object arg1) {
    return null;
  }

  public Object visitParam(ParamTree arg0, Object arg1) {
    return null;
  }

  public Object visitLiteral(LiteralTree arg0, Object arg1) {
    return null;
  }

  public Object visitLink(LinkTree arg0, Object arg1) {
    return null;
  }

  public Object visitInheritDoc(InheritDocTree arg0, Object arg1) {
    return null;
  }

  public Object visitIndex(IndexTree arg0, Object arg1) {
    return null;
  }

  public Object visitIdentifier(IdentifierTree arg0, Object arg1) {
    return null;
  }

  public Object visitHidden(HiddenTree arg0, Object arg1) {
    return null;
  }

  public Object visitEscape(EscapeTree arg0, Object arg1) {
    return null;
  }

  public Object visitErroneous(ErroneousTree arg0, Object arg1) {
    return null;
  }

  public Object visitEntity(EntityTree arg0, Object arg1) {
    return null;
  }

  public Object visitEndElement(EndElementTree arg0, Object arg1) {
    return null;
  }

  public Object visitDocType(DocTypeTree arg0, Object arg1) {
    return null;
  }

  public Object visitDocRoot(DocRootTree arg0, Object arg1) {
    return null;
  }

  public Object visitDocComment(DocCommentTree arg0, Object arg1) {
    return null;
  }

  public Object visitDeprecated(DeprecatedTree arg0, Object arg1) {
    return null;
  }

  public Object visitComment(CommentTree arg0, Object arg1) {
    return null;
  }

  public Object visitAuthor(AuthorTree arg0, Object arg1) {
    return null;
  }

  public Object visitAttribute(AttributeTree arg0, Object arg1) {
    return null;
  }
}
