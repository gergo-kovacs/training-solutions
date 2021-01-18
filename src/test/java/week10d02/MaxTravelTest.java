package week10d02;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MaxTravelTest {

    @Test
    void getMaxIndex() {
    List<Integer> list = Arrays.asList(1,2,2,5,12,112,0,0,0,0,0,0);

        Assertions.assertEquals(0,new MaxTravel().getMaxIndex(list));
    }
}