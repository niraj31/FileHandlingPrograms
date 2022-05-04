package FileHandlingPrograms;
import java.io.*;
public class PrintStreamExample {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		FileOutputStream fout = new FileOutputStream("C:\\demofile.txt");
		PrintStream ps = new PrintStream(fout);
		
		ps.println(2016);
		ps.println("Hello Java");
		
		ps.close();
		fout.close();
		
		System.out.println("File printed..");

	}

}
