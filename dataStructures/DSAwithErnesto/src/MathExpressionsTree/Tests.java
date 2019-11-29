package MathExpressionsTree;

import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class Tests {
    @Test
    public void validAddition() {
        // 2 + 5
        final double valueLeft = 2;
        final double valueRight = 5;
        final Node leftNode = new Constant(valueLeft);
        final Node rightNode = new Constant(valueRight);

        final Node expression =  new Addition(leftNode, rightNode);
        final double result = valueLeft + valueRight;

        assertEquals(result, expression.evaluate(), 0);
    }

    @Test
    public void validUnary() {
        // -(2 + (3 * 5))
        // -17

        final Node expression =  new Unary(
                new Addition(
                        new Constant(2),
                        new Multiplication(
                                new Constant(3),
                                new Constant(5)
                        )
                )

        );

        final double result = -17;

        assertEquals(result, expression.evaluate(), 0);
    }

}
