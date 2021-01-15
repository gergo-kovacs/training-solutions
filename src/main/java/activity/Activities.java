package activity;

import java.util.ArrayList;
import java.util.List;

public class Activities {

    private List<Activity> activities;

    public Activities(List<Activity> activityList){
        activities = activityList;
    }

    public void addActivity(Activity activity){
        activities.add(activity);
    }

    public List<Report> distancesByTypes0(){
        List<Report> reports = new ArrayList<>();
        for (Activity activity : activities) {
            if(activity instanceof ActivityWithoutTrack){
                reports.add(new Report(activity.getType(), activity.getDistance()));
            }
            if(activity instanceof ActivityWithTrack){
                reports.add(new Report(activity.getType(), activity.getDistance()));
            }

        }

        return reports;
    }

    public List<Report> distancesByTypes(){
        List<Report> reports = new ArrayList<>();
        double[] distancesSum = new double[4];

        for (int i = 0; i < activities.size(); i++) {
             Activity activ = activities.get(i);
            for (int j = 0; j < ActivityType.values().length; j++) {
                if(activ.getType() == ActivityType.values()[j]){
                    distancesSum[j] += activ.getDistance();
                }
            }
        }
        for (int i = 0; i < distancesSum.length; i++) {
            reports.add(new Report(ActivityType.values()[i],distancesSum[i]));
        }
        return reports;
    }


    public int numberOfTrackActivities(){
        int counter=0;
        for (Activity a:activities) {
            if(a instanceof ActivityWithTrack){
                counter++;
            }
        }
        return counter;
    }

    public int numberOfWithoutTrackActivities(){
        int counter=0;
        for (Activity a:activities) {
            if(a instanceof ActivityWithoutTrack){
                counter++;
            }
        }
        return counter;
    }

}
