package collectionsautoboxing;

import java.util.ArrayList;
import java.util.List;

public class IntegerOperations {

    private List<Integer> integers = new ArrayList<>();

    public List<Integer> createList(int... i) {
        for (int n: i) {
            integers.add(n);
        }
        return integers;
    }

    public int sumIntegerList(List<Integer> list) {
        int sum = 0;
        for (Integer i: list) {
            sum+=i;
        }
        return sum;
    }

    public int sumIntegerObjects(int... i) {
        return sumIntegerList(createList(i));
    }
}
