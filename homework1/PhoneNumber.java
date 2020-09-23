package homework1;

import java.util.Arrays;

public class PhoneNumber {
    public static void main(String[] args) {
        int[] array = {0, 1 ,2 ,3, 4, 5, 6, 7, 8, 9};
        String arr = createPhoneNumber(array);
        System.out.println(arr);
    }

    public static String createPhoneNumber(int[] numbers) {
        char[] mass = {'(', 'x','x','x',')','x','x','x',' ','x','x','x','x'};

        for (int i = 0; i <= mass.length-1; i++) {

            for (int j = 0; j < numbers.length - 1; j++) {
                if (mass[i] == 'x') {
                        mass[i] = Character.forDigit(numbers[j], 10);

                    }
                }
            }


            return Arrays.toString(mass);
    }
}
