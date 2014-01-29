package com.sourcepawn.files;

import com.intellij.openapi.fileTypes.LanguageFileType;
import com.sourcepawn.SourcePawnIcon;
import com.sourcepawn.SourcePawnLanguage;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class IncludeFileType extends LanguageFileType {
    public static final IncludeFileType INSTANCE = new IncludeFileType();

    protected IncludeFileType() {
        super(SourcePawnLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public String getName() {
        return "SourcePawn include file";
    }

    @NotNull
    @Override
    public String getDescription() {
        return getName();
    }

    @NotNull
    @Override
    public String getDefaultExtension() {
        return "inc";
    }

    @Nullable
    @Override
    public Icon getIcon() {
        return SourcePawnIcon.FILE;
    }
}
