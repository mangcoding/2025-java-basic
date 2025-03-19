public class App {
    public static void main(String[] args) throws Exception {
        BankAccount account = new BankAccount(1000000);
        account.deposit(1000000);
        System.out.println(account.getBalance());

        BankAccount.getmonth();
    }
}
