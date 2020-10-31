package classsctructureconstructors;

public class Store {

    private String product;
    private int stock=0;

    public Store(String product) {
        this.product = product;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public int getStock() {

        return stock;
    }

    public void setStock(int stock) {

        this.stock = stock;
    }

    public void store(int quantity){

        this.stock=stock+quantity;
    }

    public void dispatch(int quantity){

        this.stock = stock-quantity;
    }
}
