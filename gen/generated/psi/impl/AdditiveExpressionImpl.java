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

public class AdditiveExpressionImpl extends ExpressionImpl implements AdditiveExpression {

  public AdditiveExpressionImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof Visitor) ((Visitor)visitor).visitAdditiveExpression(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public ArithmeticAdditiveOperator getArithmeticAdditiveOperator() {
    return findChildByClass(ArithmeticAdditiveOperator.class);
  }

  @Override
  @NotNull
  public List<Expression> getExpressionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, Expression.class);
  }

  @Override
  @NotNull
  public List<Identifier> getIdentifierList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, Identifier.class);
  }

  @Override
  @Nullable
  public PsiElement getTag() {
    return findChildByType(TAG);
  }

}
