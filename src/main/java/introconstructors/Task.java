package introconstructors;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Task {
    String title;
    String description;
    String startDateTime;
    int duration;

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getStartDateTime() {
        return startDateTime;
    }

    public int getDuration() {
        return duration;
    }

    public void start(){
      Calendar now = new GregorianCalendar();
      startDateTime = now.getTime().toString();
      System.out.println(startDateTime);
    }

    public static void main(String[] args) {

        Task task = new Task();
        task.start();
        System.out.println(task.getStartDateTime());

    }

}
