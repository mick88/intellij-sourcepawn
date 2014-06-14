// This is a generated file. Not intended for manual editing.
package generated.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface PrefixOperatorExpression extends Expression {

  @Nullable
  ArithmeticAdditiveOperator getArithmeticAdditiveOperator();

  @Nullable
  ArithmeticMultiplicativeOperator getArithmeticMultiplicativeOperator();

  @Nullable
  AssignmentOperator getAssignmentOperator();

  @Nullable
  BitwiseShiftOperator getBitwiseShiftOperator();

  @Nullable
  EqualityOperator getEqualityOperator();

  @Nullable
  Expression getExpression();

  @Nullable
  Identifier getIdentifier();

  @Nullable
  MiscOperator getMiscOperator();

  @Nullable
  RelationalOperator getRelationalOperator();

  @Nullable
  Statement getStatement();

}
