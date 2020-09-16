package homework3;

public class CalculatorWithMathExtendsMain {
    public static void main(String[] args) {
        CalculatorWithMathExtends calcEx = new CalculatorWithMathExtends();
        double calc3 = calcEx.addition(calcEx.addition(4.1, calcEx.multiplication(15, 7)),
                calcEx.pov(calcEx.division(28,5), 2));

        System.out.println(calc3);
        System.out.println(calcEx.division(calc3, 0));
        // Спецификация IEEE с плавающей запятой имеет специальные значения для деления на ноль,
        //  -> одно из них двойное. Бесконечность.
        System.out.println(calcEx.division(calc3, 0.0d));
    }
}
