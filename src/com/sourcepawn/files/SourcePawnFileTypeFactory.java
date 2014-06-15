package com.sourcepawn.files;

import com.intellij.openapi.fileTypes.FileTypeConsumer;
import com.intellij.openapi.fileTypes.FileTypeFactory;
import com.sourcepawn.files.IncludeFileType;
import com.sourcepawn.files.SourceFileType;
import org.jetbrains.annotations.NotNull;

public class SourcePawnFileTypeFactory extends FileTypeFactory {
    @Override
    public void createFileTypes(@NotNull FileTypeConsumer fileTypeConsumer) {
        fileTypeConsumer.consume(SourceFileType.INSTANCE, "sp");
        fileTypeConsumer.consume(IncludeFileType.INSTANCE, "inc");
    }
}
