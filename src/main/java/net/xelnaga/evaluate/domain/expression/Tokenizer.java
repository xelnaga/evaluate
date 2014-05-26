package net.xelnaga.evaluate.domain.expression;

import java.util.Arrays;
import java.util.List;

public class Tokenizer {

    public List<String> tokenize(String expression) {

        String sanitized = expression.replaceAll("[^0-9\\.\\+\\-\\*/]", "");

        sanitized = sanitized.replaceAll("\\+", " + ");
        sanitized = sanitized.replaceAll("\\-", " - ");
        sanitized = sanitized.replaceAll("\\*", " * ");
        sanitized = sanitized.replaceAll("/", " / ");

        sanitized = sanitized.replaceAll("\\s+", " ");
        sanitized = sanitized.trim();

        return Arrays.asList(sanitized.split(" "));
    }
}
