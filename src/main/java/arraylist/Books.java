package arraylist;

import java.util.ArrayList;
import java.util.List;

public class Books {
    private List<String> titles = new ArrayList<>();

    public void add(String book){
        titles.add(book);
    }

    public List<String>findAllByPrefix(String prefix){
        List<String> eureka = new ArrayList<>();
        for (int i = 0; i < titles.size(); i++) {
        if(titles.get(i).startsWith(prefix))
            eureka.add(titles.get(i));
        }
        return eureka;
    }

    public List<String> getTitles(){
        return titles;
    }

    public static void main(String[] args) {
        Books books = new Books();
        books.add("A madarak");
        books.add("A kutyák");
        books.add("A macskák");

        System.out.println(books.getTitles());
        System.out.println(books.findAllByPrefix("A ma"));
    }
}
