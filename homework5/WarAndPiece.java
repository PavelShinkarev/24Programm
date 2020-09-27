package homework5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class WarAndPiece {
    public static void main(String[] args) {
        String filePath = "d:/Java/Война и мир_книга.txt";
        System.out.println(readAllBytes( filePath ));
    }
    private static String readAllBytes(String filePath){
        String content = "";
        try{
            content = new String(Files.readAllBytes(Paths.get(filePath)));
        }
        catch (IOException e){
            e.printStackTrace();
        }
        return content;
    }
}
