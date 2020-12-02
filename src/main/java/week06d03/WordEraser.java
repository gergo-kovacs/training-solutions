package week06d03;

import java.util.ArrayList;
import java.util.List;

public class WordEraser {
    public static void main(String[] args) {
        String s = "I want to walk my dog";
        WordEraser we = new WordEraser();

        System.out.println(we.eraseWord("alma almafa barack","alma"));
    }
    public String eraseWord(String words, String word){
        if(isEmpty(words,word)){
            throw new IllegalArgumentException("Parameter must not be empty!");
        }
        StringBuilder sb = new StringBuilder();
        String[] wordsArray = words.split(" ");
        for (String w:wordsArray) {
            if(!w.equals(word)){
                sb.append(w+" ");
            }
        }
        sb = sb.delete(sb.length()-1,sb.length());
        String result = sb.toString();
        return result;
    }

    private boolean isEmpty(String a,String b){
        return ((a==null && b==null)||((a=="") && (b=="")));
    }
}
