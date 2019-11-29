package MathExpressionsTree;

public class Multiplication extends Node {

    public Multiplication(Node left, Node right) {
        super(left, right);
    }

    @Override
    public double evaluate() {
        return left.evaluate() * right.evaluate();
    }
}
