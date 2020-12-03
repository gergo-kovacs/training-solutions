package methodstructure.pendrives;

import java.util.List;

/*
*     Legyen Pendrive best(List<Pendrive>) metódusa, amely a legjobb ár/kapacitás értékű
*  pendrive-t adja vissza, azaz amelyiknél ez a legkisebb.
    Legyen Pendrive cheapest(List<Pendrive>) metódusa, amely a legolcsóbbat adja vissza.
    Legyen void risePriceWhereCapacity(List<Pendrive>, int percent, int capacity) metódusa,
    * amely adott százalékkal
    *  megemeli azon pendrive-ok árát, amelynek a kapacitása a megadott értékkel megegyezik.
* */
public class Pendrives {

    public Pendrive best(List<Pendrive> pendrives) {

        Pendrive best = pendrives.get(0);
        for (int i = 0; i < pendrives.size() - 1; i++) {
            if (1 == best.comparePricePerCapacity(pendrives.get(i + 1))) {
                best = pendrives.get(i + 1);
            }
        }
        return best;
    }
    public Pendrive cheapest(List<Pendrive> pendrives){
        Pendrive cheap = pendrives.get(0);
            for (int i = 0; i < pendrives.size()-1; i++) {
                if(!cheap.cheaperThan(pendrives.get(i+1))){
                    cheap=pendrives.get(i+1);
                }

        }
            return cheap;
    }

    public void risePriceWhereCapacity(List<Pendrive> pendrives, int percent, int capacity){
        for (Pendrive p:pendrives) {
            if(p.getCapacity()==capacity){
                p.risePrice(percent);
            }
        }
    }

}
