package MathExpressionsTree;

public class Addition extends NodeBinary {

    public Addition(NodeBinary left, NodeBinary right) {
        super(left, right);
    }

    @Override
    public double evaluate() {
        return left.evaluate() + right.evaluate();
    }
}
