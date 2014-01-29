package com.sourcepawn.files;

import com.intellij.openapi.fileTypes.LanguageFileType;
import com.sourcepawn.SourcePawnIcon;
import com.sourcepawn.SourcePawnLanguage;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class SourceFileType extends LanguageFileType {
    public static final SourceFileType INSTANCE = new SourceFileType();

    protected SourceFileType() {
        super(SourcePawnLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public String getName() {
        return "SourcePawn source file";
    }

    @NotNull
    @Override
    public String getDescription() {
        return getName();
    }

    @NotNull
    @Override
    public String getDefaultExtension() {
        return "sp";
    }

    @Nullable
    @Override
    public Icon getIcon() {
        return SourcePawnIcon.FILE;
    }
}
