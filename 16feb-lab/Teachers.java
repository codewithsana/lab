package LAB;
class Teacher{//parent class
String designation;//instance variable
String college;
void work() {//user define method
}}
class IT_Teacher extends Teacher{//child1
void show() {//user define method
System.out.println(designation="Designation:-Wise Principle");
System.out.println(college="College:-IIT kanpur");
}}	
class Math_Teacher extends Teacher{//child2
void show1() {//user define method
System.out.println(designation="Designation:-H.O.D.");
System.out.println(college="College:-VMLG");
}}
class Softskill_Teacher extends Teacher{//child3
void show3() {//user define method
System.out.println(designation="Designation:-Teacher");
System.out.println(college="College:-MMH");	
}}
public class Teachers {//main class
public static void main(String[] args) {//main method
IT_Teacher t1= new IT_Teacher();//object of child1
System.out.println("IIT teacher");
t1.work();
t1.show();	
Math_Teacher m1= new Math_Teacher();//object of child2
System.out.println("Maths teacher");
m1.work();
m1.show1();
Softskill_Teacher s1= new Softskill_Teacher();//object of child3
System.out.println("Softskill teacher");
s1.work();
s1.show3();
}}
