package homework5;

public class EasySearch implements ISearchEngine {

    public long search(String text, String word){
        long value = 1;
        int temp = text.indexOf(" "+word+" ");
        int index = 0;
        do{
            index = text.indexOf(word, temp+1);
            if (index == -1){
                return value;
            }
            value++;
            temp = index;
            index = 0;
        }
        while (index != -1);
        return value;
    }
}
