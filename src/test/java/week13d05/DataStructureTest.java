package week13d05;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DataStructureTest {

    @Test
    void aVoid() {
        Assertions.assertEquals(4,new DataStructure().characterCounter("a lmaFA"));
    }
}