package classstructureio;

import java.util.Scanner;

public class Registration {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Kérem a nevét: ");
        String name;
        name = scanner.nextLine();

        System.out.print("Kérem az email címét: ");
        String email;
        email = scanner.nextLine();


        System.out.println("Név: "+name);
        System.out.println("Email: "+email);
    }
}
