package FileHandlingPrograms;

import java.io.*;

public class BufferedFileReadExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			FileInputStream fos = new FileInputStream("C:\\BufferedData.txt");
			BufferedInputStream bos = new BufferedInputStream(fos);
			
			int i;
			while((i=bos.read())!=-1)
			{
				System.out.print((char)i);
			}
			System.out.println();
			System.out.println("File Read Succesfully..");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

}
