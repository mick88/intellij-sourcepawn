// This is a generated file. Not intended for manual editing.
package com.sourcepawn.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface SourcePawnBitwiseAndExpression extends SourcePawnExpression {

  @NotNull
  List<SourcePawnExpression> getExpressionList();

  @NotNull
  List<SourcePawnIdentifier> getIdentifierList();

  @Nullable
  SourcePawnPrefixExpressionOperator getPrefixExpressionOperator();

  @NotNull
  List<SourcePawnSuffixExpressionOperator> getSuffixExpressionOperatorList();

  @Nullable
  SourcePawnTagIdentifier getTagIdentifier();

}
