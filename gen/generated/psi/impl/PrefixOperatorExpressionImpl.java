// This is a generated file. Not intended for manual editing.
package generated.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static generated.GeneratedTypes.*;
import generated.psi.*;

public class PrefixOperatorExpressionImpl extends ExpressionImpl implements PrefixOperatorExpression {

  public PrefixOperatorExpressionImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof Visitor) ((Visitor)visitor).visitPrefixOperatorExpression(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public ArithmeticAdditiveOperator getArithmeticAdditiveOperator() {
    return findChildByClass(ArithmeticAdditiveOperator.class);
  }

  @Override
  @Nullable
  public ArithmeticMultiplicativeOperator getArithmeticMultiplicativeOperator() {
    return findChildByClass(ArithmeticMultiplicativeOperator.class);
  }

  @Override
  @Nullable
  public AssignmentOperator getAssignmentOperator() {
    return findChildByClass(AssignmentOperator.class);
  }

  @Override
  @Nullable
  public BitwiseShiftOperator getBitwiseShiftOperator() {
    return findChildByClass(BitwiseShiftOperator.class);
  }

  @Override
  @Nullable
  public EqualityOperator getEqualityOperator() {
    return findChildByClass(EqualityOperator.class);
  }

  @Override
  @Nullable
  public Expression getExpression() {
    return findChildByClass(Expression.class);
  }

  @Override
  @Nullable
  public Identifier getIdentifier() {
    return findChildByClass(Identifier.class);
  }

  @Override
  @Nullable
  public MiscOperator getMiscOperator() {
    return findChildByClass(MiscOperator.class);
  }

  @Override
  @Nullable
  public RelationalOperator getRelationalOperator() {
    return findChildByClass(RelationalOperator.class);
  }

  @Override
  @Nullable
  public Statement getStatement() {
    return findChildByClass(Statement.class);
  }

}
