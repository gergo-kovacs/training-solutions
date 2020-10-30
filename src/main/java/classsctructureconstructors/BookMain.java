package classsctructureconstructors;

import java.util.Scanner;

public class BookMain {
    public static void main(String[] args) {

        Book konyv1 = new Book("Kövesdán Gábor","Szoftverfejlesztés JAVA SE platformon");
        konyv1.register("2");

        System.out.println("Szerző: "+konyv1.getAuthor());
        System.out.println("Cím: "+konyv1.getTitle());
        System.out.println("Reg.szám: "+konyv1.getRegNumber());



    }
}
