package net.xelnaga.evaluate.domain.symbol.operator

import spock.lang.Specification

class TimesOperatorSpec extends Specification {

    TimesOperator operator

    void setup() {
        operator = new TimesOperator()
    }

    def 'is operand'() {

        expect:
            !new TimesOperator().isOperand()
    }

    def 'is operator'() {

        expect:
            new TimesOperator().isOperator()
    }

    def 'to string'() {

        expect:
            operator.toString() == '*'
    }
}
