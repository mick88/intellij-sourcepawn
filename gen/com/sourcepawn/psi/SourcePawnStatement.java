// This is a generated file. Not intended for manual editing.
package com.sourcepawn.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface SourcePawnStatement extends PsiElement {

  @Nullable
  SourcePawnBreakStatement getBreakStatement();

  @Nullable
  SourcePawnContinueStatement getContinueStatement();

  @Nullable
  SourcePawnDoWhileStatement getDoWhileStatement();

  @Nullable
  SourcePawnElseStatement getElseStatement();

  @Nullable
  SourcePawnExpression getExpression();

  @Nullable
  SourcePawnForStatement getForStatement();

  @Nullable
  SourcePawnIfStatement getIfStatement();

  @Nullable
  SourcePawnLocalVarStatement getLocalVarStatement();

  @Nullable
  SourcePawnReturnStatement getReturnStatement();

  @Nullable
  SourcePawnSwitchStatement getSwitchStatement();

  @Nullable
  SourcePawnWhileStatement getWhileStatement();

}
