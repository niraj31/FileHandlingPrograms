package FileHandlingPrograms;
import java.io.*;
public class CharArrayReaderExample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		char a[]= {'a','b','c','d','e','f','g','h','i'};
		CharArrayReader ca = new CharArrayReader(a);
		int i=0;
		if((i=ca.read())!=-1)
		{
			char ch=(char)i;
			System.out.println(ch+":");
			System.out.println(i);
		}
	}

}
