package genericsusage.withoutgenerics;

import genericsusage.Book;

import java.util.ArrayList;
import java.util.List;

public class Library {


    public Book getFirstBook(List listOfBooks){
        if(listOfBooks==null){
            throw new NullPointerException();
        }

        if(listOfBooks.isEmpty()){
            throw new IllegalArgumentException("Argument should not be empty!");
        }
        Object book = listOfBooks.get(0);
        if(!isBook(book)){
            throw new ClassCastException("Not a book");
        }

    return ((Book) book);
    }

    private boolean isBook(Object b){
        return b instanceof Book;
    }

}
