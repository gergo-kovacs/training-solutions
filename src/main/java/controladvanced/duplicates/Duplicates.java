package controladvanced.duplicates;

import java.util.ArrayList;
import java.util.List;

public class Duplicates {
    public List<Integer> find(List<Integer> integersList){
        List<Integer> integers = new ArrayList<>();
        for (int i = 0; i < integersList.size()-1; i++) {
            if(integersList.get(i).equals(integersList.get(i+1))){
                integers.add(integersList.get(i));
            }
        }
        return integers;
    }
}




