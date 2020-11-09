public class BankAccount {

	private double balance;
	private int accountID;
	private String password;

	public BankAccount(int a, String p){
		balance = 0.0;
		accountID = a;
		password = p;
	}

	public double getBalance() {
		return balance;
	}

	public int getAccountID() {
		return accountID;
	}

	public void setPassword(String newPass) {
		if (password != newPass) {
			password = newPass;
		}
		else {
			System.out.println("You have entered the same password.");
		}
	}

	public boolean deposit(double amount) {
		if (amount < 0) {
			return false;
		}
		else {
			this.balance += amount;
			return true;
		}
	}

	public boolean withdraw(double amount) {
		if (amount < 0 || amount > balance) {
			return false;
		}
		else {
			this.balance -= amount;
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

	private boolean authenticate(String password) {
		return (password.equals(this.password));
	}

	public boolean transferTo(BankAccount other, double amount, String password) {
		if (this.authenticate(password)) {
			if (other.withdraw(amount)) {
				if (this.deposit(amount)) {
					return true;
				}
				else {
					return false;
				}
			}
			else {
				return false;
			}
		}
		else {
			return false;
		}
	}

}
