package net.xelnaga.evaluate.domain.operator;

import java.math.BigDecimal;

public class MinusOperator implements Operator {

    @Override
    public BigDecimal operate(BigDecimal operand1, BigDecimal operand2) {
        return operand1.subtract(operand2);
    }
}
