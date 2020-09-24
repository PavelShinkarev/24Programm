package homework4.homework4.Generics;

import java.util.Arrays;
import java.util.Comparator;

public class DataContainerMain {
    public static void main(String[] args) {
    DataContainer<Integer> one = new DataContainer<>(Integer.class);
    DataComporator comparator = new DataComporator();
        int a =one.add(28);
        int b =one.add(72);
        int c =one.add(61);
        int d =one.add(21);



        System.out.println(one.toString());
        one.sort(comparator);
        System.out.println(one.toString());


    }
}
