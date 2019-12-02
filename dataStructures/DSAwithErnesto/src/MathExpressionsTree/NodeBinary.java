package MathExpressionsTree;

public abstract class NodeBinary {
    NodeBinary left = null;
    NodeBinary right = null;

    public NodeBinary() {}

    public NodeBinary(NodeBinary left, NodeBinary right) {
        this.left = left;
        this.right = right;
    }

    public NodeBinary getLeft() {
        return left;
    }

    public NodeBinary getRight() {
        return right;
    }

    public void setLeft(NodeBinary left) {
        this.left = left;
    }

    public void setRight(NodeBinary right) {
        this.right = right;
    }

    public abstract double evaluate();

}
