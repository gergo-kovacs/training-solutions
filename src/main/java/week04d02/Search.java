package week04d02;

import java.util.ArrayList;
import java.util.List;

public class Search {

    public static void main(String[] args) {
        Search main = new Search();
        System.out.println(main.getIndexesOfChar("kefe",'e'));
    }

    List<Integer> getIndexesOfChar(String str, char c) {
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)==c){
                result.add(i);
            }
        }

        return result;
    }
}