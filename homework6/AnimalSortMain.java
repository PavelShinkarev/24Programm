package homework6;

import java.util.*;

public class AnimalSortMain {
    public static void main(String[] args) {
        LinkedList<Animal> animals = new LinkedList<>();
        long timeLinkedList = System.currentTimeMillis();
        for (int i = 0; i < 100_000 ; i++) {
            int index = (int)(Math.random()*15+1);
            String nick = AnimalNickRandom.nextString();
            animals.add(new Animal(index, nick));
        }
        long timesortLinkedList = System.currentTimeMillis();
        System.out.println("LinkedList - время заполнения " + (System.currentTimeMillis() -
                timeLinkedList) + " мсек.");
        Collections.sort(animals, new CompareAge().thenComparing(new CompareNickAnimal()));
        System.out.println("LinkedList - время сортировки " + (System.currentTimeMillis() -
                timesortLinkedList) + " мсек.");
        long timeDisplayLinked = System.currentTimeMillis();// время вывода в консоль
        for (int i = 0; i < animals.size(); i++) { // итерирование через for
            Animal animal = animals.get(i);
//            System.out.println("Password - " + animal.getAge() + " //////" +  "nick -" + animal.getNick());
        }
        System.out.println("LinkedList - время вывода в консоль(for) " + (System.currentTimeMillis()-
                timeDisplayLinked));
        long timeDisplayLinkedList = System.currentTimeMillis(); // время вывода в консоль
        Iterator<Animal> animalIterator = animals.iterator(); // итерирование через Iterator
        while(animalIterator.hasNext()){
            Animal an = animalIterator.next();
//            System.out.println("Password - "+an.getAge() + " ///// " +"nick - " + an.getNick());
        }
        System.out.println("LinkedList - время вывода в консоль(Iterator) " + (System.currentTimeMillis() -
                timeDisplayLinkedList) + " мсек.");
        Iterator<Animal> animalDeleteIterator = animals.iterator(); // удаление через Iterator
        long deleteLinked = System.currentTimeMillis(); // время удаления
        while(animalDeleteIterator.hasNext()){
            Animal animal = animalDeleteIterator.next();
            animalDeleteIterator.remove();
        }
        System.out.println("LinkedList - удаление " + (System.currentTimeMillis()-
                deleteLinked)+ " мсек.");

        ArrayList<Animal> Arrayanimal = new ArrayList<>();
        long timeArrayList = System.currentTimeMillis();    // время заполнения
        for (int i = 0; i < 100_000 ; i++){
            int index = (int)(Math.random()*15+1);
            String nick = AnimalNickRandom.nextString();
            Arrayanimal.add(new Animal(index, nick));
        }
        System.out.println("ArrayList - время заполнения " + (System.currentTimeMillis() -
                timeArrayList)+ " мсек.");
        long timesortArrayList = System.currentTimeMillis(); // время сортировки
        Collections.sort(Arrayanimal, new CompareAge().thenComparing(new CompareNickAnimal()));
        System.out.println("ArrayList - время сортировки " + (System.currentTimeMillis() -
                timesortArrayList)+ " мсек.");
        long timeArrayWithFor = System.currentTimeMillis();// время вывода в консоль
        for (int i = 0; i < Arrayanimal.size() ; i++) {
            Animal animal = Arrayanimal.get(i);
//            System.out.println("Password - " + animal.getAge() + "//////" +  "nick -" + animal.getNick());
        }
        System.out.println("ArrayList - время вывода в консоль(for) " + (System.currentTimeMillis()-
                timeArrayWithFor));
        long timeDisplayArrayList = System.currentTimeMillis(); // время вывода в консоль
        Iterator<Animal> ArrayAnimalIterator = Arrayanimal.iterator();

        while(ArrayAnimalIterator.hasNext()){
            Animal a = ArrayAnimalIterator.next();
//            System.out.println("Password - " +a.getAge() + " ///// " + "nick - " + a.getNick());
        }
        System.out.println("ArrayList - время вывода(Iterator) " + (System.currentTimeMillis() -
                timeDisplayArrayList)+ " мсек.");
        Iterator<Animal> arrayDeleteIteratorA = Arrayanimal.iterator(); // удаление через Iterator
        long deleteArray = System.currentTimeMillis(); // время удаления
        while(arrayDeleteIteratorA.hasNext()){
            Animal animal = arrayDeleteIteratorA.next();
            arrayDeleteIteratorA.remove();
        }
        System.out.println("ArrayList - удаление " + (System.currentTimeMillis()-
                deleteArray)+ " мсек.");

        HashSet<Animal> Hanimal = new HashSet<>();
        long timeHashSet = System.currentTimeMillis();
        for (int i = 0; i < 100_000 ; i++) {
            int index = (int)(Math.random()*15+1);
            String nick = AnimalNickRandom.nextString();
            Hanimal.add(new Animal(index, nick));
        }
        long timesortHashSet = System.currentTimeMillis();
        System.out.println("HashSet - время заполнения " + (System.currentTimeMillis() -
                timeHashSet)+ " мсек.");
        Comparator<Animal> temp = new CompareAge().thenComparing(new CompareNickAnimal());
        TreeSet<Animal> myTreeSet = new TreeSet<>(temp);
        myTreeSet.addAll(Hanimal);
        long timeDisplayHashSet = System.currentTimeMillis(); // время вывода в консоль
        System.out.println("HashSet - время сортировки " + (System.currentTimeMillis() -
                timesortHashSet)+ " мсек.");
        ArrayList<Animal> arrayList = new ArrayList<>(myTreeSet);
        long timeHashSetFor = System.currentTimeMillis();
        for (int i = 0; i < arrayList.size() ; i++) {
            Animal a = arrayList.get(i);
//            System.out.println("Password - " + a.getAge() + "//////" +  "nick -" + a.getNick());
        }
        System.out.println("HashSet(Array) - время вывода в консоль(for) " + (System.currentTimeMillis()-
                timeHashSetFor));
        Iterator<Animal> HashAnimalIterator = myTreeSet.iterator();
        while(HashAnimalIterator.hasNext()){
            Animal a = HashAnimalIterator.next();
//            System.out.println("Password - " + a.getAge() + " ///// " + "nick - " + a.getNick());
        }
        System.out.println("HashSet - время вывода в консоль (Iterator) " + (System.currentTimeMillis() -
                timeDisplayHashSet)+ " мсек.");
        Iterator<Animal> animalDeleteIteratorH = Hanimal.iterator(); // удаление через Iterator
        long deleteHash = System.currentTimeMillis(); // время удаления
        while(animalDeleteIteratorH.hasNext()){
            Animal animal = animalDeleteIteratorH.next();
            animalDeleteIteratorH.remove();
        }
        System.out.println("HashSet - удаление " + (System.currentTimeMillis()-
                deleteHash)+ " мсек.");
        Comparator<Animal> cmped = new CompareAge().thenComparing(new CompareNickAnimal());

        TreeSet<Animal> Tanimal = new TreeSet<>(cmped);
        long timeTreeSet = System.currentTimeMillis();
        for (int i = 0; i < 100_000 ; i++) {
            int index = (int)(Math.random()*15+1);
            String nick = AnimalNickRandom.nextString();
            Tanimal.add(new Animal(index, nick));
        }
        long timeDisplayTreeeSet = System.currentTimeMillis(); // время вывода в консоль
        System.out.println("TreeSet - время заполнения " + (System.currentTimeMillis() -
                timeTreeSet)+ " мсек.");
        Iterator<Animal> TreeAnimalIterator = Tanimal.iterator();
        while(TreeAnimalIterator.hasNext()){
            Animal a = TreeAnimalIterator.next();
//            System.out.println("Password - " + a.getAge() + " ///// " + "nick - " + a.getNick());
        }
        System.out.println("TreeSet - время вывода в консоль (Iterator) " + (System.currentTimeMillis() -
                timeDisplayTreeeSet)+ " мсек.");

        ArrayList<Animal> arrayTreeSet = new ArrayList<>(Tanimal);
        long timeTreeSetFor = System.currentTimeMillis();
        for (int i = 0; i < arrayTreeSet.size(); i++) {
            Animal a = arrayTreeSet.get(i);
//            System.out.println("Password - " + a.getAge() + " ///// " + "nick - " + a.getNick());
        }
        System.out.println("TreeSet(Array) - время вывода в консоль " + (System.currentTimeMillis()-
                timeTreeSetFor)+ " мсек.");
        Iterator<Animal> animalDeleteIteratorT = Tanimal.iterator(); // удаление через Iterator
        long deleteTree = System.currentTimeMillis(); // время удаления
        while(animalDeleteIteratorT.hasNext()){
            Animal animal = animalDeleteIteratorT.next();
            animalDeleteIteratorT.remove();
        }
        System.out.println("TreeSet - удаление " + (System.currentTimeMillis()-
                deleteTree)+ " мсек.");
    }
}
