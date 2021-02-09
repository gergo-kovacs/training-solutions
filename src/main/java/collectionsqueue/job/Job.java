package collectionsqueue.job;

import java.util.List;

public class Job implements Comparable<Job>{
    private final int priority;
    private final String jobDescription;
    private final boolean urgent;


    public Job(int priority, String jobDescription) {
        this.priority = priority;
        this.jobDescription = jobDescription;
        this.urgent= priority < 5;
    }


    public boolean isUrgent() {
        return urgent;
    }


    @Override
    public int compareTo(Job o) {
        if(this.getPriority() == o.getPriority()){
            return 0;
        }else if(this.getPriority() < o.getPriority()){
            return -1;
        }else {
            return 1;
        }
    }
    public String getJobDescription(){
        return this.jobDescription;
    }

    public int getPriority() {
        return this.priority;
    }
}
