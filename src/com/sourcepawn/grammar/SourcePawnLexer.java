package com.sourcepawn.grammar;

import com.intellij.lexer.FlexAdapter;

/**
 * Created by isaac on 14/06/2014.
 */
public class SourcePawnLexer extends FlexAdapter {
    public SourcePawnLexer() {
        super(new _SourcePawnLexer());
    }
}
