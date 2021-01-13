package week11d03;

import java.util.ArrayList;
import java.util.List;

public class WordFilter2 {

    public List<String> wordsWithChar(List<String> words, char c){

        List<String> wordsWithChar = new ArrayList<>();

        for (String word : words) {

            if(word.indexOf(c)>=0){
                wordsWithChar.add(word);
            }
        }
        return wordsWithChar;
    }


}
