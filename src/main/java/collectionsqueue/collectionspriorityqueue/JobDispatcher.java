package collectionsqueue.collectionspriorityqueue;

import collectionsqueue.job.Job;
import collectionsqueue.job.NoJobException;

import java.util.*;

public class JobDispatcher {

    public Queue<Job> addJob(Job... jobs){

        Queue<Job> jobList = new PriorityQueue<>();
        Collections.addAll(jobList, jobs);
        return jobList;
    }

    public Job dispatchNextJob(Queue<Job> jobs) throws NoJobException {
        if(jobs.isEmpty()){
            throw new NoJobException("No job available, get a rest!");
        }

        return jobs.poll();
    }



}
