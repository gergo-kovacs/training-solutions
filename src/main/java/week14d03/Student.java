package week14d03;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Student {

    private String name;
    Map<String, List<String>> markBook = new HashMap<>();

    public Student(String name) {
        this.name = name;
    }

    public void writeInBook(String subject, String mark){
        if(markBook.containsKey(subject)){
            List<String> marks = new ArrayList<>();
            marks.add(mark);
            markBook.put(subject,marks);
        }else{

            markBook.put(subject,new ArrayList<>());
            List<String> marks = new ArrayList<>();
            marks.add(mark);
            markBook.put(subject,marks);
        }
    }




}
