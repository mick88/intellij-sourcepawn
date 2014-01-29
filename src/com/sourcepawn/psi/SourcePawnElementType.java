package com.sourcepawn.psi;

import com.intellij.psi.tree.IElementType;
import com.sourcepawn.SourcePawnLanguage;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

public class SourcePawnElementType extends IElementType {
    public SourcePawnElementType(@NotNull @NonNls String debugName) {
        super(debugName, SourcePawnLanguage.INSTANCE);
    }
}
