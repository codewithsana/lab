package LAB;
class Arithmetic1{//parent class
int a;int b;//instance variable
int add(int a,int b) {//user define method
int sum=a+b;//logic to add two numbers
return sum;
}}
public class Adder extends Arithmetic1 {//child and main class
public static void main(String[] args) {//main method
Adder ad= new Adder();//object of child class
System.out.println("the sum is:"+ad.add(4,5));//call the method
}}
