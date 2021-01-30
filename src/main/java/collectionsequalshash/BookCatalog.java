package collectionsequalshash;

import java.util.*;

public class BookCatalog {


   public Book findBookByTitleAuthor(List<Book> books, String title, String author){

       for (Book b: books) {
           if(b.getTitle().equals(title) && b.getAuthor().equals(author)){

              return b;
           }
       }
       return null;

   }


   /*

    public Book findBookByTitleAuthor(List<Book> books, String title, String author){
        Book book = new Book(title,author);
        int result=0;
        if(!books.contains(book)) {
            return null;

        }else {

            for (int i = 0; i < books.size(); i++) {
                if (books.get(i).getTitle().equals(title) && books.get(i).getAuthor().equals(author)) {
                    result = i;
                }
            }


        }
        return books.get(result);
    }

*/




    public Book findBook(List<Book> books, Book book){
        if(books.contains(book)){
            int i = books.indexOf(book);
            return books.get(i);
        }
       return null;
    }

    public Set<Book> addBooksToSet(Book[] books){
        Set<Book> bookSetList = new HashSet<>();//TreeSet<>();
        for (Book b:books) {
            bookSetList.add(b);
        }
       return bookSetList;
    }

}
