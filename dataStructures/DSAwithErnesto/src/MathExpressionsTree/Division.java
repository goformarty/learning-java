package MathExpressionsTree;

public class Division extends NodeBinary {
    public Division(NodeBinary left, NodeBinary right) {
        super(left, right);
    }

    @Override
    public double evaluate() {
        return left.evaluate() / right.evaluate();
    }
}
