package week06d04;

import java.time.LocalDate;

public class Item {

    private LocalDate date;
    private int price;
    private String name;

    public Item(int year,int month, int day, int price, String name) {

        this.date = LocalDate.of(year,month,day);
        this.price = price;
        this.name = name;
    }

    public LocalDate getDate() {

        return date;
    }

    public int getPrice() {

        return price;
    }

    public String getName() {
        return name;
    }
}
