package week07d02;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DigitSumTest {

    @Test
    public void testSumODigits(){
        Assertions.assertEquals(8,new DigitSum().sumOfDigits(1025));
        Assertions.assertEquals(5,new DigitSum().sumOfDigits2(32));
        Assertions.assertEquals(3,new DigitSum().sumOfDigits3(003));

    }
}
