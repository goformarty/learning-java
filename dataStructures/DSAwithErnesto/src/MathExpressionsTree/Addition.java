package MathExpressionsTree;

public class Addition extends Node {

    public Addition(Node left, Node right) {
        super(left, right);
    }

    @Override
    public double evaluate() {
        return left.evaluate() + right.evaluate();
    }
}
