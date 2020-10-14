package homework6;

import java.io.File;
import java.util.Random;
import static homework5.WarAndPiece.readAllBytes;

public class PersonNickRandom {
    private static String filePath = "src"+ File.separator + "names.txt";
    private static String content = (readAllBytes(filePath));
    private static String[]str = content.split("\\s+");
    private static final Random random = new Random();

    public static String nextString(){
        String name = str[random.nextInt(str.length)];
        return name;
    }
}
