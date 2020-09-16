package homework3;

public class CalcWithCounter1 {
    int counter = 0;
    private final CalculatorWithOperator calc1;
    private final CalculatorWithMathCopy calc2;
    private final CalculatorWithMathExtends calc3;

    public CalcWithCounter1(CalculatorWithOperator Calc){
        this.calc1 = Calc;
        this.calc2 = null;
        this.calc3 = null;
    }

    public CalcWithCounter1(CalculatorWithMathCopy Calc){
        this.calc1 = null;
        this.calc2 = Calc;
        this.calc3 = null;
    }

    public CalcWithCounter1(CalculatorWithMathExtends Calc){
        this.calc1 = null;
        this.calc2 = null;
        this.calc3 = Calc;
    }

    public double division( double a, double b){
        this.counter++;
        if(this.calc1 != null){
            return this.calc1.division(a,b);
        } else if( this.calc2 != null ){
            return this.calc2.division(a, b);
        } else {
            return this.calc3.division(a,b);
        }
    }

    public double multiplication ( double a, double b){
        this.counter++;
        if(this.calc1 != null){
            return this.calc1.multiplication(a,b);
        } else if( this.calc2 != null ){
            return this.calc2.multiplication(a, b);
        } else {
            return this.calc3.multiplication(a,b);
        }
    }

    public double subtration ( double a, double b){
        this.counter++;
        if(this.calc1 != null){
            return this.calc1.subtration(a,b);
        } else if( this.calc2 != null ){
            return this.calc2.subtration(a, b);
        } else {
            return this.calc3.subtration(a,b);
        }
    }

    public double addition( double a, double b){
        this.counter++;
        if(this.calc1 != null){
            return this.calc1.addition(a,b);
        } else if( this.calc2 != null ){
            return this.calc2.addition(a, b);
        } else {
            return this.calc3.addition(a,b);
        }
    }

    public double pov( double a, int b){
        this.counter++;
        if(this.calc1 != null){
            return this.calc1.pov(a,b);
        } else if( this.calc2 != null ){
            return this.calc2.pov(a, b);
        } else {
            return this.calc3.pov(a,b);
        }
    }

    public double modyl(double a){
        this.counter++;
        if(this.calc1 != null){
            return this.calc1.modyl(a);
        } else if( this.calc2 != null ){
            return this.calc2.modyl(a);
        } else {
            return this.calc3.modyl(a);
        }
    }

    public double sqrt(double a){
        this.counter++;
        if(this.calc1 != null){
            return this.calc1.sqrt(a);
        } else if( this.calc2 != null ){
            return this.calc2.sqrt(a);
        } else {
            return this.calc3.sqrt(a);
        }
    }
}
