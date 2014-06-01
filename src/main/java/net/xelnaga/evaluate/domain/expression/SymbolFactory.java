package net.xelnaga.evaluate.domain.expression;

import net.xelnaga.evaluate.domain.symbol.Symbol;
import net.xelnaga.evaluate.domain.symbol.operand.Operand;
import net.xelnaga.evaluate.domain.symbol.operator.DivideOperator;
import net.xelnaga.evaluate.domain.symbol.operator.MinusOperator;
import net.xelnaga.evaluate.domain.symbol.operator.PlusOperator;
import net.xelnaga.evaluate.domain.symbol.operator.TimesOperator;

public class SymbolFactory {

    private static final String OPERAND_REGEX = "^(\\d+)?(\\.)?(\\d+)?$";

    private static final String PLUS_CHARACTER = "+";
    private static final String MINUS_CHARACTER = "-";
    private static final String TIMES_CHARACTER = "*";
    private static final String DIVIDE_CHARACTER = "/";

    private static final Symbol PLUS_OPERATOR = new PlusOperator();
    private static final Symbol MINUS_OPERATOR = new MinusOperator();
    private static final Symbol TIMES_OPERATOR = new TimesOperator();
    private static final Symbol DIVIDE_OPERATOR = new DivideOperator();

    public Symbol toSymbol(String token) {

        if (token.matches(OPERAND_REGEX)) {
            return new Operand(token);
        }

        if (token.equals(PLUS_CHARACTER)) {
            return PLUS_OPERATOR;
        }

        if (token.equals(MINUS_CHARACTER)) {
            return MINUS_OPERATOR;
        }

        if (token.equals(TIMES_CHARACTER)) {
            return TIMES_OPERATOR;
        }

        if (token.equals(DIVIDE_CHARACTER)) {
            return DIVIDE_OPERATOR;
        }

        throw new InvalidSymbolException();
    }
}
