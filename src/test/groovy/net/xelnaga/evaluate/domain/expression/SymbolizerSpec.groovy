package net.xelnaga.evaluate.domain.expression

import net.xelnaga.evaluate.domain.symbol.Symbol
import spock.lang.Specification
import spock.lang.Unroll

@Unroll
class SymbolizerSpec extends Specification {

    Symbolizer symbolizer

    SymbolFactory mockSymbolFactory

    void setup() {

        symbolizer = new Symbolizer()

        mockSymbolFactory = Mock(SymbolFactory)
        symbolizer.symbolFactory = mockSymbolFactory
    }

    def 'to symbols'() {

        given:
            List<String> tokens = [
                    'token1',
                    'token2',
                    'token3'
            ]

            List<Symbol> mockSymbols = [
                    Mock(Symbol),
                    Mock(Symbol),
                    Mock(Symbol)
            ]

        when:
            List<Symbol> result = symbolizer.toSymbols(tokens)

        then:
            1 * mockSymbolFactory.toSymbol('token1') >> mockSymbols[0]
        then:
            1 * mockSymbolFactory.toSymbol('token2') >> mockSymbols[1]
        then:
            1 * mockSymbolFactory.toSymbol('token3') >> mockSymbols[2]
            0 * _._

        and:
            result == mockSymbols
    }
}
