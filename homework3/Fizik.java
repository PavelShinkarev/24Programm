package homework3;

public class Fizik<T extends ICalc> {
    private T calc;


    public Fizik(T calc){
        this.calc = calc;
    }
    public double calc(int a, int b){
        return calc.subtration(a,b);
    }

    public T getCalc() {
        return calc;
    }
}
