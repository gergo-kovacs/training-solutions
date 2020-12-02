package week06d03;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import week06d01.ListSelector;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class WordEraserTest {

    @Test
    public void testIfIsNull(){
        Exception ex = assertThrows(IllegalArgumentException.class, () -> new WordEraser().eraseWord(null,null));
        assertEquals("Parameter must not be empty!", ex.getMessage());
    }
    @Test
    public void testParameters(){

        assertEquals("almafa barack", new WordEraser().eraseWord("alma almafa barack","alma"));
    }



}
