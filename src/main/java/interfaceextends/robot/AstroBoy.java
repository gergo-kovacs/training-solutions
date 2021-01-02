package interfaceextends.robot;

import java.util.ArrayList;
import java.util.List;

public class AstroBoy implements FlyableRobot{

    private Point position;
    private int angle;
    private List<Point> path = new ArrayList<>();
    public static final long ALTITUDE = 5;

    public AstroBoy(Point initialPoint) {
        position = initialPoint;
    }

    public void walkTo(Point position){
        path.add(position);
        this.position = position;
    }

    public void flyTo(Point position){
        path.add(position);
        this.position = position;
    }

    @Override
    public void liftTo(long altitude) {
    Point newPoint = new Point(position.getX(), position.getY(), altitude);
    this.position = newPoint;
    path.add(newPoint);
    }

    @Override
    public void moveTo(Point position) {
        path.add(position);
        this.position = position;
    }

    @Override
    public void fastMoveTo(Point position) {
        Point newPoint = new Point(position.getX(), position.getY(), ALTITUDE);
        liftTo(newPoint.getZ());
        flyTo(newPoint);
        liftTo(0);
    }

    @Override
    public void rotate(int angle) {
        this.angle = angle;
    }

    @Override
    public List<Point> getPath() {
        return path;
    }

    public Point getPosition() {
        return position;
    }

    public int getAngle() {
        return angle;
    }

    public long getAltitude() {
        return position.getZ();
    }
}
