// This is a generated file. Not intended for manual editing.
package com.intellij.plugins.thrift.lang.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.intellij.plugins.thrift.lang.lexer.ThriftTokenTypes.*;
import com.intellij.plugins.thrift.lang.psi.*;

public class ThriftTypedefImpl extends ThriftPsiCompositeElementImpl implements ThriftTypedef {

  public ThriftTypedefImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof ThriftVisitor) ((ThriftVisitor)visitor).visitTypedef(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public ThriftBaseType getBaseType() {
    return findChildByClass(ThriftBaseType.class);
  }

  @Override
  @Nullable
  public ThriftListType getListType() {
    return findChildByClass(ThriftListType.class);
  }

  @Override
  @Nullable
  public ThriftMapType getMapType() {
    return findChildByClass(ThriftMapType.class);
  }

  @Override
  @Nullable
  public ThriftSetType getSetType() {
    return findChildByClass(ThriftSetType.class);
  }

}