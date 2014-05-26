package net.xelnaga.evaluate.domain.operator;

public class Operator implements Symbol {

    private String value;

    public Operator(String value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Operator operator = (Operator) obj;

        return value.equals(operator.value);
    }

    @Override
    public int hashCode() {
        return value.hashCode();
    }
}
