package MathExpressionsTree;

import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class Tests {
    @Test
    public void validAddition() {
        // 2 + 5
        final double valueLeft = 2;
        final double valueRight = 5;
        final NodeBinary leftNodeBinary = new Constant(valueLeft);
        final NodeBinary rightNodeBinary = new Constant(valueRight);

        final NodeBinary expression =  new Addition(leftNodeBinary, rightNodeBinary);
        final double result = valueLeft + valueRight;

        assertEquals(result, expression.evaluate(), 0);
    }

    @Test
    public void validUnary() {
        // -(2 + (3 * 5))
        // -17

        final NodeBinary expression =  new Unary(
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
