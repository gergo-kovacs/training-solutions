package introinheritance.basket;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Basket {

    private List<Item> items = new ArrayList<>();

    public void addItem(Item item){
    items.add(item);
    }

    public void removeItem(String barcode){
        Item removed = null;

        for(Item i:items) {
            if(i.getBarcode().equals(barcode)){
                removed = i; //

            }
        }
        items.remove(removed);
    }

    public void clearBasket(){
        items.clear();
    }

    public List<Item> getItems(){
        return new ArrayList<Item>(items);
    }
}
