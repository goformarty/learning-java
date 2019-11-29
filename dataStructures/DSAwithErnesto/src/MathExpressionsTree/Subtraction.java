package MathExpressionsTree;

public class Subtraction extends Node {

    public Subtraction(Node left, Node right) {
        super(left, right);
    }

    @Override
    public double evaluate() {
        return left.evaluate() - right.evaluate();
    }
}
