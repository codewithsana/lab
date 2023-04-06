package LAB;

import java.io.Serializable;
import java.io.*;
class Test implements Serializable{
	transient int id;   //using transient      
	String name;    //without transient
     int age;   //without transient
	transient String Address;   //String using transient
	public Test(int id, String name,int age,String Address) {  //parameterized constructor
		this.id=id;
		this.name=name;
		this.age=age;
		this.Address=Address;
	}
}
public class QUESTION3 {
	public static void main(String[] args) throws Exception{  //main method
		Test obj=new Test(101,"Sana",22,"Ghazaibad");
		//serialization
		FileOutputStream f=new FileOutputStream("E:\\java_io\\input.txt");
		ObjectOutputStream ob=new ObjectOutputStream(f);
		ob.writeObject(obj);
		ob.flush();
		ob.close();
		f.close();
		//desialization
		FileInputStream e=new FileInputStream("E:\\java_io\\input.txt");
		ObjectInputStream in=new ObjectInputStream(e);
		Test obj1=(Test) in.readObject();
		in.close();
		System.out.println(obj1.id+" "+obj1.name+" "+obj1.age+" "+obj1.Address);

	}

}
