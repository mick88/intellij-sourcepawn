// This is a generated file. Not intended for manual editing.
package com.sourcepawn.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import com.sourcepawn.psi.impl.*;

public interface SourcePawnTypes {

  IElementType ADDITIVE_EXPRESSION = new SourcePawnElementType("ADDITIVE_EXPRESSION");
  IElementType ARITHMETIC_ADDITIVE_OPERATOR = new SourcePawnElementType("ARITHMETIC_ADDITIVE_OPERATOR");
  IElementType ARITHMETIC_MULTIPLICATIVE_OPERATOR = new SourcePawnElementType("ARITHMETIC_MULTIPLICATIVE_OPERATOR");
  IElementType ARRAY_EXPRESSION = new SourcePawnElementType("ARRAY_EXPRESSION");
  IElementType ASSIGNMENT_OPERATOR = new SourcePawnElementType("ASSIGNMENT_OPERATOR");
  IElementType ASSIGN_EXPRESSION = new SourcePawnElementType("ASSIGN_EXPRESSION");
  IElementType BITWISE_AND_EXPRESSION = new SourcePawnElementType("BITWISE_AND_EXPRESSION");
  IElementType BITWISE_OPERATOR = new SourcePawnElementType("BITWISE_OPERATOR");
  IElementType BITWISE_OR_EXPRESSION = new SourcePawnElementType("BITWISE_OR_EXPRESSION");
  IElementType BITWISE_SHIFT_EXPRESSION = new SourcePawnElementType("BITWISE_SHIFT_EXPRESSION");
  IElementType BITWISE_SHIFT_OPERATOR = new SourcePawnElementType("BITWISE_SHIFT_OPERATOR");
  IElementType BITWISE_XOR_EXPRESSION = new SourcePawnElementType("BITWISE_XOR_EXPRESSION");
  IElementType BRACKET_LIST = new SourcePawnElementType("BRACKET_LIST");
  IElementType BREAK_STATEMENT = new SourcePawnElementType("BREAK_STATEMENT");
  IElementType CALL_EXPRESSION = new SourcePawnElementType("CALL_EXPRESSION");
  IElementType COMMA_LIST = new SourcePawnElementType("COMMA_LIST");
  IElementType CONSTANT_LIST = new SourcePawnElementType("CONSTANT_LIST");
  IElementType CONTINUE_STATEMENT = new SourcePawnElementType("CONTINUE_STATEMENT");
  IElementType DEFINE_DIRECTIVE = new SourcePawnElementType("DEFINE_DIRECTIVE");
  IElementType DIRECTIVE_DECLARATION = new SourcePawnElementType("DIRECTIVE_DECLARATION");
  IElementType DIRECTIVE_LIST = new SourcePawnElementType("DIRECTIVE_LIST");
  IElementType DO_WHILE_STATEMENT = new SourcePawnElementType("DO_WHILE_STATEMENT");
  IElementType ELSEIF_DIRECTIVE = new SourcePawnElementType("ELSEIF_DIRECTIVE");
  IElementType ELSE_DIRECTIVE = new SourcePawnElementType("ELSE_DIRECTIVE");
  IElementType ELSE_STATEMENT = new SourcePawnElementType("ELSE_STATEMENT");
  IElementType ENDIF_DIRECTIVE = new SourcePawnElementType("ENDIF_DIRECTIVE");
  IElementType END_INPUT_DIRECTIVE = new SourcePawnElementType("END_INPUT_DIRECTIVE");
  IElementType ENUM_DECLARATION = new SourcePawnElementType("ENUM_DECLARATION");
  IElementType ENUM_LIST = new SourcePawnElementType("ENUM_LIST");
  IElementType EQUALITY_EXPRESSION = new SourcePawnElementType("EQUALITY_EXPRESSION");
  IElementType EQUALITY_OPERATOR = new SourcePawnElementType("EQUALITY_OPERATOR");
  IElementType EXPRESSION = new SourcePawnElementType("EXPRESSION");
  IElementType EXPRESSION_LIST = new SourcePawnElementType("EXPRESSION_LIST");
  IElementType FOR_INIT_LIST = new SourcePawnElementType("FOR_INIT_LIST");
  IElementType FOR_STATEMENT = new SourcePawnElementType("FOR_STATEMENT");
  IElementType FUNCENUM_BLOCK = new SourcePawnElementType("FUNCENUM_BLOCK");
  IElementType FUNCENUM_BLOCK_DECLARATION = new SourcePawnElementType("FUNCENUM_BLOCK_DECLARATION");
  IElementType FUNCENUM_DECLARATION = new SourcePawnElementType("FUNCENUM_DECLARATION");
  IElementType FUNCTION_BLOCK = new SourcePawnElementType("FUNCTION_BLOCK");
  IElementType FUNCTION_DECLARATION = new SourcePawnElementType("FUNCTION_DECLARATION");
  IElementType FUNCTION_PARAMETER = new SourcePawnElementType("FUNCTION_PARAMETER");
  IElementType FUNCTION_PARAMETER_LIST = new SourcePawnElementType("FUNCTION_PARAMETER_LIST");
  IElementType GLOBAL_VAR_DECLARATION = new SourcePawnElementType("GLOBAL_VAR_DECLARATION");
  IElementType GLOBAL_VAR_MODIFIER = new SourcePawnElementType("GLOBAL_VAR_MODIFIER");
  IElementType IDENTIFIER = new SourcePawnElementType("IDENTIFIER");
  IElementType IF_DIRECTIVE = new SourcePawnElementType("IF_DIRECTIVE");
  IElementType IF_STATEMENT = new SourcePawnElementType("IF_STATEMENT");
  IElementType INCLUDE_DIRECTIVE = new SourcePawnElementType("INCLUDE_DIRECTIVE");
  IElementType KEYWORD_LIST = new SourcePawnElementType("KEYWORD_LIST");
  IElementType LITERAL_EXPRESSION = new SourcePawnElementType("LITERAL_EXPRESSION");
  IElementType LOCAL_VAR_MODIFIER = new SourcePawnElementType("LOCAL_VAR_MODIFIER");
  IElementType LOCAL_VAR_STATEMENT = new SourcePawnElementType("LOCAL_VAR_STATEMENT");
  IElementType LOGICAL_OPERATOR = new SourcePawnElementType("LOGICAL_OPERATOR");
  IElementType LOGIC_AND_EXPRESSION = new SourcePawnElementType("LOGIC_AND_EXPRESSION");
  IElementType LOGIC_OR_EXPRESSION = new SourcePawnElementType("LOGIC_OR_EXPRESSION");
  IElementType MISC_OPERATOR = new SourcePawnElementType("MISC_OPERATOR");
  IElementType MISC_PREFIX_EXPRESSION = new SourcePawnElementType("MISC_PREFIX_EXPRESSION");
  IElementType MULTIPLICATIVE_EXPRESSION = new SourcePawnElementType("MULTIPLICATIVE_EXPRESSION");
  IElementType OPERATOR_LIST = new SourcePawnElementType("OPERATOR_LIST");
  IElementType OPTIONAL_COMMA_LIST = new SourcePawnElementType("OPTIONAL_COMMA_LIST");
  IElementType OTHER_LIST = new SourcePawnElementType("OTHER_LIST");
  IElementType PARENTHESIZED_EXPRESSION = new SourcePawnElementType("PARENTHESIZED_EXPRESSION");
  IElementType PRAGMA_DIRECTIVE = new SourcePawnElementType("PRAGMA_DIRECTIVE");
  IElementType PREFIX_EXPRESSION_OPERATOR = new SourcePawnElementType("PREFIX_EXPRESSION_OPERATOR");
  IElementType QUALIFIED_IDENTIFIER = new SourcePawnElementType("QUALIFIED_IDENTIFIER");
  IElementType RELATIONAL_EXPRESSION = new SourcePawnElementType("RELATIONAL_EXPRESSION");
  IElementType RELATIONAL_OPERATOR = new SourcePawnElementType("RELATIONAL_OPERATOR");
  IElementType RETURN_STATEMENT = new SourcePawnElementType("RETURN_STATEMENT");
  IElementType STATEMENT = new SourcePawnElementType("STATEMENT");
  IElementType STRUCT_DECLARATION = new SourcePawnElementType("STRUCT_DECLARATION");
  IElementType STRUCT_LIST = new SourcePawnElementType("STRUCT_LIST");
  IElementType SUFFIX_EXPRESSION_OPERATOR = new SourcePawnElementType("SUFFIX_EXPRESSION_OPERATOR");
  IElementType SWITCH_BLOCK = new SourcePawnElementType("SWITCH_BLOCK");
  IElementType SWITCH_CASE = new SourcePawnElementType("SWITCH_CASE");
  IElementType SWITCH_STATEMENT = new SourcePawnElementType("SWITCH_STATEMENT");
  IElementType SYNTAX_LIST = new SourcePawnElementType("SYNTAX_LIST");
  IElementType TAG = new SourcePawnElementType("TAG");
  IElementType TERNARY_EXPRESSION = new SourcePawnElementType("TERNARY_EXPRESSION");
  IElementType UNDEFINE_DIRECTIVE = new SourcePawnElementType("UNDEFINE_DIRECTIVE");
  IElementType VAR_BLOCK = new SourcePawnElementType("VAR_BLOCK");
  IElementType VAR_BLOCK_STATEMENT = new SourcePawnElementType("VAR_BLOCK_STATEMENT");
  IElementType VAR_DECLARATION_PART = new SourcePawnElementType("VAR_DECLARATION_PART");
  IElementType VAR_INIT = new SourcePawnElementType("VAR_INIT");
  IElementType WHILE_STATEMENT = new SourcePawnElementType("WHILE_STATEMENT");

  IElementType BLOCK_COMMENT = new SourcePawnTokenType("BLOCK_COMMENT");
  IElementType BRACKET_CURLY_L = new SourcePawnTokenType("{");
  IElementType BRACKET_CURLY_R = new SourcePawnTokenType("}");
  IElementType BRACKET_PAREN_L = new SourcePawnTokenType("(");
  IElementType BRACKET_PAREN_R = new SourcePawnTokenType(")");
  IElementType BRACKET_SQUARE_L = new SourcePawnTokenType("[");
  IElementType BRACKET_SQUARE_R = new SourcePawnTokenType("]");
  IElementType CONSTANT_BOOLEAN = new SourcePawnTokenType("CONSTANT_BOOLEAN");
  IElementType CONSTANT_CHARACTER = new SourcePawnTokenType("CONSTANT_CHARACTER");
  IElementType CONSTANT_FLOAT = new SourcePawnTokenType("CONSTANT_FLOAT");
  IElementType CONSTANT_HEX = new SourcePawnTokenType("CONSTANT_HEX");
  IElementType CONSTANT_INTEGER = new SourcePawnTokenType("CONSTANT_INTEGER");
  IElementType CONSTANT_STRING = new SourcePawnTokenType("CONSTANT_STRING");
  IElementType DIR_ASSERT = new SourcePawnTokenType("#assert");
  IElementType DIR_DEFINE = new SourcePawnTokenType("#define");
  IElementType DIR_ELSE = new SourcePawnTokenType("#else");
  IElementType DIR_ELSEIF = new SourcePawnTokenType("#elseif");
  IElementType DIR_ENDIF = new SourcePawnTokenType("#endif");
  IElementType DIR_ENDINPUT = new SourcePawnTokenType("#endinput");
  IElementType DIR_ERROR = new SourcePawnTokenType("#error");
  IElementType DIR_FILE = new SourcePawnTokenType("#file");
  IElementType DIR_IF = new SourcePawnTokenType("#if");
  IElementType DIR_INCLUDE = new SourcePawnTokenType("#include");
  IElementType DIR_LINE = new SourcePawnTokenType("#line");
  IElementType DIR_PRAGMA = new SourcePawnTokenType("#pragma");
  IElementType DIR_PRAGMA_DEPRECATED = new SourcePawnTokenType("DIR_PRAGMA_DEPRECATED");
  IElementType DIR_SECTION = new SourcePawnTokenType("#section");
  IElementType DIR_TRYINC = new SourcePawnTokenType("#tryinclude");
  IElementType DIR_UNDEF = new SourcePawnTokenType("#undef");
  IElementType ID = new SourcePawnTokenType("ID");
  IElementType KEY_ASSERT = new SourcePawnTokenType("assert");
  IElementType KEY_BREAK = new SourcePawnTokenType("break");
  IElementType KEY_CASE = new SourcePawnTokenType("case");
  IElementType KEY_CONTINUE = new SourcePawnTokenType("continue");
  IElementType KEY_DEFAULT = new SourcePawnTokenType("default");
  IElementType KEY_DO = new SourcePawnTokenType("do");
  IElementType KEY_ELSE = new SourcePawnTokenType("else");
  IElementType KEY_EXIT = new SourcePawnTokenType("exit");
  IElementType KEY_FOR = new SourcePawnTokenType("for");
  IElementType KEY_GOTO = new SourcePawnTokenType("goto");
  IElementType KEY_IF = new SourcePawnTokenType("if");
  IElementType KEY_RETURN = new SourcePawnTokenType("return");
  IElementType KEY_SLEEP = new SourcePawnTokenType("sleep");
  IElementType KEY_STATE = new SourcePawnTokenType("state");
  IElementType KEY_SWITCH = new SourcePawnTokenType("switch");
  IElementType KEY_WHILE = new SourcePawnTokenType("while");
  IElementType LINE_COMMENT = new SourcePawnTokenType("LINE_COMMENT");
  IElementType OP_ADD = new SourcePawnTokenType("+");
  IElementType OP_AND = new SourcePawnTokenType("&&");
  IElementType OP_BITAND = new SourcePawnTokenType("&");
  IElementType OP_BITAND_EQ = new SourcePawnTokenType("&=");
  IElementType OP_BITNOT = new SourcePawnTokenType("~");
  IElementType OP_BITOR = new SourcePawnTokenType("|");
  IElementType OP_BITOR_EQ = new SourcePawnTokenType("|=");
  IElementType OP_BITSHIFTL = new SourcePawnTokenType("<<");
  IElementType OP_BITSHIFTL_EQ = new SourcePawnTokenType("<<=");
  IElementType OP_BITSHIFTR = new SourcePawnTokenType(">>");
  IElementType OP_BITSHIFTR_EQ = new SourcePawnTokenType(">>=");
  IElementType OP_BITUSHIFTR = new SourcePawnTokenType(">>>");
  IElementType OP_BITUSHIFTR_EQ = new SourcePawnTokenType(">>>=");
  IElementType OP_BITXOR = new SourcePawnTokenType("^");
  IElementType OP_BITXOR_EQ = new SourcePawnTokenType("^=");
  IElementType OP_DEC = new SourcePawnTokenType("--");
  IElementType OP_DEC_EQ = new SourcePawnTokenType("-=");
  IElementType OP_DEFINED = new SourcePawnTokenType("defined");
  IElementType OP_DIV = new SourcePawnTokenType("/");
  IElementType OP_DIV_EQ = new SourcePawnTokenType("/=");
  IElementType OP_EQ = new SourcePawnTokenType("=");
  IElementType OP_EQ_EQ = new SourcePawnTokenType("==");
  IElementType OP_GT = new SourcePawnTokenType(">");
  IElementType OP_GT_EQ = new SourcePawnTokenType(">=");
  IElementType OP_INC = new SourcePawnTokenType("++");
  IElementType OP_INC_EQ = new SourcePawnTokenType("+=");
  IElementType OP_LT = new SourcePawnTokenType("<");
  IElementType OP_LT_EQ = new SourcePawnTokenType("<=");
  IElementType OP_MUL = new SourcePawnTokenType("*");
  IElementType OP_MUL_EQ = new SourcePawnTokenType("*=");
  IElementType OP_NOT = new SourcePawnTokenType("!");
  IElementType OP_NOT_EQ = new SourcePawnTokenType("!=");
  IElementType OP_OR = new SourcePawnTokenType("||");
  IElementType OP_REM = new SourcePawnTokenType("%");
  IElementType OP_REM_EQ = new SourcePawnTokenType("%=");
  IElementType OP_SIZEOF = new SourcePawnTokenType("sizeof");
  IElementType OP_STATE = new SourcePawnTokenType("OP_STATE");
  IElementType OP_SUB = new SourcePawnTokenType("-");
  IElementType OP_TAGOF = new SourcePawnTokenType("tagof");
  IElementType OTHER_CONST = new SourcePawnTokenType("const");
  IElementType OTHER_DECL = new SourcePawnTokenType("decl");
  IElementType OTHER_ENUM = new SourcePawnTokenType("enum");
  IElementType OTHER_FORWARD = new SourcePawnTokenType("forward");
  IElementType OTHER_FUNCENUM = new SourcePawnTokenType("funcenum");
  IElementType OTHER_FUNCTAG = new SourcePawnTokenType("functag");
  IElementType OTHER_NATIVE = new SourcePawnTokenType("native");
  IElementType OTHER_NEW = new SourcePawnTokenType("new");
  IElementType OTHER_PUBLIC = new SourcePawnTokenType("public");
  IElementType OTHER_STATIC = new SourcePawnTokenType("static");
  IElementType OTHER_STOCK = new SourcePawnTokenType("stock");
  IElementType OTHER_STRUCT = new SourcePawnTokenType("struct");
  IElementType PATH = new SourcePawnTokenType("PATH");
  IElementType SYNTAX_COLON = new SourcePawnTokenType(":");
  IElementType SYNTAX_COMMA = new SourcePawnTokenType(",");
  IElementType SYNTAX_DOT = new SourcePawnTokenType(".");
  IElementType SYNTAX_ELLIPSIS = new SourcePawnTokenType("...");
  IElementType SYNTAX_QUESTION = new SourcePawnTokenType("?");
  IElementType SYNTAX_SEMICOLON = new SourcePawnTokenType(";");
  IElementType WHITE_SPACE = new SourcePawnTokenType("WHITE_SPACE");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
       if (type == ADDITIVE_EXPRESSION) {
        return new SourcePawnAdditiveExpressionImpl(node);
      }
      else if (type == ARITHMETIC_ADDITIVE_OPERATOR) {
        return new SourcePawnArithmeticAdditiveOperatorImpl(node);
      }
      else if (type == ARITHMETIC_MULTIPLICATIVE_OPERATOR) {
        return new SourcePawnArithmeticMultiplicativeOperatorImpl(node);
      }
      else if (type == ARRAY_EXPRESSION) {
        return new SourcePawnArrayExpressionImpl(node);
      }
      else if (type == ASSIGNMENT_OPERATOR) {
        return new SourcePawnAssignmentOperatorImpl(node);
      }
      else if (type == ASSIGN_EXPRESSION) {
        return new SourcePawnAssignExpressionImpl(node);
      }
      else if (type == BITWISE_AND_EXPRESSION) {
        return new SourcePawnBitwiseAndExpressionImpl(node);
      }
      else if (type == BITWISE_OPERATOR) {
        return new SourcePawnBitwiseOperatorImpl(node);
      }
      else if (type == BITWISE_OR_EXPRESSION) {
        return new SourcePawnBitwiseOrExpressionImpl(node);
      }
      else if (type == BITWISE_SHIFT_EXPRESSION) {
        return new SourcePawnBitwiseShiftExpressionImpl(node);
      }
      else if (type == BITWISE_SHIFT_OPERATOR) {
        return new SourcePawnBitwiseShiftOperatorImpl(node);
      }
      else if (type == BITWISE_XOR_EXPRESSION) {
        return new SourcePawnBitwiseXorExpressionImpl(node);
      }
      else if (type == BRACKET_LIST) {
        return new SourcePawnBracketListImpl(node);
      }
      else if (type == BREAK_STATEMENT) {
        return new SourcePawnBreakStatementImpl(node);
      }
      else if (type == CALL_EXPRESSION) {
        return new SourcePawnCallExpressionImpl(node);
      }
      else if (type == COMMA_LIST) {
        return new SourcePawnCommaListImpl(node);
      }
      else if (type == CONSTANT_LIST) {
        return new SourcePawnConstantListImpl(node);
      }
      else if (type == CONTINUE_STATEMENT) {
        return new SourcePawnContinueStatementImpl(node);
      }
      else if (type == DEFINE_DIRECTIVE) {
        return new SourcePawnDefineDirectiveImpl(node);
      }
      else if (type == DIRECTIVE_DECLARATION) {
        return new SourcePawnDirectiveDeclarationImpl(node);
      }
      else if (type == DIRECTIVE_LIST) {
        return new SourcePawnDirectiveListImpl(node);
      }
      else if (type == DO_WHILE_STATEMENT) {
        return new SourcePawnDoWhileStatementImpl(node);
      }
      else if (type == ELSEIF_DIRECTIVE) {
        return new SourcePawnElseifDirectiveImpl(node);
      }
      else if (type == ELSE_DIRECTIVE) {
        return new SourcePawnElseDirectiveImpl(node);
      }
      else if (type == ELSE_STATEMENT) {
        return new SourcePawnElseStatementImpl(node);
      }
      else if (type == ENDIF_DIRECTIVE) {
        return new SourcePawnEndifDirectiveImpl(node);
      }
      else if (type == END_INPUT_DIRECTIVE) {
        return new SourcePawnEndInputDirectiveImpl(node);
      }
      else if (type == ENUM_DECLARATION) {
        return new SourcePawnEnumDeclarationImpl(node);
      }
      else if (type == ENUM_LIST) {
        return new SourcePawnEnumListImpl(node);
      }
      else if (type == EQUALITY_EXPRESSION) {
        return new SourcePawnEqualityExpressionImpl(node);
      }
      else if (type == EQUALITY_OPERATOR) {
        return new SourcePawnEqualityOperatorImpl(node);
      }
      else if (type == EXPRESSION) {
        return new SourcePawnExpressionImpl(node);
      }
      else if (type == EXPRESSION_LIST) {
        return new SourcePawnExpressionListImpl(node);
      }
      else if (type == FOR_INIT_LIST) {
        return new SourcePawnForInitListImpl(node);
      }
      else if (type == FOR_STATEMENT) {
        return new SourcePawnForStatementImpl(node);
      }
      else if (type == FUNCENUM_BLOCK) {
        return new SourcePawnFuncenumBlockImpl(node);
      }
      else if (type == FUNCENUM_BLOCK_DECLARATION) {
        return new SourcePawnFuncenumBlockDeclarationImpl(node);
      }
      else if (type == FUNCENUM_DECLARATION) {
        return new SourcePawnFuncenumDeclarationImpl(node);
      }
      else if (type == FUNCTION_BLOCK) {
        return new SourcePawnFunctionBlockImpl(node);
      }
      else if (type == FUNCTION_DECLARATION) {
        return new SourcePawnFunctionDeclarationImpl(node);
      }
      else if (type == FUNCTION_PARAMETER) {
        return new SourcePawnFunctionParameterImpl(node);
      }
      else if (type == FUNCTION_PARAMETER_LIST) {
        return new SourcePawnFunctionParameterListImpl(node);
      }
      else if (type == GLOBAL_VAR_DECLARATION) {
        return new SourcePawnGlobalVarDeclarationImpl(node);
      }
      else if (type == GLOBAL_VAR_MODIFIER) {
        return new SourcePawnGlobalVarModifierImpl(node);
      }
      else if (type == IDENTIFIER) {
        return new SourcePawnIdentifierImpl(node);
      }
      else if (type == IF_DIRECTIVE) {
        return new SourcePawnIfDirectiveImpl(node);
      }
      else if (type == IF_STATEMENT) {
        return new SourcePawnIfStatementImpl(node);
      }
      else if (type == INCLUDE_DIRECTIVE) {
        return new SourcePawnIncludeDirectiveImpl(node);
      }
      else if (type == KEYWORD_LIST) {
        return new SourcePawnKeywordListImpl(node);
      }
      else if (type == LITERAL_EXPRESSION) {
        return new SourcePawnLiteralExpressionImpl(node);
      }
      else if (type == LOCAL_VAR_MODIFIER) {
        return new SourcePawnLocalVarModifierImpl(node);
      }
      else if (type == LOCAL_VAR_STATEMENT) {
        return new SourcePawnLocalVarStatementImpl(node);
      }
      else if (type == LOGICAL_OPERATOR) {
        return new SourcePawnLogicalOperatorImpl(node);
      }
      else if (type == LOGIC_AND_EXPRESSION) {
        return new SourcePawnLogicAndExpressionImpl(node);
      }
      else if (type == LOGIC_OR_EXPRESSION) {
        return new SourcePawnLogicOrExpressionImpl(node);
      }
      else if (type == MISC_OPERATOR) {
        return new SourcePawnMiscOperatorImpl(node);
      }
      else if (type == MISC_PREFIX_EXPRESSION) {
        return new SourcePawnMiscPrefixExpressionImpl(node);
      }
      else if (type == MULTIPLICATIVE_EXPRESSION) {
        return new SourcePawnMultiplicativeExpressionImpl(node);
      }
      else if (type == OPERATOR_LIST) {
        return new SourcePawnOperatorListImpl(node);
      }
      else if (type == OPTIONAL_COMMA_LIST) {
        return new SourcePawnOptionalCommaListImpl(node);
      }
      else if (type == OTHER_LIST) {
        return new SourcePawnOtherListImpl(node);
      }
      else if (type == PARENTHESIZED_EXPRESSION) {
        return new SourcePawnParenthesizedExpressionImpl(node);
      }
      else if (type == PRAGMA_DIRECTIVE) {
        return new SourcePawnPragmaDirectiveImpl(node);
      }
      else if (type == PREFIX_EXPRESSION_OPERATOR) {
        return new SourcePawnPrefixExpressionOperatorImpl(node);
      }
      else if (type == QUALIFIED_IDENTIFIER) {
        return new SourcePawnQualifiedIdentifierImpl(node);
      }
      else if (type == RELATIONAL_EXPRESSION) {
        return new SourcePawnRelationalExpressionImpl(node);
      }
      else if (type == RELATIONAL_OPERATOR) {
        return new SourcePawnRelationalOperatorImpl(node);
      }
      else if (type == RETURN_STATEMENT) {
        return new SourcePawnReturnStatementImpl(node);
      }
      else if (type == STATEMENT) {
        return new SourcePawnStatementImpl(node);
      }
      else if (type == STRUCT_DECLARATION) {
        return new SourcePawnStructDeclarationImpl(node);
      }
      else if (type == STRUCT_LIST) {
        return new SourcePawnStructListImpl(node);
      }
      else if (type == SUFFIX_EXPRESSION_OPERATOR) {
        return new SourcePawnSuffixExpressionOperatorImpl(node);
      }
      else if (type == SWITCH_BLOCK) {
        return new SourcePawnSwitchBlockImpl(node);
      }
      else if (type == SWITCH_CASE) {
        return new SourcePawnSwitchCaseImpl(node);
      }
      else if (type == SWITCH_STATEMENT) {
        return new SourcePawnSwitchStatementImpl(node);
      }
      else if (type == SYNTAX_LIST) {
        return new SourcePawnSyntaxListImpl(node);
      }
      else if (type == TAG) {
        return new SourcePawnTagImpl(node);
      }
      else if (type == TERNARY_EXPRESSION) {
        return new SourcePawnTernaryExpressionImpl(node);
      }
      else if (type == UNDEFINE_DIRECTIVE) {
        return new SourcePawnUndefineDirectiveImpl(node);
      }
      else if (type == VAR_BLOCK) {
        return new SourcePawnVarBlockImpl(node);
      }
      else if (type == VAR_BLOCK_STATEMENT) {
        return new SourcePawnVarBlockStatementImpl(node);
      }
      else if (type == VAR_DECLARATION_PART) {
        return new SourcePawnVarDeclarationPartImpl(node);
      }
      else if (type == VAR_INIT) {
        return new SourcePawnVarInitImpl(node);
      }
      else if (type == WHILE_STATEMENT) {
        return new SourcePawnWhileStatementImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
