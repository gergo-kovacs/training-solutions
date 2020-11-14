package attributes.bill;

import java.util.ArrayList;
import java.util.List;

public class Bill {
    List<Item> items = new ArrayList<>();

    public List<Item> getItems() {
        return items;
    }

    public void addItem(Item item){
        items.add(item);
    }

    public void calculateTotalPrice(){
        double sum=0;
        for (Item i:items) {
            sum += i.getPrice() * i.getQuantity();
        }
        System.out.println(sum);
    }
}
