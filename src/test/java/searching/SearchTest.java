package searching;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SearchTest {

    @Test
    public void testArraySearch(){
        int[] i= {1,3,5,34,7,9,12};

        Assertions.assertEquals(1,Arrays.binarySearch(i,3));
        Assertions.assertTrue(0>Arrays.binarySearch(i,123));
        Arrays.sort(i);
        Assertions.assertEquals(3,Arrays.binarySearch(i,7));

    }

    @Test
    public void testListSearch() {
        List<Integer> list = Arrays.asList(1,3,5,6,7,9,12);

        Assertions.assertEquals(2, Collections.binarySearch(list,5));
        Assertions.assertTrue(0>Collections.binarySearch(list,234));
    }

    }
