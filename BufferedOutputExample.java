package FileHandlingPrograms;
import java.io.*;
public class BufferedOutputExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			FileOutputStream fos = new FileOutputStream("C:\\BufferedData.txt");
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			
			String s = "Buffered Data..";
			byte b[]= s.getBytes();
			bos.write(b);
			bos.flush();
			bos.close();
			
			System.out.println("File Created Succesfully..");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

}
