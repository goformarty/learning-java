package MathExpressionsTree;

public abstract class Node {
    Node left = null;
    Node right = null;

    public Node(Node left, Node right) {
        this.left = left;
        this.right = right;
    }

    public Node getLeft() {
        return left;
    }

    public Node getRight() {
        return right;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public abstract double evaluate();

}
