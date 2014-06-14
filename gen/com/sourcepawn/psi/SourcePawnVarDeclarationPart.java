// This is a generated file. Not intended for manual editing.
package com.sourcepawn.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface SourcePawnVarDeclarationPart extends PsiElement {

  @NotNull
  List<SourcePawnExpression> getExpressionList();

  @NotNull
  SourcePawnQualifiedIdentifier getQualifiedIdentifier();

}
