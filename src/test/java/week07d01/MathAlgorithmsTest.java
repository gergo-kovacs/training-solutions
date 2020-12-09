package week07d01;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MathAlgorithmsTest {
    @Test
    public void isPrimeTest(){
        Assertions.assertTrue(new MathAlgorithms().isPrime(5));
        Assertions.assertFalse(new MathAlgorithms().isPrime(341));
    }
}
