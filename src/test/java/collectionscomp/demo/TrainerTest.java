package collectionscomp.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.text.Collator;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class TrainerTest {

    @Test
    public void testSort(){
        List<String> names = Arrays.asList("Joe","Jack","Jane");
        System.out.println(names);
        Collections.sort(names);
        System.out.println(names);

        Assertions.assertEquals(Arrays.asList("Jack","Jane","Joe"),names);

    }

    @Test
    public void testTrainersSort(){
        List<Trainer> trainers = Arrays.asList(
            new Trainer("Joe",3),
            new Trainer("Jack",2),
            new Trainer("Jane",1)
        );

        Collections.sort(trainers);
        System.out.println(trainers.toString());
        Collections.sort(trainers, new SalaryComparator());
        System.out.println(trainers);


        Collections.sort(trainers, new Comparator<Trainer>(){
            @Override
            public int compare(Trainer o1, Trainer o2) {
                return o1.getName().length() - o2.getName().length();
            }
        });
        System.out.println(trainers);


    }

    public class SalaryComparator implements Comparator<Trainer>{
        @Override
        public int compare(Trainer o1, Trainer o2) {
            return o1.getSalary() - o2.getSalary();
        }


    }

    @Test
    public void testSortWithAccutes(){
        List<String> names = Arrays.asList("Joe","Jack","Jane","Ábel","éva","jack");
        Collections.sort(names, Collator.getInstance(new Locale("hu","HU")));
        System.out.println(names);
    }



}