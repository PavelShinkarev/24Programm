package homework6;

import java.util.Comparator;

public class ConpareNick implements Comparator<Person> {
    public int compare(Person a, Person b){
        return a.getNick().compareTo(b.getNick());
    }
}
