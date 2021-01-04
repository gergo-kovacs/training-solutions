package week10d01;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HikingTest {


    @Test
    void getPlusElevationIfListIsNull() throws IllegalArgumentException{

        Exception exception = Assertions.assertThrows(IllegalArgumentException.class, () -> new Hiking().getPlusElevation(null));
        Assertions.assertEquals("List can't be null",exception.getMessage());
    }

    @Test
    void  getPlusElevationIfListIsEmpty() throws IllegalArgumentException{
        List<Double> list = new ArrayList<>();
        Exception exception = Assertions.assertThrows(IllegalArgumentException.class, () -> new Hiking().getPlusElevation(list));
        Assertions.assertEquals("List can't be empty",exception.getMessage());
    }

    @Test
    void getPlusElevation() {
        List<Double> list = Arrays.asList(10.0,12.0,7.0,9.0);
        Assertions.assertEquals(4.0,new Hiking().getPlusElevation(list));
    }
}
