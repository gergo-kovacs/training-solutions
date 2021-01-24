package week12d01;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class GradeRounderTest {


    @Test
    public void roundGradesTest(){
        int[] grades = new int[]{5,10,8,45,65,62,48};
        int[] test =   new int[]{5,10,8,50,70,60,50};

        Assertions.assertArrayEquals(test, new GradeRounder().roundGrades(grades));
    }

}