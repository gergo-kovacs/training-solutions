package algorithmsdecision.integers;

import java.util.ArrayList;
import java.util.List;

public class IntegerDecisionMaker {
//List<Integer> numbers = new ArrayList<>();

    public boolean containsGreaterThan(List<Integer> numbers,int n){
        for (int i: numbers) {
            if(i==n){
                return true;
            }
        }
        return false;
    }

    public boolean containsLowerThan(List<Integer> numbers,int k){
        for (int i: numbers) {
            if(i<k){
                return true;
            }
        }
        return false;
    }
}
