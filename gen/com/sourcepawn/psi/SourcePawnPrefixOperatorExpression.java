// This is a generated file. Not intended for manual editing.
package com.sourcepawn.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface SourcePawnPrefixOperatorExpression extends SourcePawnExpression {

  @Nullable
  SourcePawnArithmeticAdditiveOperator getArithmeticAdditiveOperator();

  @Nullable
  SourcePawnArithmeticMultiplicativeOperator getArithmeticMultiplicativeOperator();

  @Nullable
  SourcePawnAssignmentOperator getAssignmentOperator();

  @Nullable
  SourcePawnBitwiseShiftOperator getBitwiseShiftOperator();

  @Nullable
  SourcePawnEqualityOperator getEqualityOperator();

  @Nullable
  SourcePawnExpression getExpression();

  @Nullable
  SourcePawnIdentifier getIdentifier();

  @Nullable
  SourcePawnMiscOperator getMiscOperator();

  @Nullable
  SourcePawnRelationalOperator getRelationalOperator();

  @Nullable
  SourcePawnStatement getStatement();

}
