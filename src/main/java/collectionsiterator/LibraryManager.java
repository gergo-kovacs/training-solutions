package collectionsiterator;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class LibraryManager {

    Set<Book> libraryBooks;

    public LibraryManager(Set<Book> libraryBooks) {
        this.libraryBooks = libraryBooks;
    }

    public Book findBookByRegNumber(int regNumber){
        Book lookingBook;
        for (Book libraryBook : libraryBooks) {
            lookingBook = libraryBook;
            if (lookingBook.getRegNumber() == regNumber) {
                return lookingBook;
            }

        }

        throw new MissingBookException("No books found with regnumber: "+regNumber);

    }


    public int removeBookByRegNumber(int regNumber){
        Book lookingBook;
        Iterator<Book> i= libraryBooks.iterator();
        while(i.hasNext()){
            lookingBook=i.next();
            if(lookingBook.getRegNumber()==regNumber){
                i.remove();
                return lookingBook.getRegNumber();
            }

        }
        throw new MissingBookException("No books found with regnumber: "+regNumber);
    }


    public Set<Book> selectBooksByAuthor(String author){
        Book lookingBook;
        Set<Book> selectedBooks = new HashSet<>();
        for (Book libraryBook : libraryBooks) {
            lookingBook = libraryBook;
            if (lookingBook.getAuthor().equals(author)) {
                selectedBooks.add(lookingBook);
            }
        }
        if(selectedBooks.size()>0){
            return selectedBooks;
        }else{
            throw new MissingBookException("No books found by "+author);
        }
    }

    public int libraryBooksCount(){
        return libraryBooks.size();
    }
}
