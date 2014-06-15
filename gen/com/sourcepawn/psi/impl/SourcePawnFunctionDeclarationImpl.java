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

public class SourcePawnFunctionDeclarationImpl extends ASTWrapperPsiElement implements SourcePawnFunctionDeclaration {

  public SourcePawnFunctionDeclarationImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SourcePawnVisitor) ((SourcePawnVisitor)visitor).visitFunctionDeclaration(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public SourcePawnFuncenumDeclaration getFuncenumDeclaration() {
    return findChildByClass(SourcePawnFuncenumDeclaration.class);
  }

  @Override
  @Nullable
  public SourcePawnFunctionBlock getFunctionBlock() {
    return findChildByClass(SourcePawnFunctionBlock.class);
  }

  @Override
  @Nullable
  public SourcePawnFunctionParameterList getFunctionParameterList() {
    return findChildByClass(SourcePawnFunctionParameterList.class);
  }

  @Override
  @Nullable
  public SourcePawnIdentifier getIdentifier() {
    return findChildByClass(SourcePawnIdentifier.class);
  }

  @Override
  @Nullable
  public SourcePawnQualifiedIdentifier getQualifiedIdentifier() {
    return findChildByClass(SourcePawnQualifiedIdentifier.class);
  }

  @Override
  @Nullable
  public SourcePawnTagIdentifier getTagIdentifier() {
    return findChildByClass(SourcePawnTagIdentifier.class);
  }

}
