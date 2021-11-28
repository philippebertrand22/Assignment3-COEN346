import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Scanner;
import java.io.IOException;
import java.io.PrintWriter;

public class Driver extends Thread {
	public static void main(String[] args) throws FileNotFoundException
	{
		File fileInput = new File("input.txt");

		// choosing how many processes and their ids
		Scanner scanner = new Scanner(fileInput);
			int processes = scanner.nextInt();
		
		RR newThreads[] = new RR[processes];
		int counter = 0;

		// Burst time of the processes this is only changed manually
		int [] burst_time = new int [50];

		//scanning the input text
		Scanner scan = new Scanner(fileInput);

			while (scan.hasNextLine()){
				burst_time[counter++] = scan.nextInt();
			}
			
		int n = counter;

		//this is the function that prints out everything
		RR.WaitTime(newThreads, n, burst_time);

		try{
		//outputting the console to a text file
		PrintWriter out = new PrintWriter(new FileOutputStream("output.txt", true), true);
		out.close();
       }
	   catch(IOException e){
			System.out.println("Error during writing");
	   }
	}
}
