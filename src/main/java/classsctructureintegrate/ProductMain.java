package classsctructureintegrate;

import java.util.Scanner;

public class ProductMain {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Termék neve? ");
        String product = scan.nextLine();
        System.out.println("Termék ára? ");
        int cost = scan.nextInt();

        Product termek1 = new Product(product, cost);

        System.out.println(termek1.getName() + " " + termek1.getPrice());

        termek1.decreasePrice(100);
        System.out.println("decrease -> " + termek1.getName() + " " + termek1.getPrice());

        termek1.increasePrice(51);
        System.out.println("increase -> " + termek1.getName() + " " + termek1.getPrice());

    }
}
