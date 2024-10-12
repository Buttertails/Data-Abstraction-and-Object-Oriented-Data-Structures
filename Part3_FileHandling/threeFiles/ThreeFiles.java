package threeFiles;

import java.io.*;
import java.util.Scanner;

/**
 * This program reads input from three files and 
 * writes the input to one output file
 * @author Drew Elliott
 */
public class ThreeFiles {

	public static void main(String[] args) {
		//Variable and array to hold the file paths of the input and output
		String outputFilePath = "files/output.txt";
		String[] filePaths = new String[] {"files/1.txt", "files/2.txt", "files/3.txt"};
		
		//Declare the input streams and output streams
		Scanner inStream = null;
		PrintWriter outStream = null;
		
		//Create an output File with the output file path
		File outputFile = new File(outputFilePath);
		
		int x = 1;
		
		try
		{
			//Creates the output file
			outStream = new PrintWriter(new FileOutputStream(outputFile, true));	
			
			//Loop to iterate through the input file paths 
			for(int i = 0; i < 3; i++)
			{
				File inputFile = new File(filePaths[i]);
				
				try
				{
					inStream = new Scanner(inputFile);
					
					//Write input to output file while there is more to read
					while(inStream.hasNextLine())
					{
						String line = inStream.nextLine();
						outStream.println(x + " " + line);
						x++;
					}
				}
				catch(FileNotFoundException e)
				{
					System.out.println("File not found");
					System.exit(0);
				}
			}
		}
		catch(FileNotFoundException e)
		{
			System.out.println("File not found");
			System.exit(0);
		}
		
		//Close the input and output files
		inStream.close();
		outStream.close();
	}

}
