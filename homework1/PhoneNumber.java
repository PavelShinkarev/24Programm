package homework1;

public class PhoneNumber {
    public static void main(String[] args) {
        int[] array = {0, 1 ,2 ,3, 4, 5, 6, 7, 8, 9};
        String arr = сreatePhoneNumber(array);
        System.out.println(arr);
    }
    public static String сreatePhoneNumber(int[] numbers) {
        char[] mass = {'(', 'x','x','x',')','x','x','x',' ','x','x','x','x'};
        int j = 0;
        for (int i = 0; i < mass.length; i++) {
            if (mass[i] == 'x') {
                mass[i] = Character.forDigit(numbers[j], 10);
                j++;
            }
        }
            return String.valueOf(mass);
    }
}
