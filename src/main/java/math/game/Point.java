package math.game;

public class Point {

    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public double distance(Point other){
        double result = Math.sqrt(Math.pow(other.getX()-getX(),2)+Math.pow(other.getY()-getY(),2));
        return result;
    }
}
