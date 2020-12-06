package week06d04;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

//egy Budget osztályt, amely a konstruktorában Item példányokat vár
// listában (List). Az Item tartalmazza az alábbi attribútumokat:
// int price, int month, String name. A Budget osztály tárolja el
// egy attribútumban a konstruktorban megkapott items listát.
// Írjunk egy metódust, getItemsByMonth néven, mely egy hónapot vár
// (1-12) és visszaadja az Itemeket az adott hónapban! Bónusz feladat:
// ellenőrizzük a bemeneti paramétereket és írjunk tesztet!
public class Budget {

    private List<Item> itemList;


    public Budget(List<Item> items) {
        itemList=items;
    }

    public List<Item> getItemsByMonth(int month){
        if(month<1 || month>12){
            throw new IllegalArgumentException("There is no such month.");
        }
        List<Item> result= new ArrayList<>();
        for (Item i:itemList) {
            if(i.getDate().getMonthValue()==month){
            result.add(i);
            }

        }
        return result;
    }

}
