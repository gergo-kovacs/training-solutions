package week08d01;

public class Robot {

    public Point point = new Point(0,0);

    public Point move(String movement){
        movement = movement.toUpperCase();
        for (int i = 0; i < movement.length(); i++) {
            moveOneStep(movement.charAt(i));
        }
        return this.point;
    }

    private void moveOneStep(char step){
        switch(step){
            case 'F':{
                point.increaseY();
                return;
            }
            case 'L':{
                point.decreaseY();
                return;
            }
            case 'J':{
                point.increaseX();
                return;
            }
            case 'B':{
                point.decreaseX();
                return;
            }
            default: throw new IllegalArgumentException("wrong character!");
        }
    }
}
