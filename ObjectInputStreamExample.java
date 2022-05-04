package FileHandlingPrograms;
import java.io.*;
public class ObjectInputStreamExample {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		ObjectInputStream o = new ObjectInputStream(new FileInputStream("C:\\student.txt"));
		Student s = (Student)o.readObject();
		System.out.println(s.rollNo+" "+s.name);
	}

}
