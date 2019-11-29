package MathExpressionsTree;

public class Division extends Node {
    public Division(Node left, Node right) {
        super(left, right);
    }

    @Override
    public double evaluate() {
        return left.evaluate() / right.evaluate();
    }
}
