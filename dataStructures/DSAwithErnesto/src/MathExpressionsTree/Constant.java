package MathExpressionsTree;

public class Constant extends NodeBinary {

    private double value;

    public Constant(double value) {
        super();
        this.value = value;
    }

    @Override
    public double evaluate() {
        return value;
    }
}
