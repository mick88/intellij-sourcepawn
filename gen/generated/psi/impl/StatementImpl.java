// This is a generated file. Not intended for manual editing.
package generated.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static generated.GeneratedTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import generated.psi.*;

public class StatementImpl extends ASTWrapperPsiElement implements Statement {

  public StatementImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof Visitor) ((Visitor)visitor).visitStatement(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public BreakStatement getBreakStatement() {
    return findChildByClass(BreakStatement.class);
  }

  @Override
  @Nullable
  public ContinueStatement getContinueStatement() {
    return findChildByClass(ContinueStatement.class);
  }

  @Override
  @Nullable
  public DoWhileStatement getDoWhileStatement() {
    return findChildByClass(DoWhileStatement.class);
  }

  @Override
  @Nullable
  public ElseStatement getElseStatement() {
    return findChildByClass(ElseStatement.class);
  }

  @Override
  @Nullable
  public Expression getExpression() {
    return findChildByClass(Expression.class);
  }

  @Override
  @Nullable
  public ForStatement getForStatement() {
    return findChildByClass(ForStatement.class);
  }

  @Override
  @Nullable
  public IfStatement getIfStatement() {
    return findChildByClass(IfStatement.class);
  }

  @Override
  @Nullable
  public LocalVarDeclaration getLocalVarDeclaration() {
    return findChildByClass(LocalVarDeclaration.class);
  }

  @Override
  @Nullable
  public ReturnStatement getReturnStatement() {
    return findChildByClass(ReturnStatement.class);
  }

  @Override
  @Nullable
  public SwitchStatement getSwitchStatement() {
    return findChildByClass(SwitchStatement.class);
  }

  @Override
  @Nullable
  public WhileStatement getWhileStatement() {
    return findChildByClass(WhileStatement.class);
  }

}
