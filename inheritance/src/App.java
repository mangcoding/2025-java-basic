public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        PaypalPayment payX = new PaypalPayment("1234567890", "1234567890", "1234567890", 100);

        Payment payY = new PaypalPayment("1234567890", "1234567890", "1234567890", 100);

        Payment payZ = new Payment("1234567890", 100);

    }
}
