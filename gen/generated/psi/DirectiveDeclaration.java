// This is a generated file. Not intended for manual editing.
package generated.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface DirectiveDeclaration extends PsiElement {

  @Nullable
  DefineDirective getDefineDirective();

  @Nullable
  ElseDirective getElseDirective();

  @Nullable
  ElseifDirective getElseifDirective();

  @Nullable
  EndInputDirective getEndInputDirective();

  @Nullable
  EndifDirective getEndifDirective();

  @Nullable
  IfDirective getIfDirective();

  @Nullable
  IncludeDirective getIncludeDirective();

  @Nullable
  PragmaDirective getPragmaDirective();

  @Nullable
  UndefineDirective getUndefineDirective();

}
