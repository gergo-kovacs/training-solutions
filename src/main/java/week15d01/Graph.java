package week15d01;

import jvm.D;

import java.util.*;

public class Graph {

    //Adott egy függvénygrafikon a koordináta rendszerben.
    //A grafikon néhány pontját megkapjuk egy Map-ben.
    //A map kulcsa az x koordináta értéke pedig az y koordináta. Döntsük el,
    //hogy a kapott pontok küzül, hol van a függvénynek maximum helye és ott mennyi az értéke.

    public static void main(String[] args) {
        Graph graph = new Graph();
        Map<Double,Double> testMap = new TreeMap<>();
        testMap.put(3.0,4.0);
        testMap.put(5.0,6.0);
        testMap.put(7.0,5.0);
        System.out.println(graph.graphMax(testMap));
    }
    public String graphMax(Map<Double,Double> graphPoints){

        Iterator<Double> iterator = graphPoints.keySet().iterator();
        Double tmpMaxPlace=0.0;
        double tmpMaxValue=0;

        while(iterator.hasNext()){

            Double key   = iterator.next();
            Double value = graphPoints.get(key);
            if(tmpMaxValue<value){
                tmpMaxValue=value;
                tmpMaxPlace=key;
            }
        }
        return "X="+tmpMaxPlace+" helyen van a maximuma és értéke:"+tmpMaxValue;
    }
}
