package week08d03;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringListsTest {
    List<String> words = new ArrayList<>();
    List<String> anotherWordList = new ArrayList<>();
    List<String> result = new ArrayList<>();


    @Test
    public void shortestWordsTest(){
       words = Arrays.asList("kkkk","aaa","aa","bbb","ff","dd","ee");
       result = Arrays.asList("aa","dd","ee","ff");

       Assertions.assertEquals(result ,new StringLists().shortestWords(words));
    }

    @Test
    public void stringListsUnionTest(){
       words = Arrays.asList("a","b","d","e","ff","dd","ee");
       anotherWordList = Arrays.asList("f","a","bbb","ff","d");
       result = Arrays.asList("a","d","ff");

       Assertions.assertEquals(result ,new StringLists().stringListsUnion(words,anotherWordList));
    }

}
