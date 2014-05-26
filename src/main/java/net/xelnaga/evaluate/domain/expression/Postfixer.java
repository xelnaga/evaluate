package net.xelnaga.evaluate.domain.expression;

import java.util.ArrayList;
import java.util.List;

public class Postfixer {

    public List<Object> postfix(List<Object> infix) {

        List<Object> postfix = new ArrayList<>();
        for (Object element : infix) {
            postfix.add(element);
        }

        return postfix;
    }
}
