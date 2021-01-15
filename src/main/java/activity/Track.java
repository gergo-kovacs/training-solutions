package activity;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Track {
    List<TrackPoint> trackPoints = new ArrayList<>();

    public void addTrackPoint(TrackPoint trackPoint){
        trackPoints.add(trackPoint);
    }

    public Coordinate findMaximumCoordinate(){
        double maxLat = trackPoints.get(0).getCoordinate().getLatitude();
        double minLat = trackPoints.get(0).getCoordinate().getLongitude();

        for (int i = 1; i < trackPoints.size(); i++) {
            if(trackPoints.get(i).getCoordinate().getLatitude()>maxLat){
                maxLat = trackPoints.get(i).getCoordinate().getLatitude();
            }
        }
        for (int i = 1; i < trackPoints.size(); i++) {
            if(trackPoints.get(i).getCoordinate().getLongitude()>minLat){
                minLat = trackPoints.get(i).getCoordinate().getLongitude();
            }
        }
        return new Coordinate(maxLat,minLat);
    }

    public Coordinate findMinimumCoordinate(){
        double minLat = trackPoints.get(0).getCoordinate().getLatitude();
        double minLon = trackPoints.get(0).getCoordinate().getLongitude();

        for (int i = 1; i < trackPoints.size(); i++) {
            if(trackPoints.get(i).getCoordinate().getLatitude()<minLat){
                minLat = trackPoints.get(i).getCoordinate().getLatitude();
            }
        }
        for (int i = 1; i < trackPoints.size(); i++) {
            if(trackPoints.get(i).getCoordinate().getLongitude()<minLon){
                minLon = trackPoints.get(i).getCoordinate().getLongitude();
            }
        }
        return new Coordinate(minLat,minLon);
    }

    public double getDistance(){
        double sum = 0.0;
        for (int i = 0; i < trackPoints.size()-1; i++) {
            sum += trackPoints.get(i).getDistanceFrom(trackPoints.get(i+1));
        }
        return sum;

    }

    public double getFullDecrease(){
        double sum = trackPoints.get(0).getElevation();
        for (int i = 1; i < trackPoints.size(); i++) {
            if(sum>trackPoints.get(i).getElevation()){
                sum+= trackPoints.get(i).getElevation()-trackPoints.get(i-1).getElevation();
            }
        }
        return Math.abs(sum - trackPoints.get(0).getElevation());
    }

    public double getFullElevation(){
        double sum = trackPoints.get(0).getElevation();
        for (int i = 1; i < trackPoints.size(); i++) {
            if(sum<trackPoints.get(i).getElevation()){
                sum+= trackPoints.get(i).getElevation()-trackPoints.get(i-1).getElevation();
            }
        }
        return sum - trackPoints.get(0).getElevation();
    }

    public double getRectangleArea(){
        double a = findMaximumCoordinate().getLatitude()-findMinimumCoordinate().getLatitude();
        double b = findMaximumCoordinate().getLongitude()-findMinimumCoordinate().getLongitude();
        return a * b;
    }

    public List<TrackPoint> getTrackPoints(){
        return trackPoints;
    }

}
