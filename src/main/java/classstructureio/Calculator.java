package classstructureio;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Kérem az első számot: ");
        int a = scanner.nextInt();
        System.out.print("Kérem a második számot: ");
        int b = scanner.nextInt();
        int c= a+b;
        System.out.println(a +" + "+ b);
        System.out.println(c);
    }

}
