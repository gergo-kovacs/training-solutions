package week10d01;

import java.util.List;

public class Hiking {


    public double getPlusElevation(List<Double> elevations){
        if(elevations == null){
            throw new IllegalArgumentException("List can't be null");
        }
        if(elevations.isEmpty()){
            throw new IllegalArgumentException("List can't be empty");
        }
        double result = 0;
        for (int i = 1; i < elevations.size(); i++) {
            if(elevations.get(i)>elevations.get(i-1)){
                result += elevations.get(i)-elevations.get(i-1);
            }
        }

        return result;
    }

}
