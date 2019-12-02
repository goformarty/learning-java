package MathExpressionsTree;

public class Unary extends NodeBinary {

    NodeBinary singleNode;

    public Unary(NodeBinary nodeBinary) {
        super();
        this.singleNode = nodeBinary;
    }

    @Override
    public double evaluate() {
        return singleNode.evaluate() * (-1);
    }
}
