package com.sourcepawn.highlight;

import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighter;
import com.intellij.openapi.options.colors.AttributesDescriptor;
import com.intellij.openapi.options.colors.ColorDescriptor;
import com.intellij.openapi.options.colors.ColorSettingsPage;
import com.sourcepawn.icons.SourcePawnIcon;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;
import java.util.Map;

/**
 * Created by isaac on 15/06/2014.
 */
public class SourcePawnColorsPage implements ColorSettingsPage {

    final static String demo = "// comment\n" +
            "/* multiline\n" +
            " comment */\n" +
            "/** document\n" +
            " comment */\n" +
            " \n" +
            "public bool:func(blah, blah[], const String:blah[] = \"asd\", any:...) {\n" +
            "\tnew blah = 0x1234\n" +
            "\tdecl blah = 'c'\n" +
            "\tblah = \"wang\"\n" +
            "\tblah = 123\n" +
            "\tif (blah == 123) {\n" +
            "\t\tdosomething();\n" +
            "\t}\n" +
            "}\n" +
            "\n" +
            "new blah:balh;\n" +
            "\n" +
            "enum blah {\n" +
            "\tnou,\n" +
            "\tyau,\n" +
            "}";

    @Nullable
    @Override
    public Icon getIcon() {
        return SourcePawnIcon.FILE;
    }

    @NotNull
    @Override
    public SyntaxHighlighter getHighlighter() {
        return new SourcePawnSyntaxHighlighter();
    }

    @NotNull
    @Override
    public String getDemoText() {
        return demo;
    }

    @Nullable
    @Override
    public Map<String, TextAttributesKey> getAdditionalHighlightingTagToDescriptorMap() {
        return null; // todo: this
    }

    @NotNull
    @Override
    public AttributesDescriptor[] getAttributeDescriptors() {
        return new AttributesDescriptor[0]; // todo: this
    }

    @NotNull
    @Override
    public ColorDescriptor[] getColorDescriptors() {
        return new ColorDescriptor[0]; // todo: this
    }

    @NotNull
    @Override
    public String getDisplayName() {
        return "SourcePawn";
    }
}
