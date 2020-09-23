package homework4.homework4.Generics;

public class DataContainerMain {
    public static void main(String[] args) {
    DataContainer<Integer> one = new DataContainer<>(Integer.class);
        int a =one.add(48);
        int b =one.add(555);
        int c =one.add(61);
        int d =one.add(68);
        System.out.println(one.toString());
        one.delete(3);
        System.out.println(one.toString());



    }
}
