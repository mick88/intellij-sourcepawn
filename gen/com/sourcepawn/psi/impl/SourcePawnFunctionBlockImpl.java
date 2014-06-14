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

public class SourcePawnFunctionBlockImpl extends ASTWrapperPsiElement implements SourcePawnFunctionBlock {

  public SourcePawnFunctionBlockImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SourcePawnVisitor) ((SourcePawnVisitor)visitor).visitFunctionBlock(this);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<SourcePawnStatement> getStatementList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, SourcePawnStatement.class);
  }

}
