package enumtype.week;

import java.util.ArrayList;
import java.util.List;

public class WorkdayCalculator {
    public List<DayType> dayTypes(Day firstDay, int numberOfDays) {

        List<DayType> days = new ArrayList<>();
        
        Day parameters = firstDay;
        for (int i = 0; i < numberOfDays; i++) {
            
            days.add(parameters.getDayType());
            parameters = nextDay(parameters);
        }

        return days;
    }

    private Day nextDay(Day day) {
        int index;
        if(day.ordinal()==Day.values().length-1){
            index = 0;
        }else{
            index = day.ordinal() + 1;
        }
        return Day.values()[index];
    }
}
