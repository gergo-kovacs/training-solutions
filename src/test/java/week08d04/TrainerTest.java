package week08d04;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TrainerTest {

    @Test
    public void testTrainer(){
        Assertions.assertEquals(5,new GoodMood().giveMark());
        Assertions.assertEquals(3,new BadMood().giveMark());
    }
}
