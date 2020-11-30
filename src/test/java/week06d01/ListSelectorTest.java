package week06d01;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ListSelectorTest {

    @Test
    public void selectorTestIfListIsNull(){
        Exception ex = assertThrows(IllegalArgumentException.class, () -> new ListSelector().selector(null));
        assertEquals("Parameter must not be empty!", ex.getMessage());
    }

    @Test
    public void selectorTestParameters(){
        List<String> listTest = Arrays.asList("A","B","C");
        List<String> listTest2 = Arrays.asList("");

        assertEquals("[AC]",new ListSelector().selector(listTest).toString());
        assertEquals("[]",new ListSelector().selector(listTest2).toString());
    }
}
