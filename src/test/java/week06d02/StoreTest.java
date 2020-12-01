package week06d02;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StoreTest {


    @Test
    public void getEvenIndexElementsTest() {
        Store store = new Store(Arrays.asList(
                new Product("Bosch", Category.FROZEN, 1000),
                new Product("Lehel", Category.FROZEN, 2000),
                new Product("Mars", Category.OTHER, 1000)
        ));

        assertEquals(2, store.getProductByCategoryName(Category.FROZEN));

    }
}