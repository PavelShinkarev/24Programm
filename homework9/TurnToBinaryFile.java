package homework9;

import java.io.*;
import java.util.List;

public class TurnToBinaryFile<T>{
    public static <T> void turnBytes(List<T> list){
        String str = "src" + File.separator + "data.bin";
        try(FileOutputStream fos = new FileOutputStream(str);
            ObjectOutputStream oos = new ObjectOutputStream(fos)){

            for ( T student : list ) {
                oos.writeObject(student);
            }
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
