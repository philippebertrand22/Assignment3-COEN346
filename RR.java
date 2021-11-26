public class RR extends Driver
{
	static void WaitTime(int processes[], int n, int BurstTime[], int WaitingTime[], int quantum)
	{
	
		int remaining_BT[] = new int[n];
		for (int i = 0 ; i < n ; i++)
			remaining_BT[i] = BurstTime[i];
	
		int t = 0; // start time at 0
	
		// body of the round robin
		while(true)
		{
			boolean Complete = true;
	
			for (int i = 0 ; i < n; i++)
			{
				// if remaining burst time is more than 0 then put through round robin
				if (remaining_BT[i] > 0)
				{
					Complete = false;
	
					// if remaining burst time is bigger than quantum then, update time variable and update new remaining burst time
					if (remaining_BT[i] > quantum)
					{
						t = t + quantum; 
	
						remaining_BT[i] = remaining_BT[i] - quantum;
					}
	
					// if remaining burst time is smaller than quantum then, update time variable, set total waiting time for this process
					// set remaining burst time to zero since, process completed
					else
					{
						t = t + remaining_BT[i];
	
						WaitingTime[i] = t - BurstTime[i];
	
						remaining_BT[i] = 0;
					}
				}
			}
	
			// break means all processes are done
			if (Complete == true)
			break;
		}
	}
	// calculating average from all waiting times
	static void AVGtime(int processes[], int n, int burstTime[],
										int quantum)
	{
		int waitTime[] = new int[n];
		int totalWaitTime = 0;
	
		// finding wait time
		WaitTime(processes, n, burstTime, waitTime, quantum);
	
		// output
		System.out.println("Processes " + " Burst time " +
					" Waiting time ");
	
		// calculate total waiting time
		for (int i=0; i<n; i++)
		{
			totalWaitTime = totalWaitTime + waitTime[i];
			System.out.println(" " + (i+1) + "\t\t" + burstTime[i] +"\t " +
							waitTime[i]);
		}
	
		System.out.println("Average waiting time = " +
						(float)totalWaitTime / (float)n);
	}
	
}
