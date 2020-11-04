package homework9;

import java.io.File;
import java.util.List;
import java.util.Scanner;

public class ScannerClass <T>{
    public static <T> void  scannerMethod(List<T> students){
        Scanner input = new Scanner(System.in);
        System.out.println("Введите путь для сохранения файла: ");
        String way = input.nextLine();
        File file = new File(way);
        if(file.isDirectory()){
            String filePAth = way + File.separator + "FIOFromScanner.txt";
            FIOWriter.fileWritten(students, false, filePAth);
        }else if(!file.isDirectory() || way == null){
            String str = "src" + File.separator + "FIOHomeWork9.txt";
            FIOWriter.fileWritten(students, false, str);
        }
    }
}
