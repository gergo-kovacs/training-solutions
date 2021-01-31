package week02d03;
//Írj egy Product oszályt String name és String code attribútumokkal!
//Legyen egy konstruktora a két attribútummal! Legyen egy areTheyEqual()
//metódusa, mely kap egy másik Product példányt,
//és eldönti, hogy azonos-e az adott példánnyal.
//Két termék akkor egyezik, ha a nevük megegyezik.


public class Product {

    private String name;
    private String code;

    public Product(String name, String code) {
        this.name = name;
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    public boolean areTheyEqual(Product product){
        return this.getName().equals(product.getName());
    }

    public static void main(String[] args) {
        Product product1 = new Product("asztal","2423");
        Product product2 = new Product("szék","2993");
        Product product3 = new Product("asztal","6423");

        System.out.println(product1.areTheyEqual(product2));
    }
}
