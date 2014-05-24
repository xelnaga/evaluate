package net.xelnaga.evaluate.domain.operator;

import java.math.BigDecimal;

public interface Operator {

    BigDecimal operate(BigDecimal operand1, BigDecimal operand2);
}
