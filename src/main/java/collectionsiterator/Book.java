package collectionsiterator;

import java.util.Objects;

public class Book {

    public static void main(String[] args) {
        Book book1 = new Book(10,"a","ab");
        Book book2 = new Book(10,"a","ab");
        Book book3 = new Book(11,"a","ab");

        System.out.println(book1.equals(book2));
    }

    private int regNumber;
    private String title;
    private String author;

    public Book(String title, String author){
        this.title = title;
        this.author = author;
    }

    public Book(int regNumber, String title, String author) {
        this(title,author);
        this.regNumber = regNumber;
    }

    public int getRegNumber() {
        return regNumber;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return regNumber == book.regNumber && Objects.equals(title, book.title) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(regNumber, title, author);
    }
}
