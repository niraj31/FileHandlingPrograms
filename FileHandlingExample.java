package FileHandlingPrograms;
import java.io.*;
public class FileHandlingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			FileOutputStream f = new FileOutputStream("C:\\demo.txt");
			f.write(68);
			f.close();
			System.out.println("Success");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

}
