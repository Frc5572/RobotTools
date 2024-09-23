package com.sun.tools.javac.code;

import com.sun.tools.javac.util.List;

public class SymbolMetadata {
  public SymbolMetadata(Symbol arg0) {
  }

  public List getDeclarationAttributes() {
    return null;
  }

  public List getTypeAttributes() {
    return null;
  }

  public List getInitTypeAttributes() {
    return null;
  }

  public List getClassInitTypeAttributes() {
    return null;
  }

  public void setDeclarationAttributes(List arg0) {
  }

  public void setTypeAttributes(List arg0) {
  }

  public void setInitTypeAttributes(List arg0) {
  }

  public void setClassInitTypeAttributes(List arg0) {
  }

  public void setAttributes(SymbolMetadata arg0) {
  }

  public SymbolMetadata reset() {
    return null;
  }

  public boolean isEmpty() {
    return false;
  }

  public boolean isTypesEmpty() {
    return false;
  }

  public boolean pendingCompletion() {
    return false;
  }

  public SymbolMetadata append(List arg0) {
    return null;
  }

  public SymbolMetadata appendUniqueTypes(List arg0) {
    return null;
  }

  public SymbolMetadata appendInitTypeAttributes(List arg0) {
    return null;
  }

  public SymbolMetadata appendClassInitTypeAttributes(List arg0) {
    return null;
  }

  public SymbolMetadata prepend(List arg0) {
    return null;
  }

  private List filterDeclSentinels(List arg0) {
    return null;
  }

  private boolean isStarted() {
    return false;
  }

  private List removeFromCompoundList(List arg0, Attribute.Compound arg1) {
    return null;
  }

  public void removeDeclarationMetadata(Attribute.Compound arg0) {
  }
}
