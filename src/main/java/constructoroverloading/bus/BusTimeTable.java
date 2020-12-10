package constructoroverloading.bus;

import java.util.ArrayList;
import java.util.List;

public class BusTimeTable {
    List<SimpleTime> simpleTimes = new ArrayList<>();

    public BusTimeTable(List<SimpleTime> timeTable){
    this.simpleTimes=timeTable;
    }

    public BusTimeTable(int firstHour, int lastHour, int everyMinute){

        for (int i = firstHour; i <= lastHour; i++) {
            simpleTimes.add(new SimpleTime(i, everyMinute));
        }
    }

    public List<SimpleTime> getTimeTable(){
    return simpleTimes;
    }

    /*
    public SimpleTime nextBus(SimpleTime actual){

        for (SimpleTime t:simpleTimes) {
            if(t.getHours()>actual.getHours()){
                return t;
            }
        }
        throw new IllegalStateException("No more buses today!");
    }
    */

    public SimpleTime nextBus(SimpleTime actual){

        for (SimpleTime t:simpleTimes) {
            if(t.difference(actual)>0){
                return t;
            }
        }
        throw new IllegalStateException("No more buses today!");
    }
}
