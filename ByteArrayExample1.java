package FileHandlingPrograms;
import java.io.*;
public class ByteArrayExample1 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		FileOutputStream f = new FileOutputStream("C:\\File1.txt");
		FileOutputStream f1 = new FileOutputStream("C:\\File2.txt");
		
		ByteArrayOutputStream b = new ByteArrayOutputStream();
		
		b.write(65);
		b.writeTo(f);
		b.writeTo(f1);
		
		b.close();
		System.out.println("Success");
		
	}

}
