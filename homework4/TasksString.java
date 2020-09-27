package homework4;

import java.util.Scanner;

import static homework4.Numbers.DOUBLE;
import static homework4.Numbers.MAIN;

public class TasksString {
    private static final String[] UNITS = {"\b","один","два","три","четыре","пять","шесть","семь","восемь",
            "девять","деcять","одинадцать","двенадцать","тринадцать","четырнадцать","пятнадцать","шестнадцать",
            "семнадцать","восемнадцать","девятнадцать"};
    private static final String[] TEN = {"\b","десять","двадцать","тридцать","сорок", "пятьдесят", "шестьдесят",
            "семьдесят", "восемьдесят", "девяноста"};
    private static final String[] HUND = {"\b","сто","двести","триста","четыреста", "пятьсот", "шестьсот",
            "семьсот", "восемьсот", "девятьсот"};
    private static final String[] THOUSun = {"\b","одна тысяча","две тысячи", "три тысячи","четыри тысячи","пять тысяч",
            "шесть тысяч","семь тысяч", "восемь тысяч","девять тысяч"};
    private static final String[] THOUS = {"\b","тысяча","тысячи", "тысячи","тысячи","тысяч",
            "тысяч","тысяч", "тысяч","тысяч"};
    private static final String[] MILLION = {"\b","миллион","миллиона", "миллиона","миллиона","миллионов",
            "миллионов","миллионов", "миллионов","миллионов"};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число от -999_999_999.9999 до 999_999_999.9999");
        if(scanner.hasNextInt()){
            int mark = scanner.nextInt();
            String string = toString(mark, Numbers.MAIN);
            System.out.println(string);
        }
        if(scanner.hasNextDouble()){
            double mark = scanner.nextDouble();
            String string = DoubleToString(mark);
            System.out.println(string);
    }
        System.out.println(toWeek(14));
}

    public static String toString(int number, Numbers numbers){
        StringBuilder builder = new StringBuilder();
        if(number == 0){
            builder.append(" ноль");
        }
        if (number < 1_000_000_000&&number>-1_000_000_000) {
            if(number<0){
                builder.append("минус");
                number*=-1;
            }
                int MillHund = number / 100_000_000;
                int MillTen = (number % 100_000_000) / 10_000_000;
                int MillUnit = (number % 10_000_000) / 1_000_000;
                if (MillHund != 0) {
                    builder.append(" " + HUND[MillHund]);
                }
                if (MillHund != 0 && MillTen == 0 && MillUnit == 0) {
                    builder.append(" " + MILLION[9]);
                }
                if (MillTen == 1) {
                    int temp = (number % 100_000_000) / 1_000_000;
                    builder.append(" " + UNITS[temp] + " " + MILLION[9]);
                }
                if (MillTen == 0) {
                    builder.append(" " + UNITS[MillUnit] + " " + MILLION[MillUnit]);
                }
                if (MillTen > 1) {
                    builder.append(" " + TEN[MillTen] + " " + UNITS[MillUnit] + " " + MILLION[MillUnit]);
                }
                if (MillTen > 1 && MillUnit == 0) {
                    builder.append(" " + MILLION[9]);
                }
                number = number % 1_000_000;
                int ThousHund = number / 100_000;
                int ThousTen = (number % 100_000) / 10_000;
                int ThousUnit = (number % 10_000) / 1_000;
                if (ThousHund != 0) {
                    builder.append(" " + HUND[ThousHund]);
                }
                if (ThousHund != 0 && ThousTen == 0 && ThousUnit == 0) {
                    builder.append(" " + THOUS[9]);
                }
                if (ThousTen == 1) {
                    int temp = (number % 100_000) / 1_000;
                    builder.append(" " + UNITS[temp] + " " + THOUS[9]);
                }
                if (ThousTen == 0) {
                    builder.append(" " + THOUSun[ThousUnit]);
                }
                if (ThousTen > 1) {
                    builder.append(" " + TEN[ThousTen] + " "  + THOUSun[ThousUnit]);
                }
                if (ThousTen > 1 && ThousUnit == 0) {
                    builder.append(" " + THOUS[9]);
                }
                number = number % 1000;
                int Hund = number / 100;
                int Ten = (number % 100) / 10;
                int Unit = number % 10;
                if (Hund != 0) {
                    builder.append(" " + HUND[Hund]);
                }
                if (Ten == 1) {
                    int temp = number % 100;
                    builder.append(" " + UNITS[temp]);
                }
                if (Ten == 0) {
                    if(numbers==MAIN){
                        builder.append(" " + UNITS[Unit]);
                    }

                    if(numbers == DOUBLE ){
                        if(Unit ==1){
                            builder.append(" " + TEN[Ten] +" одна");
                        }
                        if(Unit == 2){
                            builder.append(" " + TEN[Ten] +" две");
                        }
                        if(Unit > 2){
                            builder.append(" " + TEN[Ten] + " " + UNITS[Unit]);
                        }
                    }
                }
                if (Ten > 1) {
                    if(numbers == MAIN) {
                        builder.append(" " + TEN[Ten] + " " + UNITS[Unit]);
                    }
                    if(numbers == DOUBLE ){
                        if(Unit ==1){
                            builder.append(" " + TEN[Ten] +" одна");
                        }
                        if(Unit == 2){
                            builder.append(" " + TEN[Ten] +" две");
                        }
                        if(Unit > 2){
                            builder.append(" " + TEN[Ten] + " " + UNITS[Unit]);
                        }
                    }
                }
        }
            return builder.toString();
    }
    public static String DoubleToString(double number){
        StringBuilder builder = new StringBuilder();
            if(number<0){
                 builder.append("минус");
                 number*=-1;
                }
            int mark = (int) number;        // целая часть
            int tmp = mark%10;
            double temp = (number - mark)*100;
            int FNumber = (int) temp;      // дробная часть
            int tmp2 = FNumber%10;
            String string = toString(mark, DOUBLE);
            if(tmp == 1){
                builder.append(string +" целая");
            }else {
                builder.append(string + " целых");
            }
            String string1 = toString(FNumber, DOUBLE);
            if(tmp2 == 1){
                builder.append(string1 + " " + "сотая");
             }else {
                builder.append(string1 + " " + "сотых");
            }
        return builder.toString();
   }

    public static String toWeek(int day){
        StringBuilder builder = new StringBuilder();
        int week = day / 7;
        int temp = week%10;
        if(temp == 1){
            builder.append(week +" " + "неделя");
        }
        if(temp==2||temp==3||temp==4){
            builder.append(week + " " + "недели");
        }
        if(temp>4){
            builder.append(week + " " + "недель");
        }
        return builder.toString();
     }
}
