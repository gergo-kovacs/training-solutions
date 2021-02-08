package week14d01;

import java.util.*;

//Mai junior/medior feladat:
//Készíts egy Indexer osztályt, melynek van egy public Map<Character, List<String>> index(List<String> names) metódusa.
// A feladat az, hogy egy indexet készítsünk a megadott nevek kezdőbetűiből
// (minden kezdőbetűt társítsunk az összes névvel, mely ezzel a betűvel kezdődik).
//Példa:
//System.out.println(new Indexer().index(Arrays.asList("Odon", "Lujza", "Abraham", "Magdolna")));
//// {A=[Abraham], L=[Lujza], M=[Magdolna], O=[Odon]}
public class Indexer {

    public static void main(String[] args) {
        Indexer indexer = new Indexer();
        System.out.println(indexer.index(Arrays.asList("Odon", "Lujza", "Abraham", "Magdolna")).values());
        System.out.println(indexer.index2(Arrays.asList("Odon", "Lujza", "Abraham", "Magdolna")).values());

    }

    public Map<Character, List<String>> index(List<String> names){
        Map<Character,List<String>> nameWithIndex = new HashMap<>();
        for (int i = 0; i < names.size(); i++) {
            Character ch = names.get(i).charAt(0);

            if(!nameWithIndex.containsKey(ch)){
                nameWithIndex.put(ch,new ArrayList<>());
            }
        }
        for (int i = 0; i < names.size(); i++) {
            if(nameWithIndex.containsKey((Character) names.get(i).charAt(0))){
                nameWithIndex.get((Character) names.get(i).charAt(0)).add(names.get(i));
            }
        }
        return nameWithIndex;
    }


    public Map<Character, List<String>> index2(List<String> names) {
        Map<Character, List<String>> nameWithIndex = new HashMap<>();
        for (int i = 0; i < names.size(); i++) {
            Character chKey = names.get(i).charAt(0);

            if (!nameWithIndex.containsKey(chKey)) {
                nameWithIndex.put(chKey, new ArrayList<>());
            }
                nameWithIndex.get(chKey).add(names.get(i));


        }

        return nameWithIndex;
    }

    public Map<Character, Set<String>> index3(List<String> names) {
        Map<Character, Set<String>> nameWithIndex = new HashMap<>();

        for (String s: names) {

            Character key =s.charAt(0);
            if(!nameWithIndex.containsKey(s)){
                nameWithIndex.put(key,new HashSet<>());
            }
            nameWithIndex.get(key).add(s);

        }

        return nameWithIndex;
    }
}