package homework2;

import java.util.Scanner;

public class TaskTwoForEachReverse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int size = input.nextInt();
        int[] array = new int[size];
        System.out.println("Введите элементы массива: ");
        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt();
        }
        System.out.print("Введенные элементы массива: ");
        int n = array.length;
        int b;
        for (int i = 0; i < n/2 ; i++) {
        b = array[n-i-1];
        array[n-i-1] = array[i];
        array[i] = b;
        }
        for (int i : array) {
            System.out.print("  " + i);
        }
    }
}
