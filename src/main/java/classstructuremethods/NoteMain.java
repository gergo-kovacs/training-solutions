package classstructuremethods;

import java.util.Scanner;

public class NoteMain {
    public static void main(String[] args) {

        Note user1 = new Note();

        Scanner scn = new Scanner(System.in);

        System.out.println("Name: ");
        String name = scn.nextLine();
        user1.setName(name);
        System.out.println("Topic: ");
        String topic = scn.nextLine();
        user1.setTopic(topic);
        System.out.println("text: ");
        String text = scn.nextLine();
        user1.setText(text);
        System.out.println(user1.getNoteText());

    }
}
