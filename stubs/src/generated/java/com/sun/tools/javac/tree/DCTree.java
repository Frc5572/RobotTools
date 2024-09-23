package com.sun.tools.javac.tree;

import com.sun.source.doctree.AttributeTree;
import com.sun.source.doctree.AuthorTree;
import com.sun.source.doctree.BlockTagTree;
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
import com.sun.source.doctree.InlineTagTree;
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
import com.sun.tools.javac.parser.Tokens;
import com.sun.tools.javac.util.JCDiagnostic;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import javax.lang.model.element.Name;
import javax.tools.Diagnostic;

public abstract class DCTree implements DocTree {
  public DCTree() {
  }

  public JCDiagnostic.DiagnosticPosition pos(DCDocComment arg0) {
    return null;
  }

  public int getStartPosition() {
    return 0;
  }

  public int getPreferredPosition() {
    return 0;
  }

  public int getEndPosition() {
    return 0;
  }

  public boolean isBlank() {
    return false;
  }

  public static boolean isBlank(List arg0) {
    return false;
  }

  public String toString() {
    return null;
  }

  private DCTree getLastChild() {
    return null;
  }

  public static JCDiagnostic.DiagnosticPosition createDiagnosticPosition(Tokens.Comment arg0,
      int arg1, int arg2, int arg3) {
    return null;
  }

  public static class DCAttribute extends DCTree implements AttributeTree {
    DCAttribute(Name arg0, AttributeTree.ValueKind arg1, List arg2) {
    }

    public DocTree.Kind getKind() {
      return null;
    }

    public Object accept(DocTreeVisitor arg0, Object arg1) {
      return null;
    }

    public Name getName() {
      return null;
    }

    public AttributeTree.ValueKind getValueKind() {
      return null;
    }

    public List getValue() {
      return null;
    }
  }

  public static class DCAuthor extends DCBlockTag implements AuthorTree {
    DCAuthor(List arg0) {
    }

    public DocTree.Kind getKind() {
      return null;
    }

    public Object accept(DocTreeVisitor arg0, Object arg1) {
      return null;
    }

    public List getName() {
      return null;
    }
  }

  public abstract static class DCBlockTag extends DCTree implements BlockTagTree {
    public DCBlockTag() {
    }

    public String getTagName() {
      return null;
    }
  }

  public static class DCComment extends DCTree implements CommentTree {
    DCComment(String arg0) {
    }

    public DocTree.Kind getKind() {
      return null;
    }

    public Object accept(DocTreeVisitor arg0, Object arg1) {
      return null;
    }

    public String getBody() {
      return null;
    }
  }

  public static class DCDeprecated extends DCBlockTag implements DeprecatedTree {
    DCDeprecated(List arg0) {
    }

    public DocTree.Kind getKind() {
      return null;
    }

    public Object accept(DocTreeVisitor arg0, Object arg1) {
      return null;
    }

    public List getBody() {
      return null;
    }
  }

  public static class DCDocComment extends DCTree implements DocCommentTree {
    public DCDocComment(Tokens.Comment arg0, List arg1, List arg2, List arg3, List arg4, List arg5,
        List arg6) {
    }

    public DocTree.Kind getKind() {
      return null;
    }

    public Object accept(DocTreeVisitor arg0, Object arg1) {
      return null;
    }

    public List getFirstSentence() {
      return null;
    }

    public List getFullBody() {
      return null;
    }

    public List getBody() {
      return null;
    }

    public List getBlockTags() {
      return null;
    }

    public List getPreamble() {
      return null;
    }

    public List getPostamble() {
      return null;
    }

    public int getSourcePosition(int arg0) {
      return 0;
    }
  }

  public static class DCDocRoot extends DCInlineTag implements DocRootTree {
    public DCDocRoot() {
    }

    public DocTree.Kind getKind() {
      return null;
    }

    public Object accept(DocTreeVisitor arg0, Object arg1) {
      return null;
    }
  }

  public static class DCDocType extends DCTree implements DocTypeTree {
    DCDocType(String arg0) {
    }

    public DocTree.Kind getKind() {
      return null;
    }

    public Object accept(DocTreeVisitor arg0, Object arg1) {
      return null;
    }

    public String getText() {
      return null;
    }
  }

  public static class DCEndElement extends DCEndPosTree implements EndElementTree {
    DCEndElement(Name arg0) {
    }

    public DocTree.Kind getKind() {
      return null;
    }

    public Object accept(DocTreeVisitor arg0, Object arg1) {
      return null;
    }

    public Name getName() {
      return null;
    }
  }

  public abstract static class DCEndPosTree extends DCTree {
    public DCEndPosTree() {
    }

    public int getEndPos() {
      return 0;
    }

    public DCEndPosTree setEndPos(int arg0) {
      return null;
    }
  }

  public static class DCEntity extends DCTree implements EntityTree {
    DCEntity(Name arg0) {
    }

    public DocTree.Kind getKind() {
      return null;
    }

    public Object accept(DocTreeVisitor arg0, Object arg1) {
      return null;
    }

    public Name getName() {
      return null;
    }
  }

  public static class DCErroneous extends DCTree implements ErroneousTree {
    DCErroneous(String arg0, JCDiagnostic arg1) {
    }

    public DocTree.Kind getKind() {
      return null;
    }

    public Object accept(DocTreeVisitor arg0, Object arg1) {
      return null;
    }

    public String getBody() {
      return null;
    }

    public Diagnostic getDiagnostic() {
      return null;
    }

    public int getStartPosition() {
      return 0;
    }

    public int getPreferredPosition() {
      return 0;
    }

    public int getEndPosition() {
      return 0;
    }

    public DCErroneous setPrefPos(int arg0) {
      return null;
    }
  }

  public static class DCEscape extends DCTree implements EscapeTree {
    DCEscape(char arg0) {
    }

    public DocTree.Kind getKind() {
      return null;
    }

    public Object accept(DocTreeVisitor arg0, Object arg1) {
      return null;
    }

    public String getBody() {
      return null;
    }
  }

  public static class DCHidden extends DCBlockTag implements HiddenTree {
    DCHidden(List arg0) {
    }

    public DocTree.Kind getKind() {
      return null;
    }

    public Object accept(DocTreeVisitor arg0, Object arg1) {
      return null;
    }

    public List getBody() {
      return null;
    }
  }

  public static class DCIdentifier extends DCTree implements IdentifierTree {
    DCIdentifier(Name arg0) {
    }

    public DocTree.Kind getKind() {
      return null;
    }

    public Object accept(DocTreeVisitor arg0, Object arg1) {
      return null;
    }

    public Name getName() {
      return null;
    }
  }

  public static class DCIndex extends DCInlineTag implements IndexTree {
    DCIndex(DCTree arg0, List arg1) {
    }

    public DocTree.Kind getKind() {
      return null;
    }

    public Object accept(DocTreeVisitor arg0, Object arg1) {
      return null;
    }

    public DocTree getSearchTerm() {
      return null;
    }

    public List getDescription() {
      return null;
    }
  }

  public static class DCInheritDoc extends DCInlineTag implements InheritDocTree {
    public DCInheritDoc() {
    }

    public DocTree.Kind getKind() {
      return null;
    }

    public Object accept(DocTreeVisitor arg0, Object arg1) {
      return null;
    }
  }

  public abstract static class DCInlineTag extends DCEndPosTree implements InlineTagTree {
    public DCInlineTag() {
    }

    public String getTagName() {
      return null;
    }
  }

  public static class DCLink extends DCInlineTag implements LinkTree {
    DCLink(DocTree.Kind arg0, DCReference arg1, List arg2) {
    }

    public DocTree.Kind getKind() {
      return null;
    }

    public Object accept(DocTreeVisitor arg0, Object arg1) {
      return null;
    }

    public ReferenceTree getReference() {
      return null;
    }

    public List getLabel() {
      return null;
    }
  }

  public static class DCLiteral extends DCInlineTag implements LiteralTree {
    DCLiteral(DocTree.Kind arg0, DCText arg1) {
    }

    public DocTree.Kind getKind() {
      return null;
    }

    public Object accept(DocTreeVisitor arg0, Object arg1) {
      return null;
    }

    public DCText getBody() {
      return null;
    }

    public TextTree getBody() {
      return null;
    }
  }

  public static class DCParam extends DCBlockTag implements ParamTree {
    DCParam(boolean arg0, DCIdentifier arg1, List arg2) {
    }

    public DocTree.Kind getKind() {
      return null;
    }

    public Object accept(DocTreeVisitor arg0, Object arg1) {
      return null;
    }

    public boolean isTypeParameter() {
      return false;
    }

    public IdentifierTree getName() {
      return null;
    }

    public List getDescription() {
      return null;
    }
  }

  public static class DCProvides extends DCBlockTag implements ProvidesTree {
    DCProvides(DCReference arg0, List arg1) {
    }

    public DocTree.Kind getKind() {
      return null;
    }

    public Object accept(DocTreeVisitor arg0, Object arg1) {
      return null;
    }

    public ReferenceTree getServiceType() {
      return null;
    }

    public List getDescription() {
      return null;
    }
  }

  public static class DCReference extends DCEndPosTree implements ReferenceTree {
    DCReference(String arg0, JCTree.JCExpression arg1, JCTree arg2, Name arg3, List arg4) {
    }

    public DocTree.Kind getKind() {
      return null;
    }

    public Object accept(DocTreeVisitor arg0, Object arg1) {
      return null;
    }

    public String getSignature() {
      return null;
    }
  }

  public static class DCReturn extends DCEndPosTree implements ReturnTree {
    DCReturn(boolean arg0, List arg1) {
    }

    public String getTagName() {
      return null;
    }

    public DocTree.Kind getKind() {
      return null;
    }

    public Object accept(DocTreeVisitor arg0, Object arg1) {
      return null;
    }

    public boolean isInline() {
      return false;
    }

    public List getDescription() {
      return null;
    }
  }

  public static class DCSee extends DCBlockTag implements SeeTree {
    DCSee(List arg0) {
    }

    public DocTree.Kind getKind() {
      return null;
    }

    public Object accept(DocTreeVisitor arg0, Object arg1) {
      return null;
    }

    public List getReference() {
      return null;
    }
  }

  public static class DCSerial extends DCBlockTag implements SerialTree {
    DCSerial(List arg0) {
    }

    public DocTree.Kind getKind() {
      return null;
    }

    public Object accept(DocTreeVisitor arg0, Object arg1) {
      return null;
    }

    public List getDescription() {
      return null;
    }
  }

  public static class DCSerialData extends DCBlockTag implements SerialDataTree {
    DCSerialData(List arg0) {
    }

    public DocTree.Kind getKind() {
      return null;
    }

    public Object accept(DocTreeVisitor arg0, Object arg1) {
      return null;
    }

    public List getDescription() {
      return null;
    }
  }

  public static class DCSerialField extends DCBlockTag implements SerialFieldTree {
    DCSerialField(DCIdentifier arg0, DCReference arg1, List arg2) {
    }

    public DocTree.Kind getKind() {
      return null;
    }

    public Object accept(DocTreeVisitor arg0, Object arg1) {
      return null;
    }

    public List getDescription() {
      return null;
    }

    public IdentifierTree getName() {
      return null;
    }

    public ReferenceTree getType() {
      return null;
    }
  }

  public static class DCSince extends DCBlockTag implements SinceTree {
    DCSince(List arg0) {
    }

    public DocTree.Kind getKind() {
      return null;
    }

    public Object accept(DocTreeVisitor arg0, Object arg1) {
      return null;
    }

    public List getBody() {
      return null;
    }
  }

  public static class DCSnippet extends DCInlineTag implements SnippetTree {
    public DCSnippet(List arg0, DCText arg1) {
    }

    public DocTree.Kind getKind() {
      return null;
    }

    public Object accept(DocTreeVisitor arg0, Object arg1) {
      return null;
    }

    public List getAttributes() {
      return null;
    }

    public TextTree getBody() {
      return null;
    }
  }

  public static class DCSpec extends DCBlockTag implements SpecTree {
    DCSpec(DCText arg0, List arg1) {
    }

    public String getTagName() {
      return null;
    }

    public DocTree.Kind getKind() {
      return null;
    }

    public Object accept(DocTreeVisitor arg0, Object arg1) {
      return null;
    }

    public TextTree getURL() {
      return null;
    }

    public List getTitle() {
      return null;
    }
  }

  public static class DCStartElement extends DCEndPosTree implements StartElementTree {
    DCStartElement(Name arg0, List arg1, boolean arg2) {
    }

    public DocTree.Kind getKind() {
      return null;
    }

    public Object accept(DocTreeVisitor arg0, Object arg1) {
      return null;
    }

    public Name getName() {
      return null;
    }

    public List getAttributes() {
      return null;
    }

    public boolean isSelfClosing() {
      return false;
    }
  }

  public static class DCSummary extends DCInlineTag implements SummaryTree {
    DCSummary(List arg0) {
    }

    public DocTree.Kind getKind() {
      return null;
    }

    public Object accept(DocTreeVisitor arg0, Object arg1) {
      return null;
    }

    public List getSummary() {
      return null;
    }
  }

  public static class DCSystemProperty extends DCInlineTag implements SystemPropertyTree {
    DCSystemProperty(Name arg0) {
    }

    public DocTree.Kind getKind() {
      return null;
    }

    public Object accept(DocTreeVisitor arg0, Object arg1) {
      return null;
    }

    public Name getPropertyName() {
      return null;
    }
  }

  public static class DCText extends DCTree implements TextTree {
    DCText(String arg0) {
    }

    public boolean isBlank() {
      return false;
    }

    public DocTree.Kind getKind() {
      return null;
    }

    public Object accept(DocTreeVisitor arg0, Object arg1) {
      return null;
    }

    public String getBody() {
      return null;
    }
  }

  public static class DCThrows extends DCBlockTag implements ThrowsTree {
    DCThrows(DocTree.Kind arg0, DCReference arg1, List arg2) {
    }

    public DocTree.Kind getKind() {
      return null;
    }

    public Object accept(DocTreeVisitor arg0, Object arg1) {
      return null;
    }

    public ReferenceTree getExceptionName() {
      return null;
    }

    public List getDescription() {
      return null;
    }
  }

  public static class DCUnknownBlockTag extends DCBlockTag implements UnknownBlockTagTree {
    DCUnknownBlockTag(Name arg0, List arg1) {
    }

    public DocTree.Kind getKind() {
      return null;
    }

    public Object accept(DocTreeVisitor arg0, Object arg1) {
      return null;
    }

    public String getTagName() {
      return null;
    }

    public List getContent() {
      return null;
    }
  }

  public static class DCUnknownInlineTag extends DCInlineTag implements UnknownInlineTagTree {
    DCUnknownInlineTag(Name arg0, List arg1) {
    }

    public DocTree.Kind getKind() {
      return null;
    }

    public Object accept(DocTreeVisitor arg0, Object arg1) {
      return null;
    }

    public String getTagName() {
      return null;
    }

    public List getContent() {
      return null;
    }
  }

  public static class DCUses extends DCBlockTag implements UsesTree {
    DCUses(DCReference arg0, List arg1) {
    }

    public DocTree.Kind getKind() {
      return null;
    }

    public Object accept(DocTreeVisitor arg0, Object arg1) {
      return null;
    }

    public ReferenceTree getServiceType() {
      return null;
    }

    public List getDescription() {
      return null;
    }
  }

  public static class DCValue extends DCInlineTag implements ValueTree {
    DCValue(DCText arg0, DCReference arg1) {
    }

    public DocTree.Kind getKind() {
      return null;
    }

    public Object accept(DocTreeVisitor arg0, Object arg1) {
      return null;
    }

    public TextTree getFormat() {
      return null;
    }

    public ReferenceTree getReference() {
      return null;
    }
  }

  public static class DCVersion extends DCBlockTag implements VersionTree {
    DCVersion(List arg0) {
    }

    public DocTree.Kind getKind() {
      return null;
    }

    public Object accept(DocTreeVisitor arg0, Object arg1) {
      return null;
    }

    public List getBody() {
      return null;
    }
  }
}
