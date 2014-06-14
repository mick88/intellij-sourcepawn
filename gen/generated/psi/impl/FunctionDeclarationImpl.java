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

public class FunctionDeclarationImpl extends ASTWrapperPsiElement implements FunctionDeclaration {

  public FunctionDeclarationImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof Visitor) ((Visitor)visitor).visitFunctionDeclaration(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public FuncenumDeclaration getFuncenumDeclaration() {
    return findChildByClass(FuncenumDeclaration.class);
  }

  @Override
  @Nullable
  public FunctionBlock getFunctionBlock() {
    return findChildByClass(FunctionBlock.class);
  }

  @Override
  @Nullable
  public FunctionParameterList getFunctionParameterList() {
    return findChildByClass(FunctionParameterList.class);
  }

  @Override
  @Nullable
  public Identifier getIdentifier() {
    return findChildByClass(Identifier.class);
  }

  @Override
  @Nullable
  public QualifiedIdentifier getQualifiedIdentifier() {
    return findChildByClass(QualifiedIdentifier.class);
  }

  @Override
  @Nullable
  public PsiElement getTag() {
    return findChildByType(TAG);
  }

}
