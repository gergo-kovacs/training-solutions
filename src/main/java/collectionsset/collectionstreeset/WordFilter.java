package collectionsset.collectionstreeset;

import java.util.Arrays;
import java.util.Collection;
import java.util.Set;
import java.util.TreeSet;

public class WordFilter {

    public Set<String> filterWords(String[] randomStrings) {
        Set<String> orderedList = new TreeSet<>();

        for (String w:randomStrings) {
            orderedList.add(w);
        }
        return orderedList;
    }
}
