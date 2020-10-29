package classstructureattributes;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ClientMain {

    public static void main(String[] args) {
        Client user = new Client();
        Scanner scn = new Scanner(System.in);

        System.out.println("Kérem a nevét!");
        user.name = scn.nextLine();
        System.out.println("Mikor született?");
        user.year = scn.nextInt();
        scn.nextLine();
        System.out.println("Lakcíme?");
        user.address = scn.nextLine();

        System.out.println("Név: "+user.name);
        System.out.println("Szül.év: "+user.year);
        System.out.println("Lakcím: "+user.address);


    }

}
