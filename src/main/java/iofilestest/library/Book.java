package iofilestest.library;

import java.util.Objects;

public class Book {

    private String author;
    private String title;

    public Book(String author, String title) {
        if(author.isEmpty()||title.isEmpty()){
            throw new IllegalArgumentException("author or title is invalid");
        }
        this.author = author;
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return author + "-" + title;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(author, book.author) && Objects.equals(title, book.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(author, title);
    }
}
