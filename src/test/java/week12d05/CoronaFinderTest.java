package week12d05;

import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

import static org.junit.jupiter.api.Assertions.*;

class CoronaFinderTest {

    @Test
    void findCoronaSearch() {

        InputStream is = CoronaFinderTest.class.getResourceAsStream("/index.htm");
        CoronaFinder cvf = new CoronaFinder();

        int n = cvf.find(new BufferedReader(new InputStreamReader(is)),"koronavírus");
        assertEquals(9,n);
    }
}