package homework6;

import java.io.File;
import java.util.Random;

import static homework5.WarAndPiece.readAllBytes;

public class AnimalNickRandom {
    private static String filePath = "src"+ File.separator + "pet_niks.txt";
    private static String content = (readAllBytes(filePath));
    private static String[] str = content.split("\\s+");
    private static final Random random = new Random();

    public static String nextString() {
        String name = str[random.nextInt(str.length)];
        return name;
    }
}