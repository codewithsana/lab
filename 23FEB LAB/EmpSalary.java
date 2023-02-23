package LAB;
class Manager{//main class
	int IncremenSalry() {//parent class method overloaded
		return 20000;
	}}
class Devloper extends Manager {
	int IncremenSalry() {//child class method overloaded  
		return 10000;
	}}
 class  Employee extends Manager {
	int IncremenSalry() {//child class method overloaded
		return 15000;
	}}
public class EmpSalary {//main class
	public static void main(String[] args) {//main method
		Manager m=new Manager();
		System.out.println("Increment salay of manger is : "+m.IncremenSalry());
		
		Devloper d =new Devloper();
		System.out.println("Increment salay of Devloper is : "+d.IncremenSalry());
		
		Employee e =new Employee();
		System.out.println("Increment salay of employee is : "+e.IncremenSalry());
	}}
