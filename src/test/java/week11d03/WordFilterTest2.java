package week11d03;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class WordFilterTest2 {
    List<String> stringList = Arrays.asList("citrom", "banán", "Cicero");
    List<String> resultList = Arrays.asList("citrom", "Cicero");

    @Test
    public void TestWordsWithChar() {

        Assertions.assertEquals(resultList, new WordFilter2().wordsWithChar(stringList, 'c'));
    }
}