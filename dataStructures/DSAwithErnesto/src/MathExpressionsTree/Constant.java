package MathExpressionsTree;

public class Constant extends Node {

    private double value;

    public Constant(double value) {
        super(null, null);
        this.value = value;
    }

    @Override
    public double evaluate() {
        return value;
    }
}
