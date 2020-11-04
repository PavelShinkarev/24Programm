package homework9;

import java.util.Comparator;

public class CompareStudentsMarks implements Comparator<Student> {
    public int compare(Student a, Student b){
            return b.getMark()-a.getMark();

    }
}
