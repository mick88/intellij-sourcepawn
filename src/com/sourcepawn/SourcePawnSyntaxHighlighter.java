package com.sourcepawn;

import com.intellij.lexer.Lexer;
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors;
import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase;
import com.intellij.psi.tree.IElementType;
import com.sourcepawn.grammar.SourcePawnLexer;
import com.sourcepawn.psi.SourcePawnTokenType;
import com.sourcepawn.psi.SourcePawnTypes;
import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by isaac on 14/06/2014.
 */
public class SourcePawnSyntaxHighlighter extends SyntaxHighlighterBase {

    private static final Map<IElementType, TextAttributesKey> keys = new HashMap<>();

    static {
        keys.put(SourcePawnTypes.CONSTANT_STRING, DefaultLanguageHighlighterColors.STRING);
        keys.put(SourcePawnTypes.BLOCK_COMMENT, DefaultLanguageHighlighterColors.BLOCK_COMMENT);
        keys.put(SourcePawnTypes.LINE_COMMENT, DefaultLanguageHighlighterColors.LINE_COMMENT);
    }

    private static final TextAttributesKey[] EMPTY_KEYS = new TextAttributesKey[0];

    @NotNull
    @Override
    public Lexer getHighlightingLexer() {
        return new SourcePawnLexer();
    }

    @NotNull
    @Override
    public TextAttributesKey[] getTokenHighlights(IElementType tokenType) {
        if (keys.containsKey(tokenType)) {
            return pack(keys.get(tokenType));
        } else {
            return EMPTY_KEYS;
        }
    }
}
