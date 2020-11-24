package week05d02;

import java.util.Arrays;
import java.util.List;

public class ChangeLetter {

    public String changeVowels(String text){

        if(text == " ".trim()){
            throw new IllegalArgumentException("empty string");
        }
        if(text == null){
            throw new IllegalArgumentException("Incorrect parameter string!");
        }

        List<Character>vowel = Arrays.asList('A', 'E', 'I', 'O', 'U','a', 'e', 'i', 'o', 'u');
        for (int i = 0; i < text.length(); i++) {
            for (int j = 0; j < vowel.size(); j++) {
                if(text.charAt(i)==vowel.get(j)){
                    text = text.replace(text.charAt(i),'*');
                }
            }
        }
        return text;
    }
}


