package net.xelnaga.evaluate.domain.expression

import net.xelnaga.evaluate.domain.symbol.operand.Operand
import net.xelnaga.evaluate.domain.symbol.operator.DivideOperator
import net.xelnaga.evaluate.domain.symbol.operator.MinusOperator
import net.xelnaga.evaluate.domain.symbol.operator.PlusOperator
import net.xelnaga.evaluate.domain.symbol.operator.TimesOperator
import spock.lang.Specification
import spock.lang.Unroll

@Unroll
class SymbolFactorySpec extends Specification {

    SymbolFactory factory

    void setup() {
        factory = new SymbolFactory()
    }

    def 'to symbol with operand [#token]'() {

        expect:
            factory.toSymbol(token) == new Operand(token)

        where:
            token << [
                    '1',
                    '2.',
                    '1.23',
                    '0.23',
                    '.234',
                    '.'
            ]
    }

    def 'to symbol with operator [#token]'() {

        expect:
            factory.toSymbol(token) == operator

        where:
            token | operator
            '+'   | new PlusOperator()
            '-'   | new MinusOperator()
            '*'   | new TimesOperator()
            '/'   | new DivideOperator()
    }

    def 'to symbol with invalid [#token]'() {

        when:
            factory.toSymbol(token)

        then:
            thrown(InvalidSymbolException)

        where:
            token << [
                    'A',
                    'z',
                    'a123',
                    '123a',
                    '1a23',
                    'a+',
                    '+a',
                    '$',
                    '_',
                    '-z',
                    '*z',
                    '/z',
                    '++',
                    '--',
                    '**',
                    '//',
                    '1.23a',
                    'a.123',
                    '12.a3',
                    '..',
                    '1..2',
                    '1..',
                    '..1',
                    '.2.1',
                    '2.1.',
                    '+2',
                    '-2',
                    '*2',
                    '/2'
            ]
    }
}
