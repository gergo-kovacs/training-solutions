package numbers;

import java.util.Scanner;

public class CircleMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kérem a kör átmérőjét:");
        Circle circle = new Circle(scanner.nextInt());
        System.out.println("Területe: "+circle.area()+" Kerülete: "+circle.perimeter());
    }
}
