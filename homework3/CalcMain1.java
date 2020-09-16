package homework3;

public class CalcMain1 {
    public static void main(String[] args) {
        CalculatorWithOperator calc1 = new CalculatorWithOperator();
        CalculatorWithMathCopy calc2 = new CalculatorWithMathCopy();
        CalculatorWithMathExtends clac3 = new CalculatorWithMathExtends();
        ICalc calc4 = calc1;

        Fizik fizik1 = new Fizik(calc1);
        double calcResult = fizik1.calc(123, 77);
        System.out.println(calcResult);

        ICalcWithCounter calc5 = new CalcWithCounter(calc4);
        CalcWithCounter calc6 = new CalcWithCounter(calc1);
        CalcWithCounter calc7 = new CalcWithCounter(calc4);

        Fizik fizik2 = new Fizik(calc5);
        double calcResult2 = fizik2.calc(123, 77);
        System.out.println(calcResult2);
        System.out.println(calc5.getCounter());

        Fizik fizik3 = new Fizik(new CalcWithCounter(calc1));
        double calcResult3 = fizik3.calc(123, 77);
        ICalcWithCounter savedCalc = (ICalcWithCounter) fizik3.getCalc();

        System.out.println(calcResult3);
        System.out.println(savedCalc.getCounter());

        Fizik fizik4 = new Fizik(calc1);
        double calcResult4 = fizik4.calc(123, 77);
  //      ICalcWithCounter savedCalc4 = (ICalcWithCounter) fizik4.getCalc();

        System.out.println(calcResult4);
  //      System.out.println(savedCalc.getCounter());
   //     System.out.println(((ICalcWithCounter) fizik4.getCalc()).getCounter());
        ICalc savedCalc4 = fizik4.getCalc();
        if(savedCalc4 instanceof ICalcWithCounter){
            System.out.println(((ICalcWithCounter) fizik4.getCalc()).getCounter());
        }
    }
}
