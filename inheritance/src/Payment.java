public class Payment {
    private String paymentId;
    private String paymentDate;
    private double amount;
    
    public void pay(double amount) {
        System.out.println("Transferring " + amount + " to the account.");
    }

    public void printPaymentDetails() {
        System.out.println("Payment ID: " + paymentId);
        System.out.println("Payment Date: " + paymentDate);
        System.out.println("Amount: " + amount);
    }
}
