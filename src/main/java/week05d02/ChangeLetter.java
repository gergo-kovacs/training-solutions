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

/*
public class ChangeLetter2 {

    public String changeVowels(String text){
        if(text == "" || text == null){
            throw new IllegalArgumentException("Incorrect parameter string!");
        }

        String[] vowels = {"A","E","I","O","U","a","e","i","o","u"};
        for (int i = 0; i < vowels.length; i++) {
            if (text.contains(vowels[i])) {
               text = text.replaceAll(vowels[i],"*");
            }
        }
        return text;
    }

 */

/*
public class ChangeLetter3 {

    public static final String VOWELS = "aeiou";
    public static final char[] VOWELS_CHAR = {'a','e','i','o','u'};

    public String changeVowels(String temp){
        temp = temp.toLowerCase();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < temp.length(); i++) {
            String s = temp.substring(i,i+1);
            if(VOWELS.contains(s)){
                sb.append("*");
            }else{
                sb.append(s);
            }
        }
        return sb.toString();
    }

    public String changeVowels2(String temp){
        for (char c: VOWELS_CHAR) {
            temp = temp.replace(c,'*');
        }
        return temp;
    }

    public static void main(String[] args) {
        ChangeLetter3 changeLetter3 = new ChangeLetter3();
        System.out.println(changeLetter3.changeVowels2("almafa"));
    }
}
*/


