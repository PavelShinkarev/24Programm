package homework1;

public class Operators2 {

    public static void main(String[] args){
        int a = 5;
        int b = 2;
        int c = 8;
        int d = 0;
        int m = 7;
        int n = 20;
        int f = 68;
        int g = 22;
        boolean z;
        d = a + b / c;
        System.out.println("5 + 2 / 8 = " + d); // 2 / 8 = 0; 5 + 0 = 0
        a = 5;
        b = 2;
        c = 8;
        d = 0;
        d = (a + b) / c;
        System.out.println("(5 + 2) / 8 = " + d); // 5 + 2 = 7; 7 / 8 = 0
        a = 5;
        b = 2;
        c = 8;
        d = 0;
        d = (a + b++) / c;
        System.out.println("(5 + 2++) / 8 = " + d); // 5 + 2 = 7; к 2 инкремент; 7 / 8 = 0
        a = 5;
        b = 2;
        c = 8;
        d = 0;
        d = (a + b++) / --c;
        System.out.println("(5 + 2++) / --8 = " +d); // 5 + 2 = 7; декремент к 8; 7 / 7 = 1
        a = 5;
        b = 2;
        c = 8;
        d = 0;
        d = (a * b >> b++) / --c;
        System.out.println("(5 * 2 >> 2++) / --8 = " + d);
        // ответ 0; 5*2=10; 10>>2 = 2; к 2 применяем инкремент; применяем декремент к 8; 2 / 7 = 0
        a = 5;
        b = 2;
        c = 8;
        d = 0;
        m = 7;
        n = 20;
        f = 68;
        g = 22;
        d = (a + m > n ? f : g * b >> b++ ) / --c;
        System.out.println("(5 +7 > 20 ? 68 : 22 * 2 >> 2++) / --8 = " + d);
        // 5 +7 не больше 20, значит выполняется выражение2 - 22*2>>2 и инкремент к 2, после декремент к 8. 11 / 7 = 1
        a = 5;
        b = 2;
        c = 8;
        d = 0;
        m = 7;
        n = 20;
        f = 68;
        g = 22;
        System.out.println("(5 + 7 > 20 ? 68 >= 68 : 22 * 2 >> 2++) / --8 Ошибка компиляции");
        // выражение1 вернёт булевое значение, а выражение2 целочисленное.
        a = 5;
        b = 2;
        c = 8;
        d = 0;
        m = 7;
        n = 20;
        f = 68;
        g = 22;
        z = 6 - 2 > 3 && 12 * 12 <= 119;
        System.out.println(d); // две части выражения false, резульат 0
    }
}
