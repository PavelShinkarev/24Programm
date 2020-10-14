package homework4.homework4.Generics;

import java.util.Arrays;
import java.util.Comparator;

public class DataContainerMain {
    public static void main(String[] args) {
    DataContainer<Integer> one = new DataContainer<>(Integer.class);
    DataComporator comparator = new DataComporator();
        int g =one.add(897);
        int a =one.add(28);
        int b =one.add(72);
        int c =one.add(61);
        int d =one.add(21);
        int у =one.add(11);
        System.out.println(Arrays.toString(one.getItems()));
        System.out.println("размер массива - " + one.getLenght());
        one.deleteItem(61);
        System.out.println(one.toString(one.getItems())); // используем override toString, который не изменяет data
        System.out.println("размер массива - " + one.getLenght());
        one.sort(comparator); // используем sort который удаляет из data ячеки с null
        System.out.println(one.toString(one.getItems()));
        System.out.println("размер массива - " + one.getLenght());


    }
}
