package homework2;

public class TaskOneDotTwo {
    public static void main(String[] args) {
        System.out.println("Размер массива: " + args.length);
        System.out.println("Элемент массива: " + args[0]);
        String s = args[0];
        int a = Integer.parseInt(s);
        int c = 0;
        int b = 1;
        char number = s.charAt(0);
        System.out.print(number);
        for( int z = 1; z < s.length(); z++){
            char numberN = s.charAt(z);
            System.out.print(" * " + numberN);
        }
        do{
            c = a % 10;
            a = a / 10;
            b = b * c;
        }while (a != 0);
        System.out.print(" = " + s);
    }
}

