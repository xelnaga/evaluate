package net.xelnaga.evaluate.domain.symbol.operator

import spock.lang.Specification

class MinusOperatorSpec extends Specification {

    MinusOperator operator

    void setup() {
        operator = new MinusOperator()
    }

    def 'is operand'() {

        expect:
            !new MinusOperator().isOperand()
    }

    def 'is operator'() {

        expect:
            new MinusOperator().isOperator()
    }

    def 'to string'() {

        expect:
            operator.toString() == '-'
    }
}
