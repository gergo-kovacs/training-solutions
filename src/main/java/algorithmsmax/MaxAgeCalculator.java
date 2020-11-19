package algorithmsmax;

import java.util.ArrayList;
import java.util.List;

public class MaxAgeCalculator {

    public Trainer trainerWithMaxAge(List<Trainer> trainers){
        Trainer oldest = null;
        for (Trainer item:trainers) {
            if((oldest.getAge() > item.getAge()) || oldest==null){
                oldest = item;
            }
        }
        return oldest;
    }
}
