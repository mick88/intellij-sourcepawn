// This is a generated file. Not intended for manual editing.
package generated.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface BitwiseShiftExpression extends Expression {

  @Nullable
  BitwiseShiftOperator getBitwiseShiftOperator();

  @NotNull
  List<Expression> getExpressionList();

  @NotNull
  List<Identifier> getIdentifierList();

  @Nullable
  PsiElement getTag();

}
