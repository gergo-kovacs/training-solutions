package inheritanceattributes.order;


import inheritanceattributes.book.Book;

public class ShippedBook extends Book {

    private int shippingost;

    public ShippedBook(String title, int price, int shippingCost) {
        super(title, price);
        this.shippingost = shippingCost;
    }
    public int order(int pieces){
        return pieces * price +shippingost;
    }

    public String toString(){
        return this.getTitle() + ":" + price + " - " + shippingost;
    }
}
