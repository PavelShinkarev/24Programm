/* Задача № 4 из рабочей тетради.
    Написать метод, который принимает 2 числа. Совершает эти (a + b) + (a * b) операции
    и возвращает полученный результат из метода.
 */
package practic;

import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {
         int sum = getNumber();
         System.out.println("Результат " + sum);
    }
    public static int getNumber() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите первое число ");
        int a = in.nextInt();
        System.out.println("Введите второе число ");
        int b = in.nextInt();

        int sum = (a + b) + (a * b);
        return sum;
    }
}
