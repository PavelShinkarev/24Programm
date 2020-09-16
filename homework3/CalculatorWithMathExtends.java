package homework3;

public class CalculatorWithMathExtends extends CalculatorWithOperator {

    @Override
    public double pov(double a, int b) {
        return Math.pow(a, b);
    }

    @Override
    public double modyl(double a) {
        return Math.abs(a);
    }

    @Override
    public double sqrt(double a) {
        return Math.sqrt(a);
    }
}
