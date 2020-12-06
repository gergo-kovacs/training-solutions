package week06d05;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BiscuitTest {

    @Test
    public void testBiscuitToString(){
        Assertions.assertEquals("type=OREO, gramAmount=10",new Biscuit(BiscuitType.OREO,10).toString());
    }
}
