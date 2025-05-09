public class Throw {
    static void checkAge(int age) {
        if (age < 18) {
            throw new ArithmeticException("Access denied");
        }else{
            System.out.print("Access Granted");
        }
    }
}
