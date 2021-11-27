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

		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Enter how many processes to launch ");

			int processes = scanner.nextInt();
		}

		// choosing how many processes and their ids
		int processes[] = { 1, 2, 3, 4};
		int n = processes.length;
	
		// Burst time of the processes
		int burst_time[] = {10, 5, 8, 12};

		//this is the function that prints out everything
		RR.AVGtime(processes, n, burst_time);

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
