package iofilestest.library;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Library{

    public static void main(String[] args) {
        Library library = new Library();
        library.add(new Book("Harari","Sapiens"));
        library.add(new Book("Andersen","The Fir-Tree"));
        library.add(new Book("Harari","Sapiens2"));
        library.add(new Book("Tomas A.","W.S."));
        Path path = Path.of("library.txt");
        library.saveBooks(path);
        library.loadBooks(path);
    }

    List<Book> bookListShoppingCart = new ArrayList<>(Arrays.asList(new Book("Harari","Homo Deus")));

    List<Book> bookListSaved = new ArrayList<>();


    public void add(Book... books){

        boolean bookChecked = false;
        for (Book b: books) {
            for (Book book:bookListShoppingCart) {
                if (book.equals(b)) {
                    bookChecked = true;
                    throw new IllegalArgumentException("Book is already in list");
                }
            }
            if(!bookChecked){
                bookListShoppingCart.add(b);
            }
        }
    }

    public void saveBooks(Path path){

        try (BufferedWriter writer = Files.newBufferedWriter(path)) {
            for (Book book: bookListShoppingCart) {
                writer.write(book.toString());
                writer.write("\n");
            }
        }
        catch (IOException ioe) {
            throw new IllegalStateException("Can not write file", ioe);
        }
    }

    public void loadBooks(Path path){
        if(path==null){
            throw new NullPointerException("Path is null!");
        }
        try (BufferedReader reader = Files.newBufferedReader(path)) {
            String line;
            while((line = reader.readLine()) != null) {
                bookListSaved.add(new Book(line.substring(0,line.indexOf("-")),line.substring(line.indexOf("-")+1)));
            }
        }
        catch (IOException ioe) {
            throw new IllegalStateException("Can not read file", ioe);
        }
        printBooks(bookListSaved);
    }

    private void printBooks(List<Book> list){
        for (Book b: list) {
            System.out.println(b.getTitle());
        }
    }


}
