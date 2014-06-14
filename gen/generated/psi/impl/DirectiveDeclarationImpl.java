// This is a generated file. Not intended for manual editing.
package generated.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static generated.GeneratedTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import generated.psi.*;

public class DirectiveDeclarationImpl extends ASTWrapperPsiElement implements DirectiveDeclaration {

  public DirectiveDeclarationImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof Visitor) ((Visitor)visitor).visitDirectiveDeclaration(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public DefineDirective getDefineDirective() {
    return findChildByClass(DefineDirective.class);
  }

  @Override
  @Nullable
  public ElseDirective getElseDirective() {
    return findChildByClass(ElseDirective.class);
  }

  @Override
  @Nullable
  public ElseifDirective getElseifDirective() {
    return findChildByClass(ElseifDirective.class);
  }

  @Override
  @Nullable
  public EndInputDirective getEndInputDirective() {
    return findChildByClass(EndInputDirective.class);
  }

  @Override
  @Nullable
  public EndifDirective getEndifDirective() {
    return findChildByClass(EndifDirective.class);
  }

  @Override
  @Nullable
  public IfDirective getIfDirective() {
    return findChildByClass(IfDirective.class);
  }

  @Override
  @Nullable
  public IncludeDirective getIncludeDirective() {
    return findChildByClass(IncludeDirective.class);
  }

  @Override
  @Nullable
  public PragmaDirective getPragmaDirective() {
    return findChildByClass(PragmaDirective.class);
  }

  @Override
  @Nullable
  public UndefineDirective getUndefineDirective() {
    return findChildByClass(UndefineDirective.class);
  }

}
