package week10d02;
//Van egy egész számok listája, amelyben egy szám azt jelzi,
//hogy az adott számú buszmegállóban egy ember fel akar szállni.
//A 12,12,0,3,4,4 sorozat tehát azt jelenti, hogy a 12-es buszmegállóban 2-en, a 0-ásban 1 ember, 3-asban egy ember,
//4-esben 2 ember akar felszállni.
//A MaxTravel osztály getMaxIndex() metódusa adja vissza,
//hogy hanyas megállóban szeretnének a legtöbben felszállni. Maximum 30 megálló lehet.
//(Ahányszor szerepel egy szám a listában, annyian akarnak felszállni.  Egy elem a listában egy felszállót jelent.)

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MaxTravel {

    public static void main(String[] args) {
        MaxTravel maxTravel = new MaxTravel();
        List<Integer> list = Arrays.asList(1,5,12,12,12,3,3,3,3,3,0);

         System.out.println(maxTravel.getMaxIndex(list));
    }

    public int getMaxIndex(List<Integer> lines){
        List<Integer> passengers = new ArrayList<>();
        int counter=1;

        for (int i = 0; i < lines.size()-1; i++) {
            if(lines.get(i).equals(lines.get(i+1))){
            counter++;
            }else {
                passengers.add(counter);
                counter=1;
            }
        }
        int max=0;
        for (Integer passenger : passengers) {
            if (passenger > max) {
                max = passenger;
            }
        }
        System.out.println(passengers);
        return max;
    }

}
