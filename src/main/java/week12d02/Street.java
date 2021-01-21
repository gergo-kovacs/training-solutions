package week12d02;

/*
 Készítsd el a Site (telek) nevű osztályt. Egy telek jellemzői, páros vagy páratlan oldalon található,
  (0 = páros oldal 1 = páratlan oldal), a telek hossza méterben. Illetve egy Fence enum,
  ami a kerítés állapotát írja le. A kerités állapota lehet, PERFECT, NEED_UPGRADE, NO_FENCE.
  (konstruktor, getterek)
Készítsd el a Street neű osztályt, melyben eladott telkek listája található.
Kezdetben ez egy üres lista.
Készíts egy sellSite(Site site) metódust,
 ami egy telek eladását reprezentálja, vagyis hozzádunk egy telket a listához.
Határozd meg az utoljára eladott telek (lista utolsó eleme) házszámát, ha tudjuk,
hogy a telkeket a két oldalon egymás után adták el! (páros oldalon kettőtől,
páratlan oldalon 1-től indul a számozás)
pl:
0 10 PERFECT
0 7 NEED_UPGRADE
1 12 NEED_UPGRADE
0 9 PERFECT
0 11 NO_FENCE
1 13 PERFECT
A példában a házszámok rendre: 2,4,1,6,8,3
Készíts statisztikát, ami a kerítés állapota alapján visszaadja, hogy mennyi telket adtak el
kerítésfajtánként! (Egy metódus legyen, a visszatérési értéket ti döntitek el, de abból
legyen egyértelmű, hogy melyikből mennyit adtak el.)
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Street {

    public static void main(String[] args) {
        Street street = new Street();
        street.sellSite(new Site(0,10,Fence.PERFECT));
        street.sellSite(new Site(0,10,Fence.NEED_UPGRADE));
        street.sellSite(new Site(1,10,Fence.NEED_UPGRADE));
        street.sellSite(new Site(0,10,Fence.PERFECT));
        street.sellSite(new Site(0,10,Fence.PERFECT));
        street.sellSite(new Site(1,10,Fence.PERFECT));
        System.out.println(street.houseNumber());
        System.out.println(street.getHouseNumber());
        street.statistics();
        System.out.println(Fence.values()[0].getN());
        System.out.println(Fence.values()[1].getN());
        System.out.println(Fence.values()[2].getN());

    }

    private List<Site> sites = new ArrayList<>();

    public void sellSite(Site site){
        sites.add(site);
    }

        public int getHouseNumber() {
            int count = 0;
            int houseNumber = 0;
            Site lastHouse = sites.get(sites.size() - 1);
            for (Site item : sites) {
                if (item.getSide() == 0) {
                    count++;
                }
                if (lastHouse.getSide() == 0) {
                    houseNumber = count * 2;
                }
                if (lastHouse.getSide() == 1) {
                    houseNumber = (sites.size()-count) * 2 - 1;
                }
            }
            return houseNumber;
        }

        public List<Integer> houseNumber(){
            int even = 0;
            int odd = 1;
            List<Integer> houseNumbers = new ArrayList<>();

            for (int i = 0; i < sites.size(); i++) {
                if(sites.get(i).getSide() == 0){
                    even+=2;
                    houseNumbers.add(even);
                }else{
                    houseNumbers.add(odd);
                    odd+=2;
                }
            }
            return houseNumbers;
        }

    public void statistics() {

        for (Site site : sites) {
            for (int j = 0; j < Fence.values().length; j++) {
                if (site.getFence() == Fence.values()[j]) {
                    Fence.values()[j].setN();
                }
            }
        }

    }

}
