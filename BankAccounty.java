package Wiley_java_core;

public class BankAccounty {
	private int accountNumber;
	private double balance;
	private String customerNmae;
	
    public int getAccountNumber() {
		return accountNumber;
	}

//	public void setAccountNumber(int accountNumber) {
//		this.accountNumber = accountNumber;
//	}

	public double getBalance() {
		return balance;
	}

//	public void setBalance(double balance) {
//		this.balance = balance;
//	}

	public String getCustomerNmae() {
		return customerNmae;
	}

//	public void setCustomerNmae(String customerNmae) {
//		this.customerNmae = customerNmae;
//	}

	public void deposit (double amount) {
		balance += amount;
	}
	
	public void withdraw(double amount) {
		if(amount <= balance) {
			balance -= amount;
		}else {
			System.out.println("Insufficient funds.");
		}
	}
	public static void main(String[] args) {
	
    }
}
