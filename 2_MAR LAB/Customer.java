package LAB;

public class Customer {
	private int accountNumber;   //instance variable
	private String accountName;  //instance variable
	private double accountBalance;   //instance variable
	public int getAccountNumber() {//getter to read the data
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getAccountName() {
		return accountName;
	}
	public void setAccountName(String accountName) {//setter to write the data
		this.accountName = accountName;
	}
	public double getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}
	void withDrawAmount() {//user define method
		double balance= accountBalance-1000;
		System.out.println("balanve after withdraw amount  "+balance);
	}
	
	}

