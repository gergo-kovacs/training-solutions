package week05d02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ChangeLetter2Test {
    @Test
    public void changeVowelsTest(){
        assertEquals("*lM*f*", new ChangeLetter().changeVowels("alMAfa"));
        assertEquals("sdfg ", new ChangeLetter().changeVowels("sdfg "));
    }

    @Test void textIsEmpty_ChangeVowelsTest() throws IllegalArgumentException{
        Exception e = assertThrows(IllegalArgumentException.class, () -> new ChangeLetter().changeVowels(""));
        assertEquals("empty string",e.getMessage());
    }

    @Test void textIsNull_ChangeVowelsTest() throws IllegalArgumentException{
        Exception e = assertThrows(IllegalArgumentException.class, () -> new ChangeLetter().changeVowels(null));
        assertEquals("Incorrect parameter string!",e.getMessage());
    }

}
