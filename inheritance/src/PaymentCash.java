public class PaymentCash extends Payment {
    private String adminId;
    private String branchId;

    public void pay(double amount) {
        System.out.println("Customer come to the branch and pay " + amount + " cash.");
    }
}
