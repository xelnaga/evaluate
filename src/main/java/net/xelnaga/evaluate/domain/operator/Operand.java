package net.xelnaga.evaluate.domain.operator;

public class Operand implements Symbol {

    private String value;

    public Operand(String value) {
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

        Operand operand = (Operand) obj;

        return value.equals(operand.value);
    }

    @Override
    public int hashCode() {
        return value.hashCode();
    }
}
