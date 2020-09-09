package homework2;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class TaskTwoForEach {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int size = input.nextInt();
        int[] array = new int[size];
        System.out.println("Введите элементы массива: ");
        for(int i = 0; i < size; i++ ){
        array[i] = input.nextInt();
        }
        System.out.print("Введенные элементы массива: ");
        for (int i : array) {
            System.out.print("  " + i);
        }
    }
}
