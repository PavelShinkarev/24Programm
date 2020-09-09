package homework2;

import java.util.Scanner;

public class TaskDoWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int size = input.nextInt();
        int[] array = new int[size];
        System.out.println("Введите элементы массива: ");
        int i = 0;
        do {
            array[i] = input.nextInt();
            i++;
        }while (i < size);
        System.out.print("Введенные элементы массива: ");
        i = 1;
        System.out.print(array[0]);
        do {
            System.out.print(", " + array[i]);
            i++;
        }while (i < size);
    }
}
