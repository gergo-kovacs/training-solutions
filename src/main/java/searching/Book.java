package searching;

public class Book implements Comparable<Book>{

    private int id;
    private String title;
    private String author;

    public Book(int id,String author ,String title ) {
        this.id = id;
        this.title = title;
        this.author = author;
    }

    public Book(String author, String title ) {
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
        if(this.author.compareTo(o.author) != 0){
            return this.author.compareTo(o.author);
        }else{
            return this.title.compareTo(o.title);
        }

    }

    @Override
    public String toString() {
        return id +" "+ author +" "+title;
    }
}
