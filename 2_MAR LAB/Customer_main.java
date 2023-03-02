package LAB;

public class Customer_main {
public static void main(String[] args) {
	Customer c1= new Customer();
	//customer1 details
	c1.setAccountNumber(766545);
	c1.setAccountName("Ram");
	c1.setAccountBalance(40000);
	System.out.println("Account Holder name is :"+c1.getAccountName());
	System.out.println("Account number is :"+c1.getAccountNumber());
	System.out.println("Withdraw Amount is :"+c1.getAccountBalance());
	c1.withDrawAmount();
System.out.println(); // for space
//customer2 details
	c1.setAccountName("Sham"); 
	c1.setAccountNumber(76555554);
	c1.setAccountBalance(23400);
	
System.out.println("Account Holder name is :"+c1.getAccountName());
	System.out.println("Account number is :"+c1.getAccountNumber());
	System.out.println("Account Balance is :"+c1.getAccountBalance());
	c1.withDrawAmount();
}
}

