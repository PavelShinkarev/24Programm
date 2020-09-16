package homework3;

public class CalculatorWithMathCopy implements ICalc {
    public double division( double a, double b){
        double div = a / b;
        return  div;
    }
    public double multiplication ( double a, double b){
        double multi = a * b;
        return multi;
    }
    public double subtration ( double a, double b){
        double sub = a - b;
        return sub;
    }
    public double addition( double a, double b){
        double add = a + b;
        return add;
    }
    public double pov( double a, int b){
        return Math.pow(a, b);
        }
    public double modyl(double a){
        return Math.abs(a);
    }
    public double sqrt(double a){
        return Math.sqrt(a);
    }
}
