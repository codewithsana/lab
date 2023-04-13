package LAB;

import java.util.ArrayList;

public class Person {//main class
public static void main(String[] args) {//main method
	ArrayList<String> al=new ArrayList<String>();//creating array list	
	al.add("Aruba");
	al.add("Priya");
	al.add("Sana");
	al.add("Ritu");
	al.add("Megha");
	al.add("Sadaf");
	al.add("Shifalli");
	al.add("Akshay");
	al.add("Rahul");
	al.add("Misbah");
	System.out.println("Use for each loop to print the array list:");
	for(String a:al) {//using for each loop
		System.out.println(a);
	}	
}
}
