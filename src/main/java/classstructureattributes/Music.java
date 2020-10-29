package classstructureattributes;

import java.util.Scanner;

public class Music {
    public static void main(String[] args) {
        Song myMusic = new Song();
        Scanner scan = new Scanner(System.in);

        System.out.println("Kedvenc dalszerző? ");
        myMusic.band = scan.nextLine();
        System.out.println("Kedvenc zeneszáma? ");
        myMusic.title = scan.nextLine();
        System.out.println("Zene hossza?");
        myMusic.length = scan.nextInt();

        System.out.println(myMusic.band+" - "+myMusic.title+" ("+myMusic.length+" perc)!");

    }
}
