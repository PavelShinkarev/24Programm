package homework9;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class FIOWriter<T> {
    public static <T> void fileWritten(List<T> list, boolean a) {
        String str = "";
        if(a == false){
             str = "src" + File.separator + "FIOHomeWork9.txt";
        }else if(a == true) {
            str = "src" + File.separator + "TopStudents.txt";
        }
        try {
            PrintWriter pw = new PrintWriter(new FileOutputStream(str));
            for(T student : list){
                pw.write(student.toString());
                pw.write("\n");
            }
            pw.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}

