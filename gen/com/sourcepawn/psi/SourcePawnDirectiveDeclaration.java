// This is a generated file. Not intended for manual editing.
package com.sourcepawn.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface SourcePawnDirectiveDeclaration extends PsiElement {

  @Nullable
  SourcePawnDefineDirective getDefineDirective();

  @Nullable
  SourcePawnElseDirective getElseDirective();

  @Nullable
  SourcePawnElseifDirective getElseifDirective();

  @Nullable
  SourcePawnEndInputDirective getEndInputDirective();

  @Nullable
  SourcePawnEndifDirective getEndifDirective();

  @Nullable
  SourcePawnIfDirective getIfDirective();

  @Nullable
  SourcePawnIncludeDirective getIncludeDirective();

  @Nullable
  SourcePawnPragmaDirective getPragmaDirective();

  @Nullable
  SourcePawnUndefineDirective getUndefineDirective();

}
