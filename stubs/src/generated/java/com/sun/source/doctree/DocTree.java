package com.sun.source.doctree;

import java.lang.Object;

public interface DocTree {
  Kind getKind();

  Object accept(DocTreeVisitor arg0, Object arg1);

  final enum Kind {
    ATTRIBUTE,

    AUTHOR,

    CODE,

    COMMENT,

    DEPRECATED,

    DOC_COMMENT,

    DOC_ROOT,

    DOC_TYPE,

    END_ELEMENT,

    ENTITY,

    ERRONEOUS,

    ESCAPE,

    EXCEPTION,

    HIDDEN,

    IDENTIFIER,

    INDEX,

    INHERIT_DOC,

    LINK,

    LINK_PLAIN,

    LITERAL,

    PARAM,

    PROVIDES,

    REFERENCE,

    RETURN,

    SEE,

    SERIAL,

    SERIAL_DATA,

    SERIAL_FIELD,

    SINCE,

    SNIPPET,

    SPEC,

    START_ELEMENT,

    SYSTEM_PROPERTY,

    SUMMARY,

    TEXT,

    THROWS,

    UNKNOWN_BLOCK_TAG,

    UNKNOWN_INLINE_TAG,

    USES,

    VALUE,

    VERSION,

    OTHER
  }
}
