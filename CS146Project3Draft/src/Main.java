

public class Main {

	public static void main(String[] args) {
		Schedule dailyTasks = new Schedule();
		dailyTasks.insert(5);
		dailyTasks.insert(3);
		dailyTasks.insert(1);
		
		
		for(Schedule.Job jobs: dailyTasks.jobList) {
			System.out.println(jobs.jobIndex);
		}
		
		Schedule.Job j1 = dailyTasks.get(2);
		j1.requires(dailyTasks.get(0));
		System.out.println(j1.edges.size());
		
		int index = dailyTasks.insert(4).jobIndex;
		System.out.println("index"+ index);
		
		System.out.println(dailyTasks.insert(3).edges.size());
		

	}

}
