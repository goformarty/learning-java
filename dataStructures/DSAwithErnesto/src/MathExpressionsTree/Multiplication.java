package MathExpressionsTree;

public class Multiplication extends NodeBinary {

    public Multiplication(NodeBinary left, NodeBinary right) {
        super(left, right);
    }

    @Override
    public double evaluate() {
        return left.evaluate() * right.evaluate();
    }
}
