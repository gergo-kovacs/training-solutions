package finalmodifier;

public class PiMain {
    public static void main(String[] args) {
        CircleCalculator circle = new CircleCalculator();
        CylinderCalculator cylinder = new CylinderCalculator();

        System.out.println("Pi: "+ CircleCalculator.PI);

        System.out.println(circle.calculateArea(3.0));
        System.out.println(circle.calculatePerimeter(3.0));
        System.out.println(cylinder.calculateSurfaceArea(3.0,10));
        System.out.println(cylinder.calculateVolume(3.0,10));

    }
}
