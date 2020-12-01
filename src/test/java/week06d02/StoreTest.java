package week06d02;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class StoreTest {

    List<Product> products = new ArrayList<>();
    Product product1 = new Product();
    Product product2 = new Product();


    @Test
    public void test1(){
        product1.setName("Chibo");
        product1.setPrice(1000);
        product1.setCategory(Category.OTHER.toString());
        product2.setName("Chibo");
        product2.setPrice(2000);
        product2.setCategory(Category.FROZEN.toString());
        Assertions.assertEquals(0,new Store(products).getProductByCategoryName(Category.FROZEN));
    }
}
