// This is a generated file. Not intended for manual editing.
package com.sourcepawn.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface SourcePawnAssignExpression extends SourcePawnExpression {

  @Nullable
  SourcePawnAssignmentOperator getAssignmentOperator();

  @NotNull
  List<SourcePawnExpression> getExpressionList();

  @NotNull
  List<SourcePawnIdentifier> getIdentifierList();

  @Nullable
  SourcePawnPrefixExpressionOperator getPrefixExpressionOperator();

  @NotNull
  List<SourcePawnSuffixExpressionOperator> getSuffixExpressionOperatorList();

  @Nullable
  SourcePawnTag getTag();

}
