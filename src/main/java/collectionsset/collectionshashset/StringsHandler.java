package collectionsset.collectionshashset;

import java.util.*;

public class StringsHandler {



    public Set<String> filterUniqueStrings(Collection<String> testCollection) {
        Set<String> uniqueStrings = new HashSet<>();
        uniqueStrings.addAll(testCollection);
        return uniqueStrings;
    }

    public Set<String> selectIdenticalStrings(Set<String> strings, Set<String> anotherStrings) {
        Collection stringSet = strings;
        Set<String> selectedStrings;
        stringSet.retainAll(anotherStrings);
        selectedStrings=(Set) stringSet;
        return selectedStrings;
    }
}
