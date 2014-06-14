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

public class GlobalVarDeclarationImpl extends ASTWrapperPsiElement implements GlobalVarDeclaration {

  public GlobalVarDeclarationImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof Visitor) ((Visitor)visitor).visitGlobalVarDeclaration(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public CommaList getCommaList() {
    return findChildByClass(CommaList.class);
  }

  @Override
  @NotNull
  public GlobalVarModifier getGlobalVarModifier() {
    return findNotNullChildByClass(GlobalVarModifier.class);
  }

  @Override
  @Nullable
  public VarInit getVarInit() {
    return findChildByClass(VarInit.class);
  }

}
