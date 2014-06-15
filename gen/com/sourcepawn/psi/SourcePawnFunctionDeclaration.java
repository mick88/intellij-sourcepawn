// This is a generated file. Not intended for manual editing.
package com.sourcepawn.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface SourcePawnFunctionDeclaration extends PsiElement {

  @Nullable
  SourcePawnFuncenumDeclaration getFuncenumDeclaration();

  @Nullable
  SourcePawnFunctionBlock getFunctionBlock();

  @Nullable
  SourcePawnFunctionParameterList getFunctionParameterList();

  @Nullable
  SourcePawnIdentifier getIdentifier();

  @Nullable
  SourcePawnQualifiedIdentifier getQualifiedIdentifier();

  @Nullable
  SourcePawnTagIdentifier getTagIdentifier();

}
