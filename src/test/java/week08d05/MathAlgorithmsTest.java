package week08d05;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MathAlgorithmsTest {

    @Test
    public void testGreatestCommonDivisor(){
        Assertions.assertEquals(2, new MathAlgorithms().greatestCommonDivisor(6,8));
    }
}
