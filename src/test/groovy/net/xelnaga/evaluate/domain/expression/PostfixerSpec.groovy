package net.xelnaga.evaluate.domain.expression

import net.xelnaga.evaluate.domain.symbol.Symbol
import net.xelnaga.evaluate.domain.symbol.operand.Operand;
import spock.lang.Specification
import spock.lang.Unroll;

@Unroll
class PostfixerSpec extends Specification {

    Postfixer postfixer

    Tokenizer tokenizer
    Symbolizer symbolizer

    void setup() {

        postfixer = new Postfixer()

        symbolizer = new Symbolizer()
        symbolizer.symbolFactory = new SymbolFactory()

        tokenizer = new Tokenizer()
    }

    def 'postfix [#infix]'() {

        given:
            List<Symbol> symbols = toSymbols(infix)

        expect:
            postfixer.postfix(symbols)*.toString() == postfix


        where:
            infix | postfix
            "1"   | ["1"]
            "1+2" | ["1", "2", "+"]
    }

    private List<Symbol> toSymbols(String expression) {

        List<String> tokens = tokenizer.tokenize(expression)

        return symbolizer.symbolize(tokens)
    }
}
