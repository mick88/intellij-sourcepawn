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

public class SourcePawnStatementImpl extends ASTWrapperPsiElement implements SourcePawnStatement {

  public SourcePawnStatementImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SourcePawnVisitor) ((SourcePawnVisitor)visitor).visitStatement(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public SourcePawnBreakStatement getBreakStatement() {
    return findChildByClass(SourcePawnBreakStatement.class);
  }

  @Override
  @Nullable
  public SourcePawnContinueStatement getContinueStatement() {
    return findChildByClass(SourcePawnContinueStatement.class);
  }

  @Override
  @Nullable
  public SourcePawnDoWhileStatement getDoWhileStatement() {
    return findChildByClass(SourcePawnDoWhileStatement.class);
  }

  @Override
  @Nullable
  public SourcePawnElseStatement getElseStatement() {
    return findChildByClass(SourcePawnElseStatement.class);
  }

  @Override
  @Nullable
  public SourcePawnExpression getExpression() {
    return findChildByClass(SourcePawnExpression.class);
  }

  @Override
  @Nullable
  public SourcePawnForStatement getForStatement() {
    return findChildByClass(SourcePawnForStatement.class);
  }

  @Override
  @Nullable
  public SourcePawnIfStatement getIfStatement() {
    return findChildByClass(SourcePawnIfStatement.class);
  }

  @Override
  @Nullable
  public SourcePawnLocalVarStatement getLocalVarStatement() {
    return findChildByClass(SourcePawnLocalVarStatement.class);
  }

  @Override
  @Nullable
  public SourcePawnReturnStatement getReturnStatement() {
    return findChildByClass(SourcePawnReturnStatement.class);
  }

  @Override
  @Nullable
  public SourcePawnSwitchStatement getSwitchStatement() {
    return findChildByClass(SourcePawnSwitchStatement.class);
  }

  @Override
  @Nullable
  public SourcePawnWhileStatement getWhileStatement() {
    return findChildByClass(SourcePawnWhileStatement.class);
  }

}
