package homework3;

public class CalculatorWithOperatorMain {
    public static void main(String[] args) {
        CalculatorWithOperator calc = new CalculatorWithOperator();
        double calc1 = calc.addition(calc.addition(4.1, calc.multiplication(15, 7)),
                calc.pov(calc.division(28,5), 2));

        System.out.println(calc1);
        System.out.println(calc.division(calc1,0 ));
        // Спецификация IEEE с плавающей запятой имеет специальные значения для деления на ноль,
        //  -> одно из них двойное. Бесконечность.
        System.out.println(calc.division(calc1,0.0d ));
    }
}
