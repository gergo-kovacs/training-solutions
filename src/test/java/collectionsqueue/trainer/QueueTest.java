package collectionsqueue.trainer;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class QueueTest {

    @Test
    public  void testQueue(){
        Queue<Integer> q = new LinkedList<>();   //FIFO
        q.add(1);
        q.add(2);
        q.add(3);
        int e = q.element();
        System.out.println(e);

        Assertions.assertEquals(1,e);
        q.remove();
        q.remove();
        System.out.println(q);
        q.remove();
        Assertions.assertTrue(q.isEmpty());
    }

    @Test
    public void testDeque(){                    //LIFO
        Deque<Integer> d = new LinkedList<>();
        d.push(1);
        d.push(2);
        d.push(3);
        System.out.println(d);
        int i= d.peek();
        System.out.println(d);
        System.out.println(i);
        d.pop();
        System.out.println(d);
    }
}
