package net.xelnaga.evaluate.domain.expression

import net.xelnaga.evaluate.domain.operator.Operand;
import spock.lang.Specification
import spock.lang.Unroll;

@Unroll
class PostfixerSpec extends Specification {

    Postfixer postfixer

    void setup() {
        postfixer = new Postfixer();
    }

    def 'postfix [#infix]'() {

        expect:
            postfixer.postfix(infix) == postfix

        where:
            infix              | postfix
            []                 | []
            [new Operand('1')] | [new Operand('1')]
    }
}
