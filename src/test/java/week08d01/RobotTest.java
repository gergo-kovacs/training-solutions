package week08d01;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class RobotTest {

    @Test
    public void testMove(){
        Robot robot1 = new Robot();
        int[] array = {1,0};

        assertTrue(Arrays.equals(array, robot1.move("J")));
    }

    @Test
    public void testWrongMove(){
        Robot robot1 = new Robot();
        int[] array = {0,1};

        assertFalse(Arrays.equals(array, robot1.move("J")));
    }
}
