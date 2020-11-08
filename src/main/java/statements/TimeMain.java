package statements;

import java.util.Scanner;

public class TimeMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Add meg az első időpontot!");
        System.out.println("Hány óra?");
        int h1 = scanner.nextInt();

        System.out.println("Hány perc?");
        int m1 = scanner.nextInt();

        System.out.println("Hány másodperc?");
        int s1 = scanner.nextInt();

        System.out.println("Add meg a második időpontot!");
        System.out.println("Hány óra?");
        int h2 = scanner.nextInt();

        System.out.println("Hány perc?");
        int m2 = scanner.nextInt();

        System.out.println("Hány másodperc?");
        int s2= scanner.nextInt();

        Time first = new Time(h1,m1,s1);
        Time second = new Time(h2,m2,s2);

        System.out.println("Az első időpont "+first.toString()+" = "+first.getMinutes()+" perc");
        System.out.println("A második időpont "+second.toString()+" = "+second.getInSeconds()+" másodperc");
        System.out.println("Az első korábbi, mint a második: "+first.earlierThan(second));

    }
}
