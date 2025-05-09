public class App {
    public static void main(String[] args) throws Exception {
        Printable.print(1);
        Printable.print("Hello");
        Printable.printArray(new Integer[]{1,2,3,4,5});
        Printable.printArray(new String[]{"One","Two","Three","Four","Five"});
    }
}
