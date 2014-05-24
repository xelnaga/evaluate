package net.xelnaga.evaluate.domain.operator

import net.xelnaga.evaluate.domain.operator.MinusOperator
import spock.lang.Specification
import spock.lang.Unroll

@Unroll
class MinusOperatorSpec extends Specification {

    MinusOperator operator

    void setup() {
        operator = new MinusOperator()
    }

    def 'operate [#o1, #o2]'() {

        given:
            BigDecimal operand1 = new BigDecimal(o1)
            BigDecimal operand2 = new BigDecimal(o2)

        expect:
            operator.operate(operand1, operand2) == new BigDecimal(result)

        where:
            o1      | o2      | result
            '2.34'  | '1.27'  | '1.07'
            '4.56'  | '-3.45' | '8.01'
            '-3.34' | '8.45'  | '-11.79'
            '4.56'  | '6.23'  | '-1.67'
            '0.00'  | '0.00'  | '0.00'
    }
}
