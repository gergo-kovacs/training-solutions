package week05d03;


import java.util.Arrays;
import java.util.List;


public class ListCounter {

    public static void main(String[] args) {
        ListCounter lc = new ListCounter();
        List<String> word;

        word = Arrays.asList("egy","alma","az","Alma","fa","alatt");
        System.out.println(lc.listCounter(word));

    }
    public int listCounter(List<String> texts){

        if(texts.size()==0){
            return 0;
        }
        int counter = 0;

        for (String t:texts) {
             if(t.charAt(0)=='A' || t.charAt(0)=='a'){
                counter++;
            }
        }

        return counter;
    }
}
