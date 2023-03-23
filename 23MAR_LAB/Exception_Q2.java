package LAB;

public class Exception_Q2 {//main class
public void display(int x,int y)throws Exception{
if(-20<=x && y<=20) {
	throw new Exception("Throw Exception");
}
else {
	System.out.println("The product of x and y: "+x*y);
}
}
public static void main(String[] args)throws Exception {//main method
	Exception_Q2 e1= new Exception_Q2();
	e1.display(-10, -30);
}
}
