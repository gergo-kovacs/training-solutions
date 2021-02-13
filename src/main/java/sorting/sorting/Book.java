package sorting.sorting;

import sorting.trainer.Trainer;

import java.util.Comparator;
import java.util.Objects;

public class Book implements Comparable<Book>{
    private int id;
    private String title;
    private String author;

    public Book(int id, String author,String title) {
        this.id = id;
        this.title = title;
        this.author = author;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public int compareTo(Book o) {
        Integer id = o.id;
        Integer thisId = this.id;
        return thisId.compareTo(id);
    }

    @Override
    public String toString() {
        return id + " " + author +" " + title;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;  //Object ?
        Book book = (Book) o;   //Object
        return id == book.id;    //Book
    }

    @Override
    public int hashCode() {
        return id;
    }
}
