package week14d03;

import java.util.*;

public class ClassNotBook {

    public static void main(String[] args) {
    ClassNotBook classNotBook = new ClassNotBook();
    classNotBook.add(new Student("Tom"));
    classNotBook.add(new Student("Tim"));
    classNotBook.studentsList.get(0).writeInBook("fizika","3");
    classNotBook.studentsList.get(0).writeInBook("matek","4");
        System.out.println(classNotBook.studentsList.get(0).markBook.values());
        System.out.println(classNotBook.studentsList.get(1).markBook.values());

        System.out.println(classNotBook.studentsList.get(0).markBook.keySet());

        classNotBook.sortNotebook(classNotBook.studentsList);
    }


    List<Student> studentsList = new ArrayList<>();

    public void add (Student student){
        studentsList.add(student);

    }


    public List<Student> sortNotebook(List<Student> l){

        return null;
    }
}
