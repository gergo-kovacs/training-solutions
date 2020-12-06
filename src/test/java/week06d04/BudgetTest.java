package week06d04;

import org.junit.jupiter.api.Test;
import stringscanner.StringScanner;
import week06d03.WordEraser;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class BudgetTest {

    @Test
    public void testParameters(){
    List<Item> list = new ArrayList<>();
    list.add(new Item(1920,2,10,1000,"sa"));
    list.add(new Item(1920,2,10,1000,"sb"));

        Exception ex = assertThrows(IllegalArgumentException.class, () -> new Budget(list).getItemsByMonth (13));
        assertEquals("There is no such month.", ex.getMessage());
    }
}
