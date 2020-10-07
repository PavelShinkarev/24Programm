package homework6;

import java.util.Comparator;

public class CompareAge implements Comparator<Animal> {
    public int compare(Animal a, Animal b){
        return  a.getAge() - b.getAge();
    }

}
