package com.sourcepawn.psi;

import com.intellij.extapi.psi.PsiFileBase;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.psi.FileViewProvider;
import com.sourcepawn.SourcePawnLanguage;
import com.sourcepawn.files.SourceFileType;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;

/**
 * Created by isaac on 28/01/14.
 */
public class SourcePawnFile extends PsiFileBase {
    public SourcePawnFile(@NotNull FileViewProvider viewProvider) {
        super(viewProvider, SourcePawnLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public FileType getFileType() {
        return SourceFileType.INSTANCE;
    }

    @Override
    public String toString() {
        return "SourcePawn File";
    }

    @Override
    public Icon getIcon(int flags) {
        return super.getIcon(flags);
    }
}
