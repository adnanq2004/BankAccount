public class DriverBankAccount {
  public static void main(String[] args) {
    BankAccount b1 = new BankAccount(401000,"jewels");
    BankAccount b2 = new BankAccount(602000, "brilliant");

    System.out.println(b1.getBalance());
    System.out.println(b1.getAccountID());
    System.out.println(b1.deposit(-10));
    System.out.println(b1.deposit(500));
    System.out.println(b1.getBalance());
    System.out.println(b1.withdraw(-20));
    System.out.println(b1.withdraw(5600));
    System.out.println(b1.withdraw(200));
    System.out.println(b1.getBalance());
    System.out.println(b1.toString());
  }
}
