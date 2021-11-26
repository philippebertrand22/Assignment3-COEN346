import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Scanner;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.FileWriter;

public class Driver extends Thread {
	public static void main(String[] args) throws FileNotFoundException
	{
		// choosing how many processes and their ids
		int processes[] = { 1, 2, 3, 4};
		int n = processes.length;
	
		// Burst time of the processes
		int burst_time[] = {10, 5, 8, 12};
	
		// quantum of the round robin
		int quantum = 2;
		RR.AVGtime(processes, n, burst_time, quantum);

		File file = new File("input.txt");
		Scanner scan = new Scanner(file);
		
				while (scan.hasNextLine()){
					System.out.println("Sussy Baka");
				}

		PrintStream out = new PrintStream(new FileOutputStream("output.txt"));		
       
	}
}
