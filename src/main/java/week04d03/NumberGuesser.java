package week04d03;

import java.util.Random;
import java.util.Scanner;

public class NumberGuesser {
    public static void main(String[] args) {

        Random rand = new Random();
        int number = rand.nextInt(100) + 1;
        boolean valasz = false;
        Scanner scan = new Scanner(System.in);

        System.out.println("Kérek egy számot!");
        int num = scan.nextInt();

        do {

            if (num > number) {
                System.out.println("Kisebb számra gondoltam.");
                num =scan.nextInt();
            } else if (num < number) {
                System.out.println("Nagyobb számra gondoltam.");
                num=scan.nextInt();
            } else {
                valasz=true;
                System.out.println("Talált!");
            }
        } while (valasz != true);

    }

}
