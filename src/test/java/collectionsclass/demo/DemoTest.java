package collectionsclass.demo;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DemoTest {

    @Test
    public void testReverse(){
        List<Integer> l = Arrays.asList(1,2,3,4);

        List<Integer> elements = Collections.unmodifiableList(l);
        Collections.reverse(l);
        System.out.println(l);
        System.out.println(elements);
        //Collections.reverse(elements);  //UnsupportedOperationException
    }

}