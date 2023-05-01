package Array;

import java.util.Scanner;

public class Array_eg5 {
	public static void main(String[] args) {//main method
		//declare and initialized
	// String name[]= {"Priya","Taniya","Riya","Rahul","Jay","Yash","Sana","Bhumi","Tarun","pihu"};
		String name[]=  new String[5];
		System.out.println("enter the value");
		Scanner sc= new Scanner(System.in);
		for(int i=0;i<name.length;i++) {
		String n=sc.next();	
			name[i]=sc.next();
		}
	for(int i=0;i<name.length;i++) {//length  is predefine
	System.out.println(name[i]);	
	}
	}
}
