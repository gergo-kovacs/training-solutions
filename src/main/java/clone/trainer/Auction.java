package clone.trainer;

public class Auction {

    private int price;
    private User user;
    private Product product;

    public Auction(int price, User user, Product product) {
        this.price = price;
        this.user = user;
        this.product = product;
    }

    public Auction(Auction another){
        this.price = another.price;
        this.user  = another.user;
        this.product = new Product(another.product);
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
