package com.sourcepawn.grammar;
import com.intellij.lexer.*;
import com.intellij.psi.tree.IElementType;
import static com.sourcepawn.psi.SourcePawnTypes.*;

%%

%{
  public _SourcePawnLexer() {
    this((java.io.Reader)null);
  }
%}

%public
%class _SourcePawnLexer
%implements FlexLexer
%function advance
%type IElementType
%unicode

EOL="\r"|"\n"|"\r\n"
LINE_WS=[\ \t\f]
WHITE_SPACE=({LINE_WS}|{EOL})+

DIR_PRAGMA_DEPRECATED=deprecated .*
CONSTANT_HEX=0x[a-fA-F\d]+
CONSTANT_FLOAT=-?[0-9]+\.[0-9]+
CONSTANT_INTEGER=-?[0-9]+
CONSTANT_BOOLEAN=(true|false)
CONSTANT_STRING=\"([^\"\\]|\\.)*\"
CONSTANT_CHARACTER='(\\?.|\\[0-9]{3}|\\x[:letter:]{3})'
ID=[a-zA-Z_0-9]+
LINE_COMMENT="//".*
BLOCK_COMMENT="/"\*(.|[\r\n])+?\*"/"
PATH=<.+>

%%
<YYINITIAL> {
  {WHITE_SPACE}                { return com.intellij.psi.TokenType.WHITE_SPACE; }

  "="                          { return OP_EQ; }
  "+="                         { return OP_INC_EQ; }
  "-="                         { return OP_DEC_EQ; }
  "*="                         { return OP_MUL_EQ; }
  "/="                         { return OP_DIV_EQ; }
  "%="                         { return OP_REM_EQ; }
  ">>="                        { return OP_BITSHIFTR_EQ; }
  ">>>="                       { return OP_BITUSHIFTR_EQ; }
  "<<="                        { return OP_BITSHIFTL_EQ; }
  "&="                         { return OP_BITAND_EQ; }
  "|="                         { return OP_BITOR_EQ; }
  "^="                         { return OP_BITXOR_EQ; }
  "=="                         { return OP_EQ_EQ; }
  "!="                         { return OP_NOT_EQ; }
  "<"                          { return OP_LT; }
  "<="                         { return OP_LT_EQ; }
  ">"                          { return OP_GT; }
  ">="                         { return OP_GT_EQ; }
  "+"                          { return OP_ADD; }
  "-"                          { return OP_SUB; }
  "*"                          { return OP_MUL; }
  "/"                          { return OP_DIV; }
  "%"                          { return OP_REM; }
  "++"                         { return OP_INC; }
  "--"                         { return OP_DEC; }
  "||"                         { return OP_OR; }
  "&&"                         { return OP_AND; }
  "!"                          { return OP_NOT; }
  "|"                          { return OP_BITOR; }
  "^"                          { return OP_BITXOR; }
  "~"                          { return OP_BITNOT; }
  "&"                          { return OP_BITAND; }
  ">>"                         { return OP_BITSHIFTR; }
  ">>>"                        { return OP_BITUSHIFTR; }
  "<<"                         { return OP_BITSHIFTL; }
  "defined"                    { return OP_DEFINED; }
  "sizeof"                     { return OP_SIZEOF; }
  "state"                      { return KEY_STATE; }
  "tagof"                      { return OP_TAGOF; }
  "["                          { return BRACKET_SQUARE_L; }
  "]"                          { return BRACKET_SQUARE_R; }
  "{"                          { return BRACKET_CURLY_L; }
  "}"                          { return BRACKET_CURLY_R; }
  "("                          { return BRACKET_PAREN_L; }
  ")"                          { return BRACKET_PAREN_R; }
  "..."                        { return SYNTAX_ELLIPSIS; }
  "."                          { return SYNTAX_DOT; }
  ":"                          { return SYNTAX_COLON; }
  ";"                          { return SYNTAX_SEMICOLON; }
  "?"                          { return SYNTAX_QUESTION; }
  ","                          { return SYNTAX_COMMA; }
  "assert"                     { return KEY_ASSERT; }
  "break"                      { return KEY_BREAK; }
  "case"                       { return KEY_CASE; }
  "continue"                   { return KEY_CONTINUE; }
  "default"                    { return KEY_DEFAULT; }
  "do"                         { return KEY_DO; }
  "else"                       { return KEY_ELSE; }
  "exit"                       { return KEY_EXIT; }
  "for"                        { return KEY_FOR; }
  "goto"                       { return KEY_GOTO; }
  "if"                         { return KEY_IF; }
  "return"                     { return KEY_RETURN; }
  "sleep"                      { return KEY_SLEEP; }
  "switch"                     { return KEY_SWITCH; }
  "while"                      { return KEY_WHILE; }
  "#assert"                    { return DIR_ASSERT; }
  "#define"                    { return DIR_DEFINE; }
  "#else"                      { return DIR_ELSE; }
  "#elseif"                    { return DIR_ELSEIF; }
  "#endif"                     { return DIR_ENDIF; }
  "#endinput"                  { return DIR_ENDINPUT; }
  "#error"                     { return DIR_ERROR; }
  "#file"                      { return DIR_FILE; }
  "#if"                        { return DIR_IF; }
  "#include"                   { return DIR_INCLUDE; }
  "#line"                      { return DIR_LINE; }
  "#pragma"                    { return DIR_PRAGMA; }
  "#section"                   { return DIR_SECTION; }
  "#tryinclude"                { return DIR_TRYINC; }
  "#undef"                     { return DIR_UNDEF; }
  "functag"                    { return OTHER_FUNCTAG; }
  "funcenum"                   { return OTHER_FUNCENUM; }
  "forward"                    { return OTHER_FORWARD; }
  "native"                     { return OTHER_NATIVE; }
  "public"                     { return OTHER_PUBLIC; }
  "stock"                      { return OTHER_STOCK; }
  "const"                      { return OTHER_CONST; }
  "static"                     { return OTHER_STATIC; }
  "new"                        { return OTHER_NEW; }
  "decl"                       { return OTHER_DECL; }
  "enum"                       { return OTHER_ENUM; }
  "struct"                     { return OTHER_STRUCT; }
  "WHITE_SPACE"                { return WHITE_SPACE; }
  "OP_STATE"                   { return OP_STATE; }

  {DIR_PRAGMA_DEPRECATED}      { return DIR_PRAGMA_DEPRECATED; }
  {CONSTANT_HEX}               { return CONSTANT_HEX; }
  {CONSTANT_FLOAT}             { return CONSTANT_FLOAT; }
  {CONSTANT_INTEGER}           { return CONSTANT_INTEGER; }
  {CONSTANT_BOOLEAN}           { return CONSTANT_BOOLEAN; }
  {CONSTANT_STRING}            { return CONSTANT_STRING; }
  {CONSTANT_CHARACTER}         { return CONSTANT_CHARACTER; }
  {ID}                         { return ID; }
  {LINE_COMMENT}               { return LINE_COMMENT; }
  {BLOCK_COMMENT}              { return BLOCK_COMMENT; }
  {PATH}                       { return PATH; }

  [^] { return com.intellij.psi.TokenType.BAD_CHARACTER; }
}
