package homework2;

import java.util.Scanner;

public class TaskTwoWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ввидите размер массива: ");
        int size = input.nextInt();
        int[] array = new int[size];
        System.out.println("Введите элементы массива: ");
        int i = 0;
        while(i < size){
            array[i] = input.nextInt();
            i++;
        }
        System.out.print("Введенные элементы массива: ");
        i = 1;
        System.out.print(array[0]);
        while(i<size){
            System.out.print(", " + array[i]);
            i++;
        }
    }
}
