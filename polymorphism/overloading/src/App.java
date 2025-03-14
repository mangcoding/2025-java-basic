public class App {
    public static void main(String[] args) throws Exception {
        int a = 3;
        int b = 4;
        int c = 5;
        double x = 3.0;
        double y = 4.0;
        double z = 5.0;

        int result = Math.multiple(a, b);
        System.out.println(result);

        int result2 = Math.multiple(a, b, c);
        System.out.println(result2);

        double result3 = Math.multiple(x, y, z);
        System.out.println(result3);
    }
}
