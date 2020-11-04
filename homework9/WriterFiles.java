package homework9;

import java.io.*;
import java.util.List;


public class WriterFiles<T>{
    public static <T> void fileWrit(List<T> list) {
        String str = "src" + File.separator + "familiiHome9.txt";
        String strFam = "src" + File.separator + "namesHome9.txt";
        String strOtch = "src" + File.separator + "otchestvaHome9.txt";
        String strMarks = "src" + File.separator + "marksHome9.txt";
        try {
            PrintWriter pw = new PrintWriter(new FileOutputStream(str));
            PrintWriter pw1 = new PrintWriter(new FileOutputStream(strFam));
            PrintWriter pw2 = new PrintWriter(new FileOutputStream(strOtch));
            PrintWriter pw3 = new PrintWriter(new FileOutputStream(strMarks));
            for( T student : list){
                String wtf = student.toString();
                String string = wtf.substring(wtf.indexOf(0)+1, wtf.indexOf(" "));
                pw.println(string);

                int value = wtf.indexOf(" ");
                String string1 = wtf.substring(value+1, wtf.indexOf(" ", value+1));
                pw1.println(string1);

                int value2 = wtf.indexOf(" ", value+1);
                String string2 = wtf.substring(value2+1, wtf.indexOf(" ", value2+1));
                pw2.println(string2);

                int value3 = wtf.indexOf(" ", value2+1);
                String string3 = wtf.substring(value3+1);
                pw3.println(string3);
            }
            pw.close();
            pw1.close();
            pw2.close();
            pw3.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
