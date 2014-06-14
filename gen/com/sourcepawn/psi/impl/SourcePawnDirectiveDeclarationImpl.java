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

public class SourcePawnDirectiveDeclarationImpl extends ASTWrapperPsiElement implements SourcePawnDirectiveDeclaration {

  public SourcePawnDirectiveDeclarationImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SourcePawnVisitor) ((SourcePawnVisitor)visitor).visitDirectiveDeclaration(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public SourcePawnDefineDirective getDefineDirective() {
    return findChildByClass(SourcePawnDefineDirective.class);
  }

  @Override
  @Nullable
  public SourcePawnElseDirective getElseDirective() {
    return findChildByClass(SourcePawnElseDirective.class);
  }

  @Override
  @Nullable
  public SourcePawnElseifDirective getElseifDirective() {
    return findChildByClass(SourcePawnElseifDirective.class);
  }

  @Override
  @Nullable
  public SourcePawnEndInputDirective getEndInputDirective() {
    return findChildByClass(SourcePawnEndInputDirective.class);
  }

  @Override
  @Nullable
  public SourcePawnEndifDirective getEndifDirective() {
    return findChildByClass(SourcePawnEndifDirective.class);
  }

  @Override
  @Nullable
  public SourcePawnIfDirective getIfDirective() {
    return findChildByClass(SourcePawnIfDirective.class);
  }

  @Override
  @Nullable
  public SourcePawnIncludeDirective getIncludeDirective() {
    return findChildByClass(SourcePawnIncludeDirective.class);
  }

  @Override
  @Nullable
  public SourcePawnPragmaDirective getPragmaDirective() {
    return findChildByClass(SourcePawnPragmaDirective.class);
  }

  @Override
  @Nullable
  public SourcePawnUndefineDirective getUndefineDirective() {
    return findChildByClass(SourcePawnUndefineDirective.class);
  }

}
