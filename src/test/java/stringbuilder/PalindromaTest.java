package stringbuilder;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PalindromaTest {
    @Test
    public void nullParameterShouldThrowException() throws IllegalArgumentException {
        Exception ex = assertThrows(IllegalArgumentException.class, () -> new Palindroma().isPalindrome(null));
        assertEquals("Text must not be null!", ex.getMessage());
    }

    @Test
    public void isPalindrome() {

        assertTrue(new Palindroma().isPalindrome("Racecar"));
        assertFalse(new Palindroma().isPalindrome("start"));
        assertTrue(new Palindroma().isPalindrome(""));
        assertTrue(new Palindroma().isPalindrome("\n\t"));
    }
}
