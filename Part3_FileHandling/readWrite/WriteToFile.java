package readWrite;

import java.io.*;

public class WriteToFile {

	public static void main(String[] args) {
		String fileName = "files/out.txt";
		File file = new File(fileName);
		
		PrintWriter outStream = null;
		
		try
		{
			//outStream = new PrintWriter(fileName);
			outStream = new PrintWriter(new FileOutputStream(file, true));
		}
		catch(FileNotFoundException e)
		{
			System.out.println("file not found");
			System.exit(0);
		}
		
		outStream.println("Hello World!");
		outStream.println("Hello Java");
		
		outStream.close();
		
		
	}

}
