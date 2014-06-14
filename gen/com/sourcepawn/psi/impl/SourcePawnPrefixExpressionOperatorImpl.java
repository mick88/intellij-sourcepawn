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

public class SourcePawnPrefixExpressionOperatorImpl extends ASTWrapperPsiElement implements SourcePawnPrefixExpressionOperator {

  public SourcePawnPrefixExpressionOperatorImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SourcePawnVisitor) ((SourcePawnVisitor)visitor).visitPrefixExpressionOperator(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public SourcePawnArithmeticAdditiveOperator getArithmeticAdditiveOperator() {
    return findChildByClass(SourcePawnArithmeticAdditiveOperator.class);
  }

  @Override
  @Nullable
  public SourcePawnArithmeticMultiplicativeOperator getArithmeticMultiplicativeOperator() {
    return findChildByClass(SourcePawnArithmeticMultiplicativeOperator.class);
  }

  @Override
  @Nullable
  public SourcePawnAssignmentOperator getAssignmentOperator() {
    return findChildByClass(SourcePawnAssignmentOperator.class);
  }

  @Override
  @Nullable
  public SourcePawnBitwiseShiftOperator getBitwiseShiftOperator() {
    return findChildByClass(SourcePawnBitwiseShiftOperator.class);
  }

  @Override
  @Nullable
  public SourcePawnEqualityOperator getEqualityOperator() {
    return findChildByClass(SourcePawnEqualityOperator.class);
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
  public SourcePawnMiscOperator getMiscOperator() {
    return findChildByClass(SourcePawnMiscOperator.class);
  }

  @Override
  @Nullable
  public SourcePawnPrefixExpressionOperator getPrefixExpressionOperator() {
    return findChildByClass(SourcePawnPrefixExpressionOperator.class);
  }

  @Override
  @Nullable
  public SourcePawnRelationalOperator getRelationalOperator() {
    return findChildByClass(SourcePawnRelationalOperator.class);
  }

  @Override
  @Nullable
  public SourcePawnStatement getStatement() {
    return findChildByClass(SourcePawnStatement.class);
  }

}
