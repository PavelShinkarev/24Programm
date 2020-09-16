package homework3;

public class CalculatorWithMathCopyMain {
    public static void main(String[] args) {
        CalculatorWithMathCopy calcCopy = new CalculatorWithMathCopy();
        double calc2 = calcCopy.addition(calcCopy.addition(4.1, calcCopy.multiplication(15, 7)),
                calcCopy.pov(calcCopy.division(28,5), 2));

        System.out.println(calc2);
        System.out.println(calcCopy.division(calc2, 0));
        // Спецификация IEEE с плавающей запятой имеет специальные значения для деления на ноль,
        //  -> одно из них двойное. Бесконечность.
        System.out.println(calcCopy.division(calc2, 0.0d));
    }
}
