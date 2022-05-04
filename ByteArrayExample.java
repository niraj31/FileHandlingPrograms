package FileHandlingPrograms;
import java.io.*;
public class ByteArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			FileOutputStream fos = new FileOutputStream("C:\\ByteArray.txt");
			String s = "Welcome to the text file";
			byte b[]=s.getBytes();
			fos.write(b);
			fos.close();
			System.out.println("File Created Successfully...");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

}
