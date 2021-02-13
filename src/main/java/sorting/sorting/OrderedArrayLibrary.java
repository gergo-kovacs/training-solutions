package sorting.sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class OrderedArrayLibrary{


    private Book[] bookArray;

    public OrderedArrayLibrary(Book... bookArray) {
        this.bookArray = bookArray;
    }


    public Book[] sortingById(){
        Book[] books = new Book[bookArray.length];
        Arrays.sort(booksCopy(books));
        return books;
    }



    public Book[] sortingByTitle(){
        Comparator<Book> comparator = new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getTitle().compareTo(o2.getTitle());
            }
        };

        Book[] books = Arrays.copyOf(bookArray,bookArray.length-1);
        Arrays.sort(books,comparator);
        return books;
    }


    public int compare(Book o1, Book o2) {
        return o1.getTitle().compareTo(o2.getTitle());
    }


    private Book[] booksCopy(Book[] booksArray){
        int i=0;
        while(i!=bookArray.length){
            booksArray[i] = bookArray[i];
            i++;
        }
        return booksArray;
    }



}
