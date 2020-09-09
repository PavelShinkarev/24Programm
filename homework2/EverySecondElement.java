package homework2;

import java.util.Scanner;

public class EverySecondElement {
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
        System.out.print("Каждый второй элемент массива: ");
        System.out.print(array[1]);
        for(i = 2; i < size; i++){
            if (i % 2 != 0) {
                System.out.print(", " + array[i] );
            }
        }
    }
}


