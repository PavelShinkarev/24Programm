package homework3;

public class CalculatorWithOperator implements ICalc {
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
        double st = 1;
        if(b == 0){
            return 1;
        }else {
            for (int i = 1; i <= b; i++) {
                st = st * a;
            }
        }
        return st;
    }
    public double modyl( double a){
        if(a <= 0){
            a = a * -1;
        }
        return a;
    }
    public double sqrt(double a){
        double temp;
        double x = a / 2;
        do {
            temp = x;
            x =(temp + (a / temp))/2;
        }while ((temp - x) != 0);
        return x;
    }
}
