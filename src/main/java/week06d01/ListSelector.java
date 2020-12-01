package week06d01;

import java.util.List;

public class ListSelector {

    public StringBuilder selector(List<String> list){
       StringBuilder sb = new StringBuilder();
       if(list == null){
           throw new IllegalArgumentException("Parameter must not be empty!");
       }
       sb.append("[]");
       for (int i = 0; i < list.size(); i+=2) {
           sb.insert(sb.length()-1,list.get(i));
       }
       return sb;
   }

}
