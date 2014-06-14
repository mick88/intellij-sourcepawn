package com.sourcepawn;

import com.intellij.lang.ASTNode;
import com.intellij.lang.Language;
import com.intellij.lang.ParserDefinition;
import com.intellij.lang.PsiParser;
import com.intellij.lexer.FlexAdapter;
import com.intellij.lexer.Lexer;
import com.intellij.openapi.project.Project;
import com.intellij.psi.FileViewProvider;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import com.intellij.psi.TokenType;
import com.intellij.psi.tree.IFileElementType;
import com.intellij.psi.tree.TokenSet;
import com.sourcepawn.grammar.SourcePawnLexer;
import com.sourcepawn.parser.SourcePawnParser;
import com.sourcepawn.psi.SourcePawnFile;
import com.sourcepawn.psi.SourcePawnTypes;
import org.jetbrains.annotations.NotNull;

import java.io.Reader;

/**
 * Created by isaac on 14/06/2014.
 */
public class SourcePawnParserDefinition implements ParserDefinition {

    public static final TokenSet WHITE_SPACES = TokenSet.create(TokenType.WHITE_SPACE);
    public static final TokenSet COMMENTS = TokenSet.create(SourcePawnTypes.BLOCK_COMMENT, SourcePawnTypes.LINE_COMMENT);
    public static final TokenSet STRINGS = TokenSet.create(SourcePawnTypes.CONSTANT_STRING);

    public static final IFileElementType FILE = new IFileElementType(Language.findInstance(SourcePawnLanguage.class));

    @NotNull
    @Override
    public Lexer createLexer(Project project) {
        return new SourcePawnLexer();
    }

    @Override
    public PsiParser createParser(Project project) {
        return new SourcePawnParser();
    }

    @Override
    public IFileElementType getFileNodeType() {
        return FILE;
    }

    @NotNull
    @Override
    public TokenSet getWhitespaceTokens() {
        return WHITE_SPACES;
    }

    @NotNull
    @Override
    public TokenSet getCommentTokens() {
        return COMMENTS;
    }

    @NotNull
    @Override
    public TokenSet getStringLiteralElements() {
        return STRINGS;
    }

    @NotNull
    @Override
    public PsiElement createElement(ASTNode node) {
        return SourcePawnTypes.Factory.createElement(node);
    }

    @Override
    public PsiFile createFile(FileViewProvider viewProvider) {
        return new SourcePawnFile(viewProvider);
    }

    @Override
    public SpaceRequirements spaceExistanceTypeBetweenTokens(ASTNode left, ASTNode right) {
        return SpaceRequirements.MAY;
    }
}
