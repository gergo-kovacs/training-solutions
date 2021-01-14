package week11d02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Courier {

    List<Ride> rideList = new ArrayList<>();

    public void addRide(Ride ride){
        boolean nextRide = false;

        if(rideList.isEmpty()){
            rideList.add(ride);
        }else{
            for (Ride value : rideList) {
                if (ride.getDay() >= value.getDay()) {
                    nextRide = true;
                }
            }
        }

        if(nextRide) {
            if (ride.getDay() == rideList.get(rideList.size() - 1).getDay()) {
                if (ride.getNumber() > rideList.get(rideList.size() - 1).getNumber() && ride.getNumber()
                        < rideList.get(rideList.size() - 1).getNumber()+2) {
                    rideList.add(ride);
                }else{
                    throw new IllegalArgumentException("Not a good input.");
                }
            }
            else if(ride.getDay()>rideList.get(rideList.size()-1).getDay()){
                if(ride.getNumber()==1){
                    rideList.add(ride);
                }
            }else{
                throw new IllegalArgumentException("Not a good input.");
            }
        }
    }

    public int getDayOff(){
        List<Integer> week = Arrays.asList(0,0,0,0,0,0,0);
        for (int i = 0; i < rideList.size(); i++) {
            week.set(rideList.get(i).getDay()-1,rideList.get(i).getDay());
        }
        for (Integer i:week) {
            System.out.print(i);
        }
        for (int i = 0; i < week.size(); i++) {
            if(week.get(i)==0){
                return i+1;
            }
        }
        return 0;
    }

}


