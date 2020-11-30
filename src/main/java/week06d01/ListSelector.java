package week06d01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListSelector {

    public static void main(String[]args){
    ListSelector ls = new ListSelector();
    List<String> list1;

    list1 = Arrays.asList("A", "B", "C", "D", "E", "F");
    list1 = Arrays.asList("A", "B", "C");
    List<String> list2 = new ArrayList<>();

    System.out.println(list1);
    System.out.println(ls.selector(list2));

    }

   public StringBuilder selector(List<String> list){
       StringBuilder sb = new StringBuilder("");
       if(list == null){
           throw new IllegalArgumentException("Parameter must not be empty!");
       }
       if(isEmpty(list)){
           return sb;
       }
       sb.append("[]");
       for (int i = 0; i < list.size(); i++) {
           if(i%2==0){
               sb.insert(sb.length()-1,list.get(i));
           }
       }
       return sb;
   }

   //private boolean isEmpty(String text){
   //     return text == null || text == "".trim();
   //}

   private boolean isEmpty(List<String> texts){
       return texts.size()==0;
   }

}
