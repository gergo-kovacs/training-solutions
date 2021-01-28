package collectionslist;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.AssertionsKt;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class TrainerTest {

    @Test
    public void testList(){
        List<String> l = new LinkedList<>(); //new ArrayList<>();
        l.add("John");
        l.add("Jack");
        Assertions.assertEquals(Arrays.asList("John","Jack"),l);
        System.out.println(l);

        Collection<String> c = l;
        c.add("Jane");

        System.out.println(l);
        c.remove("Jack");
        System.out.println(l);

        l.add(0,"Tom");
        Assertions.assertEquals(Arrays.asList("Tom","John","Jane"),c);
        Assertions.assertEquals(l.get(1),"John");

        l.add("Tom");

        Assertions.assertEquals(3,l.lastIndexOf("Tom"));
    }

}