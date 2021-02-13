package searching;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BookArraySearch {

    private Book[] bookArray;

    public BookArraySearch(Book[] bookArray) {
     this.bookArray = bookArray;
    }

    public Book findBookByAuthorTitle(String name, String title) {
        if(isEmpty(name) || isEmpty(title)){
            throw new IllegalArgumentException("Author or title must not be empty!");
        }

        List<Book> books = new ArrayList<>(Arrays.asList(bookArray));
        Book k =new Book(name,title);
        Collections.sort(books);
        //Arrays.sort(bookArray);
        int result = Collections.binarySearch(books,k);//Arrays.binarySearch(bookArray,k);
        if(result<0){
            throw new IllegalArgumentException("No book found by " + name + " with title " + title);
        }
        return books.get(result);
    }

    private boolean isEmpty(String txt){
        if(txt==null || txt.equals("")){
            return true;
        }else {
            return false;
        }
    }
}
