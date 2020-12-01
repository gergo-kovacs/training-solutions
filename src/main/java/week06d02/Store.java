package week06d02;

import java.util.ArrayList;
import java.util.List;

public class Store {
    public List<Product> productList;

    public Store(List<Product> productList) {

        this.productList = productList;
    }

    public int getProductByCategoryName(Category category){
        int count = 0;
        for (Product p:productList) {
            if(p.getName().toLowerCase().equals(category.name().toLowerCase())){
                count++;
            }
        }
        return count;
    }


}
