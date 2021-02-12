package collectionsclass;

import java.util.*;

public class CollectionManager{

    List<Book> bookList;
    public CollectionManager(List<Book> bookList) {
    this.bookList=bookList;
    }

    public List<Book> createUnmodifiableLibrary() {
        return Collections.unmodifiableList(bookList);
    }

    public List<Book> reverseLibrary(){
        List<Book> reverseList = new ArrayList<>(bookList);
        Collections.sort(reverseList);
        Collections.reverse(reverseList);
        return reverseList;
    }

    public Book getFirstBook(){
        return Collections.min(bookList);
    }

    public Book getLastBook(){
        return Collections.max(bookList);
    }


}
