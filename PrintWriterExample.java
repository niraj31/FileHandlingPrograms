package FileHandlingPrograms;
import java.io.*;
public class PrintWriterExample {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		PrintWriter pw = new PrintWriter(System.out);
		pw.write("Using Printwriter");
		pw.close();
		
		PrintWriter w1 = null;
		w1=new PrintWriter(new File("C:\\printwriter.txt"));
		w1.write("Welcome to Java");
		w1.close();
		
	}

}
