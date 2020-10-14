package homework2;

import java.util.Scanner;

public class NumberPov {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число(может быть дробным и отрицательным):");
        if(sc.hasNextDouble()){
            double a = sc.nextDouble();
            System.out.println("Введите второе число:");
            if(sc.hasNextInt()){
                int b = sc.nextInt();
                System.out.println(a + " в степени " + b + " = " + Math.pow(a, b));
            }else{
                System.out.println("Вы ввели не целое число !");
            }
        }else{
            System.out.println("Вы ввели не число !");
        }
    }
}

