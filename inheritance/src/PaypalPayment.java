public class PaypalPayment extends Payment {
    private String PaypalToken;
    private String PaypalId;

    PaypalPayment(String Token, String Id, String customerId, double amount) {
        super(customerId, amount);
        this.PaypalToken = Token;
        this.PaypalId = Id;
    }

    public void pay(double amount) {
        System.out.println("using paypal API to transfer " + amount + " to the account.");
    }
}
