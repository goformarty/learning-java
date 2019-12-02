package MathExpressionsTree;

public class Subtraction extends NodeBinary {

    public Subtraction(NodeBinary left, NodeBinary right) {
        super(left, right);
    }

    @Override
    public double evaluate() {
        return left.evaluate() - right.evaluate();
    }
}
