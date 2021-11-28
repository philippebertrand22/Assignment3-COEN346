public class RR extends Driver
{
	
	static void WaitTime(RR[] newThreads, int n, int BurstTime[])
	{
		int waitTime[] = new int[n];

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
					//if statement to see if its the first time the process is lauched
					if(BurstTime[i] == remaining_BT[i]){
						System.out.println("Time " + t + ", Process " + (i+1) + ", Started");
					}
					Complete = false;

					System.out.println("Time " + t + ", Process " + (i+1) + ", Resumed");

					//setting a dynamic quantum according to the problem statement
					int quantum = 2; //remaining_BT[i] * (10/100);

						System.out.println("Time " + t + ", Process " + (i+1) + ", Paused");

					// if remaining burst time is bigger than quantum then, update time variable and update new remaining burst time
					if (remaining_BT[i] > quantum)
					{
						t = t + quantum; 
	
						remaining_BT[i] = remaining_BT[i] - quantum;
					}
	
					// if remaining burst time is smaller than quantum then, update time variable, set total waiting time for this process
					// set remaining burst time to zero since, process finished
					else
					{
						t = t + remaining_BT[i];
	
						waitTime[i] = t - BurstTime[i];
	
						remaining_BT[i] = 0;

						System.out.println("Time " + t + ", Process " + (i+1) + ", Finished");

					}
				}
			}
	
			// break means all processes are done
			if (Complete == true)
			break;
		}
		// printing table
		System.out.println("Process " + " Waiting time ");
		for (int i=0; i<n; i++)
		{
			System.out.println(" " + (i+1) + "\t\t" + waitTime[i]);
		}
	}
}
