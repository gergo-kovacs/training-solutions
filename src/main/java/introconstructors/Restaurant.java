package introconstructors;

import java.util.ArrayList;
import java.util.List;

public class Restaurant {
    List<String> menu = new ArrayList<>();
    String name;
    int capacity;

    public List<String> getMenu() {
        return menu;
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    public Restaurant(String name, int numberOfTables) {
        this.name = name;
        capacity = numberOfTables*4;
        menuInput();
    }

    private void menuInput(){
        String[] foods = {"levesA","levesB","főételA","főételB"}; ;
        for (int i = 0; i < foods.length; i++) {
            menu.add(foods[i]);
        }
    }

}
