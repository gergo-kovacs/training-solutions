package week07d04;

import java.time.LocalTime;

public class Lab {

    private final String title;
    private boolean completed;
    private LocalTime completedAt;

    public Lab(String title) {
        this.title = title;
    }

    public Lab(String name, LocalTime completedAt) {
        this.title = name;
        this.completedAt = completedAt;
        this.completed = true;
    }

    public String getTitle() {
        return title;
    }

    public boolean isCompleted() {
        return completed;
    }

    public LocalTime getCompletedAt() {
        return completedAt;
    }

    public void complete(LocalTime date){
        this.completedAt = date;
        this.completed = true;
    }

    public void complete(){
        this.completedAt = LocalTime.now();
    }

    @Override
    public String toString() {
        return "Lab{" +
                "name='" + title + '\'' +
                ", completed=" + completed +
                ", completedAt=" + completedAt +
                '}';
    }
}
