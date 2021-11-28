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
		Scanner scanner = new Scanner(System.in);
			System.out.println("Enter how many processes to launch ");

			int processes = scanner.nextInt();
		
		RR newThreads[] = new RR[processes];
		int n = newThreads.length;
	
		// Burst time of the processes this is only changed manually
		int burst_time[] = {2, 1, 4, 6};

		//this is the function that prints out everything
		RR.WaitTime(newThreads, n, burst_time);

		//scanning the input text
		File fileInput = new File("input.txt");
		try (Scanner scan = new Scanner(fileInput)) {
			while (scan.hasNextLine()){
				System.out.println("Sussy Baka");
			}
		}


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
