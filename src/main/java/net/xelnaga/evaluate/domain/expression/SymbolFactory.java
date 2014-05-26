package net.xelnaga.evaluate.domain.expression;

import net.xelnaga.evaluate.domain.operator.Operand;
import net.xelnaga.evaluate.domain.operator.Operator;
import net.xelnaga.evaluate.domain.operator.Symbol;

public class SymbolFactory {

    public Symbol toSymbol(String token) {

        if (token.matches("^(\\d+)?(\\.)?(\\d+)?$")) {
            return new Operand(token);
        }

        if (token.matches("^[\\+\\-\\*/]$")) {
            return new Operator(token);
        }

        throw new InvalidSymbolException();
    }
}
