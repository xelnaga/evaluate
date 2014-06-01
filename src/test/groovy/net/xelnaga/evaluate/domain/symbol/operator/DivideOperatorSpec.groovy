package net.xelnaga.evaluate.domain.symbol.operator

import spock.lang.Specification

class DivideOperatorSpec extends Specification {

    DivideOperator operator

    void setup() {
        operator = new DivideOperator()
    }

    def 'to string'() {

        expect:
            operator.toString() == '/'
    }
}
