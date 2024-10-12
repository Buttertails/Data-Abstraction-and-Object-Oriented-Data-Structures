package readWrite;

import java.util.Scanner;
import java.io.*;

public class ReadToFile {

	public static void main(String args[]) {
		String fileName = "files/out.txt";
		File file = new File(fileName);
		
		Scanner inStream = null;
		
		try
		{
			inStream = new Scanner(file);
		}
		catch(FileNotFoundException e)
		{
			System.out.println("File not found");
			System.exit(0);
		}
		
		while(inStream.hasNextLine())
		{
			System.out.println(inStream.nextLine());
		}
		
		inStream.close();
	}
}
