package LAB;
import java.util.Scanner;//to import the scanner
public class Student {//main class
int rollno;//global variable
String name;
int age;
Student(){//default constructor
Scanner sc= new Scanner(System.in);//taking input from user
System.out.print("enter the roll no.");
rollno=sc.nextInt();
System.out.print("enter the name");
name=sc.next();
System.out.print("enter the age");
age=sc.nextInt();
}
Student(int r,String n,int a){//perameterized constructor
rollno=r;
name=n;
age=a;
}
void show() {//show the method
System.out.println("roll no.:"+rollno);	
System.out.println("name:"+name);
System.out.println("age:"+age);
}
public static void main(String[] args) {//main method
Student s1= new Student();//create object
Student s2=new Student();//create object
System.out.println("without perameter");//show the default constructor
s1.show();
System.out.println();
System.out.println("with perameter");//show the perameter constructor
s2.show();
}
}
