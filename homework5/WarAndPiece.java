package homework5;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class WarAndPiece {
    public static void main(String[] args) {
        String filePath = "src"+ File.separator + "Война и мир_книга.txt";
        String content = (readAllBytes(filePath));
        Set<String> uniques = new HashSet<>();
        String[]str = content.split("\\s+");
        for (String word : str)
            uniques.add(word);
        System.out.println(uniques);
        System.out.println(uniques.size());

        Map<String, Integer> collection = new HashMap<>();
        for (String word : str) {
            Integer oldCount = collection.get(word);
            if (oldCount == null) {
                oldCount = 0;
            }
            collection.put(word, oldCount +1);
        }
        System.out.println(collection);

        List list = new ArrayList(collection.entrySet());

        Collections.sort(list, (Comparator<Map.Entry<Integer, Integer>>)
                (o1, o2) -> o2.getValue()-o1.getValue());
        for (int i = 0; i < list.size(); i++) {
            if(i == 10){
                break;
            }
            System.out.print(list.get(i) + " ");
        }
        ISearchEngine searchEngine = new EasySearch();
        System.out.println( "\nESвойна= " + searchEngine.search(content, "война"));
        System.out.println( "ESи= " + searchEngine.search(content, " и "));
        System.out.println( "ESмир= " + searchEngine.search(content, "мир"));
        ISearchEngine RegExSearch = new RegExSearch();
        System.out.println("война= " + RegExSearch.search(content, "война"));
        System.out.println("и= " + RegExSearch.search(content, "и"));
        System.out.println("мир= " + RegExSearch.search(content, "Мир"));
    }
    public static String readAllBytes(String filePath){
        String content = "";
        try{
            content = new String(Files.readAllBytes(Paths.get(filePath)));
        }
        catch (IOException e){
            e.printStackTrace();
        }
        return content.replaceAll("\\p{Punct}", " ");
    }
}

