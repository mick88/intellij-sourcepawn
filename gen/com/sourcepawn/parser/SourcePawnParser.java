// This is a generated file. Not intended for manual editing.
package com.sourcepawn.parser;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import com.intellij.openapi.diagnostic.Logger;
import static com.sourcepawn.psi.SourcePawnTypes.*;
import static com.intellij.lang.parser.GeneratedParserUtilBase.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class SourcePawnParser implements PsiParser {

  public static final Logger LOG_ = Logger.getInstance("com.sourcepawn.parser.SourcePawnParser");

  public ASTNode parse(IElementType root_, PsiBuilder builder_) {
    boolean result_;
    builder_ = adapt_builder_(root_, builder_, this, EXTENDS_SETS_);
    Marker marker_ = enter_section_(builder_, 0, _COLLAPSE_, null);
    if (root_ == ADDITIVE_EXPRESSION) {
      result_ = additiveExpression(builder_, 0);
    }
    else if (root_ == ARITHMETIC_ADDITIVE_OPERATOR) {
      result_ = arithmeticAdditiveOperator(builder_, 0);
    }
    else if (root_ == ARITHMETIC_MULTIPLICATIVE_OPERATOR) {
      result_ = arithmeticMultiplicativeOperator(builder_, 0);
    }
    else if (root_ == ARRAY_EXPRESSION) {
      result_ = arrayExpression(builder_, 0);
    }
    else if (root_ == ASSIGN_EXPRESSION) {
      result_ = assignExpression(builder_, 0);
    }
    else if (root_ == ASSIGNMENT_OPERATOR) {
      result_ = assignmentOperator(builder_, 0);
    }
    else if (root_ == BITWISE_AND_EXPRESSION) {
      result_ = bitwiseAndExpression(builder_, 0);
    }
    else if (root_ == BITWISE_OPERATOR) {
      result_ = bitwiseOperator(builder_, 0);
    }
    else if (root_ == BITWISE_OR_EXPRESSION) {
      result_ = bitwiseOrExpression(builder_, 0);
    }
    else if (root_ == BITWISE_SHIFT_EXPRESSION) {
      result_ = bitwiseShiftExpression(builder_, 0);
    }
    else if (root_ == BITWISE_SHIFT_OPERATOR) {
      result_ = bitwiseShiftOperator(builder_, 0);
    }
    else if (root_ == BITWISE_XOR_EXPRESSION) {
      result_ = bitwiseXorExpression(builder_, 0);
    }
    else if (root_ == BRACKET_LIST) {
      result_ = bracketList(builder_, 0);
    }
    else if (root_ == BREAK_STATEMENT) {
      result_ = breakStatement(builder_, 0);
    }
    else if (root_ == CALL_EXPRESSION) {
      result_ = callExpression(builder_, 0);
    }
    else if (root_ == CONSTANT_LIST) {
      result_ = constantList(builder_, 0);
    }
    else if (root_ == CONTINUE_STATEMENT) {
      result_ = continueStatement(builder_, 0);
    }
    else if (root_ == DEFINE_DIRECTIVE) {
      result_ = defineDirective(builder_, 0);
    }
    else if (root_ == DIRECTIVE_DECLARATION) {
      result_ = directiveDeclaration(builder_, 0);
    }
    else if (root_ == DIRECTIVE_LIST) {
      result_ = directiveList(builder_, 0);
    }
    else if (root_ == DO_WHILE_STATEMENT) {
      result_ = doWhileStatement(builder_, 0);
    }
    else if (root_ == ELSE_DIRECTIVE) {
      result_ = elseDirective(builder_, 0);
    }
    else if (root_ == ELSE_STATEMENT) {
      result_ = elseStatement(builder_, 0);
    }
    else if (root_ == ELSEIF_DIRECTIVE) {
      result_ = elseifDirective(builder_, 0);
    }
    else if (root_ == END_INPUT_DIRECTIVE) {
      result_ = endInputDirective(builder_, 0);
    }
    else if (root_ == ENDIF_DIRECTIVE) {
      result_ = endifDirective(builder_, 0);
    }
    else if (root_ == ENUM_DECLARATION) {
      result_ = enumDeclaration(builder_, 0);
    }
    else if (root_ == ENUM_LIST) {
      result_ = enumList(builder_, 0);
    }
    else if (root_ == EQUALITY_EXPRESSION) {
      result_ = equalityExpression(builder_, 0);
    }
    else if (root_ == EQUALITY_OPERATOR) {
      result_ = equalityOperator(builder_, 0);
    }
    else if (root_ == EXPRESSION) {
      result_ = expression(builder_, 0);
    }
    else if (root_ == EXPRESSION_LIST) {
      result_ = expressionList(builder_, 0);
    }
    else if (root_ == FOR_INIT_LIST) {
      result_ = forInitList(builder_, 0);
    }
    else if (root_ == FOR_STATEMENT) {
      result_ = forStatement(builder_, 0);
    }
    else if (root_ == FUNCENUM_BLOCK) {
      result_ = funcenumBlock(builder_, 0);
    }
    else if (root_ == FUNCENUM_BLOCK_DECLARATION) {
      result_ = funcenumBlockDeclaration(builder_, 0);
    }
    else if (root_ == FUNCENUM_DECLARATION) {
      result_ = funcenumDeclaration(builder_, 0);
    }
    else if (root_ == FUNCTION_BLOCK) {
      result_ = functionBlock(builder_, 0);
    }
    else if (root_ == FUNCTION_DECLARATION) {
      result_ = functionDeclaration(builder_, 0);
    }
    else if (root_ == FUNCTION_PARAMETER) {
      result_ = functionParameter(builder_, 0);
    }
    else if (root_ == FUNCTION_PARAMETER_LIST) {
      result_ = functionParameterList(builder_, 0);
    }
    else if (root_ == GLOBAL_VAR_DECLARATION) {
      result_ = globalVarDeclaration(builder_, 0);
    }
    else if (root_ == GLOBAL_VAR_MODIFIER) {
      result_ = globalVarModifier(builder_, 0);
    }
    else if (root_ == IDENTIFIER) {
      result_ = identifier(builder_, 0);
    }
    else if (root_ == IF_DIRECTIVE) {
      result_ = ifDirective(builder_, 0);
    }
    else if (root_ == IF_STATEMENT) {
      result_ = ifStatement(builder_, 0);
    }
    else if (root_ == INCLUDE_DIRECTIVE) {
      result_ = includeDirective(builder_, 0);
    }
    else if (root_ == KEYWORD_LIST) {
      result_ = keywordList(builder_, 0);
    }
    else if (root_ == LITERAL_EXPRESSION) {
      result_ = literalExpression(builder_, 0);
    }
    else if (root_ == LOCAL_VAR_MODIFIER) {
      result_ = localVarModifier(builder_, 0);
    }
    else if (root_ == LOCAL_VAR_STATEMENT) {
      result_ = localVarStatement(builder_, 0);
    }
    else if (root_ == LOGIC_AND_EXPRESSION) {
      result_ = logicAndExpression(builder_, 0);
    }
    else if (root_ == LOGIC_OR_EXPRESSION) {
      result_ = logicOrExpression(builder_, 0);
    }
    else if (root_ == LOGICAL_OPERATOR) {
      result_ = logicalOperator(builder_, 0);
    }
    else if (root_ == MISC_OPERATOR) {
      result_ = miscOperator(builder_, 0);
    }
    else if (root_ == MISC_PREFIX_EXPRESSION) {
      result_ = miscPrefixExpression(builder_, 0);
    }
    else if (root_ == MULTIPLICATIVE_EXPRESSION) {
      result_ = multiplicativeExpression(builder_, 0);
    }
    else if (root_ == OPERATOR_LIST) {
      result_ = operatorList(builder_, 0);
    }
    else if (root_ == OTHER_LIST) {
      result_ = otherList(builder_, 0);
    }
    else if (root_ == PARENTHESIZED_EXPRESSION) {
      result_ = parenthesizedExpression(builder_, 0);
    }
    else if (root_ == PRAGMA_DIRECTIVE) {
      result_ = pragmaDirective(builder_, 0);
    }
    else if (root_ == PREFIX_EXPRESSION_OPERATOR) {
      result_ = prefixExpressionOperator(builder_, 0);
    }
    else if (root_ == QUALIFIED_IDENTIFIER) {
      result_ = qualifiedIdentifier(builder_, 0);
    }
    else if (root_ == RELATIONAL_EXPRESSION) {
      result_ = relationalExpression(builder_, 0);
    }
    else if (root_ == RELATIONAL_OPERATOR) {
      result_ = relationalOperator(builder_, 0);
    }
    else if (root_ == RETURN_STATEMENT) {
      result_ = returnStatement(builder_, 0);
    }
    else if (root_ == STATEMENT) {
      result_ = statement(builder_, 0);
    }
    else if (root_ == STRUCT_DECLARATION) {
      result_ = structDeclaration(builder_, 0);
    }
    else if (root_ == STRUCT_LIST) {
      result_ = structList(builder_, 0);
    }
    else if (root_ == SUFFIX_EXPRESSION_OPERATOR) {
      result_ = suffixExpressionOperator(builder_, 0);
    }
    else if (root_ == SWITCH_BLOCK) {
      result_ = switchBlock(builder_, 0);
    }
    else if (root_ == SWITCH_CASE) {
      result_ = switchCase(builder_, 0);
    }
    else if (root_ == SWITCH_STATEMENT) {
      result_ = switchStatement(builder_, 0);
    }
    else if (root_ == SYNTAX_LIST) {
      result_ = syntaxList(builder_, 0);
    }
    else if (root_ == TAG) {
      result_ = tag(builder_, 0);
    }
    else if (root_ == TERNARY_EXPRESSION) {
      result_ = ternaryExpression(builder_, 0);
    }
    else if (root_ == UNDEFINE_DIRECTIVE) {
      result_ = undefineDirective(builder_, 0);
    }
    else if (root_ == VAR_BLOCK) {
      result_ = varBlock(builder_, 0);
    }
    else if (root_ == VAR_BLOCK_STATEMENT) {
      result_ = varBlockStatement(builder_, 0);
    }
    else if (root_ == VAR_DECLARATION_PART) {
      result_ = varDeclarationPart(builder_, 0);
    }
    else if (root_ == VAR_INIT) {
      result_ = varInit(builder_, 0);
    }
    else if (root_ == WHILE_STATEMENT) {
      result_ = whileStatement(builder_, 0);
    }
    else {
      result_ = parse_root_(root_, builder_, 0);
    }
    exit_section_(builder_, 0, marker_, root_, result_, true, TRUE_CONDITION);
    return builder_.getTreeBuilt();
  }

  protected boolean parse_root_(final IElementType root_, final PsiBuilder builder_, final int level_) {
    return sourcepawnFile(builder_, level_ + 1);
  }

  public static final TokenSet[] EXTENDS_SETS_ = new TokenSet[] {
    create_token_set_(ADDITIVE_EXPRESSION, ARRAY_EXPRESSION, ASSIGN_EXPRESSION, BITWISE_AND_EXPRESSION,
      BITWISE_OR_EXPRESSION, BITWISE_SHIFT_EXPRESSION, BITWISE_XOR_EXPRESSION, CALL_EXPRESSION,
      EQUALITY_EXPRESSION, EXPRESSION, LITERAL_EXPRESSION, LOGIC_AND_EXPRESSION,
      LOGIC_OR_EXPRESSION, MISC_PREFIX_EXPRESSION, MULTIPLICATIVE_EXPRESSION, PARENTHESIZED_EXPRESSION,
      RELATIONAL_EXPRESSION, TERNARY_EXPRESSION),
  };

  /* ********************************************************** */
  // arithmeticAdditiveOperator multiplicativeExpressionWrapper
  public static boolean additiveExpression(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "additiveExpression")) return false;
    if (!nextTokenIs(builder_, "<additive expression>", OP_ADD, OP_SUB)) return false;
    boolean result_ = false;
    boolean pinned_ = false;
    Marker marker_ = enter_section_(builder_, level_, _LEFT_, "<additive expression>");
    result_ = arithmeticAdditiveOperator(builder_, level_ + 1);
    pinned_ = result_; // pin = 1
    result_ = result_ && multiplicativeExpressionWrapper(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, ADDITIVE_EXPRESSION, result_, pinned_, null);
    return result_ || pinned_;
  }

  /* ********************************************************** */
  // multiplicativeExpressionWrapper additiveExpression*
  static boolean additiveExpressionWrapper(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "additiveExpressionWrapper")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = multiplicativeExpressionWrapper(builder_, level_ + 1);
    result_ = result_ && additiveExpressionWrapper_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // additiveExpression*
  private static boolean additiveExpressionWrapper_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "additiveExpressionWrapper_1")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!additiveExpression(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "additiveExpressionWrapper_1", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  /* ********************************************************** */
  // OP_ADD | OP_SUB
  public static boolean arithmeticAdditiveOperator(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "arithmeticAdditiveOperator")) return false;
    if (!nextTokenIs(builder_, "<arithmetic additive operator>", OP_ADD, OP_SUB)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<arithmetic additive operator>");
    result_ = consumeToken(builder_, OP_ADD);
    if (!result_) result_ = consumeToken(builder_, OP_SUB);
    exit_section_(builder_, level_, marker_, ARITHMETIC_ADDITIVE_OPERATOR, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // OP_MUL | OP_DIV | OP_REM | OP_INC | OP_DEC
  public static boolean arithmeticMultiplicativeOperator(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "arithmeticMultiplicativeOperator")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<arithmetic multiplicative operator>");
    result_ = consumeToken(builder_, OP_MUL);
    if (!result_) result_ = consumeToken(builder_, OP_DIV);
    if (!result_) result_ = consumeToken(builder_, OP_REM);
    if (!result_) result_ = consumeToken(builder_, OP_INC);
    if (!result_) result_ = consumeToken(builder_, OP_DEC);
    exit_section_(builder_, level_, marker_, ARITHMETIC_MULTIPLICATIVE_OPERATOR, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // identifier (BRACKET_SQUARE_L expression? BRACKET_SQUARE_R)+
  public static boolean arrayExpression(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "arrayExpression")) return false;
    if (!nextTokenIs(builder_, ID)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = identifier(builder_, level_ + 1);
    result_ = result_ && arrayExpression_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, ARRAY_EXPRESSION, result_);
    return result_;
  }

  // (BRACKET_SQUARE_L expression? BRACKET_SQUARE_R)+
  private static boolean arrayExpression_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "arrayExpression_1")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = arrayExpression_1_0(builder_, level_ + 1);
    int pos_ = current_position_(builder_);
    while (result_) {
      if (!arrayExpression_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "arrayExpression_1", pos_)) break;
      pos_ = current_position_(builder_);
    }
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // BRACKET_SQUARE_L expression? BRACKET_SQUARE_R
  private static boolean arrayExpression_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "arrayExpression_1_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, BRACKET_SQUARE_L);
    result_ = result_ && arrayExpression_1_0_1(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, BRACKET_SQUARE_R);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // expression?
  private static boolean arrayExpression_1_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "arrayExpression_1_0_1")) return false;
    expression(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // assignmentOperator ternaryExpressionWrapper
  public static boolean assignExpression(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "assignExpression")) return false;
    boolean result_ = false;
    boolean pinned_ = false;
    Marker marker_ = enter_section_(builder_, level_, _LEFT_, "<assign expression>");
    result_ = assignmentOperator(builder_, level_ + 1);
    pinned_ = result_; // pin = 1
    result_ = result_ && ternaryExpressionWrapper(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, ASSIGN_EXPRESSION, result_, pinned_, null);
    return result_ || pinned_;
  }

  /* ********************************************************** */
  // ternaryExpressionWrapper assignExpression*
  static boolean assignExpressionWrapper(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "assignExpressionWrapper")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = ternaryExpressionWrapper(builder_, level_ + 1);
    result_ = result_ && assignExpressionWrapper_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // assignExpression*
  private static boolean assignExpressionWrapper_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "assignExpressionWrapper_1")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!assignExpression(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "assignExpressionWrapper_1", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  /* ********************************************************** */
  // OP_EQ | OP_INC_EQ | OP_DEC_EQ | OP_MUL_EQ | OP_DIV_EQ | OP_REM_EQ | OP_BITSHIFTR_EQ | OP_BITUSHIFTR_EQ | OP_BITSHIFTL_EQ | OP_BITAND_EQ | OP_BITOR_EQ | OP_BITXOR_EQ
  public static boolean assignmentOperator(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "assignmentOperator")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<assignment operator>");
    result_ = consumeToken(builder_, OP_EQ);
    if (!result_) result_ = consumeToken(builder_, OP_INC_EQ);
    if (!result_) result_ = consumeToken(builder_, OP_DEC_EQ);
    if (!result_) result_ = consumeToken(builder_, OP_MUL_EQ);
    if (!result_) result_ = consumeToken(builder_, OP_DIV_EQ);
    if (!result_) result_ = consumeToken(builder_, OP_REM_EQ);
    if (!result_) result_ = consumeToken(builder_, OP_BITSHIFTR_EQ);
    if (!result_) result_ = consumeToken(builder_, OP_BITUSHIFTR_EQ);
    if (!result_) result_ = consumeToken(builder_, OP_BITSHIFTL_EQ);
    if (!result_) result_ = consumeToken(builder_, OP_BITAND_EQ);
    if (!result_) result_ = consumeToken(builder_, OP_BITOR_EQ);
    if (!result_) result_ = consumeToken(builder_, OP_BITXOR_EQ);
    exit_section_(builder_, level_, marker_, ASSIGNMENT_OPERATOR, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // (OTHER_FORWARD | OTHER_NATIVE) qualifiedIdentifier BRACKET_PAREN_L functionParameterList? BRACKET_PAREN_R
  static boolean bareFunctionDeclaration(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "bareFunctionDeclaration")) return false;
    if (!nextTokenIs(builder_, "", OTHER_FORWARD, OTHER_NATIVE)) return false;
    boolean result_ = false;
    boolean pinned_ = false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, null);
    result_ = bareFunctionDeclaration_0(builder_, level_ + 1);
    pinned_ = result_; // pin = 1
    result_ = result_ && report_error_(builder_, qualifiedIdentifier(builder_, level_ + 1));
    result_ = pinned_ && report_error_(builder_, consumeToken(builder_, BRACKET_PAREN_L)) && result_;
    result_ = pinned_ && report_error_(builder_, bareFunctionDeclaration_3(builder_, level_ + 1)) && result_;
    result_ = pinned_ && consumeToken(builder_, BRACKET_PAREN_R) && result_;
    exit_section_(builder_, level_, marker_, null, result_, pinned_, null);
    return result_ || pinned_;
  }

  // OTHER_FORWARD | OTHER_NATIVE
  private static boolean bareFunctionDeclaration_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "bareFunctionDeclaration_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, OTHER_FORWARD);
    if (!result_) result_ = consumeToken(builder_, OTHER_NATIVE);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // functionParameterList?
  private static boolean bareFunctionDeclaration_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "bareFunctionDeclaration_3")) return false;
    functionParameterList(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // OP_BITAND bitwiseShiftExpressionWrapper
  public static boolean bitwiseAndExpression(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "bitwiseAndExpression")) return false;
    if (!nextTokenIs(builder_, OP_BITAND)) return false;
    boolean result_ = false;
    boolean pinned_ = false;
    Marker marker_ = enter_section_(builder_, level_, _LEFT_, null);
    result_ = consumeToken(builder_, OP_BITAND);
    pinned_ = result_; // pin = 1
    result_ = result_ && bitwiseShiftExpressionWrapper(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, BITWISE_AND_EXPRESSION, result_, pinned_, null);
    return result_ || pinned_;
  }

  /* ********************************************************** */
  // bitwiseShiftExpressionWrapper bitwiseAndExpression*
  static boolean bitwiseAndExpressionWrapper(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "bitwiseAndExpressionWrapper")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = bitwiseShiftExpressionWrapper(builder_, level_ + 1);
    result_ = result_ && bitwiseAndExpressionWrapper_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // bitwiseAndExpression*
  private static boolean bitwiseAndExpressionWrapper_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "bitwiseAndExpressionWrapper_1")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!bitwiseAndExpression(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "bitwiseAndExpressionWrapper_1", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  /* ********************************************************** */
  // OP_BITOR | OP_BITXOR | OP_BITNOT | OP_BITAND
  public static boolean bitwiseOperator(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "bitwiseOperator")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<bitwise operator>");
    result_ = consumeToken(builder_, OP_BITOR);
    if (!result_) result_ = consumeToken(builder_, OP_BITXOR);
    if (!result_) result_ = consumeToken(builder_, OP_BITNOT);
    if (!result_) result_ = consumeToken(builder_, OP_BITAND);
    exit_section_(builder_, level_, marker_, BITWISE_OPERATOR, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // OP_BITOR bitwiseXorExpressionWrapper
  public static boolean bitwiseOrExpression(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "bitwiseOrExpression")) return false;
    if (!nextTokenIs(builder_, OP_BITOR)) return false;
    boolean result_ = false;
    boolean pinned_ = false;
    Marker marker_ = enter_section_(builder_, level_, _LEFT_, null);
    result_ = consumeToken(builder_, OP_BITOR);
    pinned_ = result_; // pin = 1
    result_ = result_ && bitwiseXorExpressionWrapper(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, BITWISE_OR_EXPRESSION, result_, pinned_, null);
    return result_ || pinned_;
  }

  /* ********************************************************** */
  // bitwiseXorExpressionWrapper bitwiseOrExpression*
  static boolean bitwiseOrExpressionWrapper(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "bitwiseOrExpressionWrapper")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = bitwiseXorExpressionWrapper(builder_, level_ + 1);
    result_ = result_ && bitwiseOrExpressionWrapper_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // bitwiseOrExpression*
  private static boolean bitwiseOrExpressionWrapper_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "bitwiseOrExpressionWrapper_1")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!bitwiseOrExpression(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "bitwiseOrExpressionWrapper_1", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  /* ********************************************************** */
  // bitwiseShiftOperator additiveExpressionWrapper
  public static boolean bitwiseShiftExpression(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "bitwiseShiftExpression")) return false;
    boolean result_ = false;
    boolean pinned_ = false;
    Marker marker_ = enter_section_(builder_, level_, _LEFT_, "<bitwise shift expression>");
    result_ = bitwiseShiftOperator(builder_, level_ + 1);
    pinned_ = result_; // pin = 1
    result_ = result_ && additiveExpressionWrapper(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, BITWISE_SHIFT_EXPRESSION, result_, pinned_, null);
    return result_ || pinned_;
  }

  /* ********************************************************** */
  // additiveExpressionWrapper bitwiseShiftExpression*
  static boolean bitwiseShiftExpressionWrapper(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "bitwiseShiftExpressionWrapper")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = additiveExpressionWrapper(builder_, level_ + 1);
    result_ = result_ && bitwiseShiftExpressionWrapper_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // bitwiseShiftExpression*
  private static boolean bitwiseShiftExpressionWrapper_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "bitwiseShiftExpressionWrapper_1")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!bitwiseShiftExpression(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "bitwiseShiftExpressionWrapper_1", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  /* ********************************************************** */
  // OP_BITSHIFTR | OP_BITUSHIFTR | OP_BITSHIFTL
  public static boolean bitwiseShiftOperator(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "bitwiseShiftOperator")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<bitwise shift operator>");
    result_ = consumeToken(builder_, OP_BITSHIFTR);
    if (!result_) result_ = consumeToken(builder_, OP_BITUSHIFTR);
    if (!result_) result_ = consumeToken(builder_, OP_BITSHIFTL);
    exit_section_(builder_, level_, marker_, BITWISE_SHIFT_OPERATOR, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // OP_BITXOR bitwiseAndExpressionWrapper
  public static boolean bitwiseXorExpression(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "bitwiseXorExpression")) return false;
    if (!nextTokenIs(builder_, OP_BITXOR)) return false;
    boolean result_ = false;
    boolean pinned_ = false;
    Marker marker_ = enter_section_(builder_, level_, _LEFT_, null);
    result_ = consumeToken(builder_, OP_BITXOR);
    pinned_ = result_; // pin = 1
    result_ = result_ && bitwiseAndExpressionWrapper(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, BITWISE_XOR_EXPRESSION, result_, pinned_, null);
    return result_ || pinned_;
  }

  /* ********************************************************** */
  // bitwiseAndExpressionWrapper bitwiseXorExpression*
  static boolean bitwiseXorExpressionWrapper(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "bitwiseXorExpressionWrapper")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = bitwiseAndExpressionWrapper(builder_, level_ + 1);
    result_ = result_ && bitwiseXorExpressionWrapper_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // bitwiseXorExpression*
  private static boolean bitwiseXorExpressionWrapper_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "bitwiseXorExpressionWrapper_1")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!bitwiseXorExpression(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "bitwiseXorExpressionWrapper_1", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  /* ********************************************************** */
  // BRACKET_CURLY_L (statement SYNTAX_SEMICOLON?)* BRACKET_CURLY_R
  static boolean blockStatement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "blockStatement")) return false;
    if (!nextTokenIs(builder_, BRACKET_CURLY_L)) return false;
    boolean result_ = false;
    boolean pinned_ = false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, null);
    result_ = consumeToken(builder_, BRACKET_CURLY_L);
    pinned_ = result_; // pin = 1
    result_ = result_ && report_error_(builder_, blockStatement_1(builder_, level_ + 1));
    result_ = pinned_ && consumeToken(builder_, BRACKET_CURLY_R) && result_;
    exit_section_(builder_, level_, marker_, null, result_, pinned_, null);
    return result_ || pinned_;
  }

  // (statement SYNTAX_SEMICOLON?)*
  private static boolean blockStatement_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "blockStatement_1")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!blockStatement_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "blockStatement_1", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // statement SYNTAX_SEMICOLON?
  private static boolean blockStatement_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "blockStatement_1_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = statement(builder_, level_ + 1);
    result_ = result_ && blockStatement_1_0_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // SYNTAX_SEMICOLON?
  private static boolean blockStatement_1_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "blockStatement_1_0_1")) return false;
    consumeToken(builder_, SYNTAX_SEMICOLON);
    return true;
  }

  /* ********************************************************** */
  // BRACKET_SQUARE_L | BRACKET_SQUARE_R | BRACKET_CURLY_L | BRACKET_CURLY_R | BRACKET_PAREN_L | BRACKET_PAREN_R
  public static boolean bracketList(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "bracketList")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<bracket list>");
    result_ = consumeToken(builder_, BRACKET_SQUARE_L);
    if (!result_) result_ = consumeToken(builder_, BRACKET_SQUARE_R);
    if (!result_) result_ = consumeToken(builder_, BRACKET_CURLY_L);
    if (!result_) result_ = consumeToken(builder_, BRACKET_CURLY_R);
    if (!result_) result_ = consumeToken(builder_, BRACKET_PAREN_L);
    if (!result_) result_ = consumeToken(builder_, BRACKET_PAREN_R);
    exit_section_(builder_, level_, marker_, BRACKET_LIST, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // KEY_BREAK
  public static boolean breakStatement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "breakStatement")) return false;
    if (!nextTokenIs(builder_, KEY_BREAK)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, KEY_BREAK);
    exit_section_(builder_, marker_, BREAK_STATEMENT, result_);
    return result_;
  }

  /* ********************************************************** */
  // identifier BRACKET_PAREN_L expressionList? BRACKET_PAREN_R
  public static boolean callExpression(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "callExpression")) return false;
    if (!nextTokenIs(builder_, ID)) return false;
    boolean result_ = false;
    boolean pinned_ = false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, null);
    result_ = identifier(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, BRACKET_PAREN_L);
    pinned_ = result_; // pin = 2
    result_ = result_ && report_error_(builder_, callExpression_2(builder_, level_ + 1));
    result_ = pinned_ && consumeToken(builder_, BRACKET_PAREN_R) && result_;
    exit_section_(builder_, level_, marker_, CALL_EXPRESSION, result_, pinned_, null);
    return result_ || pinned_;
  }

  // expressionList?
  private static boolean callExpression_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "callExpression_2")) return false;
    expressionList(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // <<param>> (SYNTAX_COMMA <<param>>)*
  public static boolean comma_list(PsiBuilder builder_, int level_, final Parser param) {
    if (!recursion_guard_(builder_, level_, "comma_list")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = param.parse(builder_, level_);
    result_ = result_ && comma_list_1(builder_, level_ + 1, param);
    exit_section_(builder_, marker_, COMMA_LIST, result_);
    return result_;
  }

  // (SYNTAX_COMMA <<param>>)*
  private static boolean comma_list_1(PsiBuilder builder_, int level_, final Parser param) {
    if (!recursion_guard_(builder_, level_, "comma_list_1")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!comma_list_1_0(builder_, level_ + 1, param)) break;
      if (!empty_element_parsed_guard_(builder_, "comma_list_1", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // SYNTAX_COMMA <<param>>
  private static boolean comma_list_1_0(PsiBuilder builder_, int level_, final Parser param) {
    if (!recursion_guard_(builder_, level_, "comma_list_1_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, SYNTAX_COMMA);
    result_ = result_ && param.parse(builder_, level_);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // CONSTANT_HEX | CONSTANT_FLOAT | CONSTANT_INTEGER | CONSTANT_BOOLEAN | CONSTANT_STRING | CONSTANT_CHARACTER
  public static boolean constantList(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "constantList")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<constant list>");
    result_ = consumeToken(builder_, CONSTANT_HEX);
    if (!result_) result_ = consumeToken(builder_, CONSTANT_FLOAT);
    if (!result_) result_ = consumeToken(builder_, CONSTANT_INTEGER);
    if (!result_) result_ = consumeToken(builder_, CONSTANT_BOOLEAN);
    if (!result_) result_ = consumeToken(builder_, CONSTANT_STRING);
    if (!result_) result_ = consumeToken(builder_, CONSTANT_CHARACTER);
    exit_section_(builder_, level_, marker_, CONSTANT_LIST, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // KEY_CONTINUE
  public static boolean continueStatement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "continueStatement")) return false;
    if (!nextTokenIs(builder_, KEY_CONTINUE)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, KEY_CONTINUE);
    exit_section_(builder_, marker_, CONTINUE_STATEMENT, result_);
    return result_;
  }

  /* ********************************************************** */
  // DIR_DEFINE expression expression?
  public static boolean defineDirective(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "defineDirective")) return false;
    if (!nextTokenIs(builder_, DIR_DEFINE)) return false;
    boolean result_ = false;
    boolean pinned_ = false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, null);
    result_ = consumeToken(builder_, DIR_DEFINE);
    pinned_ = result_; // pin = 1
    result_ = result_ && report_error_(builder_, expression(builder_, level_ + 1));
    result_ = pinned_ && defineDirective_2(builder_, level_ + 1) && result_;
    exit_section_(builder_, level_, marker_, DEFINE_DIRECTIVE, result_, pinned_, null);
    return result_ || pinned_;
  }

  // expression?
  private static boolean defineDirective_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "defineDirective_2")) return false;
    expression(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // includeDirective
  //                      | defineDirective | undefineDirective
  //                      | pragmaDirective
  //                      | ifDirective | elseifDirective | elseDirective | endifDirective
  //                      | endInputDirective
  public static boolean directiveDeclaration(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "directiveDeclaration")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<directive declaration>");
    result_ = includeDirective(builder_, level_ + 1);
    if (!result_) result_ = defineDirective(builder_, level_ + 1);
    if (!result_) result_ = undefineDirective(builder_, level_ + 1);
    if (!result_) result_ = pragmaDirective(builder_, level_ + 1);
    if (!result_) result_ = ifDirective(builder_, level_ + 1);
    if (!result_) result_ = elseifDirective(builder_, level_ + 1);
    if (!result_) result_ = elseDirective(builder_, level_ + 1);
    if (!result_) result_ = endifDirective(builder_, level_ + 1);
    if (!result_) result_ = endInputDirective(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, DIRECTIVE_DECLARATION, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // DIR_ASSERT | DIR_DEFINE | DIR_ELSE | DIR_ELSEIF | DIR_ENDIF | DIR_ENDINPUT | DIR_ERROR | DIR_FILE | DIR_IF | DIR_INCLUDE | DIR_LINE | DIR_PRAGMA | DIR_SECTION | DIR_TRYINC | DIR_UNDEF
  public static boolean directiveList(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "directiveList")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<directive list>");
    result_ = consumeToken(builder_, DIR_ASSERT);
    if (!result_) result_ = consumeToken(builder_, DIR_DEFINE);
    if (!result_) result_ = consumeToken(builder_, DIR_ELSE);
    if (!result_) result_ = consumeToken(builder_, DIR_ELSEIF);
    if (!result_) result_ = consumeToken(builder_, DIR_ENDIF);
    if (!result_) result_ = consumeToken(builder_, DIR_ENDINPUT);
    if (!result_) result_ = consumeToken(builder_, DIR_ERROR);
    if (!result_) result_ = consumeToken(builder_, DIR_FILE);
    if (!result_) result_ = consumeToken(builder_, DIR_IF);
    if (!result_) result_ = consumeToken(builder_, DIR_INCLUDE);
    if (!result_) result_ = consumeToken(builder_, DIR_LINE);
    if (!result_) result_ = consumeToken(builder_, DIR_PRAGMA);
    if (!result_) result_ = consumeToken(builder_, DIR_SECTION);
    if (!result_) result_ = consumeToken(builder_, DIR_TRYINC);
    if (!result_) result_ = consumeToken(builder_, DIR_UNDEF);
    exit_section_(builder_, level_, marker_, DIRECTIVE_LIST, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // KEY_DO functionBlock KEY_WHILE BRACKET_PAREN_L expression BRACKET_PAREN_R
  public static boolean doWhileStatement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "doWhileStatement")) return false;
    if (!nextTokenIs(builder_, KEY_DO)) return false;
    boolean result_ = false;
    boolean pinned_ = false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, null);
    result_ = consumeToken(builder_, KEY_DO);
    pinned_ = result_; // pin = 1
    result_ = result_ && report_error_(builder_, functionBlock(builder_, level_ + 1));
    result_ = pinned_ && report_error_(builder_, consumeTokens(builder_, -1, KEY_WHILE, BRACKET_PAREN_L)) && result_;
    result_ = pinned_ && report_error_(builder_, expression(builder_, level_ + 1)) && result_;
    result_ = pinned_ && consumeToken(builder_, BRACKET_PAREN_R) && result_;
    exit_section_(builder_, level_, marker_, DO_WHILE_STATEMENT, result_, pinned_, null);
    return result_ || pinned_;
  }

  /* ********************************************************** */
  // DIR_ELSE
  public static boolean elseDirective(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "elseDirective")) return false;
    if (!nextTokenIs(builder_, DIR_ELSE)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, DIR_ELSE);
    exit_section_(builder_, marker_, ELSE_DIRECTIVE, result_);
    return result_;
  }

  /* ********************************************************** */
  // KEY_ELSE functionBlock
  public static boolean elseStatement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "elseStatement")) return false;
    if (!nextTokenIs(builder_, KEY_ELSE)) return false;
    boolean result_ = false;
    boolean pinned_ = false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, null);
    result_ = consumeToken(builder_, KEY_ELSE);
    pinned_ = result_; // pin = 1
    result_ = result_ && functionBlock(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, ELSE_STATEMENT, result_, pinned_, null);
    return result_ || pinned_;
  }

  /* ********************************************************** */
  // DIR_ELSEIF expression
  public static boolean elseifDirective(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "elseifDirective")) return false;
    if (!nextTokenIs(builder_, DIR_ELSEIF)) return false;
    boolean result_ = false;
    boolean pinned_ = false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, null);
    result_ = consumeToken(builder_, DIR_ELSEIF);
    pinned_ = result_; // pin = 1
    result_ = result_ && expression(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, ELSEIF_DIRECTIVE, result_, pinned_, null);
    return result_ || pinned_;
  }

  /* ********************************************************** */
  // DIR_ENDINPUT
  public static boolean endInputDirective(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "endInputDirective")) return false;
    if (!nextTokenIs(builder_, DIR_ENDINPUT)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, DIR_ENDINPUT);
    exit_section_(builder_, marker_, END_INPUT_DIRECTIVE, result_);
    return result_;
  }

  /* ********************************************************** */
  // DIR_ENDIF
  public static boolean endifDirective(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "endifDirective")) return false;
    if (!nextTokenIs(builder_, DIR_ENDIF)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, DIR_ENDIF);
    exit_section_(builder_, marker_, ENDIF_DIRECTIVE, result_);
    return result_;
  }

  /* ********************************************************** */
  // OTHER_ENUM identifier BRACKET_CURLY_L enumList BRACKET_CURLY_R SYNTAX_SEMICOLON?
  public static boolean enumDeclaration(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "enumDeclaration")) return false;
    if (!nextTokenIs(builder_, OTHER_ENUM)) return false;
    boolean result_ = false;
    boolean pinned_ = false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, null);
    result_ = consumeToken(builder_, OTHER_ENUM);
    pinned_ = result_; // pin = 1
    result_ = result_ && report_error_(builder_, identifier(builder_, level_ + 1));
    result_ = pinned_ && report_error_(builder_, consumeToken(builder_, BRACKET_CURLY_L)) && result_;
    result_ = pinned_ && report_error_(builder_, enumList(builder_, level_ + 1)) && result_;
    result_ = pinned_ && report_error_(builder_, consumeToken(builder_, BRACKET_CURLY_R)) && result_;
    result_ = pinned_ && enumDeclaration_5(builder_, level_ + 1) && result_;
    exit_section_(builder_, level_, marker_, ENUM_DECLARATION, result_, pinned_, null);
    return result_ || pinned_;
  }

  // SYNTAX_SEMICOLON?
  private static boolean enumDeclaration_5(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "enumDeclaration_5")) return false;
    consumeToken(builder_, SYNTAX_SEMICOLON);
    return true;
  }

  /* ********************************************************** */
  // <<optional_comma_list expression>>
  public static boolean enumList(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "enumList")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<enum list>");
    result_ = optional_comma_list(builder_, level_ + 1, expression_parser_);
    exit_section_(builder_, level_, marker_, ENUM_LIST, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // equalityOperator relationalExpressionWrapper
  public static boolean equalityExpression(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "equalityExpression")) return false;
    if (!nextTokenIs(builder_, "<equality expression>", OP_EQ_EQ, OP_NOT_EQ)) return false;
    boolean result_ = false;
    boolean pinned_ = false;
    Marker marker_ = enter_section_(builder_, level_, _LEFT_, "<equality expression>");
    result_ = equalityOperator(builder_, level_ + 1);
    pinned_ = result_; // pin = 1
    result_ = result_ && relationalExpressionWrapper(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, EQUALITY_EXPRESSION, result_, pinned_, null);
    return result_ || pinned_;
  }

  /* ********************************************************** */
  // relationalExpressionWrapper equalityExpression*
  static boolean equalityExpressionWrapper(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "equalityExpressionWrapper")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = relationalExpressionWrapper(builder_, level_ + 1);
    result_ = result_ && equalityExpressionWrapper_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // equalityExpression*
  private static boolean equalityExpressionWrapper_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "equalityExpressionWrapper_1")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!equalityExpression(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "equalityExpressionWrapper_1", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  /* ********************************************************** */
  // OP_EQ_EQ | OP_NOT_EQ
  public static boolean equalityOperator(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "equalityOperator")) return false;
    if (!nextTokenIs(builder_, "<equality operator>", OP_EQ_EQ, OP_NOT_EQ)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<equality operator>");
    result_ = consumeToken(builder_, OP_EQ_EQ);
    if (!result_) result_ = consumeToken(builder_, OP_NOT_EQ);
    exit_section_(builder_, level_, marker_, EQUALITY_OPERATOR, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // assignExpressionWrapper
  public static boolean expression(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "expression")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_, level_, _COLLAPSE_, "<expression>");
    result_ = assignExpressionWrapper(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, EXPRESSION, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // <<comma_list expression>>
  public static boolean expressionList(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "expressionList")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<expression list>");
    result_ = comma_list(builder_, level_ + 1, expression_parser_);
    exit_section_(builder_, level_, marker_, EXPRESSION_LIST, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // <<comma_list localVarStatement>>
  public static boolean forInitList(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "forInitList")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<for init list>");
    result_ = comma_list(builder_, level_ + 1, localVarStatement_parser_);
    exit_section_(builder_, level_, marker_, FOR_INIT_LIST, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // KEY_FOR BRACKET_PAREN_L forInitList? SYNTAX_SEMICOLON expression? SYNTAX_SEMICOLON expression? BRACKET_PAREN_R functionBlock
  public static boolean forStatement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "forStatement")) return false;
    if (!nextTokenIs(builder_, KEY_FOR)) return false;
    boolean result_ = false;
    boolean pinned_ = false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, null);
    result_ = consumeTokens(builder_, 1, KEY_FOR, BRACKET_PAREN_L);
    pinned_ = result_; // pin = 1
    result_ = result_ && report_error_(builder_, forStatement_2(builder_, level_ + 1));
    result_ = pinned_ && report_error_(builder_, consumeToken(builder_, SYNTAX_SEMICOLON)) && result_;
    result_ = pinned_ && report_error_(builder_, forStatement_4(builder_, level_ + 1)) && result_;
    result_ = pinned_ && report_error_(builder_, consumeToken(builder_, SYNTAX_SEMICOLON)) && result_;
    result_ = pinned_ && report_error_(builder_, forStatement_6(builder_, level_ + 1)) && result_;
    result_ = pinned_ && report_error_(builder_, consumeToken(builder_, BRACKET_PAREN_R)) && result_;
    result_ = pinned_ && functionBlock(builder_, level_ + 1) && result_;
    exit_section_(builder_, level_, marker_, FOR_STATEMENT, result_, pinned_, null);
    return result_ || pinned_;
  }

  // forInitList?
  private static boolean forStatement_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "forStatement_2")) return false;
    forInitList(builder_, level_ + 1);
    return true;
  }

  // expression?
  private static boolean forStatement_4(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "forStatement_4")) return false;
    expression(builder_, level_ + 1);
    return true;
  }

  // expression?
  private static boolean forStatement_6(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "forStatement_6")) return false;
    expression(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // <<optional_comma_list funcenumBlockDeclaration>>
  public static boolean funcenumBlock(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "funcenumBlock")) return false;
    if (!nextTokenIs(builder_, "<funcenum block>", ID, OTHER_PUBLIC)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<funcenum block>");
    result_ = optional_comma_list(builder_, level_ + 1, funcenumBlockDeclaration_parser_);
    exit_section_(builder_, level_, marker_, FUNCENUM_BLOCK, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // tag? OTHER_PUBLIC BRACKET_PAREN_L functionParameterList? BRACKET_PAREN_R
  public static boolean funcenumBlockDeclaration(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "funcenumBlockDeclaration")) return false;
    if (!nextTokenIs(builder_, "<funcenum block declaration>", ID, OTHER_PUBLIC)) return false;
    boolean result_ = false;
    boolean pinned_ = false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<funcenum block declaration>");
    result_ = funcenumBlockDeclaration_0(builder_, level_ + 1);
    result_ = result_ && consumeTokens(builder_, 1, OTHER_PUBLIC, BRACKET_PAREN_L);
    pinned_ = result_; // pin = 2
    result_ = result_ && report_error_(builder_, funcenumBlockDeclaration_3(builder_, level_ + 1));
    result_ = pinned_ && consumeToken(builder_, BRACKET_PAREN_R) && result_;
    exit_section_(builder_, level_, marker_, FUNCENUM_BLOCK_DECLARATION, result_, pinned_, null);
    return result_ || pinned_;
  }

  // tag?
  private static boolean funcenumBlockDeclaration_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "funcenumBlockDeclaration_0")) return false;
    tag(builder_, level_ + 1);
    return true;
  }

  // functionParameterList?
  private static boolean funcenumBlockDeclaration_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "funcenumBlockDeclaration_3")) return false;
    functionParameterList(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // OTHER_FUNCENUM identifier BRACKET_CURLY_L funcenumBlock BRACKET_CURLY_R
  public static boolean funcenumDeclaration(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "funcenumDeclaration")) return false;
    if (!nextTokenIs(builder_, OTHER_FUNCENUM)) return false;
    boolean result_ = false;
    boolean pinned_ = false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, null);
    result_ = consumeToken(builder_, OTHER_FUNCENUM);
    pinned_ = result_; // pin = 1
    result_ = result_ && report_error_(builder_, identifier(builder_, level_ + 1));
    result_ = pinned_ && report_error_(builder_, consumeToken(builder_, BRACKET_CURLY_L)) && result_;
    result_ = pinned_ && report_error_(builder_, funcenumBlock(builder_, level_ + 1)) && result_;
    result_ = pinned_ && consumeToken(builder_, BRACKET_CURLY_R) && result_;
    exit_section_(builder_, level_, marker_, FUNCENUM_DECLARATION, result_, pinned_, null);
    return result_ || pinned_;
  }

  /* ********************************************************** */
  // OTHER_FUNCTAG (OTHER_PUBLIC qualifiedIdentifier | identifier tag? OTHER_PUBLIC) BRACKET_PAREN_L functionParameterList? BRACKET_PAREN_R
  static boolean functagDeclaration(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "functagDeclaration")) return false;
    if (!nextTokenIs(builder_, OTHER_FUNCTAG)) return false;
    boolean result_ = false;
    boolean pinned_ = false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, null);
    result_ = consumeToken(builder_, OTHER_FUNCTAG);
    pinned_ = result_; // pin = 1
    result_ = result_ && report_error_(builder_, functagDeclaration_1(builder_, level_ + 1));
    result_ = pinned_ && report_error_(builder_, consumeToken(builder_, BRACKET_PAREN_L)) && result_;
    result_ = pinned_ && report_error_(builder_, functagDeclaration_3(builder_, level_ + 1)) && result_;
    result_ = pinned_ && consumeToken(builder_, BRACKET_PAREN_R) && result_;
    exit_section_(builder_, level_, marker_, null, result_, pinned_, null);
    return result_ || pinned_;
  }

  // OTHER_PUBLIC qualifiedIdentifier | identifier tag? OTHER_PUBLIC
  private static boolean functagDeclaration_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "functagDeclaration_1")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = functagDeclaration_1_0(builder_, level_ + 1);
    if (!result_) result_ = functagDeclaration_1_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // OTHER_PUBLIC qualifiedIdentifier
  private static boolean functagDeclaration_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "functagDeclaration_1_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, OTHER_PUBLIC);
    result_ = result_ && qualifiedIdentifier(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // identifier tag? OTHER_PUBLIC
  private static boolean functagDeclaration_1_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "functagDeclaration_1_1")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = identifier(builder_, level_ + 1);
    result_ = result_ && functagDeclaration_1_1_1(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, OTHER_PUBLIC);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // tag?
  private static boolean functagDeclaration_1_1_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "functagDeclaration_1_1_1")) return false;
    tag(builder_, level_ + 1);
    return true;
  }

  // functionParameterList?
  private static boolean functagDeclaration_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "functagDeclaration_3")) return false;
    functionParameterList(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // blockStatement | statement
  public static boolean functionBlock(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "functionBlock")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<function block>");
    result_ = blockStatement(builder_, level_ + 1);
    if (!result_) result_ = statement(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, FUNCTION_BLOCK, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // (funcenumDeclaration | functagDeclaration | bareFunctionDeclaration | normalFunctionDeclaration) SYNTAX_SEMICOLON?
  public static boolean functionDeclaration(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "functionDeclaration")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<function declaration>");
    result_ = functionDeclaration_0(builder_, level_ + 1);
    result_ = result_ && functionDeclaration_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, FUNCTION_DECLARATION, result_, false, null);
    return result_;
  }

  // funcenumDeclaration | functagDeclaration | bareFunctionDeclaration | normalFunctionDeclaration
  private static boolean functionDeclaration_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "functionDeclaration_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = funcenumDeclaration(builder_, level_ + 1);
    if (!result_) result_ = functagDeclaration(builder_, level_ + 1);
    if (!result_) result_ = bareFunctionDeclaration(builder_, level_ + 1);
    if (!result_) result_ = normalFunctionDeclaration(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // SYNTAX_SEMICOLON?
  private static boolean functionDeclaration_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "functionDeclaration_1")) return false;
    consumeToken(builder_, SYNTAX_SEMICOLON);
    return true;
  }

  /* ********************************************************** */
  // [OTHER_CONST | OP_BITAND] tag? (SYNTAX_ELLIPSIS | identifier (BRACKET_SQUARE_L expression? BRACKET_SQUARE_R)* varInit?)
  public static boolean functionParameter(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "functionParameter")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<function parameter>");
    result_ = functionParameter_0(builder_, level_ + 1);
    result_ = result_ && functionParameter_1(builder_, level_ + 1);
    result_ = result_ && functionParameter_2(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, FUNCTION_PARAMETER, result_, false, null);
    return result_;
  }

  // [OTHER_CONST | OP_BITAND]
  private static boolean functionParameter_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "functionParameter_0")) return false;
    functionParameter_0_0(builder_, level_ + 1);
    return true;
  }

  // OTHER_CONST | OP_BITAND
  private static boolean functionParameter_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "functionParameter_0_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, OTHER_CONST);
    if (!result_) result_ = consumeToken(builder_, OP_BITAND);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // tag?
  private static boolean functionParameter_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "functionParameter_1")) return false;
    tag(builder_, level_ + 1);
    return true;
  }

  // SYNTAX_ELLIPSIS | identifier (BRACKET_SQUARE_L expression? BRACKET_SQUARE_R)* varInit?
  private static boolean functionParameter_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "functionParameter_2")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, SYNTAX_ELLIPSIS);
    if (!result_) result_ = functionParameter_2_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // identifier (BRACKET_SQUARE_L expression? BRACKET_SQUARE_R)* varInit?
  private static boolean functionParameter_2_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "functionParameter_2_1")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = identifier(builder_, level_ + 1);
    result_ = result_ && functionParameter_2_1_1(builder_, level_ + 1);
    result_ = result_ && functionParameter_2_1_2(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (BRACKET_SQUARE_L expression? BRACKET_SQUARE_R)*
  private static boolean functionParameter_2_1_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "functionParameter_2_1_1")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!functionParameter_2_1_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "functionParameter_2_1_1", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // BRACKET_SQUARE_L expression? BRACKET_SQUARE_R
  private static boolean functionParameter_2_1_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "functionParameter_2_1_1_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, BRACKET_SQUARE_L);
    result_ = result_ && functionParameter_2_1_1_0_1(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, BRACKET_SQUARE_R);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // expression?
  private static boolean functionParameter_2_1_1_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "functionParameter_2_1_1_0_1")) return false;
    expression(builder_, level_ + 1);
    return true;
  }

  // varInit?
  private static boolean functionParameter_2_1_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "functionParameter_2_1_2")) return false;
    varInit(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // <<comma_list functionParameter>>
  public static boolean functionParameterList(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "functionParameterList")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<function parameter list>");
    result_ = comma_list(builder_, level_ + 1, functionParameter_parser_);
    exit_section_(builder_, level_, marker_, FUNCTION_PARAMETER_LIST, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // globalVarModifier varDeclarationPartList SYNTAX_SEMICOLON?
  public static boolean globalVarDeclaration(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "globalVarDeclaration")) return false;
    boolean result_ = false;
    boolean pinned_ = false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<global var declaration>");
    result_ = globalVarModifier(builder_, level_ + 1);
    pinned_ = result_; // pin = 1
    result_ = result_ && report_error_(builder_, varDeclarationPartList(builder_, level_ + 1));
    result_ = pinned_ && globalVarDeclaration_2(builder_, level_ + 1) && result_;
    exit_section_(builder_, level_, marker_, GLOBAL_VAR_DECLARATION, result_, pinned_, null);
    return result_ || pinned_;
  }

  // SYNTAX_SEMICOLON?
  private static boolean globalVarDeclaration_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "globalVarDeclaration_2")) return false;
    consumeToken(builder_, SYNTAX_SEMICOLON);
    return true;
  }

  /* ********************************************************** */
  // OTHER_PUBLIC | OTHER_STATIC | OTHER_NEW | OTHER_CONST | OTHER_DECL
  public static boolean globalVarModifier(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "globalVarModifier")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<global var modifier>");
    result_ = consumeToken(builder_, OTHER_PUBLIC);
    if (!result_) result_ = consumeToken(builder_, OTHER_STATIC);
    if (!result_) result_ = consumeToken(builder_, OTHER_NEW);
    if (!result_) result_ = consumeToken(builder_, OTHER_CONST);
    if (!result_) result_ = consumeToken(builder_, OTHER_DECL);
    exit_section_(builder_, level_, marker_, GLOBAL_VAR_MODIFIER, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // ID
  public static boolean identifier(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "identifier")) return false;
    if (!nextTokenIs(builder_, ID)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, ID);
    exit_section_(builder_, marker_, IDENTIFIER, result_);
    return result_;
  }

  /* ********************************************************** */
  // DIR_IF expression
  public static boolean ifDirective(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ifDirective")) return false;
    if (!nextTokenIs(builder_, DIR_IF)) return false;
    boolean result_ = false;
    boolean pinned_ = false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, null);
    result_ = consumeToken(builder_, DIR_IF);
    pinned_ = result_; // pin = 1
    result_ = result_ && expression(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, IF_DIRECTIVE, result_, pinned_, null);
    return result_ || pinned_;
  }

  /* ********************************************************** */
  // KEY_IF BRACKET_PAREN_L expression BRACKET_PAREN_R functionBlock
  public static boolean ifStatement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ifStatement")) return false;
    if (!nextTokenIs(builder_, KEY_IF)) return false;
    boolean result_ = false;
    boolean pinned_ = false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, null);
    result_ = consumeTokens(builder_, 1, KEY_IF, BRACKET_PAREN_L);
    pinned_ = result_; // pin = 1
    result_ = result_ && report_error_(builder_, expression(builder_, level_ + 1));
    result_ = pinned_ && report_error_(builder_, consumeToken(builder_, BRACKET_PAREN_R)) && result_;
    result_ = pinned_ && functionBlock(builder_, level_ + 1) && result_;
    exit_section_(builder_, level_, marker_, IF_STATEMENT, result_, pinned_, null);
    return result_ || pinned_;
  }

  /* ********************************************************** */
  // DIR_INCLUDE PATH
  public static boolean includeDirective(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "includeDirective")) return false;
    if (!nextTokenIs(builder_, DIR_INCLUDE)) return false;
    boolean result_ = false;
    boolean pinned_ = false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, null);
    result_ = consumeTokens(builder_, 1, DIR_INCLUDE, PATH);
    pinned_ = result_; // pin = 1
    exit_section_(builder_, level_, marker_, INCLUDE_DIRECTIVE, result_, pinned_, null);
    return result_ || pinned_;
  }

  /* ********************************************************** */
  // KEY_ASSERT | KEY_BREAK | KEY_CASE | KEY_CONTINUE | KEY_DEFAULT | KEY_DO | KEY_ELSE | KEY_EXIT | KEY_FOR | KEY_GOTO | KEY_IF | KEY_RETURN | KEY_SLEEP | KEY_STATE | KEY_SWITCH | KEY_WHILE
  public static boolean keywordList(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "keywordList")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<keyword list>");
    result_ = consumeToken(builder_, KEY_ASSERT);
    if (!result_) result_ = consumeToken(builder_, KEY_BREAK);
    if (!result_) result_ = consumeToken(builder_, KEY_CASE);
    if (!result_) result_ = consumeToken(builder_, KEY_CONTINUE);
    if (!result_) result_ = consumeToken(builder_, KEY_DEFAULT);
    if (!result_) result_ = consumeToken(builder_, KEY_DO);
    if (!result_) result_ = consumeToken(builder_, KEY_ELSE);
    if (!result_) result_ = consumeToken(builder_, KEY_EXIT);
    if (!result_) result_ = consumeToken(builder_, KEY_FOR);
    if (!result_) result_ = consumeToken(builder_, KEY_GOTO);
    if (!result_) result_ = consumeToken(builder_, KEY_IF);
    if (!result_) result_ = consumeToken(builder_, KEY_RETURN);
    if (!result_) result_ = consumeToken(builder_, KEY_SLEEP);
    if (!result_) result_ = consumeToken(builder_, KEY_STATE);
    if (!result_) result_ = consumeToken(builder_, KEY_SWITCH);
    if (!result_) result_ = consumeToken(builder_, KEY_WHILE);
    exit_section_(builder_, level_, marker_, KEYWORD_LIST, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // constantList
  public static boolean literalExpression(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "literalExpression")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<literal expression>");
    result_ = constantList(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, LITERAL_EXPRESSION, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // OTHER_STATIC | OTHER_NEW | OTHER_CONST | OTHER_DECL
  public static boolean localVarModifier(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "localVarModifier")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<local var modifier>");
    result_ = consumeToken(builder_, OTHER_STATIC);
    if (!result_) result_ = consumeToken(builder_, OTHER_NEW);
    if (!result_) result_ = consumeToken(builder_, OTHER_CONST);
    if (!result_) result_ = consumeToken(builder_, OTHER_DECL);
    exit_section_(builder_, level_, marker_, LOCAL_VAR_MODIFIER, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // localVarModifier varDeclarationPartList
  public static boolean localVarStatement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "localVarStatement")) return false;
    boolean result_ = false;
    boolean pinned_ = false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<local var statement>");
    result_ = localVarModifier(builder_, level_ + 1);
    pinned_ = result_; // pin = 1
    result_ = result_ && varDeclarationPartList(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, LOCAL_VAR_STATEMENT, result_, pinned_, null);
    return result_ || pinned_;
  }

  /* ********************************************************** */
  // OP_AND equalityExpressionWrapper
  public static boolean logicAndExpression(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "logicAndExpression")) return false;
    if (!nextTokenIs(builder_, OP_AND)) return false;
    boolean result_ = false;
    boolean pinned_ = false;
    Marker marker_ = enter_section_(builder_, level_, _LEFT_, null);
    result_ = consumeToken(builder_, OP_AND);
    pinned_ = result_; // pin = 1
    result_ = result_ && equalityExpressionWrapper(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, LOGIC_AND_EXPRESSION, result_, pinned_, null);
    return result_ || pinned_;
  }

  /* ********************************************************** */
  // equalityExpressionWrapper logicAndExpression*
  static boolean logicAndExpressionWrapper(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "logicAndExpressionWrapper")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = equalityExpressionWrapper(builder_, level_ + 1);
    result_ = result_ && logicAndExpressionWrapper_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // logicAndExpression*
  private static boolean logicAndExpressionWrapper_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "logicAndExpressionWrapper_1")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!logicAndExpression(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "logicAndExpressionWrapper_1", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  /* ********************************************************** */
  // OP_OR logicAndExpressionWrapper
  public static boolean logicOrExpression(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "logicOrExpression")) return false;
    if (!nextTokenIs(builder_, OP_OR)) return false;
    boolean result_ = false;
    boolean pinned_ = false;
    Marker marker_ = enter_section_(builder_, level_, _LEFT_, null);
    result_ = consumeToken(builder_, OP_OR);
    pinned_ = result_; // pin = 1
    result_ = result_ && logicAndExpressionWrapper(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, LOGIC_OR_EXPRESSION, result_, pinned_, null);
    return result_ || pinned_;
  }

  /* ********************************************************** */
  // logicAndExpressionWrapper logicOrExpression*
  static boolean logicOrExpressionWrapper(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "logicOrExpressionWrapper")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = logicAndExpressionWrapper(builder_, level_ + 1);
    result_ = result_ && logicOrExpressionWrapper_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // logicOrExpression*
  private static boolean logicOrExpressionWrapper_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "logicOrExpressionWrapper_1")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!logicOrExpression(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "logicOrExpressionWrapper_1", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  /* ********************************************************** */
  // OP_OR | OP_AND | OP_NOT
  public static boolean logicalOperator(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "logicalOperator")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<logical operator>");
    result_ = consumeToken(builder_, OP_OR);
    if (!result_) result_ = consumeToken(builder_, OP_AND);
    if (!result_) result_ = consumeToken(builder_, OP_NOT);
    exit_section_(builder_, level_, marker_, LOGICAL_OPERATOR, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // OP_DEFINED | OP_SIZEOF | OP_STATE | OP_TAGOF
  public static boolean miscOperator(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "miscOperator")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<misc operator>");
    result_ = consumeToken(builder_, OP_DEFINED);
    if (!result_) result_ = consumeToken(builder_, OP_SIZEOF);
    if (!result_) result_ = consumeToken(builder_, OP_STATE);
    if (!result_) result_ = consumeToken(builder_, OP_TAGOF);
    exit_section_(builder_, level_, marker_, MISC_OPERATOR, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // miscOperator BRACKET_PAREN_L? expression BRACKET_PAREN_R?
  public static boolean miscPrefixExpression(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "miscPrefixExpression")) return false;
    boolean result_ = false;
    boolean pinned_ = false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<misc prefix expression>");
    result_ = miscOperator(builder_, level_ + 1);
    pinned_ = result_; // pin = 1
    result_ = result_ && report_error_(builder_, miscPrefixExpression_1(builder_, level_ + 1));
    result_ = pinned_ && report_error_(builder_, expression(builder_, level_ + 1)) && result_;
    result_ = pinned_ && miscPrefixExpression_3(builder_, level_ + 1) && result_;
    exit_section_(builder_, level_, marker_, MISC_PREFIX_EXPRESSION, result_, pinned_, null);
    return result_ || pinned_;
  }

  // BRACKET_PAREN_L?
  private static boolean miscPrefixExpression_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "miscPrefixExpression_1")) return false;
    consumeToken(builder_, BRACKET_PAREN_L);
    return true;
  }

  // BRACKET_PAREN_R?
  private static boolean miscPrefixExpression_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "miscPrefixExpression_3")) return false;
    consumeToken(builder_, BRACKET_PAREN_R);
    return true;
  }

  /* ********************************************************** */
  // arithmeticMultiplicativeOperator prefixExpression
  public static boolean multiplicativeExpression(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "multiplicativeExpression")) return false;
    boolean result_ = false;
    boolean pinned_ = false;
    Marker marker_ = enter_section_(builder_, level_, _LEFT_, "<multiplicative expression>");
    result_ = arithmeticMultiplicativeOperator(builder_, level_ + 1);
    pinned_ = result_; // pin = 1
    result_ = result_ && prefixExpression(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, MULTIPLICATIVE_EXPRESSION, result_, pinned_, null);
    return result_ || pinned_;
  }

  /* ********************************************************** */
  // prefixExpression multiplicativeExpression*
  static boolean multiplicativeExpressionWrapper(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "multiplicativeExpressionWrapper")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = prefixExpression(builder_, level_ + 1);
    result_ = result_ && multiplicativeExpressionWrapper_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // multiplicativeExpression*
  private static boolean multiplicativeExpressionWrapper_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "multiplicativeExpressionWrapper_1")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!multiplicativeExpression(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "multiplicativeExpressionWrapper_1", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  /* ********************************************************** */
  // [OTHER_PUBLIC | OTHER_STOCK] qualifiedIdentifier BRACKET_PAREN_L functionParameterList? BRACKET_PAREN_R functionBlock
  static boolean normalFunctionDeclaration(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "normalFunctionDeclaration")) return false;
    boolean result_ = false;
    boolean pinned_ = false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, null);
    result_ = normalFunctionDeclaration_0(builder_, level_ + 1);
    result_ = result_ && qualifiedIdentifier(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, BRACKET_PAREN_L);
    pinned_ = result_; // pin = 3
    result_ = result_ && report_error_(builder_, normalFunctionDeclaration_3(builder_, level_ + 1));
    result_ = pinned_ && report_error_(builder_, consumeToken(builder_, BRACKET_PAREN_R)) && result_;
    result_ = pinned_ && functionBlock(builder_, level_ + 1) && result_;
    exit_section_(builder_, level_, marker_, null, result_, pinned_, null);
    return result_ || pinned_;
  }

  // [OTHER_PUBLIC | OTHER_STOCK]
  private static boolean normalFunctionDeclaration_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "normalFunctionDeclaration_0")) return false;
    normalFunctionDeclaration_0_0(builder_, level_ + 1);
    return true;
  }

  // OTHER_PUBLIC | OTHER_STOCK
  private static boolean normalFunctionDeclaration_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "normalFunctionDeclaration_0_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, OTHER_PUBLIC);
    if (!result_) result_ = consumeToken(builder_, OTHER_STOCK);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // functionParameterList?
  private static boolean normalFunctionDeclaration_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "normalFunctionDeclaration_3")) return false;
    functionParameterList(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // assignmentOperator | equalityOperator | relationalOperator | arithmeticAdditiveOperator | arithmeticMultiplicativeOperator | logicalOperator | bitwiseOperator | bitwiseShiftOperator | miscOperator
  public static boolean operatorList(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "operatorList")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<operator list>");
    result_ = assignmentOperator(builder_, level_ + 1);
    if (!result_) result_ = equalityOperator(builder_, level_ + 1);
    if (!result_) result_ = relationalOperator(builder_, level_ + 1);
    if (!result_) result_ = arithmeticAdditiveOperator(builder_, level_ + 1);
    if (!result_) result_ = arithmeticMultiplicativeOperator(builder_, level_ + 1);
    if (!result_) result_ = logicalOperator(builder_, level_ + 1);
    if (!result_) result_ = bitwiseOperator(builder_, level_ + 1);
    if (!result_) result_ = bitwiseShiftOperator(builder_, level_ + 1);
    if (!result_) result_ = miscOperator(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, OPERATOR_LIST, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // <<param>> (SYNTAX_COMMA <<param>>)* SYNTAX_COMMA?
  public static boolean optional_comma_list(PsiBuilder builder_, int level_, final Parser param) {
    if (!recursion_guard_(builder_, level_, "optional_comma_list")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = param.parse(builder_, level_);
    result_ = result_ && optional_comma_list_1(builder_, level_ + 1, param);
    result_ = result_ && optional_comma_list_2(builder_, level_ + 1);
    exit_section_(builder_, marker_, OPTIONAL_COMMA_LIST, result_);
    return result_;
  }

  // (SYNTAX_COMMA <<param>>)*
  private static boolean optional_comma_list_1(PsiBuilder builder_, int level_, final Parser param) {
    if (!recursion_guard_(builder_, level_, "optional_comma_list_1")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!optional_comma_list_1_0(builder_, level_ + 1, param)) break;
      if (!empty_element_parsed_guard_(builder_, "optional_comma_list_1", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // SYNTAX_COMMA <<param>>
  private static boolean optional_comma_list_1_0(PsiBuilder builder_, int level_, final Parser param) {
    if (!recursion_guard_(builder_, level_, "optional_comma_list_1_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, SYNTAX_COMMA);
    result_ = result_ && param.parse(builder_, level_);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // SYNTAX_COMMA?
  private static boolean optional_comma_list_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "optional_comma_list_2")) return false;
    consumeToken(builder_, SYNTAX_COMMA);
    return true;
  }

  /* ********************************************************** */
  // OTHER_FORWARD | OTHER_NATIVE | OTHER_PUBLIC | OTHER_STOCK | OTHER_CONST | OTHER_STATIC | OTHER_NEW | OTHER_DECL | OTHER_ENUM | OTHER_STRUCT
  public static boolean otherList(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "otherList")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<other list>");
    result_ = consumeToken(builder_, OTHER_FORWARD);
    if (!result_) result_ = consumeToken(builder_, OTHER_NATIVE);
    if (!result_) result_ = consumeToken(builder_, OTHER_PUBLIC);
    if (!result_) result_ = consumeToken(builder_, OTHER_STOCK);
    if (!result_) result_ = consumeToken(builder_, OTHER_CONST);
    if (!result_) result_ = consumeToken(builder_, OTHER_STATIC);
    if (!result_) result_ = consumeToken(builder_, OTHER_NEW);
    if (!result_) result_ = consumeToken(builder_, OTHER_DECL);
    if (!result_) result_ = consumeToken(builder_, OTHER_ENUM);
    if (!result_) result_ = consumeToken(builder_, OTHER_STRUCT);
    exit_section_(builder_, level_, marker_, OTHER_LIST, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // BRACKET_PAREN_L expression BRACKET_PAREN_R
  public static boolean parenthesizedExpression(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "parenthesizedExpression")) return false;
    if (!nextTokenIs(builder_, BRACKET_PAREN_L)) return false;
    boolean result_ = false;
    boolean pinned_ = false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, null);
    result_ = consumeToken(builder_, BRACKET_PAREN_L);
    pinned_ = result_; // pin = 1
    result_ = result_ && report_error_(builder_, expression(builder_, level_ + 1));
    result_ = pinned_ && consumeToken(builder_, BRACKET_PAREN_R) && result_;
    exit_section_(builder_, level_, marker_, PARENTHESIZED_EXPRESSION, result_, pinned_, null);
    return result_ || pinned_;
  }

  /* ********************************************************** */
  // DIR_PRAGMA (identifier expression | DIR_PRAGMA_DEPRECATED)
  public static boolean pragmaDirective(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "pragmaDirective")) return false;
    if (!nextTokenIs(builder_, DIR_PRAGMA)) return false;
    boolean result_ = false;
    boolean pinned_ = false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, null);
    result_ = consumeToken(builder_, DIR_PRAGMA);
    pinned_ = result_; // pin = 1
    result_ = result_ && pragmaDirective_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, PRAGMA_DIRECTIVE, result_, pinned_, null);
    return result_ || pinned_;
  }

  // identifier expression | DIR_PRAGMA_DEPRECATED
  private static boolean pragmaDirective_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "pragmaDirective_1")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = pragmaDirective_1_0(builder_, level_ + 1);
    if (!result_) result_ = consumeToken(builder_, DIR_PRAGMA_DEPRECATED);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // identifier expression
  private static boolean pragmaDirective_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "pragmaDirective_1_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = identifier(builder_, level_ + 1);
    result_ = result_ && expression(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // prefixExpressionOperator prefixExpression | suffixExpression
  static boolean prefixExpression(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "prefixExpression")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = prefixExpression_0(builder_, level_ + 1);
    if (!result_) result_ = suffixExpression(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // prefixExpressionOperator prefixExpression
  private static boolean prefixExpression_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "prefixExpression_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = prefixExpressionOperator(builder_, level_ + 1);
    result_ = result_ && prefixExpression(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // OP_SUB | OP_DEC | OP_INC | OP_NOT | OP_BITNOT
  public static boolean prefixExpressionOperator(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "prefixExpressionOperator")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_, level_, _LEFT_, "<prefix expression operator>");
    result_ = consumeToken(builder_, OP_SUB);
    if (!result_) result_ = consumeToken(builder_, OP_DEC);
    if (!result_) result_ = consumeToken(builder_, OP_INC);
    if (!result_) result_ = consumeToken(builder_, OP_NOT);
    if (!result_) result_ = consumeToken(builder_, OP_BITNOT);
    exit_section_(builder_, level_, marker_, PREFIX_EXPRESSION_OPERATOR, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // tag? identifier
  public static boolean qualifiedIdentifier(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "qualifiedIdentifier")) return false;
    if (!nextTokenIs(builder_, ID)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = qualifiedIdentifier_0(builder_, level_ + 1);
    result_ = result_ && identifier(builder_, level_ + 1);
    exit_section_(builder_, marker_, QUALIFIED_IDENTIFIER, result_);
    return result_;
  }

  // tag?
  private static boolean qualifiedIdentifier_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "qualifiedIdentifier_0")) return false;
    tag(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // relationalOperator bitwiseOrExpressionWrapper
  public static boolean relationalExpression(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "relationalExpression")) return false;
    boolean result_ = false;
    boolean pinned_ = false;
    Marker marker_ = enter_section_(builder_, level_, _LEFT_, "<relational expression>");
    result_ = relationalOperator(builder_, level_ + 1);
    pinned_ = result_; // pin = 1
    result_ = result_ && bitwiseOrExpressionWrapper(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, RELATIONAL_EXPRESSION, result_, pinned_, null);
    return result_ || pinned_;
  }

  /* ********************************************************** */
  // bitwiseOrExpressionWrapper relationalExpression*
  static boolean relationalExpressionWrapper(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "relationalExpressionWrapper")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = bitwiseOrExpressionWrapper(builder_, level_ + 1);
    result_ = result_ && relationalExpressionWrapper_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // relationalExpression*
  private static boolean relationalExpressionWrapper_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "relationalExpressionWrapper_1")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!relationalExpression(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "relationalExpressionWrapper_1", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  /* ********************************************************** */
  // OP_LT | OP_LT_EQ | OP_GT | OP_GT_EQ
  public static boolean relationalOperator(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "relationalOperator")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<relational operator>");
    result_ = consumeToken(builder_, OP_LT);
    if (!result_) result_ = consumeToken(builder_, OP_LT_EQ);
    if (!result_) result_ = consumeToken(builder_, OP_GT);
    if (!result_) result_ = consumeToken(builder_, OP_GT_EQ);
    exit_section_(builder_, level_, marker_, RELATIONAL_OPERATOR, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // KEY_RETURN expression?
  public static boolean returnStatement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "returnStatement")) return false;
    if (!nextTokenIs(builder_, KEY_RETURN)) return false;
    boolean result_ = false;
    boolean pinned_ = false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, null);
    result_ = consumeToken(builder_, KEY_RETURN);
    pinned_ = result_; // pin = 1
    result_ = result_ && returnStatement_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, RETURN_STATEMENT, result_, pinned_, null);
    return result_ || pinned_;
  }

  // expression?
  private static boolean returnStatement_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "returnStatement_1")) return false;
    expression(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // topLevelDeclaration*
  static boolean sourcepawnFile(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "sourcepawnFile")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!topLevelDeclaration(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "sourcepawnFile", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  /* ********************************************************** */
  // localVarStatement
  //             | ifStatement
  //             | elseStatement
  //             | forStatement
  //             | whileStatement
  //             | doWhileStatement
  //             | returnStatement
  //             | breakStatement
  //             | continueStatement
  //             | switchStatement
  //             | expression
  public static boolean statement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "statement")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<statement>");
    result_ = localVarStatement(builder_, level_ + 1);
    if (!result_) result_ = ifStatement(builder_, level_ + 1);
    if (!result_) result_ = elseStatement(builder_, level_ + 1);
    if (!result_) result_ = forStatement(builder_, level_ + 1);
    if (!result_) result_ = whileStatement(builder_, level_ + 1);
    if (!result_) result_ = doWhileStatement(builder_, level_ + 1);
    if (!result_) result_ = returnStatement(builder_, level_ + 1);
    if (!result_) result_ = breakStatement(builder_, level_ + 1);
    if (!result_) result_ = continueStatement(builder_, level_ + 1);
    if (!result_) result_ = switchStatement(builder_, level_ + 1);
    if (!result_) result_ = expression(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, STATEMENT, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // OTHER_STRUCT identifier BRACKET_CURLY_L structList BRACKET_CURLY_R SYNTAX_SEMICOLON?
  public static boolean structDeclaration(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "structDeclaration")) return false;
    if (!nextTokenIs(builder_, OTHER_STRUCT)) return false;
    boolean result_ = false;
    boolean pinned_ = false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, null);
    result_ = consumeToken(builder_, OTHER_STRUCT);
    pinned_ = result_; // pin = 1
    result_ = result_ && report_error_(builder_, identifier(builder_, level_ + 1));
    result_ = pinned_ && report_error_(builder_, consumeToken(builder_, BRACKET_CURLY_L)) && result_;
    result_ = pinned_ && report_error_(builder_, structList(builder_, level_ + 1)) && result_;
    result_ = pinned_ && report_error_(builder_, consumeToken(builder_, BRACKET_CURLY_R)) && result_;
    result_ = pinned_ && structDeclaration_5(builder_, level_ + 1) && result_;
    exit_section_(builder_, level_, marker_, STRUCT_DECLARATION, result_, pinned_, null);
    return result_ || pinned_;
  }

  // SYNTAX_SEMICOLON?
  private static boolean structDeclaration_5(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "structDeclaration_5")) return false;
    consumeToken(builder_, SYNTAX_SEMICOLON);
    return true;
  }

  /* ********************************************************** */
  // <<optional_comma_list localVarStatement>>
  public static boolean structList(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "structList")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<struct list>");
    result_ = optional_comma_list(builder_, level_ + 1, localVarStatement_parser_);
    exit_section_(builder_, level_, marker_, STRUCT_LIST, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // value suffixExpressionOperator?
  static boolean suffixExpression(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "suffixExpression")) return false;
    boolean result_ = false;
    boolean pinned_ = false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, null);
    result_ = value(builder_, level_ + 1);
    pinned_ = result_; // pin = 1
    result_ = result_ && suffixExpression_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, null, result_, pinned_, null);
    return result_ || pinned_;
  }

  // suffixExpressionOperator?
  private static boolean suffixExpression_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "suffixExpression_1")) return false;
    suffixExpressionOperator(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // OP_DEC | OP_INC
  public static boolean suffixExpressionOperator(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "suffixExpressionOperator")) return false;
    if (!nextTokenIs(builder_, "<suffix expression operator>", OP_DEC, OP_INC)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_, level_, _LEFT_, "<suffix expression operator>");
    result_ = consumeToken(builder_, OP_DEC);
    if (!result_) result_ = consumeToken(builder_, OP_INC);
    exit_section_(builder_, level_, marker_, SUFFIX_EXPRESSION_OPERATOR, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // BRACKET_CURLY_L (switchCase SYNTAX_SEMICOLON?)+ BRACKET_CURLY_R
  public static boolean switchBlock(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "switchBlock")) return false;
    if (!nextTokenIs(builder_, BRACKET_CURLY_L)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, BRACKET_CURLY_L);
    result_ = result_ && switchBlock_1(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, BRACKET_CURLY_R);
    exit_section_(builder_, marker_, SWITCH_BLOCK, result_);
    return result_;
  }

  // (switchCase SYNTAX_SEMICOLON?)+
  private static boolean switchBlock_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "switchBlock_1")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = switchBlock_1_0(builder_, level_ + 1);
    int pos_ = current_position_(builder_);
    while (result_) {
      if (!switchBlock_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "switchBlock_1", pos_)) break;
      pos_ = current_position_(builder_);
    }
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // switchCase SYNTAX_SEMICOLON?
  private static boolean switchBlock_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "switchBlock_1_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = switchCase(builder_, level_ + 1);
    result_ = result_ && switchBlock_1_0_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // SYNTAX_SEMICOLON?
  private static boolean switchBlock_1_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "switchBlock_1_0_1")) return false;
    consumeToken(builder_, SYNTAX_SEMICOLON);
    return true;
  }

  /* ********************************************************** */
  // (KEY_DEFAULT | KEY_CASE) identifier SYNTAX_COLON functionBlock?
  public static boolean switchCase(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "switchCase")) return false;
    if (!nextTokenIs(builder_, "<switch case>", KEY_CASE, KEY_DEFAULT)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<switch case>");
    result_ = switchCase_0(builder_, level_ + 1);
    result_ = result_ && identifier(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, SYNTAX_COLON);
    result_ = result_ && switchCase_3(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, SWITCH_CASE, result_, false, null);
    return result_;
  }

  // KEY_DEFAULT | KEY_CASE
  private static boolean switchCase_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "switchCase_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, KEY_DEFAULT);
    if (!result_) result_ = consumeToken(builder_, KEY_CASE);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // functionBlock?
  private static boolean switchCase_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "switchCase_3")) return false;
    functionBlock(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // KEY_SWITCH parenthesizedExpression switchBlock
  public static boolean switchStatement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "switchStatement")) return false;
    if (!nextTokenIs(builder_, KEY_SWITCH)) return false;
    boolean result_ = false;
    boolean pinned_ = false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, null);
    result_ = consumeToken(builder_, KEY_SWITCH);
    pinned_ = result_; // pin = 1
    result_ = result_ && report_error_(builder_, parenthesizedExpression(builder_, level_ + 1));
    result_ = pinned_ && switchBlock(builder_, level_ + 1) && result_;
    exit_section_(builder_, level_, marker_, SWITCH_STATEMENT, result_, pinned_, null);
    return result_ || pinned_;
  }

  /* ********************************************************** */
  // SYNTAX_ELLIPSIS | SYNTAX_DOT | SYNTAX_QUESTION | SYNTAX_COMMA | SYNTAX_COLON | SYNTAX_SEMICOLON
  public static boolean syntaxList(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "syntaxList")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<syntax list>");
    result_ = consumeToken(builder_, SYNTAX_ELLIPSIS);
    if (!result_) result_ = consumeToken(builder_, SYNTAX_DOT);
    if (!result_) result_ = consumeToken(builder_, SYNTAX_QUESTION);
    if (!result_) result_ = consumeToken(builder_, SYNTAX_COMMA);
    if (!result_) result_ = consumeToken(builder_, SYNTAX_COLON);
    if (!result_) result_ = consumeToken(builder_, SYNTAX_SEMICOLON);
    exit_section_(builder_, level_, marker_, SYNTAX_LIST, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // identifier !WHITE_SPACE SYNTAX_COLON
  public static boolean tag(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "tag")) return false;
    if (!nextTokenIs(builder_, ID)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = identifier(builder_, level_ + 1);
    result_ = result_ && tag_1(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, SYNTAX_COLON);
    exit_section_(builder_, marker_, TAG, result_);
    return result_;
  }

  // !WHITE_SPACE
  private static boolean tag_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "tag_1")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_, level_, _NOT_, null);
    result_ = !consumeToken(builder_, WHITE_SPACE);
    exit_section_(builder_, level_, marker_, null, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // SYNTAX_QUESTION expression SYNTAX_COLON ternaryExpressionWrapper
  public static boolean ternaryExpression(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ternaryExpression")) return false;
    if (!nextTokenIs(builder_, SYNTAX_QUESTION)) return false;
    boolean result_ = false;
    boolean pinned_ = false;
    Marker marker_ = enter_section_(builder_, level_, _LEFT_, null);
    result_ = consumeToken(builder_, SYNTAX_QUESTION);
    pinned_ = result_; // pin = 1
    result_ = result_ && report_error_(builder_, expression(builder_, level_ + 1));
    result_ = pinned_ && report_error_(builder_, consumeToken(builder_, SYNTAX_COLON)) && result_;
    result_ = pinned_ && ternaryExpressionWrapper(builder_, level_ + 1) && result_;
    exit_section_(builder_, level_, marker_, TERNARY_EXPRESSION, result_, pinned_, null);
    return result_ || pinned_;
  }

  /* ********************************************************** */
  // logicOrExpressionWrapper ternaryExpression*
  static boolean ternaryExpressionWrapper(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ternaryExpressionWrapper")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = logicOrExpressionWrapper(builder_, level_ + 1);
    result_ = result_ && ternaryExpressionWrapper_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // ternaryExpression*
  private static boolean ternaryExpressionWrapper_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ternaryExpressionWrapper_1")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!ternaryExpression(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "ternaryExpressionWrapper_1", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  /* ********************************************************** */
  // directiveDeclaration
  //                                 | structDeclaration
  //                                 | enumDeclaration
  //                                 | functionDeclaration
  //                                 | globalVarDeclaration
  static boolean topLevelDeclaration(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "topLevelDeclaration")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = directiveDeclaration(builder_, level_ + 1);
    if (!result_) result_ = structDeclaration(builder_, level_ + 1);
    if (!result_) result_ = enumDeclaration(builder_, level_ + 1);
    if (!result_) result_ = functionDeclaration(builder_, level_ + 1);
    if (!result_) result_ = globalVarDeclaration(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // DIR_UNDEF identifier
  public static boolean undefineDirective(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "undefineDirective")) return false;
    if (!nextTokenIs(builder_, DIR_UNDEF)) return false;
    boolean result_ = false;
    boolean pinned_ = false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, null);
    result_ = consumeToken(builder_, DIR_UNDEF);
    pinned_ = result_; // pin = 1
    result_ = result_ && identifier(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, UNDEFINE_DIRECTIVE, result_, pinned_, null);
    return result_ || pinned_;
  }

  /* ********************************************************** */
  // tag? (literalExpression
  //                         | miscPrefixExpression
  //                         | parenthesizedExpression
  //                         | callExpression
  //                         | arrayExpression
  //                         | identifier)
  static boolean value(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "value")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = value_0(builder_, level_ + 1);
    result_ = result_ && value_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // tag?
  private static boolean value_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "value_0")) return false;
    tag(builder_, level_ + 1);
    return true;
  }

  // literalExpression
  //                         | miscPrefixExpression
  //                         | parenthesizedExpression
  //                         | callExpression
  //                         | arrayExpression
  //                         | identifier
  private static boolean value_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "value_1")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = literalExpression(builder_, level_ + 1);
    if (!result_) result_ = miscPrefixExpression(builder_, level_ + 1);
    if (!result_) result_ = parenthesizedExpression(builder_, level_ + 1);
    if (!result_) result_ = callExpression(builder_, level_ + 1);
    if (!result_) result_ = arrayExpression(builder_, level_ + 1);
    if (!result_) result_ = identifier(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // BRACKET_CURLY_L <<comma_list varBlockStatement>> BRACKET_CURLY_R
  public static boolean varBlock(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "varBlock")) return false;
    if (!nextTokenIs(builder_, BRACKET_CURLY_L)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, BRACKET_CURLY_L);
    result_ = result_ && comma_list(builder_, level_ + 1, varBlockStatement_parser_);
    result_ = result_ && consumeToken(builder_, BRACKET_CURLY_R);
    exit_section_(builder_, marker_, VAR_BLOCK, result_);
    return result_;
  }

  /* ********************************************************** */
  // literalExpression | identifier OP_EQ (identifier | literalExpression)
  public static boolean varBlockStatement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "varBlockStatement")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<var block statement>");
    result_ = literalExpression(builder_, level_ + 1);
    if (!result_) result_ = varBlockStatement_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, VAR_BLOCK_STATEMENT, result_, false, null);
    return result_;
  }

  // identifier OP_EQ (identifier | literalExpression)
  private static boolean varBlockStatement_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "varBlockStatement_1")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = identifier(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, OP_EQ);
    result_ = result_ && varBlockStatement_1_2(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // identifier | literalExpression
  private static boolean varBlockStatement_1_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "varBlockStatement_1_2")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = identifier(builder_, level_ + 1);
    if (!result_) result_ = literalExpression(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // qualifiedIdentifier (BRACKET_SQUARE_L expression? BRACKET_SQUARE_R)*
  public static boolean varDeclarationPart(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "varDeclarationPart")) return false;
    if (!nextTokenIs(builder_, ID)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = qualifiedIdentifier(builder_, level_ + 1);
    result_ = result_ && varDeclarationPart_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, VAR_DECLARATION_PART, result_);
    return result_;
  }

  // (BRACKET_SQUARE_L expression? BRACKET_SQUARE_R)*
  private static boolean varDeclarationPart_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "varDeclarationPart_1")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!varDeclarationPart_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "varDeclarationPart_1", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // BRACKET_SQUARE_L expression? BRACKET_SQUARE_R
  private static boolean varDeclarationPart_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "varDeclarationPart_1_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, BRACKET_SQUARE_L);
    result_ = result_ && varDeclarationPart_1_0_1(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, BRACKET_SQUARE_R);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // expression?
  private static boolean varDeclarationPart_1_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "varDeclarationPart_1_0_1")) return false;
    expression(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // <<comma_list varDeclarationPart>> varInit?
  static boolean varDeclarationPartList(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "varDeclarationPartList")) return false;
    if (!nextTokenIs(builder_, ID)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = comma_list(builder_, level_ + 1, varDeclarationPart_parser_);
    result_ = result_ && varDeclarationPartList_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // varInit?
  private static boolean varDeclarationPartList_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "varDeclarationPartList_1")) return false;
    varInit(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // OP_EQ (expression | varBlock)
  public static boolean varInit(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "varInit")) return false;
    if (!nextTokenIs(builder_, OP_EQ)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, OP_EQ);
    result_ = result_ && varInit_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, VAR_INIT, result_);
    return result_;
  }

  // expression | varBlock
  private static boolean varInit_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "varInit_1")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = expression(builder_, level_ + 1);
    if (!result_) result_ = varBlock(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // KEY_WHILE BRACKET_PAREN_L expression BRACKET_PAREN_R functionBlock
  public static boolean whileStatement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "whileStatement")) return false;
    if (!nextTokenIs(builder_, KEY_WHILE)) return false;
    boolean result_ = false;
    boolean pinned_ = false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, null);
    result_ = consumeTokens(builder_, 1, KEY_WHILE, BRACKET_PAREN_L);
    pinned_ = result_; // pin = 1
    result_ = result_ && report_error_(builder_, expression(builder_, level_ + 1));
    result_ = pinned_ && report_error_(builder_, consumeToken(builder_, BRACKET_PAREN_R)) && result_;
    result_ = pinned_ && functionBlock(builder_, level_ + 1) && result_;
    exit_section_(builder_, level_, marker_, WHILE_STATEMENT, result_, pinned_, null);
    return result_ || pinned_;
  }

  final static Parser expression_parser_ = new Parser() {
    public boolean parse(PsiBuilder builder_, int level_) {
      return expression(builder_, level_ + 1);
    }
  };
  final static Parser funcenumBlockDeclaration_parser_ = new Parser() {
    public boolean parse(PsiBuilder builder_, int level_) {
      return funcenumBlockDeclaration(builder_, level_ + 1);
    }
  };
  final static Parser functionParameter_parser_ = new Parser() {
    public boolean parse(PsiBuilder builder_, int level_) {
      return functionParameter(builder_, level_ + 1);
    }
  };
  final static Parser localVarStatement_parser_ = new Parser() {
    public boolean parse(PsiBuilder builder_, int level_) {
      return localVarStatement(builder_, level_ + 1);
    }
  };
  final static Parser varBlockStatement_parser_ = new Parser() {
    public boolean parse(PsiBuilder builder_, int level_) {
      return varBlockStatement(builder_, level_ + 1);
    }
  };
  final static Parser varDeclarationPart_parser_ = new Parser() {
    public boolean parse(PsiBuilder builder_, int level_) {
      return varDeclarationPart(builder_, level_ + 1);
    }
  };
}
