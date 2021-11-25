public class Driver extends Thread {
	public static void main(String[] args)
	{
		// process id's
		int processes[] = { 1, 2, 3, 4};
		int n = processes.length;
	
		// Burst time of all processes
		int burst_time[] = {10, 5, 8, 12};
	
		// Time quantum
		int quantum = 6;
		RR.findavgTime(processes, n, burst_time, quantum);
	}
}
