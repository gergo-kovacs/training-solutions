package week07d04;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalTime;

public class LabTest {


    @Test
    public void createWithTitle(){
        Lab lab = new Lab("Task");
        Assertions.assertFalse(lab.isCompleted());
        Assertions.assertEquals("Task",lab.getTitle());
    }

    @Test
    public void createWithTitleAndDate(){
        Lab lab = new Lab("Task2",LocalTime.of(10,20));
        Assertions.assertTrue(lab.isCompleted());
    }

    @Test
    public void tostringLabTest(){
        Assertions.assertEquals("Lab{name='tutorial', completed=false, completedAt=null}",
                new Lab("tutorial").toString());
    }

}
