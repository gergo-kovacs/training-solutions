package week07d03;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NumberListTest {

    @Test
    public void isIncreasingTest(){
        List<Integer> list = Arrays.asList(1,2,3,3,5,6);
        List<Integer> list2 = Arrays.asList(-1,2,3,3,5,6);
        List<Integer> list3 = Arrays.asList(1,2,3,8,15,16);

        Assertions.assertEquals(true, new NumberList().isIncreasing(list));
        Assertions.assertEquals(true, new NumberList().isIncreasing(list2));
        Assertions.assertEquals(true, new NumberList().isIncreasing(list3));
    }
}
