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

public class LocalVarDeclarationImpl extends ASTWrapperPsiElement implements LocalVarDeclaration {

  public LocalVarDeclarationImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof Visitor) ((Visitor)visitor).visitLocalVarDeclaration(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public CommaList getCommaList() {
    return findChildByClass(CommaList.class);
  }

  @Override
  @NotNull
  public LocalVarModifier getLocalVarModifier() {
    return findNotNullChildByClass(LocalVarModifier.class);
  }

  @Override
  @Nullable
  public VarInit getVarInit() {
    return findChildByClass(VarInit.class);
  }

}
