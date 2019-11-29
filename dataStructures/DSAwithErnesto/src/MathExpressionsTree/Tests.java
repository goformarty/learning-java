package MathExpressionsTree;

import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class Tests {
    @Test
    public void validAddition() {
        final double valueLeft = 2;
        final double valueRight = 5;
        final Node leftNode = new Constant(valueLeft);
        final Node rightNode = new Constant(valueRight);

        final Node expression =  new Addition(leftNode, rightNode);
        final double result = valueLeft + valueRight;

        assertEquals(result, expression.evaluate(), 0);
    }

}
