package week13d05;

import java.util.HashSet;
import java.util.Set;

public class DataStructure {

    //Junior (adatszerkezetes) feladat:
    //Írj egy metódust, amely megszámolja, hogy hány különböző betű van
    //egy szóban. A kis és nagybetűk közötti különbség nem számít!
    //A space-eket, számjegyeket, stb. ne vegye figyelembe! Csak az
    //angol ábécé betűit!

    public Integer characterCounter(String word){
        word=word.toLowerCase();
        Set<Character> characters = new HashSet<>();

        for (int i = 0; i < word.toCharArray().length-1; i++) {
            int numberAscii =  word.charAt(i);
            if(numberAscii>96 && numberAscii <123){
                characters.add(word.toCharArray()[i]);
            }
        }


        return characters.size();
    }
}
