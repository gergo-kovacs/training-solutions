package week11d03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WordFilter {
    /*Készíts egy WordFilter osztályt,
     melyben van egy List<String> wordsWithChar(List<String> words, char c) metódus.
     A metódus kiválógatja a paraméterül kapott String listából azokat a szavakat,
     melyekben előfordul a c karakter,
     majd ezeket visszaadja egy listában.
     */

    public List<String> wordsWithChar(List<String> words, char c){
        if(words.isEmpty() || c == ' '){
            throw new IllegalArgumentException("Bad input.");
        }

        List<String> wordsWithC = new ArrayList<>();
        String character = String.valueOf(c);
        for (String word : words) {

            for (int j = 0; j < word.length(); j++) {
                if (String.valueOf(word.charAt(j)).equals(character.toUpperCase()) || String.valueOf(word.charAt(j)).equals(character.toLowerCase())) {
                    wordsWithC.add(word);
                    break;
                }
            }
        }
        return wordsWithC;
    }

}
