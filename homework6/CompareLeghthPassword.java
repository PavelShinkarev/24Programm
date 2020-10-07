package homework6;

import java.util.Comparator;

public class CompareLeghthPassword implements Comparator<Person>{
            public int compare(Person a, Person b) {
            return a.getPassword().length() - b.getPassword().length();
        }
    }

