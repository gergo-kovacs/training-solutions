package week03d02;


import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;

public class Position {
    String name;
    int bonus;

    public Position(String name, int bonus) {
        this.name = name;
        this.bonus = bonus;
    }

    public String getName() {
        return name;
    }

    public int getBonus() {
        return bonus;
    }

    public String toString(){
        return ""+name;
    }


    public static void main(String[] args) {

        List<Position> positions = new ArrayList<>();
        positions.add(new Position("worker1",20000));
        positions.add(new Position("worker2",30000));
        positions.add(new Position("worker3",400000));
        positions.add(new Position("worker4",150001));

        for (Position item:positions) {
            if(item.getBonus()>150000){
                System.out.println(item.toString());
            }
        }
    }
}
