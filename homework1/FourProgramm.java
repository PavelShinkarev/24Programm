package homework1;

public class FourProgramm {
    public static void main(String[] args) {
        boolean vacation = false;
        boolean weekday = true;
        if (sleepIn(vacation,weekday)) {
            System.out.println("Выходной");
        } else {
            System.out.println("Работаем");
        }
    }
    public static boolean sleepIn(boolean vacation, boolean weekday) {
        if (!weekday || vacation) {
            return true;
        } else {
            return false;
        }
    }
}
