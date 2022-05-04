package FileHandlingPrograms;
import java.io.*;
public class FileWriterExample {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		FileWriter f = new FileWriter("C:\\filewriter.txt");
		f.write("Hello Welcome to Java");
		f.close();
		System.out.println("Success");
	}
}