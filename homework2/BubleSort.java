package homework2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class BubleSort {
    public static void main(String[] args) {

        int[] mass1 = {1, 2, 3, 4, 5, 6};
        int[] mass2 = {1, 1, 1, 1};
        int[] mass3 = {9, 1, 5, 99, 9, 9};
        int[] mass4 = {};
        System.out.print("mass1 до сортировки" + Arrays.toString(mass1) + " -> mass1 после сортировки ");
        bubbleSort(mass1);
        System.out.print("mass2 до сортировки" + Arrays.toString(mass2) + " -> mass2 после сортировки ");
        bubbleSort(mass2);
        System.out.print("mass3 до сортировки" + Arrays.toString(mass3) + " -> mass3 после сортировки ");
        bubbleSort(mass3);
        System.out.print("mass4 до сортировки" + Arrays.toString(mass4) + " -> mass4 после сортировки ");
        bubbleSort(mass4);

        Random rand = new Random();
        int[] array = new int[rand.nextInt(10)];
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(10);
        }
        System.out.print("Random array до сортировки" + Arrays.toString(array) + " -> Random array после сортировки ");
        bubbleSort(array);

        Scanner input = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int size = input.nextInt();
        int[] arraySc = new int[size];
        System.out.println("Введите элементы массива: ");
        for (int j = 0; j < size; j++) {
            arraySc[j] = input.nextInt();
        }
        System.out.print("arraySc до сортировки" + Arrays.toString(arraySc) + " -> arraySc после сортировки ");
        bubbleSort(arraySc);


    }
    public static void bubbleSort(int[] mass){
        boolean isSort = true;
        int buffer;
        while (isSort){
            isSort = false;
            for (int i = 0; i < mass.length-1; i++) {
                if(mass[i] > mass[i+1]){
                    isSort = true;

                    buffer = mass[i];
                    mass[i] = mass[i+1];
                    mass[i+1]= buffer;
                }
            }
        }
        System.out.println(Arrays.toString(mass));
    }
}


