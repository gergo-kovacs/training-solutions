package week15d05;

import java.util.ArrayList;
import java.util.List;

public class SplitDemo {

    public static void main(String[] args) {
        String s0 ="alma,, körte, meggy,";
        String s ="alma,, \"körte, körte\", meggy,";


        StringBuilder sb = new StringBuilder();
        List<String> parts = new ArrayList<>();

        boolean insideValue = false;
        for(char c: s.toCharArray()){
            if(c == '\"'){
                insideValue = !insideValue;
            }
            if(c != ','){
                sb.append(c);
            }else{
                if(!insideValue){
                    parts.add(sb.toString());
                    sb=new StringBuilder();
                }else{
                    sb.append(',');
                }
            }
        }
        for (String i: parts) {
            System.out.println(i);
        }
    }

}
