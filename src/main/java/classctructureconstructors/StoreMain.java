package classctructureconstructors;

public class StoreMain {
    public static void main(String[] args) {

        Store raktar1 = new Store("ware1");
        Store raktar2 = new Store("ware2");
        System.out.println("Raktar1: "+raktar1.getStock()+" Raktar2: "+raktar2.getStock());
        raktar1.store(2);
        raktar2.store(4);
        System.out.println("Raktar1: "+raktar1.getStock()+" Raktar2: "+raktar2.getStock());
        raktar2.dispatch(1);
        System.out.println("Raktar1: "+raktar1.getStock()+" Raktar2: "+raktar2.getStock());

    }

}
