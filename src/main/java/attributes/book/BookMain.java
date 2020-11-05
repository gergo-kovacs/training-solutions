package attributes.book;

public class BookMain {
    public static void main(String[] args) {
        Book book = new Book("Java");
        String text = book.getTitle();
        System.out.println(text);
        //System.out.println(book.title);
        book.setTitle("PHP");
        System.out.println(book.getTitle());
    }
}
