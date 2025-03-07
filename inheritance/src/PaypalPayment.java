public class PaypalPayment extends Payment {
    private String PaypalToken;
    private String PaypalId;

    public void pay(double amount) {
        System.out.println("using paypal API to transfer " + amount + " to the account.");
    }

    public void printPaymentDetails() {
        System.out.println("Payment ID: " + this.paymentId);
    } 
}
