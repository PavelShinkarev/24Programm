package homework2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ShakeSort {
    public static void main(String[] args) {

        int[] mass1 = {1, 2, 3, 4, 5, 6};
        int[] mass2 = {1, 1, 1, 1};
        int[] mass3 = {9, 1, 5, 99, 9, 9};
        int[] mass4 = {};
        System.out.print("mass1 до сортировки" + Arrays.toString(mass1) + " -> mass1 после сортировки ");
        shakerSort(mass1);
        System.out.print("mass2 до сортировки" + Arrays.toString(mass2) + " -> mass2 после сортировки ");
        shakerSort(mass2);
        System.out.print("mass3 до сортировки" + Arrays.toString(mass3) + " -> mass3 после сортировки ");
        shakerSort(mass3);
        System.out.print("mass4 до сортировки" + Arrays.toString(mass4) + " -> mass4 после сортировки ");
        shakerSort(mass4);

        Random rand = new Random();
        int[] array = new int[rand.nextInt(10)];
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(10);
        }
        System.out.print("Random array до сортировки" + Arrays.toString(array) + " -> Random array после сортировки ");
        shakerSort(array);

        Scanner input = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int size = input.nextInt();
        int[] arraySc = new int[size];
        System.out.println("Введите элементы массива: ");
        for (int j = 0; j < size; j++) {
            arraySc[j] = input.nextInt();
        }
        System.out.print("arraySc до сортировки" + Arrays.toString(arraySc) + " -> arraySc после сортировки ");
        shakerSort(arraySc);

    }
    public static void shakerSort(int[] array) {
        int temp;
        int leftSide = 0;
        int rightSide = array.length - 1;
        do {
            for (int i = leftSide; i < rightSide; i++) {
                if (array[i] > array[i + 1]) {
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
            }
            rightSide--;
            for (int i = rightSide; i > leftSide; i--) {
                if (array[i] < array[i - 1]) {
                    temp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = temp;
                }
            }
            leftSide++;
        } while (leftSide < rightSide);
        System.out.println(Arrays.toString(array));
    }
}
