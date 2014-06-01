package net.xelnaga.evaluate.domain.symbol.operator;

public abstract class BaseOperator implements Operator {

    @Override
    public boolean equals(Object obj) {
        return getClass().equals(obj.getClass());
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
