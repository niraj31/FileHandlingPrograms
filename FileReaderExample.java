package FileHandlingPrograms;
import java.io.*;
public class FileReaderExample {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		FileReader fe = new FileReader("C:\\filewriter.txt");
		int i;
		
		while((i=fe.read())!=-1)
		{
			System.out.print((char)i);
		}
		
	}

}
