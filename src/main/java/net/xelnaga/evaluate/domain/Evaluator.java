package net.xelnaga.evaluate.domain;

import net.xelnaga.evaluate.domain.expression.Symbolizer;
import net.xelnaga.evaluate.domain.expression.Tokenizer;
import net.xelnaga.evaluate.domain.symbol.Symbol;

import java.math.BigDecimal;
import java.util.List;

public class Evaluator {

    private Tokenizer tokenizer;
    private Symbolizer symbolizer;

    void setTokenizer(Tokenizer tokenizer) {
        this.tokenizer = tokenizer;
    }

    void setSymbolizer(Symbolizer symbolizer) {
        this.symbolizer = symbolizer;
    }

    public BigDecimal evaluate(String expression) {

        List<String> tokens = tokenizer.tokenize(expression);
        List<Symbol> symbols = symbolizer.toSymbols(tokens);

        return null;
    }
}
