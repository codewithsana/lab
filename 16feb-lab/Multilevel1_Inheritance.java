package LAB;
//this is program of multilevel inheritance
class A{//parent class
void compile() {//user define ethod
System.out.println("program is in compile statement");
}}
class B extends A{//child class1
void run() {//user define ethod
System.out.println("program is running statement");
}}
class C extends B{//child class2
void execute(){//user define ethod
System.out.println("program is executed");
}}
public class Multilevel1_Inheritance {//main class
public static void main(String[] args) {
C c1= new C();//object of child clss2
c1.compile();
c1.run();
c1.execute();
}}
