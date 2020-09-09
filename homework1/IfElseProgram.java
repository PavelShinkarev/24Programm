package homework1;

import java.util.Scanner;

public class IfElseProgram {

    public static void main(String[] args) {
        String name1 = "Вася";
        String name2 = "Анастасия";
        Scanner in = new Scanner(System.in);
        System.out.print("Введите Ваше имя: ");
        String name = in.nextLine();
        if (name1.equals(name)) {
            System.out.println("Привет!\nЯ тебя так долго ждал ! ");
        } else if(name2.equals(name)){
            System.out.println("Я тебя так долго ждал !");
        } else{
            System.out.println("Добрый день, а вы кто ?");
        }
    }
}
