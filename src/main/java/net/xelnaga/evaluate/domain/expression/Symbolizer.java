package net.xelnaga.evaluate.domain.expression;

import net.xelnaga.evaluate.domain.symbol.Symbol;

import java.util.ArrayList;
import java.util.List;

public class Symbolizer {

    private SymbolFactory symbolFactory;

    public void setSymbolFactory(SymbolFactory symbolFactory) {
        this.symbolFactory = symbolFactory;
    }

    public List<Symbol> symbolize(List<String> tokens) {

        List<Symbol> symbols = new ArrayList<>();

        for (String token : tokens) {

            Symbol symbol = symbolFactory.toSymbol(token);
            symbols.add(symbol);
        }

        return symbols;
    }
}
