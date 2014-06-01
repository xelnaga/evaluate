package net.xelnaga.evaluate.domain.expression;

import net.xelnaga.evaluate.domain.symbol.Symbol;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class Postfixer {

    public List<Symbol> postfix(List<Symbol> infix) {

        List<Symbol> postfix = new ArrayList<>();
        Queue<Symbol> operators = new ArrayDeque<>();

        for (Symbol symbol : infix) {

            if (symbol.isOperand()) {
                postfix.add(symbol);
                continue;
            }

            if (symbol.isOperator()) {
                operators.add(symbol);
            }
        }

        while (!operators.isEmpty()) {
            Symbol operator = operators.remove();
            postfix.add(operator);
        }

        return postfix;
    }
}
