package week10d05;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    @Test
    public void findMinSumTest(){
        int[] testArray = {1,3,5,7,9};
        Assertions.assertEquals(16, new Calculator().findMinSum(testArray));
    }
}
