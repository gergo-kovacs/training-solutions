package controliteration.dictionary;

import java.util.ArrayList;
import java.util.List;

public class Dictionary {
    List<DictionaryItem> dictionaryItems = new ArrayList<>();

    public void addItem(String word, List<String> translations){
        for (DictionaryItem item:dictionaryItems) {
            if(item.getWord().equals(word)){
               item.addTranslations(translations);
            }
        }
        if(!dictionaryItems.contains(word))
        dictionaryItems.add(new DictionaryItem(word,translations));

    }

    public List<String> findTranslations(String word){
        for (DictionaryItem i: dictionaryItems) {
            if(i.getWord().equals(word)){
                return i.getTranslations();
            }
        }
        return null;
    }



}
