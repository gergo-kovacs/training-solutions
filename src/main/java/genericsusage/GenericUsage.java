package genericsusage;

import java.util.ArrayList;
import java.util.List;



public class GenericUsage {

    public static void main(String[] args) {
        GenericUsage gu = new GenericUsage();
        gu.t();


    }
    public void t(){
        Object foo = "foo";
        Character b = 'b';
        String text = "da";
        List list = new ArrayList();
        list.add(foo);
        list.add((Object) b);
        list.add((Object) text);
        System.out.println((String) list.get(0));
        //System.out.println((String) list.get(1));  //ClassCastException

        List list2 = new ArrayList();
        list2.add("text1");
        list2.add("text2");
        list2.add(10);

        String t1 = (String) list2.get(0);
        //String t2 = (String) list2.get(2); //ClassCastException



    }

}
