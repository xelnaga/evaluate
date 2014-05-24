package net.xelnaga.evaluate.domain.expression

import spock.lang.Specification
import spock.lang.Unroll

@Unroll
class ExpressionTokenizerSpec extends Specification {

    ExpressionTokenizer tokenizer

    void setup() {
        tokenizer = new ExpressionTokenizer()
    }

    def 'tokenize [#expression]'() {

        expect:
            tokenizer.tokenize(expression) == tokens

        where:
            expression            | tokens
            '1'                   | ['1']
            '1 +'                 | ['1', '+']
            '3 - 5'               | ['3', '-', '5']
            '1 + 1'               | ['1', '+', '1']
            ' 9 * 3'              | ['9', '*', '3']
            '1 / 4 '              | ['1', '/', '4']
            '1*3+5'               | ['1', '*', '3', '+', '5']
            ' -3 / 6*8'           | ['-', '3', '/', '6', '*', '8']
            '1.23 + 0.45'         | ['1.23', '+', '0.45']
            '0.69/-2.34'          | ['0.69', '/', '-', '2.34']
            '0.233333*-4.5566   ' | ['0.233333', '*', '-', '4.5566']
            '234.35*6-14+45.697'  | ['234.35', '*', '6', '-', '14', '+', '45.697']
    }
}
