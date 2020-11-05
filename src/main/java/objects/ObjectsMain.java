package objects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ObjectsMain {
    public static void main(String[] args) {
    new Book();

        //ObjectsMain obj = new ObjectsMain();
        //obj.Book;
        System.out.println(new Book());  // **>objects.Book@3f99bd52

        Book emptyBook;
        //System.out.println(emptyBook);

        emptyBook=null;
        System.out.println(emptyBook);

        System.out.println(emptyBook == null);

        Book book = new Book();
        System.out.println(book);  // **>objects.Book@4f023edb

        Book anotherBook = new Book();
        System.out.println(book == anotherBook);
        anotherBook = book;
        System.out.println(anotherBook);  // **>objects.Book@4f023edb

        System.out.println(book == anotherBook);
        System.out.println(anotherBook instanceof Book);

        Book book1 = new Book();
        Book book2 = new Book();
        Book book3 = new Book();
        Book book4 = book1;
        Book book5 = book1;
        Book book6 = book3;
        Book book7 = null;
        book4 = book5;
        book5 = new Book();
        book6 = null;

        System.out.println(book1);  //
        System.out.println(book2);
        System.out.println(book3);
        System.out.println(book4);  //
        System.out.println(book5);
        System.out.println(book6);
        System.out.println(book7);

        Book[] books= {new Book(),new Book(),new Book()};
        List<Book> bookOfList = new ArrayList<>();
        bookOfList = Arrays.asList(new Book(),new Book(),new Book());
        List<Book> bookOfList2 = new ArrayList<>();
        bookOfList2= Arrays.asList();
        bookOfList2 = Arrays.asList(new Book(),new Book(),new Book());


    }
}
