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

public class SourcePawnVarBlockStatementImpl extends ASTWrapperPsiElement implements SourcePawnVarBlockStatement {

  public SourcePawnVarBlockStatementImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SourcePawnVisitor) ((SourcePawnVisitor)visitor).visitVarBlockStatement(this);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<SourcePawnIdentifier> getIdentifierList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, SourcePawnIdentifier.class);
  }

  @Override
  @Nullable
  public SourcePawnLiteralExpression getLiteralExpression() {
    return findChildByClass(SourcePawnLiteralExpression.class);
  }

}
