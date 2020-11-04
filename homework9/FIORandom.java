package homework9;

import java.io.File;
import java.util.Random;

import static homework5.WarAndPiece.readAllBytes;

public class FIORandom {
    public static String nextString(String content) {
        String filePath = "src"+ File.separator + content;
        String stringRandom = (readAllBytes(filePath));
        String[] str = stringRandom.split("\\s+");
        Random random = new Random();
        String name = str[random.nextInt(str.length)];
        return name;
    }
}
