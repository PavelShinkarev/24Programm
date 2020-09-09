package homework2;

import java.util.Scanner;

public class TaskTwoForReverse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите размер масива: ");
        if(input.hasNextInt()){
            int size = input.nextInt();
            int[] array = new int[size];
            System.out.println("Введите элементы массива: ");
            for(int i = 0; i< size; i++) {
                if (input.hasNextInt()) {
                    array[i] = input.nextInt();}
                else{
              System.out.println("Вы ввели не целое число ");
                    break;
                }
            }
            System.out.print("Введенные элементы массива: ");
            System.out.print(array[array.length-1]);
            for(int i = array.length-2; i >= 0; i--){
                System.out.print(", " +  array[i]);
                }
        }else{
            System.out.println("Вы ввели не целое число");
        }
    }
}

