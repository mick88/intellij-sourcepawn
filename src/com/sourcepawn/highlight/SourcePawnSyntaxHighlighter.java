package com.sourcepawn.highlight;

import com.intellij.lexer.Lexer;
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors;
import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase;
import com.intellij.psi.tree.IElementType;
import com.sourcepawn.grammar.SourcePawnLexer;
import com.sourcepawn.psi.SourcePawnTokenType;
import com.sourcepawn.psi.SourcePawnTypes;
import org.jetbrains.annotations.NotNull;

import javax.xml.transform.Source;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by isaac on 14/06/2014.
 */
public class SourcePawnSyntaxHighlighter extends SyntaxHighlighterBase {

    private static final Map<IElementType, TextAttributesKey> keys = new HashMap<>();

    static {
        // todo: intermdeiate class for holding colorus?
        keys.put(SourcePawnTypes.CONSTANT_STRING, DefaultLanguageHighlighterColors.STRING);
        keys.put(SourcePawnTypes.CONSTANT_CHARACTER, DefaultLanguageHighlighterColors.STRING);
        keys.put(SourcePawnTypes.CONSTANT_INTEGER, DefaultLanguageHighlighterColors.NUMBER);
        keys.put(SourcePawnTypes.CONSTANT_FLOAT, DefaultLanguageHighlighterColors.NUMBER);
        keys.put(SourcePawnTypes.CONSTANT_HEX, DefaultLanguageHighlighterColors.NUMBER);
        keys.put(SourcePawnTypes.CONSTANT_BOOLEAN, DefaultLanguageHighlighterColors.KEYWORD);

        keys.put(SourcePawnTypes.BLOCK_COMMENT, DefaultLanguageHighlighterColors.BLOCK_COMMENT);
        keys.put(SourcePawnTypes.LINE_COMMENT, DefaultLanguageHighlighterColors.LINE_COMMENT);

        keys.put(SourcePawnTypes.IDENTIFIER, DefaultLanguageHighlighterColors.IDENTIFIER);
        keys.put(SourcePawnTypes.TAG, DefaultLanguageHighlighterColors.LABEL);
        keys.put(SourcePawnTypes.QUALIFIED_IDENTIFIER, DefaultLanguageHighlighterColors.IDENTIFIER);

        keys.put(SourcePawnTypes.BRACKET_CURLY_L, DefaultLanguageHighlighterColors.BRACES);
        keys.put(SourcePawnTypes.BRACKET_CURLY_R, DefaultLanguageHighlighterColors.BRACES);
        keys.put(SourcePawnTypes.BRACKET_SQUARE_L, DefaultLanguageHighlighterColors.BRACKETS);
        keys.put(SourcePawnTypes.BRACKET_SQUARE_R, DefaultLanguageHighlighterColors.BRACKETS);
        keys.put(SourcePawnTypes.BRACKET_PAREN_L, DefaultLanguageHighlighterColors.PARENTHESES);
        keys.put(SourcePawnTypes.BRACKET_PAREN_R, DefaultLanguageHighlighterColors.PARENTHESES);

        keys.put(SourcePawnTypes.SYNTAX_COMMA, DefaultLanguageHighlighterColors.COMMA);
        keys.put(SourcePawnTypes.SYNTAX_SEMICOLON, DefaultLanguageHighlighterColors.SEMICOLON);

        keys.put(SourcePawnTypes.OPERATOR_LIST, DefaultLanguageHighlighterColors.OPERATION_SIGN); // todo: i dont think this type OPERATOR_LIST works, need individual added? manually add all? reflection?
        keys.put(SourcePawnTypes.KEYWORD_LIST, DefaultLanguageHighlighterColors.KEYWORD);
        keys.put(SourcePawnTypes.OTHER_LIST, DefaultLanguageHighlighterColors.KEYWORD);
        keys.put(SourcePawnTypes.DIRECTIVE_LIST, DefaultLanguageHighlighterColors.METADATA);
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
        return pack(keys.get(tokenType), EMPTY_KEYS);
    }
}
