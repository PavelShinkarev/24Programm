package homework2;

import java.util.Scanner;

public class TaskWhileReverse {
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
        i = array.length-2;
        System.out.print(array[array.length-1]);
        while(i >= 0){
            System.out.print(", " + array[i]);
            i--;
        }
    }
}
