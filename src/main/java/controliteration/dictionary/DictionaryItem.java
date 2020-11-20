package controliteration.dictionary;

import java.util.ArrayList;
import java.util.List;

public class DictionaryItem {
    private String word;
    private List<String> translations = new ArrayList<>();

    public String getWord() {
        return word;
    }

    public List<String> getTranslations() {
        return translations;
    }

    public DictionaryItem(String word, List<String> translaions) {
        this.word = word;
        addTranslations(translaions);
    }

    public void  addTranslations(List<String> dictionaryItems){
        for (String dItem:dictionaryItems) {
            if(!translations.contains(dItem)){
                translations.add(dItem);
            }
        }
    }



}
