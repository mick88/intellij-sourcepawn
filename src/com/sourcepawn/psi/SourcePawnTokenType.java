package com.sourcepawn.psi;

import com.intellij.psi.tree.IElementType;
import com.sourcepawn.SourcePawnLanguage;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

public class SourcePawnTokenType extends IElementType {
    public SourcePawnTokenType(@NotNull @NonNls String debugName) {
        super(debugName, SourcePawnLanguage.INSTANCE);
    }

    @Override
    public String toString() {
        return "SourcePawnTokenType." + super.toString();
    }
}
