package homework3;

public class CalcWithCounter implements ICalcWithCounter {
    long counter = 0;
    private final ICalc calc;

    public CalcWithCounter(ICalc Calc){
        this.calc = Calc;
    }
        public double division( double a, double b){
        this.counter++;
        return this.calc.division(a, b);
    }
    public double multiplication ( double a, double b){
        this.counter++;
        return this.calc.multiplication(a, b);
    }
    public double subtration ( double a, double b){
        this.counter++;
        return this.calc.subtration(a, b);
    }
    public double addition( double a, double b){
        this.counter++;
        return this.calc.addition(a, b);
    }
    public double pov( double a, int b){
        this.counter++;
        return this.calc.pov(a, b);
    }
    public double modyl(double a){
        this.counter++;
        return this.calc.modyl(a);
    }
    public double sqrt(double a){
        this.counter++;
        return this.calc.sqrt(a);
    }
    public long getCounter() {
        return counter;
    }
}
