package homework2;

public class TaskOneDotOne {

    public static void main(String[] args) {
        System.out.println("Размер массива: " + args.length); // Чтобы знать сколько точно элементов в массиве
        System.out.println("Элемент массива: " + args[0]); // чтоб знать, что именно в массиве
        String s = args[0];
        int a = Integer.parseInt(s);
        int b = 1;
        int i = 2;
        System.out.print(1);
        while (i <= a){
            b*=i;
            System.out.print(" * " + i);
            i++;
        }
        System.out.println(" = " + b);
    }
}