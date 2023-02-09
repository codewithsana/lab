package LAB;
class Object1{//class 1
	//global variable
	int rollno;
	String name;
	double fees;
	}
	public class Objectdemo {//main class
	public static void main(String[] args) {//main method
	Object1 ob1=new Object1();//create object
	ob1.rollno=01;//call the variable
	ob1.name="Sana";
	ob1.fees=30000.50;
	System.out.println("roll no:"+ob1.rollno);//print the values
	System.out.println("Name: "+ob1.name);
	System.out.println("Fess"+ob1.fees);
	}}

