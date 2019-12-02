package MathExpressionsTree;

import java.util.ArrayList;
import java.util.List;

public abstract class Node {
    List<Node> children;

    public Node() {
        this.children = new ArrayList<>();
    }

    public Node(ArrayList<Node> children) {
        this.children = children;
    }

    public abstract double evaluate();

    public void addChild(Node child) {
        this.children.add(child);
    }
}
