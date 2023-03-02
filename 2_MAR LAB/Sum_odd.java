package LAB;

import java.util.Scanner;

public class Sum_odd {//main class
public static void main(String[] args) {//main method
	System.out.println("enter the number");//taking input from user
	Scanner sc= new Scanner(System.in);
	int sum=0;
	int n= sc.nextInt();
	for(int i=0;i<=n;i++) {
		if(i%2!=0) {
			sum=sum+i;
}}
	System.out.println("sum of odd number is:"+sum);
	}
}
