package homework6;

import java.util.Comparator;

public class ComparePassword implements Comparator<Person> {
    public int compare(Person a, Person b) {

        return a.getPassword().compareTo(b.getPassword());
    }
}
