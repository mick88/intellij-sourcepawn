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

public class SourcePawnExpressionImpl extends ASTWrapperPsiElement implements SourcePawnExpression {

  public SourcePawnExpressionImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SourcePawnVisitor) ((SourcePawnVisitor)visitor).visitExpression(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public SourcePawnExpression getExpression() {
    return findChildByClass(SourcePawnExpression.class);
  }

  @Override
  @Nullable
  public SourcePawnIdentifier getIdentifier() {
    return findChildByClass(SourcePawnIdentifier.class);
  }

  @Override
  @Nullable
  public SourcePawnPrefixExpressionOperator getPrefixExpressionOperator() {
    return findChildByClass(SourcePawnPrefixExpressionOperator.class);
  }

  @Override
  @Nullable
  public SourcePawnSuffixExpressionOperator getSuffixExpressionOperator() {
    return findChildByClass(SourcePawnSuffixExpressionOperator.class);
  }

  @Override
  @Nullable
  public SourcePawnTagIdentifier getTagIdentifier() {
    return findChildByClass(SourcePawnTagIdentifier.class);
  }

}
