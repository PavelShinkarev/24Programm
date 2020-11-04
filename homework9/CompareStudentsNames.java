package homework9;

import java.util.Comparator;

public class CompareStudentsNames implements Comparator<Student> {
    public int compare(Student a, Student b){
        return a.getName().toUpperCase().compareTo(b.getName().toUpperCase());
    }
}
