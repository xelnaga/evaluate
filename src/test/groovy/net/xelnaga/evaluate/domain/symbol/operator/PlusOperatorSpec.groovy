package net.xelnaga.evaluate.domain.symbol.operator

import spock.lang.Specification

class PlusOperatorSpec extends Specification {

    PlusOperator operator

    void setup() {
        operator = new PlusOperator()
    }

    def 'to string'() {

        expect:
            operator.toString() == '+'
    }
}
