package week05d04;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Store {
    private List<Product> products = new ArrayList<>();

    public List<Product> getProducts() {
        return products;
    }

    public void addProduct(Product product){
        if(product==null){
            throw new IllegalArgumentException("product can't be empty");
        }
        if(isValid(product)) {
            products.add(product);
        }
    }


    private boolean isValid(Product product){
        for (Product p:products) {
            if(product.getName().equals(p)){
               return false;
            }
        }
        return true;
    }


    public int getNumberOfExpired(){
        int count=0;
        for (Product p:products) {
            if(expired(p.getDate())){
                count++;
            }
        }
        return count;
    }

    private boolean expired(LocalDate date){
        return date.isBefore(LocalDate.now());
    }


}
