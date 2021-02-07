package collectionscomp;

import java.text.Collator;
import java.util.*;

public class OrderedLibrary{

    private List<Book> bookList;

    public OrderedLibrary(List<Book> bookList) {
        this.bookList = bookList;
    }

    public List<Book> orderedByTitle(){

        Collections.sort(this.bookList);
        return bookList;
    }

    public List<Book> orderedByAuthor(){

        Collections.sort(this.bookList,new AuthorComparator());
        return bookList;
    }

    public List<String> orderedByTitleLocale(Locale locale){

        List<String> bookListString = new LinkedList<>();
        for (Book b: bookList) {
            bookListString.add(b.getTitle());
        }
        Collator hunCollator = Collator.getInstance(locale);
        hunCollator.setStrength(Collator.PRIMARY);
        bookListString.sort(hunCollator);
        return bookListString;
    }





}
