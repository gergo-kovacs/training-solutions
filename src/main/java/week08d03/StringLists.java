package week08d03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StringLists {

    public List<String> stringListsUnion(List<String> first, List<String> second){
        List<String> unio = new ArrayList<>();
        for (int i = 0; i < first.size(); i++) {
            for (int j = 0; j < second.size(); j++) {
                if(first.get(i).equals(second.get(j))){
                    if(!unio.contains(first.get(i))){
                    unio.add(first.get(i));
                    }
                }
            }
        }

        Collections.sort(unio);
        return unio;
    }

    public List<String> shortestWords(List<String> words){

        List<String> result = new ArrayList<>();
        String shortest = words.get(0);
        for (String word : words) {
            if (word.length() < shortest.length()) {
                shortest = word;
            }
        }
        for (String w:words) {
            if(w.length()==shortest.length()){
                result.add(w);
            }
        }
        Collections.sort(result);
        return result;
    }
}
