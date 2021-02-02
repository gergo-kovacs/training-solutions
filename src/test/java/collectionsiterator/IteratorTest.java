package collectionsiterator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IteratorTest {

    @Test
    public void testRemove(){
        List<Integer> integerList = Arrays.asList(1,2,3,4,5,6);
        Assertions.assertEquals(6,integerList.size());
        //integerList.add(10); //UnsupportedOperationException
        System.out.println(integerList.toString());
        integerList = new ArrayList<>(Arrays.asList(1,2,3,4,5,6));
        integerList.add(10);
        System.out.println(integerList.toString());
        // foreach -> //ConcurentModificationException
        Iterator<Integer> integerIterator = integerList.iterator();
        while(integerIterator.hasNext()){
            int j = integerIterator.next();
            if(j%2==0) {
                integerIterator.remove();
            }
        }
        System.out.println(integerList);
    }
}
