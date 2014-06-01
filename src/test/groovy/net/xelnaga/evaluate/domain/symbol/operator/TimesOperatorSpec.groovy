package net.xelnaga.evaluate.domain.symbol.operator

import spock.lang.Specification

class TimesOperatorSpec extends Specification {

    TimesOperator operator

    void setup() {
        operator = new TimesOperator()
    }

    def 'to string'() {

        expect:
            operator.toString() == '*'
    }
}
