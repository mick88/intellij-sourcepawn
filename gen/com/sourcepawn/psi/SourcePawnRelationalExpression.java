// This is a generated file. Not intended for manual editing.
package com.sourcepawn.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface SourcePawnRelationalExpression extends SourcePawnExpression {

  @NotNull
  List<SourcePawnExpression> getExpressionList();

  @NotNull
  List<SourcePawnIdentifier> getIdentifierList();

  @Nullable
  SourcePawnPrefixExpressionOperator getPrefixExpressionOperator();

  @Nullable
  SourcePawnRelationalOperator getRelationalOperator();

  @NotNull
  List<SourcePawnSuffixExpressionOperator> getSuffixExpressionOperatorList();

  @Nullable
  SourcePawnTag getTag();

}
