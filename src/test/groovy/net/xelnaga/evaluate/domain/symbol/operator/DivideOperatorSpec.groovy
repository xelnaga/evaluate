package net.xelnaga.evaluate.domain.symbol.operator

import spock.lang.Specification

class DivideOperatorSpec extends Specification {

    DivideOperator operator

    void setup() {
        operator = new DivideOperator()
    }

    def 'is operand'() {

        expect:
            !new DivideOperator().isOperand()
    }

    def 'is operator'() {

        expect:
            new DivideOperator().isOperator()
    }

    def 'to string'() {

        expect:
            operator.toString() == '/'
    }
}
