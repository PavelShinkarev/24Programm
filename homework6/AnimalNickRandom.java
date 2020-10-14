package homework6;

<<<<<<< HEAD
import java.io.File;
=======
>>>>>>> c4ef23fb2c0a2ff9d46861324b0fb0ce9d0eac54
import java.util.Random;

import static homework5.WarAndPiece.readAllBytes;

public class AnimalNickRandom {
<<<<<<< HEAD
    private static String filePath = "src"+ File.separator + "pet_niks.txt";
=======
    private static String filePath = "d:\\Java\\pet_niks.txt";
>>>>>>> c4ef23fb2c0a2ff9d46861324b0fb0ce9d0eac54
    private static String content = (readAllBytes(filePath));
    private static String[] str = content.split("\\s+");
    private static final Random random = new Random();

    public static String nextString() {
        String name = str[random.nextInt(str.length)];
        return name;
    }
}