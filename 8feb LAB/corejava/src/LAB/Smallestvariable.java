package LAB;
import java.util.Scanner;//using scanner variable 
public class Smallestvariable {//main class
public static void main(String[] args) {//main method
int a,b,c;//local variable
Scanner sc= new Scanner(System.in);//taking input from user
System.out.println("enter the first value");
a=sc.nextInt();
System.out.println("enter the second value");
b=sc.nextInt();
System.out.println("enter the third value");
c=sc.nextInt();	
smallestvalue(a,b,c);//call the method
}
public static void smallestvalue(int a,int b,int c) {//declare the method
	//logic to find the smallest number
	if(a<b &&a<c) {
		System.out.println(a+" is smallest number");}
	else if(b>c && a>c) {
		System.out.println(c+"is smallest number  ");
	}
	else {
		System.out.println(b+"is smallest number");
}}}
