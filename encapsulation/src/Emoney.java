abstract public class Emoney {
    protected double amount;
    protected String AccountNo;

    protected abstract void topUp(String type, double amount);
    protected abstract void withdraw();
    protected abstract void transfer();
    protected abstract void pay();
}
