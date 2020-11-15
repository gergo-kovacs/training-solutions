package numbers;

public class Circle {

    private int diameter;
    private double Pi = 3.14;

    public Circle(int diameter) {
        this.diameter = diameter;
    }

    public int getDiameter() {
        return diameter;
    }

    public double getPi() {
        return Pi;
    }

    public float perimeter(){
        return (float) ((diameter)*Pi);
    }

    public float area(){
        return (float) (Math.pow((diameter/2),2)*Pi);
    }
}
