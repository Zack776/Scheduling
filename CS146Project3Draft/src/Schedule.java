import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Schedule {
	// instance field
	private int numJobs; // total number of jobs in the graph/schedule
	/**
	 * The adjacency list here is for a directed graph.
	 * The general idea is that each job, say job 1 has references to outgoing jobs.
	 * Meaning, the jobs that are dependent on it(job 1).
	 * so the head of each linkedlist will be the job the succeeding jobs are dependent on
	 * The ArrayList is of type linkedlists- it holds the linklists- where each represents a node
	 * and its dependencies 
	 */
	ArrayList<Job> jobList; 
	
	/**
	 * No args constructor:
	 */
	public Schedule() {
		// Instantiate adjList:
		jobList = new ArrayList<>();
	
	}
	
	
	//inner class
	class Job{
		int time; // time it takes for job to run; the "weight" associated with a particular edge
		LinkedList<Job> edges; // incoming edges
		int jobIndex; 
		
		// no args constructor:
		private Job() {
			edges = new LinkedList<>();
		}
		// Job methods:
		
		
		public void requires(Job j) {
			edges.add(j);
		}
		/*
		public int start() {
			// Case 1: Valid times
		
			if(edges.isEmpty()) {
				return 0;
			}
			else if(jobs are indep.) {
				return sum of jobs in edges list;
			// Case 2: loop
			if(there is a loop) {
				return -1
			}
		
			return 0;	
		}
	}
		*/
		private void setTime(int t) {
			this.time = t;
		}
	}
	
	// Schedule methods:
	
	public Job insert(int t) {
		Schedule.Job job = new Job();
		job.setTime(t);
		jobList.add(job); // add to list of jobs
		job.jobIndex = jobList.indexOf(job);
		return job;
	}
	
	public Job get(int index) {
		Schedule.Job j1 = this.jobList.get(index);
		return j1;
		
	}

}
