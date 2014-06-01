package net.xelnaga.evaluate.domain.symbol.operator

import spock.lang.Specification

class PlusOperatorSpec extends Specification {

    PlusOperator operator

    void setup() {
        operator = new PlusOperator()
    }

    def 'is operand'() {

        expect:
            !new PlusOperator().isOperand()
    }

    def 'is operator'() {

        expect:
            new PlusOperator().isOperator()
    }

    def 'to string'() {

        expect:
            operator.toString() == '+'
    }
}
