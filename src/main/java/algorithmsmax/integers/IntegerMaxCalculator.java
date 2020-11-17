package algorithmsmax.integers;

import java.util.List;

public class IntegerMaxCalculator {

    public Integer max(List<Integer> integers){
        Integer max=0;
        for (Integer i:integers) {
            if(max<integers.get(i)){
                max=integers.get(i);
            }
        }
        return max;
    }
}
