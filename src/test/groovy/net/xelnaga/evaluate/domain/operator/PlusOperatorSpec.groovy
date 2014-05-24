package net.xelnaga.evaluate.domain.operator

import net.xelnaga.evaluate.domain.operator.PlusOperator
import spock.lang.Specification
import spock.lang.Unroll

@Unroll
class PlusOperatorSpec extends Specification {

    PlusOperator operator

    void setup() {
        operator = new PlusOperator()
    }

    def 'operate [#o1, #o2]'() {

        given:
            BigDecimal operand1 = new BigDecimal(o1)
            BigDecimal operand2 = new BigDecimal(o2)

        expect:
            operator.operate(operand1, operand2) == new BigDecimal(result)

        where:
            o1      | o2      | result
            '2.34'  | '1.27'  | '3.61'
            '4.56'  | '-3.45' | '1.11'
            '-3.34' | '8.45'  | '5.11'
            '4.56'  | '6.23'  | '10.79'
            '0.00'  | '0.00'  | '0.00'
    }
}
