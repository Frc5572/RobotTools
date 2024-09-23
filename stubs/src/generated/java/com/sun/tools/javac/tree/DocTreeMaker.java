package com.sun.tools.javac.tree;

import com.sun.source.doctree.AttributeTree;
import com.sun.source.doctree.AuthorTree;
import com.sun.source.doctree.CommentTree;
import com.sun.source.doctree.DeprecatedTree;
import com.sun.source.doctree.DocCommentTree;
import com.sun.source.doctree.DocRootTree;
import com.sun.source.doctree.DocTree;
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
import com.sun.source.util.DocTreeFactory;
import com.sun.tools.javac.parser.ReferenceParser;
import com.sun.tools.javac.parser.Tokens;
import com.sun.tools.javac.util.Context;
import com.sun.tools.javac.util.Pair;
import java.lang.String;
import java.util.List;
import javax.lang.model.element.Name;
import javax.tools.Diagnostic;

public class DocTreeMaker implements DocTreeFactory {
  protected DocTreeMaker(Context arg0) {
  }

  public static DocTreeMaker instance(Context arg0) {
    return null;
  }

  public DocTreeMaker at(int arg0) {
    return null;
  }

  public DCTree.DCAttribute newAttributeTree(Name arg0, AttributeTree.ValueKind arg1, List arg2) {
    return null;
  }

  public DCTree.DCAuthor newAuthorTree(List arg0) {
    return null;
  }

  public DCTree.DCLiteral newCodeTree(TextTree arg0) {
    return null;
  }

  public DCTree.DCComment newCommentTree(String arg0) {
    return null;
  }

  public DCTree.DCDeprecated newDeprecatedTree(List arg0) {
    return null;
  }

  public DCTree.DCDocComment newDocCommentTree(List arg0, List arg1) {
    return null;
  }

  public DCTree.DCDocComment newDocCommentTree(Tokens.Comment arg0, List arg1, List arg2, List arg3,
      List arg4) {
    return null;
  }

  public DCTree.DCDocComment newDocCommentTree(List arg0, List arg1, List arg2, List arg3) {
    return null;
  }

  public DCTree.DCDocRoot newDocRootTree() {
    return null;
  }

  public DCTree.DCDocType newDocTypeTree(String arg0) {
    return null;
  }

  public DCTree.DCEndElement newEndElementTree(Name arg0) {
    return null;
  }

  public DCTree.DCEntity newEntityTree(Name arg0) {
    return null;
  }

  public DCTree.DCErroneous newErroneousTree(String arg0, Diagnostic arg1) {
    return null;
  }

  public DCTree.DCEscape newEscapeTree(char arg0) {
    return null;
  }

  public DCTree.DCThrows newExceptionTree(ReferenceTree arg0, List arg1) {
    return null;
  }

  public DCTree.DCHidden newHiddenTree(List arg0) {
    return null;
  }

  public DCTree.DCIdentifier newIdentifierTree(Name arg0) {
    return null;
  }

  public DCTree.DCIndex newIndexTree(DocTree arg0, List arg1) {
    return null;
  }

  public DCTree.DCInheritDoc newInheritDocTree() {
    return null;
  }

  public DCTree.DCLink newLinkTree(ReferenceTree arg0, List arg1) {
    return null;
  }

  public DCTree.DCLink newLinkPlainTree(ReferenceTree arg0, List arg1) {
    return null;
  }

  public DCTree.DCLiteral newLiteralTree(TextTree arg0) {
    return null;
  }

  public DCTree.DCParam newParamTree(boolean arg0, IdentifierTree arg1, List arg2) {
    return null;
  }

  public DCTree.DCProvides newProvidesTree(ReferenceTree arg0, List arg1) {
    return null;
  }

  public DCTree.DCReference newReferenceTree(String arg0) {
    return null;
  }

  public DCTree.DCReference newReferenceTree(String arg0, ReferenceParser.Reference arg1) {
    return null;
  }

  public DCTree.DCReturn newReturnTree(List arg0) {
    return null;
  }

  public DCTree.DCReturn newReturnTree(boolean arg0, List arg1) {
    return null;
  }

  public DCTree.DCSee newSeeTree(List arg0) {
    return null;
  }

  public DCTree.DCSerial newSerialTree(List arg0) {
    return null;
  }

  public DCTree.DCSerialData newSerialDataTree(List arg0) {
    return null;
  }

  public DCTree.DCSerialField newSerialFieldTree(IdentifierTree arg0, ReferenceTree arg1,
      List arg2) {
    return null;
  }

  public DCTree.DCSince newSinceTree(List arg0) {
    return null;
  }

  public DCTree.DCSnippet newSnippetTree(List arg0, TextTree arg1) {
    return null;
  }

  public DCTree.DCSpec newSpecTree(TextTree arg0, List arg1) {
    return null;
  }

  public DCTree.DCStartElement newStartElementTree(Name arg0, List arg1, boolean arg2) {
    return null;
  }

  public DCTree.DCSummary newSummaryTree(List arg0) {
    return null;
  }

  public DCTree.DCSystemProperty newSystemPropertyTree(Name arg0) {
    return null;
  }

  public DCTree.DCText newTextTree(String arg0) {
    return null;
  }

  public DCTree.DCThrows newThrowsTree(ReferenceTree arg0, List arg1) {
    return null;
  }

  public DCTree.DCUnknownBlockTag newUnknownBlockTagTree(Name arg0, List arg1) {
    return null;
  }

  public DCTree.DCUnknownInlineTag newUnknownInlineTagTree(Name arg0, List arg1) {
    return null;
  }

  public DCTree.DCUses newUsesTree(ReferenceTree arg0, List arg1) {
    return null;
  }

  public DCTree.DCValue newValueTree(ReferenceTree arg0) {
    return null;
  }

  public DCTree.DCValue newValueTree(TextTree arg0, ReferenceTree arg1) {
    return null;
  }

  public DCTree.DCVersion newVersionTree(List arg0) {
    return null;
  }

  public List getFirstSentence(List arg0) {
    return null;
  }

  private static List cast(List arg0) {
    return null;
  }

  Pair splitBody(List arg0) {
    return null;
  }

  public DocTreeFactory at(int arg0) {
    return null;
  }

  public VersionTree newVersionTree(List arg0) {
    return null;
  }

  public ValueTree newValueTree(TextTree arg0, ReferenceTree arg1) {
    return null;
  }

  public ValueTree newValueTree(ReferenceTree arg0) {
    return null;
  }

  public UsesTree newUsesTree(ReferenceTree arg0, List arg1) {
    return null;
  }

  public UnknownInlineTagTree newUnknownInlineTagTree(Name arg0, List arg1) {
    return null;
  }

  public UnknownBlockTagTree newUnknownBlockTagTree(Name arg0, List arg1) {
    return null;
  }

  public ThrowsTree newThrowsTree(ReferenceTree arg0, List arg1) {
    return null;
  }

  public TextTree newTextTree(String arg0) {
    return null;
  }

  public SystemPropertyTree newSystemPropertyTree(Name arg0) {
    return null;
  }

  public SummaryTree newSummaryTree(List arg0) {
    return null;
  }

  public StartElementTree newStartElementTree(Name arg0, List arg1, boolean arg2) {
    return null;
  }

  public SpecTree newSpecTree(TextTree arg0, List arg1) {
    return null;
  }

  public SnippetTree newSnippetTree(List arg0, TextTree arg1) {
    return null;
  }

  public SinceTree newSinceTree(List arg0) {
    return null;
  }

  public SerialFieldTree newSerialFieldTree(IdentifierTree arg0, ReferenceTree arg1, List arg2) {
    return null;
  }

  public SerialDataTree newSerialDataTree(List arg0) {
    return null;
  }

  public SerialTree newSerialTree(List arg0) {
    return null;
  }

  public SeeTree newSeeTree(List arg0) {
    return null;
  }

  public ReturnTree newReturnTree(boolean arg0, List arg1) {
    return null;
  }

  public ReturnTree newReturnTree(List arg0) {
    return null;
  }

  public ReferenceTree newReferenceTree(String arg0) {
    return null;
  }

  public ProvidesTree newProvidesTree(ReferenceTree arg0, List arg1) {
    return null;
  }

  public ParamTree newParamTree(boolean arg0, IdentifierTree arg1, List arg2) {
    return null;
  }

  public LiteralTree newLiteralTree(TextTree arg0) {
    return null;
  }

  public LinkTree newLinkPlainTree(ReferenceTree arg0, List arg1) {
    return null;
  }

  public LinkTree newLinkTree(ReferenceTree arg0, List arg1) {
    return null;
  }

  public InheritDocTree newInheritDocTree() {
    return null;
  }

  public IndexTree newIndexTree(DocTree arg0, List arg1) {
    return null;
  }

  public IdentifierTree newIdentifierTree(Name arg0) {
    return null;
  }

  public HiddenTree newHiddenTree(List arg0) {
    return null;
  }

  public ThrowsTree newExceptionTree(ReferenceTree arg0, List arg1) {
    return null;
  }

  public EscapeTree newEscapeTree(char arg0) {
    return null;
  }

  public ErroneousTree newErroneousTree(String arg0, Diagnostic arg1) {
    return null;
  }

  public EntityTree newEntityTree(Name arg0) {
    return null;
  }

  public EndElementTree newEndElementTree(Name arg0) {
    return null;
  }

  public DocTypeTree newDocTypeTree(String arg0) {
    return null;
  }

  public DocRootTree newDocRootTree() {
    return null;
  }

  public DocCommentTree newDocCommentTree(List arg0, List arg1, List arg2, List arg3) {
    return null;
  }

  public DocCommentTree newDocCommentTree(List arg0, List arg1) {
    return null;
  }

  public DeprecatedTree newDeprecatedTree(List arg0) {
    return null;
  }

  public CommentTree newCommentTree(String arg0) {
    return null;
  }

  public LiteralTree newCodeTree(TextTree arg0) {
    return null;
  }

  public AuthorTree newAuthorTree(List arg0) {
    return null;
  }

  public AttributeTree newAttributeTree(Name arg0, AttributeTree.ValueKind arg1, List arg2) {
    return null;
  }

  static class SentenceBreaker {
    SentenceBreaker(DocTreeMaker arg0) {
    }

    Pair splitBody(List arg0) {
      return null;
    }

    private int defaultSentenceBreak(String arg0) {
      return 0;
    }

    private int getSentenceBreak(String arg0, DCTree arg1) {
      return 0;
    }

    private boolean isSentenceBreak(DCTree arg0, boolean arg1) {
      return false;
    }

    private boolean isSentenceBreak(Name arg0) {
      return false;
    }

    private int skipWhiteSpace(String arg0, int arg1) {
      return 0;
    }
  }
}
