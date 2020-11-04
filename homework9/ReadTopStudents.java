package homework9;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReadTopStudents {
    public static void readFile(){
        List<String> list = new ArrayList<>();
        String sre = "d:/JavaHomeWorks/src/TopStudents.txt";
        File file = new File(sre);
        try(Stream<String> stream = Files.lines(file.toPath())){
           list= stream.collect(Collectors.toList());
        }catch (IOException ignored){
        }
        System.out.println(list);
    }
}
