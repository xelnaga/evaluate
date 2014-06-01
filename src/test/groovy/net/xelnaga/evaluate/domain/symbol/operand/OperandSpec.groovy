package net.xelnaga.evaluate.domain.symbol.operand

import spock.lang.Specification

class OperandSpec extends Specification {

    def 'is operand'() {

        expect:
            new Operand('1.23').isOperand()
    }

    def 'is operator'() {

        expect:
            !new Operand('1.23').isOperator()
    }
}
