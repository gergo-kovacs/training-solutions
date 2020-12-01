package week06d02;

import java.util.ArrayList;
import java.util.List;

public class Store {
    private List<Product> productList;

    public Store(List<Product> productList) {
        this.productList = productList;
    }

    public List<Product> getProductList() {
        return new ArrayList<>(productList);
    }

    public int getProductByCategoryName(Category category){
        int count = 0;
        for (Product p:productList) {
            if(p.getCategory()==category){
                count++;
            }
        }
        return count;
    }


}
