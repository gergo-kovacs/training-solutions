package week14d01;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class IndexerTest {


    @Test
    public void testIndexer(){
        Map<Character, List<String>> expectedList =  Map.of('A',Arrays.asList("Aladar","Attila"),
                                                        'B',Arrays.asList("Bela"),
                                                        'C',Arrays.asList("Cecilia")
        );

        Assertions.assertEquals(expectedList, new Indexer().index(Arrays.asList("Bela","Aladar","Attila","Cecilia")));
        Assertions.assertEquals(expectedList, new Indexer().index2(Arrays.asList("Bela","Aladar","Attila","Cecilia")));
    }

    @Test
    public void testIndexerIfSet(){
        Map<Character, Set<String>> expectedList =  Map.of('A',Set.of("Attila"),
                                                        'B',Set.of("Bela"),
                                                        'C',Set.of("Cecilia")
        );

        Assertions.assertEquals(expectedList, new Indexer().index3(Arrays.asList("Bela","Bela","Aladar","Attila","Cecilia")));

    }
}