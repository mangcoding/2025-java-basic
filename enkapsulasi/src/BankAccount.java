public class BankAccount {
    private double balance;
    private String AccountNumber;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }

    public void setAccountNumber(String AccountNumber) {
        this.AccountNumber = AccountNumber;
    }

    public String getAccountNumber() {
        return AccountNumber;
    }
}
