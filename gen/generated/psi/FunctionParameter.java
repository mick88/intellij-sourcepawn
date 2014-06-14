// This is a generated file. Not intended for manual editing.
package generated.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface FunctionParameter extends PsiElement {

  @NotNull
  List<Expression> getExpressionList();

  @Nullable
  Identifier getIdentifier();

  @Nullable
  VarInit getVarInit();

  @Nullable
  PsiElement getTag();

}
