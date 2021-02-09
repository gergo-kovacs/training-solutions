package collectionsqueue.collectionsdeque;

import collectionsqueue.job.Job;
import collectionsqueue.job.NoJobException;

import java.util.*;

public class JobQueue {

    Queue<Job> jobList = new PriorityQueue<>();

    public Deque<Job> addJobByUrgency(Job... jobs) {

        Deque<Job> jobList = new ArrayDeque<>();
        for (int i = 0; i < jobs.length; i++) {
            if(jobs[i].isUrgent()){
               jobList.addFirst(jobs[i]);
            }else{
                jobList.addLast(jobs[i]);
            }
        }

        return jobList;
    }

    public Job dispatchUrgentJob(Deque<Job> jobs) throws NoJobException {
        if(jobs.isEmpty()){
            throw new NoJobException("No job available, get a rest!");
        }

        return jobs.getFirst();
    }

    public Job dispatchNotUrgentJob(Deque<Job> jobs) {

        return jobs.getLast();
    }
}
