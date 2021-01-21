package meetingrooms;

import java.util.ArrayList;
import java.util.List;

public class Office {
    List<MeetingRoom> meetingRooms = new ArrayList<>();

    public void addMeetingRoom(MeetingRoom meetingRoom) {
        meetingRooms.add(meetingRoom);
    }

    public void printNames() {
        for (MeetingRoom item:meetingRooms) {
            System.out.println(item.name);
        }
    }

    public void printNamesReverse() {
        for (int i = meetingRooms.size()-1; i >= 0 ; i--) {
            System.out.println(meetingRooms.get(i).name);
        }
    }


    public void EventNames() {
        for (int i = 0; i < meetingRooms.size(); i++) {
            if(i%2==0){
                System.out.println(meetingRooms.get(i).getName());
            }
        }
    }


    public void Areas() {
        for (MeetingRoom item:meetingRooms) {
            System.out.println("Tárgyaló neve: "+item.name);
            System.out.println("magasság: "+item.getLength());
            System.out.println("szélesség: "+item.getWidth());
            System.out.println("terület: "+item.getArea()+"m2"+"\n");
        }
    }

    public void MeetingRoomsWithName(String name) {
        for (MeetingRoom item:meetingRooms) {
            if(item.name.equals(name)){
                System.out.println("Tárgyaló neve: "+item.name);
                System.out.println("magasság: "+item.getLength());
                System.out.println("szélesség: "+item.getWidth());
                System.out.println("terület: "+item.getArea()+"m2"+"\n");
            }
        }
    }

    public void MeetingRoomsContains(String part) {
            for (MeetingRoom item:meetingRooms) {
                if(item.getName().toLowerCase().contains(part) || item.getName().toUpperCase().contains(part)){
                   // System.out.println(item.getName());
                    System.out.println("magasság: "+item.getLength());
                    System.out.println("szélesség: "+item.getWidth());
                    System.out.println("terület: "+item.getArea()+"m2"+"\n");
                }
            }
    }

    public void printAreasLargerThan(int area) {
        for (MeetingRoom item:meetingRooms) {
            if(item.getArea()>area){
                System.out.println("Tárgyaló neve: "+item.name);
                System.out.println("magasság: "+item.getLength());
                System.out.println("szélesség: "+item.getWidth());
                System.out.println("terület: "+item.getArea()+"m2"+"\n");
            }
        }

    }
}
