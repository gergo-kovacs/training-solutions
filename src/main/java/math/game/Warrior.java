package math.game;

import java.util.Random;

public class Warrior {

    private String name;
    private int stamina;
    private double skill = Math.random();
    Point position;

    public Warrior(String name, Point point) {
        position = point;
        this.name = name;
        Random random = new Random();
        stamina = random.nextInt(81)+20;
    }

    public Point getPosition(){
        return position;
    }

    public void move(Warrior warriorTarget){
        int stepX = position.getX();
        int stepY = position.getY();
        if (this.position.getX() < warriorTarget.getPosition().getX()) {
            stepX++;
        }
        if (this.position.getX() > warriorTarget.getPosition().getX()) {
            stepX--;
        }
        if (this.position.getY() < warriorTarget.getPosition().getY()) {
            stepY++;
        }
        if (this.position.getY() > warriorTarget.getPosition().getY()) {
            stepY--;
        }
        position = new Point(stepX,stepY);
    }

    public void attack(Warrior warriorTarget){
        double punch = Math.random();
        Random random = new Random();
        if(punch > this.skill){
            warriorTarget.stamina = warriorTarget.stamina-(random.nextInt(3)+1);
        }else{
            this.stamina = this.stamina-(random.nextInt(3)+1);
        }
    }

    public double distance(Warrior warrior2){
        return position.distance(warrior2.position);
    }

    public boolean isAlive(){
        return this.stamina > 0 ? true : false;
    }

    @Override
    public String toString(){
        return name+": (x"+position.getX()+"|y"+position.getY()+") "+stamina;
    }
}
