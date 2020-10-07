package homework6;

import org.w3c.dom.ls.LSOutput;

import java.util.*;

public class SortMain {
    public static void main(String[] args) {

        LinkedList<Person> persons = new LinkedList<>();
        long timeLinkedList = System.currentTimeMillis();
        for (int i = 0; i < 100_000 ; i++) {
            String index = PersonPasswordRandom.nextString((int)(Math.random()*6+5));
            String nick = PersonNickRandom.nextString();
            persons.add(new Person(nick, index));
        }
        long timesortLinkedList = System.currentTimeMillis();
        System.out.println("LinkedList - время заполнения " + (System.currentTimeMillis() -
                timeLinkedList) + " мсек.");
        Collections.sort(persons, new CompareLeghthPassword().thenComparing(new ComparePassword().
                thenComparing(new ConpareNick())));
        System.out.println("LinkedList - время сортировки " + (System.currentTimeMillis() -
                timesortLinkedList) + " мсек.");
        long timeDisplayLinked = System.currentTimeMillis();// время вывода в консоль


        for (int i = 0; i < persons.size(); i++) { // итерирование через for
            Person person = persons.get(i);
//            System.out.println("Password - " + person.getPassword() + " //////" +  "nick -" + person.getNick());
        }


        System.out.println("LinkedList - время вывода в консоль(for) " + (System.currentTimeMillis()-
                timeDisplayLinked));

        long timeDisplayLinkedList = System.currentTimeMillis(); // время вывода в консоль
        Iterator<Person> personIterator = persons.iterator(); // итерирование через Iterator
        while(personIterator.hasNext()){
            Person a = personIterator.next();
//            System.out.println("Password - "+a.getPassword() + " ///// " +"nick - " + a.getNick());
        }
        System.out.println("LinkedList - время вывода в консоль(Iterator) " + (System.currentTimeMillis() -
                timeDisplayLinkedList) + " мсек.");

        Iterator<Person> personDeleteIterator = persons.iterator(); // удаление через Iterator
        long deleteLinked = System.currentTimeMillis(); // время удаления
        while(personDeleteIterator.hasNext()){
            Person person = personDeleteIterator.next();
            personDeleteIterator.remove();
        }
        System.out.println("LinkedList - удаление " + (System.currentTimeMillis()-
                deleteLinked)+ " мсек.");


        ArrayList<Person> Arrayperson = new ArrayList<>();
        long timeArrayList = System.currentTimeMillis();    // время заполнения
        for (int i = 0; i < 100_000 ; i++){
            String index = PersonPasswordRandom.nextString((int)(Math.random()*6+5));
            String nick = PersonNickRandom.nextString();
            Arrayperson.add(new Person(nick, index));
        }
        System.out.println("ArrayList - время заполнения " + (System.currentTimeMillis() -
                timeArrayList)+ " мсек.");
        long timesortArrayList = System.currentTimeMillis(); // время сортировки
        Collections.sort(Arrayperson, new CompareLeghthPassword().thenComparing(new ComparePassword().
                thenComparing(new ConpareNick())));
        System.out.println("ArrayList - время сортировки " + (System.currentTimeMillis() -
                timesortArrayList)+ " мсек.");

        long timeArrayWithFor = System.currentTimeMillis();// время вывода в консоль
        // итерация for
        for (int i = 0; i < Arrayperson.size() ; i++) {
            Person person = Arrayperson.get(i);
//            System.out.println("Password - " + person.getPassword() + "//////" +  "nick -" + person.getNick());
        }
        System.out.println("ArrayList - время вывода в консоль(for) " + (System.currentTimeMillis()-
                timeArrayWithFor));

        long timeDisplayArrayList = System.currentTimeMillis(); // время вывода в консоль
        Iterator<Person> ArraypersonIterator = Arrayperson.iterator();

        while(ArraypersonIterator.hasNext()){
            Person a = ArraypersonIterator.next();
//            System.out.println("Password - " +a.getPassword() + " ///// " + "nick - " + a.getNick());
        }
        System.out.println("ArrayList - время вывода(Iterator) " + (System.currentTimeMillis() -
                timeDisplayArrayList)+ " мсек.");

        Iterator<Person> personDeleteIteratorA = Arrayperson.iterator(); // удаление через Iterator
        long deleteArray = System.currentTimeMillis(); // время удаления
        while(personDeleteIteratorA.hasNext()){
            Person person = personDeleteIteratorA.next();
            personDeleteIteratorA.remove();
        }
        System.out.println("ArrayList - удаление " + (System.currentTimeMillis()-
                deleteArray)+ " мсек.");



        HashSet<Person> Hperson = new HashSet<>();
        long timeHashSet = System.currentTimeMillis();
        for (int i = 0; i < 100_000 ; i++) {
            String index = PersonPasswordRandom.nextString((int)(Math.random()*6+5));
            String nick = PersonNickRandom.nextString();
            Hperson.add(new Person(nick, index));
        }
        long timesortHashSet = System.currentTimeMillis();
        System.out.println("HashSet - время заполнения " + (System.currentTimeMillis() -
                timeHashSet)+ " мсек.");
        Comparator<Person> temp = new CompareLeghthPassword().thenComparing(new ComparePassword().
                thenComparing(new ConpareNick()));
        TreeSet<Person> myTreeSet = new TreeSet<>(temp);
        myTreeSet.addAll(Hperson);
        long timeDisplayHashSet = System.currentTimeMillis(); // время вывода в консоль
        System.out.println("HashSet - время сортировки " + (System.currentTimeMillis() -
                timesortHashSet)+ " мсек.");


        // итерация for
        for (int i = 0; i < myTreeSet.size() ; i++) {
//            Person person =  myTreeSet. пока немогу найти способ
        }


        Iterator<Person> HashpersonIterator = myTreeSet.iterator();
        while(HashpersonIterator.hasNext()){
            Person a = HashpersonIterator.next();
//            System.out.println("Password - " + a.getPassword() + " ///// " + "nick - " + a.getNick());
        }
        System.out.println("HashSet - время вывода в консоль (Iterator) " + (System.currentTimeMillis() -
                timeDisplayHashSet)+ " мсек.");

        Comparator<Person> cmped = new CompareLeghthPassword().thenComparing(new ComparePassword().
                thenComparing(new ConpareNick()));


        Iterator<Person> personDeleteIteratorH = Hperson.iterator(); // удаление через Iterator
        long deleteHash = System.currentTimeMillis(); // время удаления
        while(personDeleteIteratorH.hasNext()){
            Person person = personDeleteIteratorH.next();
            personDeleteIteratorH.remove();
        }
        System.out.println("HashSet - удаление " + (System.currentTimeMillis()-
                deleteHash)+ " мсек.");




        TreeSet<Person> Tperson = new TreeSet<>(cmped);
        long timeTreeSet = System.currentTimeMillis();
        for (int i = 0; i < 100_000 ; i++) {
            String index = PersonPasswordRandom.nextString((int)(Math.random()*6+5));
            String nick = PersonNickRandom.nextString();
            Tperson.add(new Person(nick, index));
        }
        long timeDisplayTreeeSet = System.currentTimeMillis(); // время вывода в консоль
        System.out.println("TreeSet - время заполнения " + (System.currentTimeMillis() -
                timeTreeSet)+ " мсек.");


        // итерация for пока немогу найти способ


        Iterator<Person> TreepersonIterator = Tperson.iterator();
        while(TreepersonIterator.hasNext()){
            Person a = TreepersonIterator.next();
//            System.out.println("Password - " + a.getPassword() + " ///// " + "nick - " + a.getNick());
        }
        System.out.println("TreeSet - время вывода в консоль (Iterator) " + (System.currentTimeMillis() -
                timeDisplayTreeeSet)+ " мсек.");

        Iterator<Person> personDeleteIteratorT = Tperson.iterator(); // удаление через Iterator
        long deleteTree = System.currentTimeMillis(); // время удаления
        while(personDeleteIteratorT.hasNext()){
            Person person = personDeleteIteratorT.next();
            personDeleteIteratorT.remove();
        }
        System.out.println("TreeSet - удаление " + (System.currentTimeMillis()-
                deleteTree)+ " мсек.");


    }
}

