package methodchain.robot;

import java.util.ArrayList;
import java.util.List;

public class Robot {
    private int distance;
    private int azimut;
    List<NavigationPoint> navigationPointList = new ArrayList<>();


    public Robot go(int meter){
     this.distance += meter;
     return this;
    }

    public Robot rotate(int angle){
    this.azimut += angle;
    return this;
    }


    public int getDistance() {
        return distance;
    }

    public int getAzimut() {
        return azimut;
    }

    public List<NavigationPoint> getNavigationList() {
        return navigationPointList;
    }

    public Robot registerNavigationPoint(){
        navigationPointList.add(new NavigationPoint(getDistance(),getAzimut()));
        return this;
    }

}
