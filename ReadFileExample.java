package FileHandlingPrograms;

import java.io.*;

public class ReadFileExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			FileInputStream fin = new FileInputStream("C:\\ByteArray.txt");
			
			int i;
			while((i=fin.read())!=-1)
			{
				System.out.print((char)i);
			}
			
			fin.close();
			System.out.println();
			System.out.println("File Readed Successfully...");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
