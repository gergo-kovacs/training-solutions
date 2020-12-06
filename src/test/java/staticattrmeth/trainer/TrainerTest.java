package staticattrmeth.trainer;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class TrainerTest {

    @Test
    public void testCreate(){
        System.out.println(Trainer.numberOfTrainers);
        assertEquals(1,new Trainer("JD").numberOfTrainers);
        assertEquals(2,new Trainer("JS").numberOfTrainers);
        assertEquals(3,new Trainer("JN").numberOfTrainers);
    }

    /*@Test
    public void testCreate2(){
        System.out.println(Trainer.numberOfTrainers);
        Trainer t = new Trainer("John Doe");
        assertEquals(1,t.numberOfTrainers);

    }*/
}
