package homework6;

import java.util.Random;

public class PersonPasswordRandom {
    private static final char[] str= ("1234567890").toCharArray();
    private static final Random random = new Random();

    public static String nextString(int leght){
        StringBuilder builder = new StringBuilder(leght);
        for (int i = 0; i < leght; i++) {
            builder.append(str[random.nextInt(str.length)]);
        }
        return builder.toString();
    }

}
