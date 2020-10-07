package homework6;

import java.util.Comparator;

public class CompareNickAnimal implements Comparator<Animal> {
    public int compare(Animal a, Animal b) {
        return a.getNick().compareTo(b.getNick());
    }
}
