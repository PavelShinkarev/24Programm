package homework9;

import java.io.File;
import java.util.*;
import java.util.stream.Collectors;

public class SortStudents {
    public  static void sortMethod(List<Student> list){
        Collection<Student> collection = new ArrayList<>(list);
        List<Student> coll = new ArrayList<>();
         collection.stream()
                .sorted(new CompareStudentsMarks().thenComparing(new CompareStudentsNames()))
                .limit(15)
                .collect(Collectors.toList())
                .forEach(student -> coll.add(student))
                 ;
         Collection<Student> studentCollection = new ArrayList<>(coll);
         studentCollection.stream()
                 .forEach(student -> System.out.printf("%s %s %s - %d \n",
                        student.getName(), student.getFamilia(), student.getOtchecstvo(), student.getMark()))
                        ;
         String str = "src" + File.separator + "TopStudents.txt";
        FIOWriter.fileWritten( coll, true, str );
    }
}
