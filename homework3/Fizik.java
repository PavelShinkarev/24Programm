package homework3;

public class Fizik {
    private ICalc calc;

    public Fizik(ICalc calc){
        this.calc = calc;
    }
    public double calc(int a, int b){
        return calc.subtration(a,b);
    }

    public ICalc getCalc() {
        return calc;
    }
}
