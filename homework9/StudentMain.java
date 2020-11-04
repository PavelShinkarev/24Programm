package homework9;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StudentMain {

   private static final String name = "NamesHW9.txt";
   private static final String familia = "Familii.txt";
   private static final String otchestvo = "otchestvo.txt";
   private static final Random random = new Random();

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        Stream.generate(() -> students.add(new Student(FIORandom.nextString(familia), FIORandom.nextString(name),
                FIORandom.nextString(otchestvo), random.nextInt(11))))
                .limit(10_000)
                .collect(Collectors.toList())
        ;
        ScannerClass.scannerMethod(students);
//        WriterFiles.fileWrit(students);
//        FIOWriter.fileWritten(students, false);
//        TurnToBinaryFile.turnBytes(students);
        SortStudents.sortMethod(students);
//        ReadTopStudents.readFile();
    }
}
