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
import java.util.HashSet;
import java.util.List;

public class MaxTravel {

    public static void main(String[] args) {
        MaxTravel maxTravel = new MaxTravel();
        List<Integer> list = Arrays.asList(1, 5, 12, 12, 12, 3, 3, 3, 3, 3, 0, 0, 0, 0, 0, 0);
        HashSet hashSet = new HashSet<Integer>(list);
        System.out.println(hashSet);
        System.out.println(maxTravel.getMaxIndex(list));
    }

    public int getMaxIndex(List<Integer> lines) {
        List<Integer> busStops = new ArrayList<>();
        busStops.add(lines.get(0));
        for (Integer line : lines) {
            if (!busStops.contains(line)) {
                busStops.add(line);
            }
        }

        int max = getMax(busStops, lines);
        System.out.println(busStops);
        return max;
    }

    private int getMax(List<Integer> busStops, List<Integer> list) {
        int max = 0;
        int counter = 0;
        int busStopMaxPassengers = list.get(0);

        for (Integer busStop : busStops) {
            for (int i : list) {
                if (i == busStop) {
                    counter++;
                }
            }
            if (counter > max) {
                max = counter;
                busStopMaxPassengers = busStop;
            }
            counter = 0;
        }
        return busStopMaxPassengers;
    }


}
