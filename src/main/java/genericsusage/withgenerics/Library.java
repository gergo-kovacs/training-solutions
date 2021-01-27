package genericsusage.withgenerics;

import genericsusage.Book;

import java.util.List;

public class Library {

    public Book getFirstBook(List<Book> listOfBook){
        if(listOfBook == null){
           throw new NullPointerException();
        }
        if(listOfBook.isEmpty()){
            throw new IllegalArgumentException("Argument should not be empty!");
        }

        return listOfBook.get(0);
    }
}
