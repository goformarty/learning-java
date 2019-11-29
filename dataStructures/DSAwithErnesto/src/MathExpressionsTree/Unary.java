package MathExpressionsTree;

public class Unary extends Node {

    double value;

    public Unary(Node node) {
        super(null, null);
        value = node.evaluate();
    }

    @Override
    public double evaluate() {
        return value * (-1);
    }
}
