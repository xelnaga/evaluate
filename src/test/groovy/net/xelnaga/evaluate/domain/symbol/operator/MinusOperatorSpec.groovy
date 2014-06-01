package net.xelnaga.evaluate.domain.symbol.operator

import spock.lang.Specification

class MinusOperatorSpec extends Specification {

    MinusOperator operator

    void setup() {
        operator = new MinusOperator()
    }

    def 'to string'() {

        expect:
            operator.toString() == '-'
    }
}
