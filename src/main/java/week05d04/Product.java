package week05d04;
//Készíts egy week05d04.Product osztályt melyben egy termékről tárolod a nevét és a lejárati dátumát
// (LocalDate). Legyen egy konstruktora, ami a nevet kapja meg illetve a lejárati dátumot három részletben int year, int month, int day. (public Product(String name, int year, int month, int day))
//A lejárati dátumot a konstruktorban állítsd össze.
//Legyen mindkettőhöz getter metódus.
//Készíts egy week05d04.Store osztályt, melyben van egy Productokat tároló lista. Legyen benne egy addProduct(Product) metódus.
//Bónusz: Legyen benne egy getNumberOfExpired() metódus ami visszaadja a lejárt termékek számát. Használd a LocalDate.now() és az isBefore() metódusokat.
import java.time.LocalDate;

public class Product {
    private String name;
    private LocalDate date;

    public Product(String name, int year, int month, int day){
        this.date.withYear(year);
        this.date.withMonth(month);
        this.date.withDayOfMonth(day);
        this.name=name;
    }

    public String getName() {

        return name;
    }

    public LocalDate getDate() {

        return date;
    }

}
