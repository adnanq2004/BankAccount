public class BankAccount {

	private double balance;
	private int accountID;
	private String password;

	public BankAccount(int a, String p){
		balance = 0.0;
		accountID = a;
		password = p;
	}

	public double getbalance() {
		return balance;
	}

	public int getaccountID() {
		return accountID;
	}

	public void setpassword(String x) {
		password = x;
	}

	public boolean deposit(double amount) {
		if (amount < 0) {
			return false;
		}
		else {
			balance += amount;
			return true;
		}
	}

	public boolean withdraw(double amount) {
		if (amount < 0 || amount > balance) {
			return false;
		}
		else {
			balance -= amount;
			return true;
		}
	}

	public String toString() {
		String x = "";
		x += String.valueOf(accountID);
		x += "\t";
		x += String.valueOf(balance);
		return x;
	}

}
