package homework5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExSearch implements ISearchEngine {

    public long search(String text, String word){
        String REGEX = "\\b"+word.toLowerCase()+"\\b";
        Pattern p = Pattern.compile(REGEX);
        Matcher m = p.matcher(text.toLowerCase());
        int count = 0;
        while (m.find()){
            count ++;
        }
        return count;
    }
}
