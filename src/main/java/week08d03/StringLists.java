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
}
