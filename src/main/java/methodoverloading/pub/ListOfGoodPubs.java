package methodoverloading.pub;

import methodoverloading.Time;

import java.util.List;

public class ListOfGoodPubs {
    public List<Pub> pubList;

    public ListOfGoodPubs(List<Pub> pubList) {
        if(isEmpty(pubList)){
            throw new IllegalArgumentException("Pub list is empty!");
        }
        this.pubList = pubList;
    }

    public Pub findTheBest(){
        Time earlier = new Time(24,59);
        for (int i = 0; i < pubList.size(); i++) {
            if(pubList.get(i).getOpenFrom().isEarlier(earlier)){
               earlier=pubList.get(i).getOpenFrom();
            }
        }
        int index=0;
        for (int i = 0; i < pubList.size(); i++) {
            if(pubList.get(i).getOpenFrom().isEqual(earlier)){
                index=i;
            }
        }
        return pubList.get(index);
    }

    private boolean isEmpty(List<Pub> pubs){
        return pubs == null || pubs.size()<1;
    }
}
