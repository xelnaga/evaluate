package net.xelnaga.evaluate.domain.operator;

import java.math.BigDecimal;

public class PlusOperator implements Operator {

    @Override
    public BigDecimal operate(BigDecimal operand1, BigDecimal operand2) {
        return operand1.add(operand2);
    }
}
