package collectionsclass.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Demo {

    List<Integer> l = Arrays.asList(1,2,3);
    List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3));


    public static void main(String[] args) {
        Demo demo = new Demo();
        demo.list.add(4);
        System.out.println(demo.list);
        //demo.l.add(5);            //UnsupportedOperationException
        List<Integer> unmodifiableList = Collections.unmodifiableList(demo.list);
        //unmodifiableList.add(10); //UnsupportedOperationException
        System.out.println(unmodifiableList.get(2));

        List<Integer> emptyL = Collections.emptyList();
        System.out.println(emptyL.size());
        //emptyL.add(100);          //UnsupportedOperationException
        List<Integer> singletL = Collections.singletonList(1);
        //singletL.add(2);          //UnsupportedOperationException

        List<Integer> elements = new ArrayList<>();
        elements.add(1);
        elements.add(2);
        List<Integer> elementsC = Collections.unmodifiableList(elements);
        //elementsC.add(3);
        elements.add(30);
        System.out.println(elements);
        System.out.println(elementsC);
    }
}
