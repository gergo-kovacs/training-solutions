package week11d03;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import stringconcat.employee.Employee;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class WordFilterTest {

    @Test
    public void TestWordsWithChar(){

        List<String> stringList = Arrays.asList("citrom","banán","Cicero");
        List<String> resultList = Arrays.asList("citrom","Cicero");

        Assertions.assertEquals(resultList,new WordFilter().wordsWithChar(stringList,'c'));

        Exception ex = assertThrows(IllegalArgumentException.class, () -> new WordFilter().wordsWithChar(stringList,' '));
        assertEquals("Bad input.", ex.getMessage());
    }
}
