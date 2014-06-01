package net.xelnaga.evaluate.domain.expression;

import net.xelnaga.evaluate.domain.symbol.operand.Operand;
import net.xelnaga.evaluate.domain.symbol.operator.*;
import net.xelnaga.evaluate.domain.symbol.Symbol;

public class SymbolFactory {

    public Symbol toSymbol(String token) {

        if (token.matches("^(\\d+)?(\\.)?(\\d+)?$")) {
            return new Operand(token);
        }

        if (token.equals("+")) {
            return new PlusOperator();
        }

        if (token.equals("-")) {
            return new MinusOperator();
        }

        if (token.equals("*")) {
            return new TimesOperator();
        }

        if (token.equals("/")) {
            return new DivideOperator();
        }

        throw new InvalidSymbolException();
    }
}
