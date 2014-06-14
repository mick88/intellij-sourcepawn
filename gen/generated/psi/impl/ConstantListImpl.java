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

public class ConstantListImpl extends ASTWrapperPsiElement implements ConstantList {

  public ConstantListImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof Visitor) ((Visitor)visitor).visitConstantList(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public PsiElement getConstantBoolean() {
    return findChildByType(CONSTANT_BOOLEAN);
  }

  @Override
  @Nullable
  public PsiElement getConstantCharacter() {
    return findChildByType(CONSTANT_CHARACTER);
  }

  @Override
  @Nullable
  public PsiElement getConstantFloat() {
    return findChildByType(CONSTANT_FLOAT);
  }

  @Override
  @Nullable
  public PsiElement getConstantHex() {
    return findChildByType(CONSTANT_HEX);
  }

  @Override
  @Nullable
  public PsiElement getConstantInteger() {
    return findChildByType(CONSTANT_INTEGER);
  }

  @Override
  @Nullable
  public PsiElement getConstantString() {
    return findChildByType(CONSTANT_STRING);
  }

}
