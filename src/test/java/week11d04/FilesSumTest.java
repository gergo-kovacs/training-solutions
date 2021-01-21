package week11d04;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FilesSumTest {

    @Test
    void sumNumbersTest() {

        Assertions.assertEquals(16, new FilesSum().sumNubers());
    }
}