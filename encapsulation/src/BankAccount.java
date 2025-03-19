public class BankAccount {
    private double amount;

    public void savings(double amount) {
        this.amount += amount;
    }

    public void withdraw(double amount) {
        this.amount -= amount;
    }

    public void checkAmount() {
        System.out.print("Saldo balance: "+this.amount);
    }
}
