package week06d02;

public class Product {
    private String name;
    private String category;
    private int price;



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public int getPrice() {
        return price;
    }
}
