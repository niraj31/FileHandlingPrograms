package FileHandlingPrograms;
import java.io.*;

class  Student implements Serializable
{
	int rollNo;
	String name;
	public Student(int rollNo, String name) 
	{
		this.rollNo=rollNo;
		this.name=name;
	}
}
public class SerializationExample {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Student s = new Student(33, "Niraj");
		FileOutputStream f = new FileOutputStream("C:\\student.txt");
		ObjectOutputStream o = new ObjectOutputStream(f);
		
		o.writeObject(s);
		
	}

}
