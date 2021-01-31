package week02d05;


import java.util.ArrayList;
import java.util.List;

public class Language {
    public static void main(String[] args) {

        List<String> languages = new ArrayList<>();
        String[] lang = {"Java","Python","Javascript"};
        for (int i = 0; i < lang.length; i++) {
            languages.add(lang[i]);
        }

        for (String item:languages) {
            if(item.length()>5){
            System.out.println(item);
            }
        }

    }
}
