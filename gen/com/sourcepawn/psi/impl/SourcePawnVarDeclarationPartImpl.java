// This is a generated file. Not intended for manual editing.
package com.sourcepawn.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.sourcepawn.psi.SourcePawnTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.sourcepawn.psi.*;

public class SourcePawnVarDeclarationPartImpl extends ASTWrapperPsiElement implements SourcePawnVarDeclarationPart {

  public SourcePawnVarDeclarationPartImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SourcePawnVisitor) ((SourcePawnVisitor)visitor).visitVarDeclarationPart(this);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<SourcePawnExpression> getExpressionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, SourcePawnExpression.class);
  }

  @Override
  @NotNull
  public SourcePawnQualifiedIdentifier getQualifiedIdentifier() {
    return findNotNullChildByClass(SourcePawnQualifiedIdentifier.class);
  }

}
