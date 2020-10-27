public class BankAccount {

	private double balance;
	private int accountID;
	private String password;

	public BankAccount(int a, String p){
		balance = 0.0;
		accountID = a;
		password = p;
	}

	public String getbalance() {
		return balance;
	}

	public String getaccountID() {
		return accountID;
	}

	public void setpassword(String x) {
		password = x;
	}

}
